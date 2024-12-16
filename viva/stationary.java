import java.util.*;

class publications {
    String title;
    int price;
    int copies;
    int index;
    public static int totalsales = 0;

    void salecopy() {

    }
}

class Book extends publications {
    String author;

    Book() {
        this.title = "";
        this.author = "";
        this.price = 0;
        this.copies = 0;
    }

    Book(int index, String title, String author, int price, int copies) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.copies = copies;
        this.index = index;
    }

    void orderCopies(Book[] b) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Books currently available with us: ");
            for (int i = 0; i < 3; i++) {
                System.out
                        .println(b[i].index + " \t " + b[i].title + " \t " + b[i].author + " \t " + b[i].price + "  \t"
                                + b[i].copies);
            }
            System.out.println("Which book you want to order");
            int i = scan.nextInt() - 1;
            if (b[i].index > 0 && i < 3) {
                System.out.println("Enter the No. of copies you want to order: ");
                int qty = scan.nextInt();
                if (qty <= b[i].copies) {
                    System.out.println("Copies ordered successfully");
                    b[i].copies = b[i].copies - qty;
                    totalsales = totalsales + b[i].price * qty;
                    System.out.println("Total price for " + b[i].title + "copies is " + b[i].price * qty);
                    System.out.println("Do you want to order more books 1. YES 2. NO");
                    int ch = scan.nextInt();
                    if (ch == 2) {
                        break;
                    }

                } else {
                    System.out.println("Copies of " + b[i].title + "aren't sufficient for your order");
                    System.out.println("Do you want to order more books 1. YES 2. NO");
                    int ch = scan.nextInt();
                    if (ch == 2) {
                        break;
                    }
                }
            } else {
                System.out.println("Choose from available books");
            }
        }
    }
}

class Magazine extends publications {
    Magazine() {
    }

    Magazine(int index, String title, int price, int copies) {
        this.title = title;
        this.price = price;
        this.copies = copies;
        this.index = index;
    }

    void OrderQty(Magazine[] m) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int n;
            System.out.println("Magazines currently available with us");
            for (int i = 0; i < 2; i++) {
                System.out.println(m[i].index, +"\t", m[i].title, +"\t", m[i].price, +"\t", m[i].copies, +"\t");
            }
            n = nextInt();

            if (n > 0 && n < 2) {
                System.out.println("Enter the number of copies you want to purchase");
                int qty = scan.nextInt();
                if (qty <= m[n].copies) {
                    System.out.println("Copies ordered successfully");
                    m[n].copies = m[n].copies - qty;
                    totalsales = totalsales + m[n].price * qty;
                    System.out.println("Total price for "m[n].title + "'s " + qty + " copies is " + qty*m[n].price);
                    System.out.println("Do you want to order more magazines 1. YES 2.NO");
                    int ch = scan.nextInt();
                    if(ch == 2){
                        break;
                    }
                }
                else{
                    System.out.println("Copies of " + m[n].title + " aren't sufficient for your order");
                    System.out.println("Do you want to order more magazines 1. YES 2.NO");
                    int ch = scan.nextInt();
                    if(ch == 2){
                        break;
                    }
                }

            } else {
                System.out.println("Choose from the available options");
            }

        }
    }
}

public class stationary {

    public static void main(String args[]) {
        Book[] B = new Book[3];
        B[0] = new Book(1, "Java", "Herbert Schildt", 900, 10);
        B[1] = new Book(2, "Database", "Jason Price", 4000, 10);
        B[2] = new Book(3, "Cloud", "Brian Spendolini", 4000, 10);
        Magazine[] M = new Magazine[2];
        M[0] = new Magazine(1, "Cloud", 4000, 10);
        M[0] = new Magazine(2, "Web", 2000, 20);

        Book b2 = new Book();
        b2.orderCopies(B);
        publications p = new publications();
        System.out.println("The total sales is: " + p.totalsales);
    }

}
