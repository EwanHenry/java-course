package basics;

public class SalaryCalculator {
	public static void main(String[] args) {
		//Variable to define career
		
		//Declare
		String career;
		System.out.println("Program is starting");
		
		//Define
		career = "Software Developer";
		System.out.println("My career: " + career);
		
		//Declare & Define
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.50;
		career = "Web Developer";
		
		double salary = hoursPerWeek * weeksPerYear * rate;
		
		System.out.println("My salaray as a " + career + " at the rate of $" + rate + " per hour is $" + salary + " per year.");
		
		//Compute salary
		//rate * hoursPerWeek * weeksPerYear
	}
}
