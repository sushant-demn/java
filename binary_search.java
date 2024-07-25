package academics;
import java.util.Scanner;
public class binary_search {

	static void binary_search(int arr[] , int n , int a) {
		int l = 0 , r = n-1;
		boolean flag = false;
		int mid = (l + r)/2;
		while(l <= r) {
			mid = (l + r)/2;
				
			if(a == arr[mid]) {
				flag = true;
				break;
			}
			else if(arr[mid] < a) {
				l = mid +1;
			}
			else {
				r = mid - 1;
			}
		}
		if(flag == true) {
			System.out.println("Element " + a + "found at " + (mid+1));
			
		if(flag == false) {
			System.out.println("Element " + a + " doesnt exist in given dataset");
		}
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n, a;

		System.out.print("Enter number of elements: ");
		n = scanner.nextInt();
		int arr[] = new int[n];
		System.out.print("Enter the elements: ");
		for(int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.println("Enter element to be found: ");
		a = scanner.nextInt();
		scanner.close();
		binary_search(arr , n , a);
		
	}

}
