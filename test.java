import java.io.*;
import java.util.*;

public class test {

    public void demo()
            throws IOException {
        throw new IOException("DUMB NIGGA");
    }

    public static void main(String[] args) {
        Scanner sc;
        String destF = "Distress.txt";
        String f1 = "something.txt";
        String f2 = "destination.txt";
        try {
            FileWriter fw = new FileWriter(destF, true);
            FileReader fr = new FileReader("src2.txt");
            sc = new Scanner(fr);
            while (sc.hasNextLine()) {
                fw.write(sc.nextLine() + "\n");
            }
            fr = new FileReader("src2.txt");
            sc = new Scanner(fr);
            while (sc.hasNextLine()) {
                fw.write(sc.nextLine() + "\n");
            }
            fw.close();
            demo();
        } catch (IOException e) {
            System.out.print(e + " you fool\n");
        }
    }
}
