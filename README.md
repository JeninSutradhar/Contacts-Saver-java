# Contact Saver Java Program

[![Java](https://img.shields.io/badge/Java-Contact%20Saver-blue)](https://www.java.com/)
[![GitHub license](https://img.shields.io/badge/License-MIT-green)](LICENSE)

## 📝 Overview
ContactSaver is a Java program designed to help users save and manage their contact information conveniently. It provides a simple interface for adding, fetching, viewing, and deleting contacts.

## Features
- **Add Contact:** Easily add new contacts with their name, email, and phone number.
- **Fetch Contact:** Retrieve contact details by providing the contact's ID number.
- **View All Contacts:** View all saved contacts at once.
- **Delete Contact:** Remove a contact by specifying its ID number.
- **Data Persistence:** Contact information is saved to a file (contacts.txt) for future reference.

## Usage
1. Run the ContactSaver program.
2.  Follow the on-screen instructions:
- Choose an option from the menu:
- Enter 1 to fetch contact information by ID.
- Enter 2 to add a new contact.
- Enter 3 to view all contacts.
- Enter 4 to delete a contact by ID.
- Enter 5 to exit the program.
3. Input the required information as prompted.
4. Enjoy the convenience of managing your contacts!

### How to Run
- Compile the ContactSaver.java file and run the compiled class file.
```bash
javac ContactSaver.java
java ContactSaver
```
- or directly `run|debug` on Visual studio code

## File Structure
```bash
.
├── ContactSaver.class         (Compiled Java class)
├── ContactSaver.jar           (Executable JAR file)
├── ContactSaver.java          (Source code)
├── README.md                  (Documentation)
├── contacts.txt               (Saved contact information)
└── manifest.txt               (Manifest file for JAR packaging)
```