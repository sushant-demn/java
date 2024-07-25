package academics;
import java.util.Scanner;
public class user_input {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("What is your name: ");
		String name = scanner.nextLine();
		
		System.out.println("Your name is "+name);
		scanner.close();
	}
}
