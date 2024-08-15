
import java.util.*;

public class palindrome {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number to be checked:");
        int n = scan.nextInt();
        int x = n;
        int rev = 0;
        while (x != 0) {
            int r = x % 10;
            rev = rev * 10 + r;
            x = (int) Math.floor(x / 10);
        }

        if (n == rev) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
