import java.util.ArrayList;
import java.util.List;

class Account {
    private String accountHolderName;
    private double balance;
    private List<String> transactionHistory;
    private String symbol;

    public Account(String accountHolderName, double initialBalance, String symbol) {
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
        this.symbol = symbol;
        this.transactionHistory = new ArrayList<>();
        transactionHistory
                .add("Account created for " + accountHolderName + " with initial balance " + symbol + initialBalance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactionHistory.add("Deposited " + symbol + amount);
            System.out.println("Deposit successful. New balance: " + symbol + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactionHistory.add("Withdrew " + symbol + amount);
            System.out.println("Withdrawal successful. New balance: " + symbol + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient funds for withdrawal.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void printTransactionHistory() {
        System.out.println("Transaction History for " + accountHolderName + ": ");
        for (String transaction : transactionHistory) {
            System.out.println("- " + transaction);
        }
    }
}
