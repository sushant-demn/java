import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class student {
    int roll;
    String name;
    String div;

    student(int a, String b, String c) {
        this.roll = a;
        this.name = b;
        this.div = c;
    }

    int getroll() {
        return this.roll;
    }

    String tostring() {
        return (this.roll + "," + this.name + "," + this.div);
    }

    static student fromstring(String a) {
        String[] y = a.split(",");
        return new student(Integer.parseInt(y[0]), y[1], y[2]);
    }
}

class studentdb {
    static String myFile = "Students.txt";

    static void addRecord(student s) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(myFile, true))) {
            writer.write(s.tostring());
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    List<student> getallStudent() {
        List<student> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(myFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                list.add(student.fromstring(line));
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        return list;
    }

    void updateRecord(int roll, student updatedStudent) {
        List<student> list = getallStudent();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(myFile))) {
            for (student s : list) {
                if (s.getroll() == roll) {
                    writer.write(updatedStudent.tostring());
                } else {
                    writer.write(s.tostring());
                }
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    static void display() {
        try (BufferedReader reader = new BufferedReader(new FileReader(myFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        int ch = 0;
        student s;
        Scanner scan = new Scanner(System.in);
        while (ch != 10) {
            System.out.println("Choose from the current options \n 1.add \n2.display \n3.update");
            ch = scan.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter roll ,name ,div");
                    int roll = scan.nextInt();
                    String name = scan.nextLine();
                    String div = scan.nextLine();
                    s = new student(roll, name, div);
                    addRecord(s);
                    break;
                case 2:
                    display();
                    break;
                default:
                    break;
            }
        }

    }
}