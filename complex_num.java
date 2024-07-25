import java.util.Scanner;

public class complex_num {
    int real, imag;

    complex_num() {
        real = 0;
        imag = 0;
    }

    complex_num(int n, int m) {
        real = n;
        imag = m;
    }

    public void add(complex_num c1, complex_num c2) {
        real = c1.real + c2.real;
        imag = c1.imag + c2.imag;

        System.out.println("The addition of the both the complex numbers is: " + real + "+" + imag + "i");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        complex_num c = new complex_num();

        int n, m;
        System.out.println("Enter real and imaginary part of 1st complex number: \n Real \t Imaginary\t");
        n = scan.nextInt();
        m = scan.nextInt();

        complex_num o1 = new complex_num(n, m);
        System.out.println("Enter real and imaginary part of 2nd complex number: \n Real \t Imaginary\t");
        n = scan.nextInt();
        m = scan.nextInt();
        complex_num o2 = new complex_num(n, m);

        c.add(o1, o2);
        scan.close();
    }
}