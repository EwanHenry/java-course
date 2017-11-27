package basics;

public class Weather {
	public static void main(String[] args) {
		//Program will give suggestions of what to wear based on the temperature and sun
		
		int temperature = 61;
		String sunCondition = "Sunny";
		
		if(temperature > 80) {
			 System.out.println("It's pleasant. Wear shorts and t-shirt");
		} else if(temperature > 60 && sunCondition == "Sunny") {
			System.out.println("It's a little cool. Perhaps wear a long-sleeve shirt and jeans.");
			System.out.println("Wear a hat to keep the sun out of your eyes.");
		} else {
			System.out.println("Looks like a cold day. Bring a sweater.");
		}
	}

}
