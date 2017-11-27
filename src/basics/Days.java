package basics;

public class Days {
	public static void main(String[] args) {
		//Execute different blocks of code based of value of a condition
		
		String dayOfWeek = "Tue";
		
		switch(dayOfWeek) {
			case "Mon":
				System.out.println("Today is Monday");
				break;
			case "Tue":
				System.out.println("Today is Tuesday");
				break;
			case "Wed":
				System.out.println("Today is Wednesday");
				break;
			case "Thu":
				System.out.println("Today is Thursday");
				break;
			case "Fri":
				System.out.println("Today is Friday");
				break;
			case "Sat":
				System.out.println("Today is Saturday");
				break;
			case "Sun":
				System.out.println("Today is Sunday");
				break;
			default :
				System.out.println("Invalid day");
		}
	}
}
