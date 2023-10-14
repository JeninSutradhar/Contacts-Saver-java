# Contact Saver Java Program

[![Java](https://img.shields.io/badge/Java-Contact%20Saver-blue)](https://www.java.com/)
[![GitHub license](https://img.shields.io/badge/License-MIT-green)](LICENSE)

## 📝 Introduction

The Contact Saver Java program allows you to input contact information, including name, email, and phone number, and saves it to a text file for future reference. This README will guide you through using the program and also provide instructions on how to convert the Java program into an executable JAR (Java Archive) file.

## 📂 Files Included

1. **Contacts.txt**: A sample text file that will store contact information in the format:
   ```plaintext
   Name: John Doe
   Email: john.doe@example.com
   Phone Number: 123-456-7890
   ```
   
1. ContactSaver.class: The compiled Java class file.
2. ContactSaver.java: The source code for the Contact Saver program.
3. manifest.txt: A manifest file needed for creating an executable JAR file.
4. ContactSaver.java: The source code for the Contact Saver program.

# 🚀 How to Use the Contact Saver Program
Compile the Java program using the javac command. Make sure you're in the directory where ContactSaver.java is located.


```
javac ContactSaver.java
```
After successful compilation, a ContactSaver.class file will be generated.

To run the Contact Saver program, use the following command:

```
java ContactSaver
```
The program will prompt you to enter the contact details, including name, email, and phone number.

The program will save the contact details to a file named contacts.txt. You can modify the file name and path in the ContactSaver.java source code.

If the contact is saved successfully, you'll see a message: "Contact saved successfully!"

If an error occurs during the saving process, you'll see an error message.

# 💼 Converting the Program into an Executable JAR
To convert the Java program into an executable JAR file that you can easily share and distribute to other computers with Java installed, follow these steps:

Save the Java program with a .java extension (e.g., ContactSaver.java).

Open a command prompt or terminal and navigate to the directory where the Java program is saved.

Compile the Java program using the javac command (as explained above).

After successful compilation, a ContactSaver.class file will be generated.

Create a manifest file (e.g., manifest.txt) and add the following line to it:

```
Main-Class: ContactSaver
```
Create a JAR file using the jar command with the manifest file and the class file:

```
jar cfm ContactSaver.jar manifest.txt ContactSaver.class
```
You can now execute the program using the java command with the JAR file:

```
java -jar ContactSaver.jar
```
This executable JAR file allows you to run the program on different systems without the need for recompilation.

Enjoy using the Contact Saver Java program! 📞

# Contact
Author : Jenin Sutradhar
Email : jeninsutradhar@gmail.com
Website : vlist.free.nf
