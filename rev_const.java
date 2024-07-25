package academics;

import java.util.Scanner;

public class rev_const {
	rev_const(int n)
	{
		int rev = 0;
		while (n != 0) {
			int r = n % 10;
			rev = rev*10 + r;
			n =  (int) Math.floor(n / 10);
		}
		System.out.println("reversed num: " + rev);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to reverse: ");
		int n = scan.nextInt();
		rev_const o = new rev_const(n);
	}
}
