package basics;

public class Strings {

	public static void main(String[] args) {
		String bookTitle;
		bookTitle = "The Lord of the Rings";
		String wordChoice = "Ring";
		
		if(bookTitle.contains(wordChoice)) {
		 System.out.println("The book contains the word " + wordChoice);
		}
		
		String browser = "Chrome";
		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("The browser is chrome");
		}
		
		String firstName = "Tim";
		String lastName = "Short";
		String SSN = "91284124";
		
		//Print initials plus last 4 digits of SSN
		System.out.println(firstName.substring(0, 1) + "." + lastName.substring(0, 1) + ". SSN: " + SSN.substring(SSN.length()-4));
	}

}
