package fwd.main;

import java.io.FileWriter;
import java.io.IOException;

import fwd.utils.*;
import fwd.customers.*;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path = "/Users/sompopkulapalanont/Projects/java-course/test.csv";
		
		
		
		
		//User[] customers = new User[10];
		//customers[0] = naiKor;
		User[] customers =  {
				new User("SOmpop", "KL", 30, 24000),
				new User("P kaew", "KK", 30, 500000)
		};
		//SmartCsv.write(customers, path);
		SmartCsv csv = new SmartCsv(path, "Windows");
		csv.write(customers);
		SmartCsv csv2 = new SmartCsv( "/Users/sompopkulapalanont/Projects/java-course/test2.csv");
		csv2.write(customers);
		
	//	User.log(customers);
		/*for(int i =0 ;i < customers.length; i++) {
			System.out.println(customers[i].name + customers[i].lastName + customers[i].age);
		}*/
		
	}

}
