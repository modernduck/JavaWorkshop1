package fwd.customers;

public class User {

	public String name;
	public String lastName;
	public int age;
	public int salary;
	
	public User(String name, String lastName, int age, int salary) {
		this.name = name;
		this.lastName = lastName;
		this.age = age;
		this.salary = salary;
		
		
	}
	public String toString() {
		return this.name + " " + this.lastName + " " + this.age + " " + this.salary;
	}
	
	public String[] getStringValues() {
		String[] values = {this.name, this.lastName, this.age  + "", this.salary + ""};
		return values;
	}
	
	public static String[] getFields() {
		String[] fields = {"Name", "Last Name", "Age", "Salary"};
		return fields;
	}
	
	public static void log(User user) {
		System.out.println(user.toString());
	}
	
	public static void log(User[] users) {
		//add to updafte
		for(int i = 0 ; i < users.length ; i ++)
			User.log(users[i]);
	}
}
