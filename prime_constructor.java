package academics;
import java.util.*;

public class prime_constructor {
	prime_constructor (int n) {
		boolean flag = false;
		if(n == 1)
		{
			flag = true;
		}
		if(n == 0)
		{
			flag = true;
		}
		for(int j = 2; j < n; j++)
		{
			if(n % j == 0)
			{	
				flag = true;
				break;
			}
		}
		if(flag == false) {
			System.out.println(n + " is a prime number"); 
		}
		else 
		{
			System.out.println(n + " is not a prime number"); 
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to check if prime: ");
		int n = scan.nextInt();
		prime_constructor o1 = new prime_constructor(n);
	}

}
