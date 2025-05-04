import java.util.Scanner;

class BankAccount {
	private String name;
	private int accountNumber;
	private double balance;

	// Constructor
	public BankAccount(String name, int accountNumber) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = 0.0;
	}

	// Deposit money
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("b9" + amount + " deposited successfully.");
		} else {
			System.out.println("Invalid amount.");
		}
	}

	// Check balance
	public void checkBalance() {
		System.out.println("Account Holder: " + name);
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Current Balance: b9" + balance);
	}
}

public class BankApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankAccount account = null;
		boolean exit = false;

		while (!exit) {
			System.out.println("\n---- Bank Menu ----");
			System.out.println("1. Create Account");
			System.out.println("2. Deposit Money");
			System.out.println("3. Check Balance");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			sc.nextLine();  // consume newline

			switch (choice) {
			case 1:
				if (account != null) {
					System.out.println("Account already exists.");
				} else {
					System.out.print("Enter your name: ");
					String name = sc.nextLine();
					System.out.print("Enter account number: ");
					int accNo = sc.nextInt();
					account = new BankAccount(name, accNo);
					System.out.println("Account created successfully.");
				}
				break;

			case 2:
				if (account == null) {
					System.out.println("Please create an account first.");
				} else {
					System.out.print("Enter amount to deposit: ");
					double amount = sc.nextDouble();
					account.deposit(amount);
				}
				break;

			case 3:
				if (account == null) {
					System.out.println("Please create an account first.");
				} else {
					account.checkBalance();
				}
				break;

			case 4:
				exit = true;
				System.out.println("Exiting... Thank you!");
				break;

			default:
				System.out.println("Invalid choice. Try again.");
			}
		}

		sc.close();
	}
}
