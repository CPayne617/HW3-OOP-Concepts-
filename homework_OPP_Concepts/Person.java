package homework_OPP_Concepts;

public class Person {
	
	public String name;
	public String address;
	public String email;
	public int phone; 

	// Creating parameterized constructor
	//your local variable name doesn't have to be the same as your instance variable name but it is best practice
	public Person(String name, String address,String email, int phone)
		{
			this.name=name;
			//instance variable = local variable
			//can also be done without this. operator
			//pfirst=first; (and you would have to change the parameter)
			this.address=address;
			this.email=email;
			this.phone=phone;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
