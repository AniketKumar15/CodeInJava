import java.io.*;
import java.util.*;

class Student {
    String name;
    int roll;
    double marks;

    Student(String name, int roll, double marks) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Roll No: " + roll + ", Marks: " + marks;
    }
}

public class StudentFile{
    public static void main (String[] args) {
         Scanner sc = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        try {
            System.out.print("Enter number of students: ");
            int n = sc.nextInt();
            sc.nextLine(); // consume newline

            for (int i = 0; i < n; i++) {
                System.out.println("Enter details for Student " + (i + 1) + ":");
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Roll No: ");
                int roll = sc.nextInt();
                System.out.print("Marks: ");
                double marks = sc.nextDouble();
                sc.nextLine(); // consume newline

                students.add(new Student(name, roll, marks));
            }

            // Writing to file
            FileWriter writer = new FileWriter("students.txt");
            for (Student s : students) {
                writer.write(s.name + "," + s.roll + "," + s.marks + "\n");
            }
            writer.close();
            System.out.println("Student details saved to students.txt");

            // Reading from file
            System.out.println("\nReading student details from file:");
            BufferedReader reader = new BufferedReader(new FileReader("students.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String name = parts[0];
                int roll = Integer.parseInt(parts[1]);
                double marks = Double.parseDouble(parts[2]);
                System.out.println("Name: " + name + ", Roll No: " + roll + ", Marks: " + marks);
            }
            reader.close();

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Input error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}