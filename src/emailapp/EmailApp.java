package emailapp;

import java.util.Scanner;

/**
 * Driver class for Email Application
 * Handles user interaction and menu system.
 */
public class EmailApp {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        try {
            // ===============================
            // Taking User Information
            // ===============================
            System.out.print("Enter First Name: ");
            String firstName = scanner.next();

            System.out.print("Enter Last Name: ");
            String lastName = scanner.next();

            // Creating Email Object
            Email email = new Email(firstName, lastName);

            int choice;

            // ===============================
            // Menu Driven Program
            // ===============================
            do {
                System.out.println("\n========= MENU =========");
                System.out.println("1. Show Information");
                System.out.println("2. Change Password");
                System.out.println("3. Change Mailbox Capacity");
                System.out.println("4. Set Alternate Email");
                System.out.println("5. Store Data in File");
                System.out.println("6. Display Data from File");
                System.out.println("7. Exit");
                System.out.print("Enter your choice: ");

                while (!scanner.hasNextInt()) {
                    System.out.println("Invalid input! Please enter a number.");
                    scanner.next(); // clear invalid input
                }

                choice = scanner.nextInt();

                switch (choice) {

                    case 1:
                        email.displayInfo();
                        break;

                    case 2:
                        email.changePassword();
                        break;

                    case 3:
                        email.setMailCapacity();
                        break;

                    case 4:
                        email.setAlternateEmail();
                        break;

                    case 5:
                        email.storeFile();      // Make sure method name updated in Email class
                        break;

                    case 6:
                        email.readFile();       // Make sure method name updated in Email class
                        break;

                    case 7:
                        System.out.println("Thank you for using the Email Application!");
                        break;

                    default:
                        System.out.println("Invalid choice! Please try again.");
                }

            } while (choice != 7);   // Correct exit condition

        } catch (Exception e) {
            System.out.println("Unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}