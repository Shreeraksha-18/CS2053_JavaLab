package edu.bank;

public class CarLoan implements Loan {
    private double interestRate = 9.0;

    @Override
    public void applyLoan(double amount) {
        System.out.println("Applying for Car Loan of amount: $" + amount);
    }

    @Override
    public double calculateEMI(double amount, int tenureInMonths) {
        double totalPayable = amount + (amount * interestRate * tenureInMonths / 1200);
        return totalPayable / tenureInMonths;
    }
}
