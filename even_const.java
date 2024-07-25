package academics;

import java.util.Scanner;

public class even_const {
	even_const(int n ){
		if((n % 2) == 0) {
			System.out.print(n + " is a even number");
		}
		else {
			System.out.print(n + " is a odd number");
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to check if even : ");
		int n = scan.nextInt();
		even_const o = new even_const(n);
	}

}
