import java.util.Scanner;

public class LibrarySystem {
    static int totalBook = 50;
    static Scanner sc = new Scanner(System.in); // One Scanner instance

    static void borrowing() {
        System.out.print("How many books do you want to borrow? ");
        int count = sc.nextInt();
        
        if (count > totalBook) {
            System.out.println("Not enough books available. Only " + totalBook + " left.");
        } else if (count <= 0) {
            System.out.println("Invalid number of books.");
        } else {
            totalBook -= count;
            System.out.println("Books borrowed successfully.");
        }
    }

    static void returnBook() {
        System.out.print("How many books do you want to return? ");
        int count = sc.nextInt();
        
        if (count <= 0) {
            System.out.println("Invalid number of books.");
        } else {
            totalBook += count;
            System.out.println("Books returned successfully.");
        }
    }

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\nChoose an option:");
            System.out.println("1. Total Book Count");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            System.out.print("Your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Total books available: " + totalBook);
                    break;
                case 2:
                    borrowing();
                    break;
                case 3:
                    returnBook();
                    break;
                case 4:
                    System.out.println("Exiting the system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (choice != 4);

        sc.close(); // Clean up
    }
}
