package academics;
import java.util.*;
public class complex_method {
	public void input(String x , String y) {
		String[] r = x.split( "+" , 2);
		for (String a : r)
            System.out.println(a);
		String[] s = y.split("+" , 2);
		for (String a : s)
            System.out.println(a);
	}
	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in); 
		
		System.out.print("Enter a 2 complex number for addition: ");
		String x , y;
		x = scan.nextLine();
		y = scan.nextLine();
		complex_method o = new complex_method();
		o.input(x, y);
	}

}
