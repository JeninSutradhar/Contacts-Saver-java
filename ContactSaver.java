// Created 10 October, 2023
// Jenin Sutreadhar
// jeninsutradhar@gmail.com

// Import Statements
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ContactSaver {
    
    public static void main(String[] args) {
        
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Contacts Information Saver!");

        // Prompt the user to enter the contact's name
        System.out.print("Enter the contact name: ");
        String name = scanner.nextLine();

        // Prompt the user to enter the contact's email
        System.out.print("Enter the contact email: ");
        String email = scanner.nextLine();

        // Prompt the user to enter the contact's phone number
        System.out.print("Enter the contact phone number: ");
        String phoneNumber = scanner.nextLine();

        // Create a string with the contact details
        String contactDetails = "Name: " + name +
                                "\nEmail: " + email +
                                "\nPhone Number: " + phoneNumber;

        // Save the contact details to a file
        try {
            // Create a FileWriter object to write to a file named "contacts.txt"
            FileWriter fileWriter = new FileWriter("contacts.txt");
            
            // Write the contact details to the file
            fileWriter.write(contactDetails);
            
            // Close the FileWriter to release system resources
            fileWriter.close();
            
            // Notify the user that the contact has been saved successfully
            System.out.println("Contact saved successfully!");
        } catch (IOException e) {
            
            // If an IOException occurs, handle the error
            System.out.println("An error occurred while saving the contact.");
            
            // Print the stack trace to see the details of the error
            e.printStackTrace();
            
            // Close the Scanner to release resources
            scanner.close();
        }
        
    }

}

