package homework_OPP_Concepts;

import java.util.Scanner;

public class Employee extends Person {

	public Employee(String name, String address, String email, int phone) {
		super(name, address, email, phone);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Person1 c1 = new Person1();

		Scanner scan = new Scanner(System.in);

		System.out.println("enter name");
		String str = scan.next();
		System.out.println("phone number");
		int num = scan.nextInt();
		scan.nextLine();
		System.out.println("enter address");
		String str1 = scan.nextLine();
		System.out.println();
		scan.next();
		System.out.println("enter e-mail");
		String str2 = scan.next();
		scan.close();
		c1.setName(str);
		c1.setEmail(str2);
		c1.setPhone(num);
		c1.setAddress(str1);
//		c1.setName("Bobby");
//		c1.setEmail("bobby@gmail.com");
//		c1.setAddress("123 Sesame Street");
//		c1.setPhone(5551234);

		// Here we are grabbing the values using our getter methods inside our
		// Customer.java
		System.out.println(c1.getName());
		System.out.println(c1.getEmail());
		System.out.println(c1.getAddress());
		System.out.println(c1.getPhone());
	}
}
