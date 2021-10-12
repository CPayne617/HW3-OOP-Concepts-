package homework_OPP_Concepts;

public class Person1 {
	// The private keyword is an access modifier used for attributes, methods and
	// constructors,
	// making them only accessible within the declared class.

	private String name;
	private String address;
	private String email;
	private int phone;

	// REMINDER:
	// Since we don't have a constructor/parameterized constructor. Compiler looks
	// for a constructor.
	// If it doesn't find one. It's automatically creating a constructor for us
	// under the hood.
	// In our case here, we typically don't write a constructor for a file like
	// this...HOWEVER,
	// it really depends on your application.

	// Click anywhere in your code -> click source -> click on Generate Getters and
	// Setters...
	// Choose which ones you want to generate in the list -> click Generate...

	// GETTER
	// Here we are returning the current value of name
	public String getName() {
		return name;
	}

	// SETTER
	// Doesn't hold any value until you pass in an argument for the parameter
	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

}