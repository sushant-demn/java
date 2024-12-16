import java.io.*;
import java.util.*;

public class two_to_one {
    public static void main(String[] args) {
        String dest = "destination.txt", src1 = "something.txt", src2 = "src2.txt";
        try {
            File myFile = new File(dest);
            myFile.createNewFile();
            FileReader reader = new FileReader(src1);
            Scanner sc = new Scanner(reader);
            System.out.print("First File contains: ");
            while (sc.hasNextLine()) {

                System.out.print(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Destination file could no be created\n");
        }
        try {
            File myFile2 = new File(src2);
            myFile2.createNewFile();
            FileWriter writer = new FileWriter(src2);
            for (int i = 1; i <= 10; i++) {
                writer.write(i + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("src2 cant be created");
        }
        try {
            FileWriter fileWriter = new FileWriter(dest, true);
            FileReader reader = new FileReader(src1);
            Scanner sc = new Scanner(reader);
            while (sc.hasNextLine()) {
                fileWriter.write(sc.nextLine() + "\n");
            }
            sc.close();
            reader = new FileReader(src2);
            sc = new Scanner(reader);
            while (sc.hasNextLine()) {
                fileWriter.write(sc.nextLine() + "\n");
            }
            sc.close();
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Cannot append\n");
        }

    }
}
