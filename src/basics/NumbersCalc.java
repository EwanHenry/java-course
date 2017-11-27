package basics;

public class NumbersCalc {
	
	public static void main(String[] args) {
		System.out.println("System is starting");
		printName();
		int a = 10, b = 20;
		addNumbers(a, b);
		int multiple = multiplyNumbers(a, b);
		System.out.println("The product of numbers " + a + " and " + b + " is " + multiple);
	}
	
	static void printName() {
		System.out.println("My name is Tim");
	}
	
	static void addNumbers(int a, int b) {
		// add two numbers
		System.out.println("The sum of numbers " + a + " and " + b + " is " + (a + b));
	}
		
	static int multiplyNumbers(int a, int b) {
		return a * b;
	}
	
}
