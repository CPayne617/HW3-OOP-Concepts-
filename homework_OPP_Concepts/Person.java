package homework_OPP_Concepts;

public class Person {

	public String name;
	public String address;
	public String email;
	public int phone;

	// Creating parameterized constructor
	// your local variable name doesn't have to be the same as your instance
	// variable name but it is best practice
	public Person(String name, String address, String email, int phone) {
		this.name = name;
		this.address = address;
		this.email = email;
		this.phone = phone;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
