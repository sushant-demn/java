import java.util.Scanner;

public class user_input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Your name is " + name);
        scanner.close();
    }

}

/*system input in java depends on the scanner class 
scanner class is used to take inputs from console 
its need to be imported from java.util
syntax to form new scanner:
    Scanner scanner_name = new Scanner();
    //code
    scanner.close

    To scan/take input next line:
    data_type identifier  = scanner.nextline;

scanner needs to be closed after done
*/