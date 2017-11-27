package assignment2;

public class StudentAccountApp {

	public static void main(String[] args) {
		StudentAccount student1 = new StudentAccount("Ewan Henry", "12951023");
		
		student1.setPhone("07905139482");
		student1.setCity("Seattle");
		student1.setState("Washington");
		
		System.out.println(student1.toString());
		
		student1.enroll("Maths");
		student1.enroll("Physics");
		student1.enroll("Philosophy");
		
		student1.pay(1000);

	}

}

class StudentAccount {
	
	private static int iD = 1000;
	private String userID;
	private String SSN;
	private String name;
	
	private String phone;
	private String city;
	private String state;
	private String email;
	private static final String domain = "unveristy.com";
	private static final double costOfCourse = 500;
	
	private String courses = "";
	private double balance;

	// Constructor
	StudentAccount(String name, String SSN) {
		this.name = name;
		setEmail();
		this.SSN = SSN;
		setUserId();
	}
	
	private void setUserId() {
		iD++;
		int random = 1000 + (int)(Math.random()*8000);
		this.userID = iD + "" + random + "" + SSN.substring(SSN.length()-4);
	}
	
	private void setEmail() {
		email = name + "@" + domain;
	}

	// Getters and setters	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	// Methods
	public void enroll(String state) {
		courses += state +"\n";
		balance -= costOfCourse;
		showCourses();
		checkBalance();
	}
	
	public void pay(int amount) {
		balance += amount;
		System.out.println("Payment made: $" + amount);
		checkBalance();
	}
	
	public void checkBalance() {
		System.out.println("Current balance: $" + balance);
	}
	
	public void showCourses() {
		System.out.print("Enrolled courses:\n" + courses);
	}
	
	@Override
	public String toString() {
		return "[Name: " + name + "]\n" +
				"[User ID: " + userID + "]\n" +
				"[SSN: " + SSN + "]\n" +
				"[Email: " + email + "]\n" +
				"[Balance: " + balance + "]";
	}
}