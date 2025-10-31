package edu.bank;

public class HomeLoan implements Loan {
    private double interestRate = 7.5;

    @Override
    public void applyLoan(double amount) {
        System.out.println("Applying for Home Loan of amount: $" + amount);
    }

    @Override
    public double calculateEMI(double amount, int tenureInMonths) {
        // Simple interest based EMI calculation (for example purposes)
        double totalPayable = amount + (amount * interestRate * tenureInMonths / 1200);
        return totalPayable / tenureInMonths;
    }
}
