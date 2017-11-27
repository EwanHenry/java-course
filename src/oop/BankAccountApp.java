package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		// Creating a new bank account >> think instantiate an object
		
		// Instantiating an object
		BankAccount acc1 = new BankAccount();
		acc1.accountNumber = "0123123";
		acc1.balance = 10000;
		
		// Using encapsulation : public API methods
		acc1.setName("Ewan Henry");
		System.out.println(acc1.getName());
		acc1.setSsn("2349141");
		System.out.println(acc1.getSsn());
		
		acc1.setRate();
		acc1.increaseRate();
		
		acc1.deposit(1500);
		acc1.deposit(2000);
		acc1.withdraw(1500);
		
		// Polymorphism through overriding
		System.out.println(acc1.toString());
		
		/*
		
		// Polymorphism through overloading
		BankAccount acc2 = new BankAccount("Checking Account");
		acc2.accountNumber = "0153123";
		BankAccount acc3 = new BankAccount("Savings Account", 5000);
		acc3.accountNumber = "0112123";
		acc3.checkBalance();

		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000;
		cd1.interestRate = "4.5";
		cd1.name = "Juan";
		cd1.accountType = "CD Account";
		System.out.println(cd1.toString());
		cd1.compound();
		
		*/
		
	}

}
