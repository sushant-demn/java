import java.util.*;

class ops<T> {
    private ArrayList<T> arrayList = new ArrayList();

    ops() {
    };

    void addtoList(T a) {
        this.arrayList.add(a);
    }

    void isEven() {
        int x = 0;
        Iterator y = this.arrayList.iterator();
        while (y.hasNext()) {
            int z = (Integer) y.next();
            if (z % 2 == 0) {
                System.out.println(z + " is Even");
                x++;
            }
        }
        System.out.println("List has " + x + " Even Integers");
    }

    void isOdd() {
        int x = 0;
        Iterator y = this.arrayList.iterator();
        while (y.hasNext()) {
            int z = (Integer) y.next();
            if (z % 2 != 0) {
                System.out.println(z + " is Odd");
                x++;
            }
        }
        System.out.println("List has " + x + " Odd Integers");
    }

    void Display() {
        System.out.println("The elements in the list are: " + this.arrayList);
    }

    boolean ispalindrome(String a) {
        StringBuilder x = new StringBuilder(a);
        return (x.equals(x.reverse().toString()));
    }

    void countpal() {
        int x = 0;
        Iterator y = this.arrayList.iterator();
        while (y.hasNext()) {
            String z = (String) y.next();
            if (this.ispalindrome(z)) {
                System.out.println((String) y.next());
                x++;
            }
        }
        System.out.println("The no of palindromes " + x);
    }
}

public class generics {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        ops<Integer> a = new ops();
        ops<String> b = new ops();
        System.out.println("Enter 5 numbers");
        for (int i = 0; i < 5; i++) {
            int x = scan.nextInt();
            a.addtoList(x);
        }
        a.Display();
        a.isEven();
        a.isOdd();
        System.out.println("Enter 5 names");
        for (int i = 0; i < 5; i++) {
            String x = scan.nextLine();
            b.addtoList(x);
        }
        b.Display();
        b.countpal();

    }
}
