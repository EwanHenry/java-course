package oop;

public class BankAccount implements IRate{
	// Define variables
	String accountNumber;
	
	// static >> belongs to class not the object instance
	// final >> constant
	private static final String routingNumber = "123546"; //final equiv. to const.
	
	// Instance variable
	private String name;
	private String ssn;
	String accountType;
	double balance = 0;
	
	// Constructor definitions: unique methods
		// 1. They are used to define/setup/initialise properties of an object
		// 2. Constructors are IMPLICITY called upon instantiation
		// 3. The sane name as the class itself
		// 4. No return type
	
	
	// Polymorphism we can call the same name constructor but implement different code
	// based on the arguments
	BankAccount() {
		System.out.println("NEW ACCOUNT CREATED");
	}
	// Overloading: call same method name with different arguments
	BankAccount(String accountType) {
		System.out.println("NEW ACCOUNT: " + accountType);
	}
	BankAccount(String accountType, double initDeposit){
		// initDeposit, accountType Msg are all local variables
		System.out.println("NEW ACCOUNT: " + accountType);
		System.out.println("INITIAL DEPOSIT OF: $" + initDeposit);		
		String Msg = "";
		if (initDeposit < 1000) {
			Msg = "ERROR: Minimum deposit must be at least $1000";
		} else {
			Msg = "Thanks for you initial deposit of: $" + initDeposit;
			balance += initDeposit;
		}
		System.out.println(Msg);
	}
	
	// Getters / Setters
	
	// Allow user to define the name
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	// Interface methods
	public void setRate() {
		System.out.println("Setting Rate...");
	}
	public void increaseRate() {
		System.out.println("Increasing Rate...");
	}
	
	// Define methods
	// Public: called anywhere in project
	public void deposit(double amount) {
		balance += amount;
		showActivity("Deposit");
	}
	
	// Default :: called in package
	void withdraw(double amount) {
		balance -= amount;
		showActivity("Withdraw");
	}
	
	// Private: can only be called within class
	private void showActivity(String activity) {
		System.out.println("RECENT TRANSACTION: " + activity);
		System.out.println("NEW BALANCE IS: $" + balance);
	}
	
	void checkBalance() {
		System.out.println("BALANCE IS: $" + balance);
		
	}
	
	void getStatus() {
		
	}
	
	@Override
	public String toString() {
		return "[ NAME: " + name + ". ACCOUNT#" + accountNumber + ". ROUTING#" + routingNumber + ". BALANCE: $" + balance + " ]";
	}
}
