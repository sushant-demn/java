package academics;
import java.util.Scanner;
public class sqr_arr {

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
		System.out.print("The square of the elements of the array is: ");
		for(int i = 0; i<5; i++) {
			System.out.print(arr[i]*arr[i] + " ");
		}
	}

}