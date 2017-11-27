package basics;

public class Cities {

	public static void main(String[] args) {
		// Declare and define an array
		
		String[] cities = {"New York", "San Francisco", "Miami", "Dallas"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		
		// Declare the array
		String[] states = new String[5];
		states[0] = "California";
		states[1] = "Ohio";
		states[2] = "New Jersey";
		states[3] = "Texas";
		states[4] = "Utah";
			
		String[] countries;
		countries = new String[3];
		countries[0] = "USA";
		countries[1] = "Canda";
		countries[2] = "UK";
		System.out.println(countries[0]);
		
		System.out.println("\n***************\n");
				
		for(int i=0; i < 5; i++)
			System.out.println("STATE: " + states[i]);
		
		boolean stateFound = false;
		int n = 0;
		while(!stateFound) {
			if(states[n] == "Texas") {
				System.out.println("TEXAS FOUND!");
				stateFound = true;
			}
			n++;
		}
 	}

}
