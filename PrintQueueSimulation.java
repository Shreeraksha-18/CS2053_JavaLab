class Printer {
    public synchronized void printDocument(String user, int pages) {
        System.out.println(user + " started printing " + pages + " page(s).");
        for (int i = 1; i <= pages; i++) {
            System.out.println(user + " is printing page " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(user + " finished printing.\n");
    }
}

class User extends Thread {
    private Printer printer;
    private String userName;
    private int numPages;

    public User(Printer printer, String userName, int numPages) {
        this.printer = printer;
        this.userName = userName;
        this.numPages = numPages;
    }

    @Override
    public void run() {
        printer.printDocument(userName, numPages);
    }
}

public class PrintQueueSimulation {
    public static void main(String[] args) {
        Printer sharedPrinter = new Printer();

        User user1 = new User(sharedPrinter, "Alice", 3);
        User user2 = new User(sharedPrinter, "Bob", 2);
        User user3 = new User(sharedPrinter, "Charlie", 4);

        user1.start();
        user2.start();
        user3.start();
    }
}
