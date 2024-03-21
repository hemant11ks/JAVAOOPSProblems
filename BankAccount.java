import java.util.Objects;

class Bankacc {
    int accountNumber;
    String accountHolder;
    double accountBalance;

    Bankacc(int an, String ah, double ab) {
        System.out.println("Bankacc Constructor...");
        accountNumber = an;
        accountHolder = ah;
        accountBalance = ab;
    }

    void withdraw(float amount) {
        System.out.println(accountHolder + " is Withdrawing... " + amount);
        accountBalance -= amount;
    }

    void deposit(float amount) {
        System.out.println(accountHolder + " is Depositing... " + amount);
        accountBalance += amount;
    }

    void showBankAccount() {
        System.out.println("------object hashcode---" + this.toString()); // Using "this" to refer to the current object
        System.out.println("ACNO   : " + accountNumber);
        System.out.println("ACNAME : " + accountHolder);
        System.out.println("ACBAL  : " + accountBalance);
        System.out.println("-------------------");
    }

    @Override
    public String toString() {
        // Overriding toString() to provide a meaningful string representation of the object
        return "Bankacc{" +
                "accountNumber=" + accountNumber +
                ", accountHolder='" + accountHolder + '\'' +
                ", accountBalance=" + accountBalance +
                '}';
    }

    @Override
    public int hashCode() {
        // Overriding hashCode() to generate a hash code for the object
        // Combining hash codes of instance variables using Objects.hash()
        return Objects.hash(accountNumber, accountHolder, accountBalance);
    }
}

public class BankAccount {
    public static void main(String[] args) {
// toString() method is called explicitly using b1.toString(). 
// This method returns the string representation of the Bankacc object b1.
// hashCode() method is called explicitly using b1.hashCode(). 
// This method returns the hash code of the Bankacc object b1.
// Creating an instance of Bankacc

Bankacc b1 = new Bankacc(101, "Hemant", 1000);
b1.deposit(2000);
b1.withdraw(500);

// Calling toString()
String strRepresentation = b1.toString();
System.out.println("String representation of b1: " + strRepresentation);

// Calling hashCode()
int hashCodeValue = b1.hashCode();
System.out.println("Hash code of b1: " + hashCodeValue);

b1.showBankAccount();


    }

    public static String getBankBalance() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getBankBalance'");
    }
}
