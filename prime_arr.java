package academics;
import java.util.Scanner;

public class prime_arr {
	static void prime(int arr[], int n) {
		int a = 0;
		for(int i = 0; i<n; i++) {
			boolean flag = false;
			if(arr[i] == 1)
			{
				continue;
			}
			if(arr[i] == 0)
			{
				continue;
			}
			for(int j = 2; j < arr[i]; j++)
			{
				if(arr[i] % j == 0)
				{	
					flag = true;
					break;
				}
			}
			if(flag == false) {
				System.out.println(arr[i] + " is a prime number"); 
			}
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		System.out.print("Enter the number of the elements: ");
		n = scanner.nextInt();
		int arr[] = new int[n];
		System.out.print("Enter elements of the array: ");
		for(int i = 0; i<n; i++) {
			arr[i] = scanner.nextInt();
		};
		scanner.close();
		System.out.println("The number of prime numbers in given dataset is ");
		prime(arr , n);
	}

}
