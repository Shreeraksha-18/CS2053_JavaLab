import edu.bank.Loan;
import edu.bank.HomeLoan;
import edu.bank.CarLoan;

public class LoanDemo {
    public static void main(String[] args) {
        Loan loan1 = new HomeLoan();
        loan1.applyLoan(500000);
        System.out.printf("Home Loan EMI: $%.2f%n", loan1.calculateEMI(500000, 60));

        Loan loan2 = new CarLoan();
        loan2.applyLoan(30000);
        System.out.printf("Car Loan EMI: $%.2f%n", loan2.calculateEMI(30000, 36));
    }
}
