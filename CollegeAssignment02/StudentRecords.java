// Write a program to accept data from the n students, display top 3 student based on the marks, search for student by roll number.
import java.util.*;

class Student {
	int rollNo;
	String name;
	int marks;

	Student(int rollNo, String name, int marks) {
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}

	void display() {
		System.out.println("Roll No: " + rollNo + ", Name: " + name + ", Marks: " + marks);
	}
}

public class StudentRecords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Accept number of students
		System.out.print("Enter number of students: ");
		int n = sc.nextInt();

		List<Student> students = new ArrayList<>();

		// Accept student data
		for (int i = 0; i < n; i++) {
			System.out.println("\nEnter details for student " + (i + 1));
			System.out.print("Roll No: ");
			int roll = sc.nextInt();
			sc.nextLine();  // consume newline
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Marks: ");
			int marks = sc.nextInt();

			students.add(new Student(roll, name, marks));
		}

		// Sort by marks in descending order
		students.sort((s1, s2) -> s2.marks - s1.marks);

		// Display top 3 students
		System.out.println("\nTop 3 Students:");
		for (int i = 0; i < Math.min(3, students.size()); i++) {
			students.get(i).display();
		}

		// Search by roll number
		System.out.print("\nEnter roll number to search: ");
		int searchRoll = sc.nextInt();
		boolean found = false;

		for (Student s : students) {
			if (s.rollNo == searchRoll) {
				System.out.println("Student found:");
				s.display();
				found = true;
				break;
			}
		}

		if (!found) {
			System.out.println("Student with roll number " + searchRoll + " not found.");
		}

		sc.close();
	}
}
