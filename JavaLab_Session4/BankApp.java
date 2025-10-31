abstract class Account {
    String accountNumber;
    double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Abstract method to be implemented by subclasses
    public abstract void calculateInterest();

    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}

class SavingsAccount extends Account {
    double interestRate = 0.04; // 4% interest

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void calculateInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Savings Account Interest added: $" + interest);
    }
}

class CurrentAccount extends Account {
    double overdraftLimit = 500.0;

    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void calculateInterest() {
        System.out.println("Current Account does not earn interest.");
    }

    public void displayOverdraftLimit() {
        System.out.println("Overdraft Limit: $" + overdraftLimit);
    }
}

public class BankApp {
    public static void main(String[] args) {
        Account acc1 = new SavingsAccount("SA123", 1000);
        Account acc2 = new CurrentAccount("CA456", 2000);

        acc1.display();
        acc1.calculateInterest();
        acc1.display();

        System.out.println();

        acc2.display();
        acc2.calculateInterest();
        ((CurrentAccount) acc2).displayOverdraftLimit();
    }
}
