
// public class BankTest {

// 	public static void main(String[] args) {
// 		//Class	  refToObj allocator   Ctor
// 		//  |		  |		 |			 |
// 			BankAccount baAcc1 = new BankAccount(101,"Prakhar",50000);
// 			BankAccount baAcc2 = new BankAccount(102,"Chahat",55000);
// 			BankAccount baAcc3 = new BankAccount(103,"Harsh",65000);
// 			BankAccount baAcc4 = new BankAccount(104,"Shikha",75000);
// 			BankAccount baAcc5 = new BankAccount(105,"Pranjali",85000);
// 			BankAccount baAcc6 = new BankAccount(106,"Vishhal",95000);

// 			baAcc1.showBankAccount();
// 			baAcc2.showBankAccount();
// 			baAcc3.showBankAccount();
// 			baAcc4.showBankAccount();
// 			baAcc5.showBankAccount();
// 			baAcc6.showBankAccount();
			
// 			baAcc1.withdraw(5000);
// 			baAcc2.withdraw(3000);
// 			baAcc3.deposit(15000);
// 			baAcc4.withdraw(7000);
// 			baAcc5.deposit(8000);
// 			baAcc6.withdraw(9000);
			
// 			baAcc1.showBankAccount();
// 			baAcc2.showBankAccount();
// 			baAcc3.showBankAccount();
// 			baAcc4.showBankAccount();
// 			baAcc5.showBankAccount();
// 			baAcc6.showBankAccount();
			
		
// 		SavingsAccount.showRateOfInterest();
// 		SavingsAccount.setRateOfInterest(6.5f);
// 		SavingsAccount.showRateOfInterest();
		
		
// 		SavingsAccount savAccObj1 = new SavingsAccount(555,"Jack",60000);
// 		SavingsAccount savAccObj2 = new SavingsAccount(556,"Jane",70000);
// 		SavingsAccount savAccObj3 = new SavingsAccount(557,"Julie",80000);
// 		SavingsAccount savAccObj4 = new SavingsAccount(558,"Jaya",90000);
// 		SavingsAccount savAccObj5 = new SavingsAccount(559,"Janet",90000);

// 		savAccObj1.showBankAccount();
// 		savAccObj1.calculateSimpleInterest();
		
// 		savAccObj2.showBankAccount();
// 		savAccObj2.calculateSimpleInterest();
		
// 		savAccObj3.showBankAccount();
// 		savAccObj3.calculateSimpleInterest();
		
// 		SavingsAccount.setRateOfInterest(9.5f);
// 		System.out.println("==================");
// 		savAccObj4.showBankAccount();
// 		savAccObj4.calculateSimpleInterest();
		
		
// 		savAccObj5.showBankAccount();
// 		savAccObj5.calculateSimpleInterest();
		
		
// 		savAccObj1.showBankAccount();
// 		savAccObj1.calculateSimpleInterest();
		
// 		savAccObj2.showBankAccount();
// 		savAccObj2.calculateSimpleInterest();
		
// 		savAccObj3.showBankAccount();
// 		savAccObj3.calculateSimpleInterest();
		
// 	}

// }
// abstract class BankAccount { //extends Object 
// 	//DATA MEMBERS / fields
	
// 	int accountNumber;
// 	String accountHolder;
// 	double accountBalance;
	
// 	//MEMBER FUNCTION / methods
	
// 	//there is inbuilt ctor/implicit ctor/default ctor
// 	//IT DOES NOTHING
// 	BankAccount(int x, String y, double z) { //explicit no-arg ctor
// 		System.out.println("BankAccount ctor...");
// 		accountNumber=x;
// 		accountHolder=y;
// 		accountBalance=z;
// 	}
	
// 	//either implicit or explicit but not both
// 	void withdraw(float amt) {
// 		System.out.println(accountHolder+" is withdrawing..."+amt);
// 		accountBalance -= amt;
// 	}
// 	void deposit(float amt) {
// 		System.out.println(accountHolder+" is depositing..."+amt);
// 		accountBalance += amt;
// 	}
// 	void showBankAccount() {
// 		System.out.println("------object hashcode---"+toString());
// 		System.out.println("ACNO   : "+accountNumber);
// 		System.out.println("ACNAME : "+accountHolder);
// 		System.out.println("ACBAL  : "+accountBalance);
// 		System.out.println("-------------------");
// 	}
// 	//BankAccount() { }
// }
// //Implicit super constructor BankAccount() 
// //is undefined for default constructor. 
// //Must define an explicit constructor
// class SavingsAccount extends BankAccount {
	
// 	static float rateOfInterest;
	
// 	static void showRateOfInterest() {
// 		System.out.println("RATE : "+rateOfInterest);
// 		//accountBalance=90000;
// 	}
	
// 	static void setRateOfInterest(float rateOfInterest) {
// 		System.out.println("Setting rateOfInterest : ");
// 		SavingsAccount.rateOfInterest = rateOfInterest;
// 	}
	
// 	SavingsAccount(int a, String b, double c) {
// 		super(a,b,c); //for the ctor
// 		System.out.println("SavingsAccount ctor...");

// 	}
// 	//non-static
// 	void calculateSimpleInterest() {
// 		//pnr/100
// 		double si = (accountBalance * 1 * rateOfInterest)/100;
// 		System.out.println("SI : "+si);
// 	}
// 	void showBankAccount() {
// 		super.showBankAccount(); //for method
// 		System.out.println("RATE : "+rateOfInterest);
// 	}
// }
// /*class FixedDepositAccount extends SavingsAccount {
	
// }*/
