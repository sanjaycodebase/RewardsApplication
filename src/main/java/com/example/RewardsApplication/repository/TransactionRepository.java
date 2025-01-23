package com.example.RewardsApplication.repository;

import com.example.RewardsApplication.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    // Custom query using @Query
    @Query("SELECT t FROM Transaction t WHERE t.customerId = :customerId AND t.date BETWEEN :startDate AND :endDate")
    List<Transaction> findByCustomerIdAndDateRange(String customerId, LocalDate startDate, LocalDate endDate);
}
