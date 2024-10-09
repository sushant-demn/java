import java.util.Scanner;

public class triangle {
    static void triangle1(int arr[], int y, int n) {
        int x = n;
        int arr2[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = arr[i];
        }

        while (x != y) {

            for (int i = 0; i < x - 1; i++) {
                arr2[i] = (arr2[i] + arr2[i + 1]);
            }
            x--;
        }
        for (int i = 0; i < y; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        for (int i = 1; i < n + 1; i++) {
            triangle1(arr, i, n);
        }
    }
}
