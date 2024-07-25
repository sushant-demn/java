// package academics;
import java.util.Scanner;
public class arr_sum {

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
		int sum = 0;
		for(int i = 0; i < n; i++) {
			sum = sum + arr[i];
		}
		System.out.print("The sum of the array is: " + sum);
		
		
	}

}
