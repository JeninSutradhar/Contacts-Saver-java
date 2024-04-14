/**
 * ContactSaver.java
 * 
 * ContactSaver: A program to save contact information
 * 
 * @author https://github.com/JeninSutradhar
 * @version 1.1
 */
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContactSaver {
    
    /**
     * Stores the contact information in a map with the ID number as the key
     */
    private static Map<Integer, Contact> contacts;
    
    /**
     * The main entry point for the program
     * 
     * @param args The command line arguments (not used)
     */
    public static void main(String[] args) {
        
        // Initialize the contacts HashMap
        contacts = new HashMap<Integer, Contact>();
        
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Set the ID count to 1
        int idCount = 1;
        
        // Set a flag to indicate whether the program is running or not
        boolean isRunning = true;
        
        // While the program is running, prompt the user for options
        while (isRunning) {
            
            // Print the menu options
            System.out.println("Enter one of the following options:");
            System.out.println("1. Fetch information");
            System.out.println("2. Add contact");
            System.out.println("3. View all contacts");
            System.out.println("4. Delete a contact with ID");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            // Get the user's choice
            int choice = scanner.nextInt();
            
            // Perform the appropriate action based on the user's choice
            switch (choice) {
                
                // Fetch contact information
                case 1:
                    System.out.print("Enter an ID number to get the contact details: ");
                    int id = scanner.nextInt();
                    
                    // Get the Contact object from the HashMap
                    Contact contact = contacts.get(id);
                    
                    // If the Contact object exists, print the details
                    if (contact != null) {
                        System.out.println(contact);
                    } else {
                        System.out.println("No contact found with the ID " + id);
                    }
                    break;
                    
                // Add a new contact
                case 2:
                    System.out.print("Enter the contact name: ");
                    String name = scanner.nextLine();

                    // Prompt the user to enter the contact's email
                    System.out.print("Enter the contact email: ");
                    String email = scanner.nextLine();

                    // Prompt the user to enter the contact's phone number
                    System.out.print("Enter the contact phone number: ");
                    String phoneNumber = scanner.nextLine();

                    // Create a new Contact object with the user input
                    Contact newContact = new Contact(idCount, name, email, phoneNumber);

                    // Add the contact to the HashMap with the ID number
                    contacts.put(idCount, newContact);

                    // Increment the ID count
                    idCount++;
                    // Save the contact details to a file
                    try {
                        // Create a FileWriter object to write to a file named "contacts.txt"
                        FileWriter fileWriter = new FileWriter("contacts.txt", true);
                        
                        // Write the contact details to the file
                        fileWriter.write(newContact.toString() + "\n");
                        
                        // Close the FileWriter to release system resources
                        fileWriter.close();
                        
                        // Notify the user that the contact has been saved successfully
                        System.out.println("Details saved with ID " + newContact.getId());
                    } catch (IOException e) {
                        
                        // If an IOException occurs, handle the error
                        System.out.println("An error occurred while saving the contact.");
                        
                        // Print the stack trace to see the details of the error
                        e.printStackTrace();
                        
                        // Close the Scanner to release resources
                        scanner.close();
                    }
                    break;
                    
                // View all contacts
                case 3:
                    System.out.println("All contacts: ");
                    
                    for (Contact contactDetails : contacts.values()) {
                        System.out.println(contactDetails);
                    }
                    break;
                    
                // Delete a contact
                case 4:
                    System.out.print("Enter the ID number of the contact to be deleted: ");
                    int idToDelete = scanner.nextInt();
                    
                    // Remove the contact with the given ID from the HashMap
                    contacts.remove(idToDelete);
                    
                    // Save the updated list of contacts to a file
                    try {
                        // Create a FileWriter object to write to a file named "contacts.txt"
                        FileWriter fileWriter = new FileWriter("contacts.txt", false);
                        
                        // Write the updated list of contacts to the file
                        for (Contact contactDetails : contacts.values()) {
                            fileWriter.write(contactDetails.toString() + "\n");
                        }
                        
                        // Close the FileWriter to release system resources
                        fileWriter.close();
                        
                        // Notify the user that the contact has been deleted successfully
                        System.out.println("Contact with ID " + idToDelete + " deleted successfully.");
                    } catch (IOException e) {
                        
                        // If an IOException occurs, handle the error
                        System.out.println("An error occurred while deleting the contact.");
                        
                        // Print the stack trace to see the details of the error
                        e.printStackTrace();
                        
                        // Close the Scanner to release resources
                        scanner.close();
                    }
                    break;
                case 5:
                    return;
                    
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
        
        // Close the Scanner to release resources
        scanner.close();
    }
}

/**
 * Contact.java
 * 
 * Contact class to store the contact details
 * 
 * @author (your name)
 * @version (version number or date)
 */
class Contact {
    
    /**
     * The ID number of the contact
     */
    private int id;
    
    /**
     * The name of the contact
     */
    private String name;
    
    /**
     * The email address of the contact
     */
    private String email;
    
    /**
     * The phone number of the contact
     */
    private String phoneNumber;
    
    /**
     * Constructor for the Contact class
     * 
     * @param id The ID number of the contact
     * @param name The name of the contact
     * @param email The email address of the contact
     * @param phoneNumber The phone number of the contact
     */
    public Contact(int id, String name, String email, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    
    /**
     * Get the ID number of the contact
     * 
     * @return The ID number of the contact
     */
    public int getId() {
        return id;
    }
    
    /**
     * Return a string representation of the contact details
     * 
     * @return A string representation of the contact details
     */
    public String toString() {
        return "ID: " + id + "\nName: " + name + "\nEmail: " + email + "\nPhone Number: " + phoneNumber;
    }
}



