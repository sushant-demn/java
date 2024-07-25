package academics;
import java.util.*;

public class scanner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		
		String x = scan.nextLine();
		System.out.println("Enter a integer: ");
		int y = scan.nextInt();
		
		System.out.println("Entered String is: " + x);
		System.out.println("Entered Integer is: " + y);
		
	}
}
