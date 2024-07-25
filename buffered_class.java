package academics;
import java.io.*;

public class buffered_class {
	public static void main(String[] args) 
			throws IOException
	{
		BufferedReader b = new  BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter a string: ");
		
		String x = b.readLine();
		
		System.out.println("Enter a integer: ");
		
		System.out.println("Entered String is: " + x);
	
	}

}
