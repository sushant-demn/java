package academics;
import java.util.Scanner;
public class loop_input {

	public static void main(String[] args) {
		int arr[] = new int[5];
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter elements of the array: ");
		for(int i = 0; i<5; i++) {
			arr[i] = scanner.nextInt();
		}
		scanner.close();
		for(int i = 0; i<5; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
