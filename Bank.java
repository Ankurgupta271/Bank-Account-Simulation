import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String symbol = "\u20B9"; // Unicode for ₹

        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();

        System.out.print("Enter initial balance : " + symbol);
        double initialBalance = sc.nextDouble();

        Account acc = new Account(name, initialBalance, symbol);

        int choice;
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Transaction History");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit : " + symbol);
                    double depositAmount = sc.nextDouble();
                    acc.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw : " + symbol);
                    double withdrawAmount = sc.nextDouble();
                    acc.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.println("Current Balance: " + symbol + acc.getBalance());
                    break;
                case 4:
                    acc.printTransactionHistory();
                    break;
                case 5:
                    System.out.println("Thank you for using our banking service.");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        } while (choice != 5);

        sc.close();
    }
}
