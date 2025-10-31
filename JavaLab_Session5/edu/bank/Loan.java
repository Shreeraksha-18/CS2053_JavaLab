package edu.bank;

public interface Loan {
    void applyLoan(double amount);
    double calculateEMI(double amount, int tenureInMonths);
}
