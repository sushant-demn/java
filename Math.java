import java.util.*;
class Math {
    //Declaration of static method sum
    static int sum(int a, int b) {
        return (a + b);
    }

    public static void main(String[] args) {
        //Taking Input of values
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1st No.: ");
        int a = scan.nextInt();
        System.out.println("Enter 2nd No.: ");
        int b = scan.nextInt();
        //calling static method "sum" Without creating instance of Math
        System.out.println("The sum of " + a + "+" + b + " is: " + sum(a, b));
        scan.close();
    }
}