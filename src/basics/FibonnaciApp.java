package basics;

public class FibonnaciApp {

	public static void main(String[] args) {
		// Fibonnaci number is define by the sum of the 2 previous fibonnaci numbers
		//fib(0) = 0
		//fib(1) = 1
		//fib(2) = fib(1)+fib(0) = 0 + 1 = 1
		//fib(3) = fib(2)+fib(3) = 1 + 1 = 2
		// etc...
		
		System.out.println(fib(10));
	}
	
	public static int fib(int n) {
		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
		return (fib(n-1) + fib(n-2)); //recursion
	}

}
