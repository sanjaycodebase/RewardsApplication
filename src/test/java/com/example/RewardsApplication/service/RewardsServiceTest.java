package com.example.RewardsApplication.service;

import com.example.RewardsApplication.repository.TransactionRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class RewardsServiceTest {

    @Mock
    private TransactionRepository transactionRepository;

    @InjectMocks
    private RewardsService rewardsService;

    @BeforeEach
    void setUp() {
        // Initialize mocks
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testCalculateRewards() {
        // Create a list of mock transactions for testing
        List<Transaction> mockTransactions = Arrays.asList(
            new Transaction(1L, "CUST001", 120.0, LocalDate.of(2025, 1, 1)),
            new Transaction(2L, "CUST001", 80.0, LocalDate.of(2025, 1, 2)),
            new Transaction(3L, "CUST002", 150.0, LocalDate.of(2025, 1, 3))
        );

        // Mock the repository behavior to return the mock transactions
        when(transactionRepository.findAll()).thenReturn(mockTransactions);

        // Call the method under test
        Reward reward = rewardsService.calculateRewards("CUST001", "2025-01-01", "2025-01-31");

        // Assert the expected results
        assertEq
