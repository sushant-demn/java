import java.util.*;
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;

public class filehand {

    String tostring(String a, int b) {
        String resutl = a + b;
        return resutl;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        File myFile = new File("Database.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            System.out.println(e);
        }
        int n;
        try {
            System.out.println("Enter the number of Student's Data to be added: ");
            n = scan.nextInt();
            FileWriter wfile = new FileWriter("Database.txt");
            for (int i = 0; i < n; i++) {
                System.out.println("Enter name of the student: ");
                String name = scan.next();
                System.out.println("Enter the roll no: ");
                int roll = scan.nextInt();
                wfile.write(roll + " " + name);
                wfile.write("\n");
            }
            wfile.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        try {
            FileReader rfile = new FileReader("Database.txt");
            scan = new Scanner(rfile);
            while (scan.hasNextLine()) {
                System.out.println(scan.nextLine());
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
