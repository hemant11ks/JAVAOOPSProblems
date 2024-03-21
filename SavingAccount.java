
// Bankacc class represents a basic bank account
class Bankacc {
    int accountNumber;
    String accountHolder;
    double accountBalance;

    // Constructor to initialize Bankacc object with account number, holder name, and initial balance
    Bankacc(int an, String ah, double ab) {
        System.out.println("Bankacc Constructor...");
        accountNumber = an;
        accountHolder = ah;
        accountBalance = ab;
    }

    // Method to withdraw money from the account
    void withdraw(double amount) throws InsufficientFundsException {
        // Check if there are sufficient funds in the account
        if (amount > accountBalance) {
            throw new InsufficientFundsException("Insufficient funds in the account.");
        }
        System.out.println(accountHolder + " is Withdrawing... " + amount);
        accountBalance -= amount;
    }

    // Method to deposit money into the account
    void deposit(double amount) {
        System.out.println(accountHolder + " is Depositing... " + amount);
        accountBalance += amount;
    }

    // Method to display account details
    void showBankAccount() {
        System.out.println("------object hashcode---" + this.hashCode()); // Using hashCode() to get the hash code
        System.out.println("ACNO   : " + accountNumber);
        System.out.println("ACNAME : " + accountHolder);
        System.out.println("ACBAL  : " + accountBalance);
        System.out.println("-------------------");
    }
}

// SavingsAccount class represents a savings account, extends Bankacc class
class SavingsAccount extends Bankacc {
    double interestRate;

    // Constructor to initialize SavingsAccount object with account number, holder name, initial balance, and interest rate
    SavingsAccount(int an, String ah, double ab, double ir) {
        super(an, ah, ab); // Call superclass constructor to initialize inherited fields
        interestRate = ir;
    }

    // Method to add interest to the account balance
    void addInterest() {
        double interest = accountBalance * interestRate / 100;
        accountBalance += interest;
        System.out.println("Interest added: " + interest);
    }
}

// Custom exception class for handling insufficient funds exception
class InsufficientFundsException extends Exception {
    // Constructor to create an InsufficientFundsException object with a custom error message
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// Main class to demonstrate the Bankacc and SavingsAccount classes
public class SavingAccount {
    public static void main(String[] args) {
        try {
            // Creating a SavingsAccount object
            SavingsAccount s1 = new SavingsAccount(101, "Hemant", 1000, 5);
            
            // Deposit and withdraw operations
            s1.deposit(2000);
            s1.withdraw(500);
            
            // Displaying account details
            s1.showBankAccount();
            
            // Adding interest to the account balance
            s1.addInterest();
            s1.showBankAccount();
        } catch (InsufficientFundsException e) { // Handling InsufficientFundsException
            System.out.println("Error: " + e.getMessage());
        }
    }
}
