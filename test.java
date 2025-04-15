import java.io.*;
import java.util.*;

class Student {
    private String id;
    private String name;
    private int age;

    public Student(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return id + "," + name + "," + age;
    }

    public static Student fromString(String record) {
        String[] parts = record.split(",");
        return new Student(parts[0], parts[1], Integer.parseInt(parts[2]));
    }
}

 class StudentDatabase {
    private static final String FILE_PATH = "studentsdb2.txt";

    // Add a new student
    public static void addStudent(Student student) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            writer.write(student.toString());
            writer.newLine();
        }
    }

    // Get all students
    public static List<Student> getAllStudents() throws IOException {
        List<Student> students = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                students.add(Student.fromString(line));
            }
        }
        return students;
    }

    // Update a student
    public static void updateStudent(String id, Student updatedStudent) throws IOException {
        List<Student> students = getAllStudents();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (Student student : students) {
                if (student.getId().equals(id)) {
                    writer.write(updatedStudent.toString());
                } else {
                    writer.write(student.toString());
                }
                writer.newLine();
            }
        }
    }

    // Delete a student
    public static void deleteStudent(String id) throws IOException {
        List<Student> students = getAllStudents();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (Student student : students) {
                if (!student.getId().equals(id)) {
                    writer.write(student.toString());
                    writer.newLine();
                }
            }
        }
    }

    public static void main(String[] args) {
        try {
            // Adding students
            addStudent(new Student("1", "Alice", 20));
            addStudent(new Student("2", "Bob", 22));

            // Display all students
            System.out.println("All Students:");
            for (Student student : getAllStudents()) {
                System.out.println(student);
            }

            // Update a student
            updateStudent("1", new Student("1", "Alice", 21));
            System.out.println("\nAfter Update:");
            for (Student student : getAllStudents()) {
                System.out.println(student);
            }

            // Delete a student
            deleteStudent("2");
            System.out.println("\nAfter Deletion:");
            for (Student student : getAllStudents()) {
                System.out.println(student);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
