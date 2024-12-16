import java.io.*;
import java.io.IOException;
import java.text.ListFormat.Style;
import java.util.Scanner;

public class filehand {
    public static void main(String[] args) {

        File myFile = new File("something.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to create this file\n");
        }
        try {
            FileWriter fileWriter = new FileWriter("something.txt");
            fileWriter.write("Hello niggas");
            fileWriter.close();
        } catch (IOException e) {
            System.out.print(e);
        }
        try {
            Scanner sc = new Scanner(myFile);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.print(e);
        }
        try {
            FileReader r = new FileReader("something.txt");
            Scanner sc = new Scanner(r);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println("not possible");
            System.out.print(e);
        }
    }
}