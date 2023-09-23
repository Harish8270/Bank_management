package bank_management;

import java.util.Scanner;

class Details {
	private long acc_no;
	private String name;
	private String acc_type;
	private int pin;
	private long ph_no;
	private String add1;
	private String add2;
	private String city;
	private String email;
	private String dob;
	private char gender;
	private long balance = 500;

	Scanner sc = new Scanner(System.in);

	Details() {

	}

	Details(int num)// parameter is passed to avoid default constructor invocation
	{
		System.out.println("Enter name : ");
		name = sc.next();
		System.out.println("Enter Account Number : ");
		acc_no = sc.nextLong();
		System.out.println("Enter Account type (SB / CB): ");
		acc_type = sc.next();
		System.out.println("Enter Phone Number : ");
		ph_no = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter Address Line 1: ");
		add1 = sc.nextLine();
		System.out.println("Enter Address Line 2: ");
		add2 = sc.nextLine();
		System.out.println("Enter City : ");
		city = sc.nextLine();
		System.out.println("Enter Email : ");
		email = sc.next();
		System.out.println("Enter Gender( M/F/O) : ");
		gender = sc.next().charAt(0);
		System.out.println("Enter DOB : ");
		dob = sc.next();
		System.out.println("Enter PIN : ");
		pin = sc.nextInt();
	}

	public void getDetails() {
		System.out.println("Account Number : " + acc_no);
		System.out.println("Name : " + name);
		System.out.println("DOB : " + dob);
		System.out.println("Gender : " + gender);
		System.out.println("Account type (SB / CB): " + acc_type);
		System.out.println("Address Line 1: " + add1);
		System.out.println("Address Line 2: " + add2);
		System.out.println("City : " + city);
		System.out.println("Phone Number : " + ph_no);
		System.out.println("Email : " + email);
	}

	public void login(long ac_no, int pin_no) {
		if (ac_no == acc_no) {
			if (pin == pin_no)
				System.out.println("Loged in successfully");
			else
				System.out.println("Invalid Account number or PIN");
		} else
			System.out.println("Invalid Account number or PIN");
	}

	public void deposit() {
		System.out.println("Enter amount  : ");
		long amt = sc.nextLong();
		balance += amt;
		System.out.println("Successfull ! ");

	}

	public void withdraw() {
		System.out.println("Enter the amount to withdraw : ");
		long amt = sc.nextLong();
		if (amt > balance)
			System.out.println("Insufficient balance ");
		else {
			balance -= amt;
			System.out.println("Withdrawn successfully");
		}

	}

	public void view_balance() {
		System.out.println("Balance : " + balance);
	}

	public boolean search(long ac_no) {
		if (acc_no == ac_no)
			return true;
		else
			return false;

	}

	public void change_pin() {
		System.out.println("Enter new PIN : ");
		int p = sc.nextInt();
		pin = p;
	}
}
