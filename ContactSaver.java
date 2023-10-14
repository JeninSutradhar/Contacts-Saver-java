import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ContactSaver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Contacts Information Saver!");

        System.out.print("Enter the contact name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the contact email: ");
        String email = scanner.nextLine();

        System.out.print("Enter the contact phone number: ");
        String phoneNumber = scanner.nextLine();

        // Create a string with the contact details
        String contactDetails = "Name: " + name +
                                "\nEmail: " + email +
                                "\nPhone Number: " + phoneNumber;

        // Save the contact to a file
        try {
            FileWriter fileWriter = new FileWriter("contacts.txt");
            fileWriter.write(contactDetails);
            fileWriter.close();
            System.out.println("Contact saved successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred while saving the contact.");
            e.printStackTrace();
            scanner.close();
        }
    }
}