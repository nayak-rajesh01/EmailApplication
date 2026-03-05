

package emailapp;

import java.util.Random;
import java.util.Scanner;
import java.io.*;

/**
 * Email class represents an employee email account.
 * It handles:
 *  - Department selection
 *  - Random password generation
 *  - Email creation
 *  - Password change
 *  - Mailbox capacity update
 *  - Alternate email setting
 */
public class Email {

    // ===============================
    // Instance Variables (Encapsulation)
    // ===============================
    private String firstName;
    private String lastName;
    private String department;
    private String email;
    private String password;
    private int mailCapacity = 500;
    private String alternateEmail;

    // Single Scanner object (Best Practice)
    private static final Scanner scanner = new Scanner(System.in);

    // ===============================
    // Constructor
    // ===============================
    public Email(String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;

        System.out.println("\nNew Employee Created: " + firstName + " " + lastName);

        this.department = setDepartment();
        this.password = generatePassword(8);
        this.email = generateEmail();
    }

    // ===============================
    // Generate Email
    // ===============================
    private String generateEmail() {
        return firstName.toLowerCase() + "." +
                lastName.toLowerCase() + "@" +
                department.toLowerCase() + ".company.com";
    }

    // ===============================
    // Set Department (With Try-Catch)
    // ===============================
    private String setDepartment() {

        System.out.println("\nDepartment Codes:");
        System.out.println("1 - Sales");
        System.out.println("2 - Development");
        System.out.println("3 - Accounting");
        System.out.println("0 - None");

        while (true) {
            try {
                System.out.print("Enter Department Code: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1: return "Sales";
                    case 2: return "Development";
                    case 3: return "Accounting";
                    case 0: return "None";
                    default:
                        System.out.println("Invalid choice. Try again.");
                }

            } catch (Exception e) {
                System.out.println("Invalid input! Please enter numbers only.");
                scanner.nextLine(); // clear buffer
            }
        }
    }

    // ===============================
    // Generate Random Password
    // ===============================
    private String generatePassword(int length) {

        Random random = new Random();

        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*?";
        String allChars = upperCase + lowerCase + numbers + symbols;

        StringBuilder passwordBuilder = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(allChars.length());
            passwordBuilder.append(allChars.charAt(index));
        }

        return passwordBuilder.toString();
    }

    // ===============================
    // Change Password (With Validation + Try-Catch)
    // ===============================
    public void changePassword() {

        int attempts = 3;

        while (true) {
            try {
                System.out.print("\nDo you want to change password? (Y/N): ");
                char choice = Character.toLowerCase(scanner.next().charAt(0));

                if (choice == 'y') {

                    while (attempts > 0) {

                        System.out.print("Enter Current Password: ");
                        String currentPassword = scanner.next();

                        if (currentPassword.equals(this.password)) {

                            System.out.print("Enter New Password (min 8 chars): ");
                            String newPassword = scanner.next();

                            if (newPassword.length() >= 8) {
                                this.password = newPassword;
                                System.out.println("✅ Password changed successfully.");
                            } else {
                                System.out.println("❌ Password must be at least 8 characters.");
                            }
                            return;

                        } else {
                            attempts--;
                            System.out.println("❌ Incorrect password. Attempts left: " + attempts);
                        }
                    }

                    System.out.println("🔒 Account locked due to too many failed attempts.");
                    return;

                } else if (choice == 'n') {
                    System.out.println("Password change cancelled.");
                    return;

                } else {
                    System.out.println("Invalid choice! Enter Y or N.");
                }

            } catch (Exception e) {
                System.out.println("Error occurred: " + e.getMessage());
                scanner.nextLine();
            }
        }
    }

    // ===============================
    // Set Mailbox Capacity
    // ===============================
    public void setMailCapacity() {
        try {
            System.out.println("\nCurrent Mailbox Capacity: " + mailCapacity + "MB");
            System.out.print("Enter New Mailbox Capacity: ");
            mailCapacity = scanner.nextInt();
            System.out.println("✅ Mailbox capacity updated successfully.");
        } catch (Exception e) {
            System.out.println("Invalid input! Capacity must be a number.");
            scanner.nextLine();
        }
    }

    // ===============================
    // Set Alternate Email
    // ===============================
    public void setAlternateEmail() {
        try {
            System.out.print("\nEnter Alternate Email: ");
            alternateEmail = scanner.next().toLowerCase();
            System.out.println("✅ Alternate email set successfully.");
        } catch (Exception e) {
            System.out.println("Error setting alternate email.");
        }
    }

    // ===============================
    // Display User Information
    // ===============================
    public void displayInfo() {

        System.out.println("\n===== USER INFORMATION =====");
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Department: " + department);
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
        System.out.println("Mailbox Capacity: " + mailCapacity + "MB");
        System.out.println("Alternate Email: " + alternateEmail);
        System.out.println("=============================");
    }

    // ===============================
// Store Data in File
// ===============================
    public void storeFile() {

        String filePath = "info.txt";   // File will be created in project root folder

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            // true → enables append mode (multiple users can be stored)

            writer.write("===== USER DATA =====");
            writer.newLine();
            writer.write("First Name: " + this.firstName);
            writer.newLine();
            writer.write("Last Name: " + this.lastName);
            writer.newLine();
            writer.write("Department: " + this.department);
            writer.newLine();
            writer.write("Email: " + this.email);
            writer.newLine();
            writer.write("Password: " + this.password);
            writer.newLine();
            writer.write("Mailbox Capacity: " + this.mailCapacity + "MB");
            writer.newLine();
            writer.write("Alternate Email: " + this.alternateEmail);
            writer.newLine();
            writer.write("======================");
            writer.newLine();
            writer.newLine();

            System.out.println("✅ Data stored successfully in file.");

        } catch (IOException e) {
            System.out.println("❌ Error writing to file: " + e.getMessage());
        }
    }

    // ===============================
    // Read Data from File
    // ===============================
    public void readFile() {

        String filePath = "info.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

            String line;

            System.out.println("\n===== FILE CONTENT =====");

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            System.out.println("========================");

        } catch (FileNotFoundException e) {
            System.out.println("❌ File not found. Please store data first.");
        } catch (IOException e) {
            System.out.println("❌ Error while reading file: " + e.getMessage());
        }
    }
}



