package com.sb.SpringBootJune2026.junitTut.service;

import org.junit.jupiter.api.*;

public class BankAccountTest {

    private BankAccount bankAccount;

    @BeforeEach
    void setUp() {
        bankAccount = new BankAccount(1000);
    }

    @BeforeEach
    void testStarted() {
        System.out.println("Test started");
    }

    @AfterEach
    void testFinished() {
        System.out.println("Test Finished");
    }

    @BeforeAll
    static void setUpClass() {
        System.out.println("Database Connection Opened");
    }

    @AfterAll
    static void tearDownClass() {
        System.out.println("Database Connection Closed");
    }

    @Test
    void depositTest() {
        bankAccount.deposit(500);
        Assertions.assertEquals(1500, bankAccount.getBalance());
        System.out.println("Deposit Test");
    }

    @Test
    void withdrawTest() {
        bankAccount.withdraw(300);
        Assertions.assertEquals(700, bankAccount.getBalance());
        System.out.println("Withdraw Test");
    }


}
