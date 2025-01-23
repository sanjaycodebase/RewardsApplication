package com.example.RewardsApplication.service;

import com.example.RewardsApplication.model.Reward;
import com.example.RewardsApplication.model.Transaction;
import com.example.RewardsApplication.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class RewardsService {

    @Autowired
    private TransactionRepository transactionRepository;

    public Reward calculateRewards(String customerId, String startDate, String endDate) {
        // Convert strings to LocalDate
        LocalDate start = LocalDate.parse(startDate);
        LocalDate end = LocalDate.parse(endDate);

        // Fetch transactions for the given customer and date range
        List<Transaction> transactions = transactionRepository.findByCustomerIdAndDateRange(customerId, start, end);

        int totalPoints = 0;

        // Calculate points based on the transaction amount
        for (Transaction transaction : transactions) {
            double amount = transaction.getAmount();
            if (amount > 100) {
                totalPoints += (amount - 100) * 2;  // Points for amounts above 100
            } else if (amount > 50) {
                totalPoints += (amount - 50);  // Points for amounts between 50 and 100
            }
        }

        // Prepare the reward object with calculated points
        Reward reward = new Reward();
        reward.setCustomerId(customerId);
        reward.setPoints(totalPoints);
        reward.setMonth(start.getMonth().name().toUpperCase());  // Return the month of the start date

        return reward;
    }
}
