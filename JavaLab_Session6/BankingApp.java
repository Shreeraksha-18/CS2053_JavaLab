// Custom Exception class
class LowBalanceException extends Exception {
    public LowBalanceException(String message) {
        super(message);
    }
}

// Banking class with withdrawal method
class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws LowBalanceException {
        if (amount > balance) {
            throw new LowBalanceException("Insufficient balance. Withdrawal failed.");
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: $" + balance);
    }

    public double getBalance() {
        return balance;
    }
}

// Demo class
public class BankingApp {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500.0);

        try {
            account.withdraw(600.0);
        } catch (LowBalanceException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Transaction completed.");
        }
    }
}
