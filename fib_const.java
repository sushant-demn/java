package academics;
import java.util.Scanner;

public class fib_const {
	fib_const(int n)
	{
		int x = 0 , y = 1;
		System.out.print(x +  " ");
		while(y <= n)
		{
			System.out.print(y +  " ");
			int u = y;
			y = y + x;
			x = u;
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number fibonacci number limit: ");
		int n = scan.nextInt();
		fib_const o = new fib_const(n);
	}

}
