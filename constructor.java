package academics;
import java.util.*;

public class constructor {
	int id = 10;
	String name = "Something";
	constructor(){}
	constructor(int x , String y ){
		id = x;
		name = y;
	}	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//object created through default constructor
		constructor o = new constructor();
		
		System.out.println("Enter a string: ");
		String x = scan.nextLine();
		System.out.println("Enter a integer: ");
		int y = scan.nextInt();
		//object created through parameterised constructor
		constructor o2 = new constructor(y , x); 
		
		System.out.println("The integer and string value for 1st object: " + o.id + " " + o.name);

		System.out.println("The integer and string value for 2nd object: " + o2.id + " " + o2.name);
	}
}
