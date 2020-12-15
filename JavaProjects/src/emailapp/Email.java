package emailapp;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity;
	private String alternateEmail;
	
	//Constructor to receive firstName and lastName

	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email Created:" + this.firstName + " " + this.lastName);
		
	}
	// Ask for the dept
	// Generate a random password
	// set mailbox capacity
	// set alternate email
	// change the password
}
