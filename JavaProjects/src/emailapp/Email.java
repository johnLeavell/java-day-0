package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity;
	private String alternateEmail;
	
	//Constructor to receive firstName and lastName
<<<<<<< HEAD
=======

>>>>>>> 6816cf746227d74b2bb84db8ac6aa03b2195de8b
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email Created:" + this.firstName + " " + this.lastName);
<<<<<<< HEAD
		
		//call a method asking for the dept  - return the dept
		this.department = setDepartment();
		System.out.println("Department: " + this.department);
	}
	
=======
	}
>>>>>>> 6816cf746227d74b2bb84db8ac6aa03b2195de8b
	// Ask for the dept
	private String setDepartment() {
		System.out.print("Department Codes\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code:");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		
		if(depChoice == 1) { return "sales"; }
		else if (depChoice == 2) { return "dev"; }
		else if (depChoice == 3) { return "acct"; }
		else { return ""; }
		}
	}
	// Generate a random password
	// set mailbox capacity
	// set alternate email
	// change the password

