// BankAccount.java
public class StaticBankAccount {
    // Static variables
    private static int nextId = 1000; // Counter for generating unique IDs
    private static double bankBalance = 0.0; // Shared bank balance

    // Constants
    private static final double MIN_BALANCE = 0.0; // Minimum balance allowed

    // Instance variables
    private int accountId; // Unique ID for each account
    private double balance; // Balance associated with each account

    // Constructor
    public StaticBankAccount(double initialBalance) {
        // Assign unique ID and initialize balance
        this.accountId = getNextId(); // Assign unique ID
        this.balance = initialBalance; // Initialize balance
    }

    // Static method to get next unique ID
    private static int getNextId() {
        return nextId++; // Increment and return next unique ID
    }

    // Static method to access bank balance
    public static double getBankBalance() {
        return bankBalance; // Return current bank balance
    }

    // Static method to deposit to bank balance

    // deposit() and withdraw() methods are synchronized to prevent race conditions when accessing/modifying the shared bank balance.
    public static synchronized void deposit(double amount) {
        bankBalance += amount; // Add deposited amount to bank balance
    }

    // Static method to withdraw from bank balance
    public static synchronized void withdraw(double amount) {
        if (bankBalance - amount >= MIN_BALANCE) { // Check if sufficient balance is available
            bankBalance -= amount; // Withdraw amount from bank balance
        } else {
            System.out.println("Insufficient balance!"); // Print message if balance is insufficient
        }
    }

    // Method to get account ID
    public int getAccountId() {
        return accountId; // Return account ID
    }

    // Method to get account balance
    public double getBalance() {
        return balance; // Return account balance
    }

    // Method to deposit into account
    public void depositIntoAccount(double amount) {
        balance += amount; // Add deposited amount to account balance
        deposit(amount); // Deposit amount to bank balance
    }

    // Method to withdraw from account
    public void withdrawFromAccount(double amount) {
        if (balance - amount >= MIN_BALANCE) { // Check if sufficient balance is available in account
            balance -= amount; // Withdraw amount from account balance
            withdraw(amount); // Withdraw amount from bank balance
        } else {
            System.out.println("Insufficient balance in account!"); // Print message if balance is insufficient
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create two accounts
        StaticBankAccount account1 = new StaticBankAccount(1000); // Create account1 with initial balance 1000
        StaticBankAccount account2 = new StaticBankAccount(2000); // Create account2 with initial balance 2000

        // Deposit to account1 and withdraw from account2
        account1.depositIntoAccount(500); // Deposit 500 into account1
        account1.depositIntoAccount(1000);
        account1.depositIntoAccount(5000);
        account2.withdrawFromAccount(1000); // Withdraw 1000 from account2

        // Display bank balance
        System.out.println("Bank Balance: " + StaticBankAccount.getBankBalance()); // Print current bank balance
    }
}
