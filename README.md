Book Resource Management System
Description
The Book Resource Management System is a Java application that allows users to manage a collection of books. Users can perform various operations such as adding, removing, updating, viewing, and searching for books. The system uses a HashMap to store books, with the ISBN as the key for quick lookups.

Features
Add Book: Add a new book with a title, author, and ISBN.
Remove Book: Remove a book using its ISBN.
Update Book Availability: Update the availability status of a book.
View All Books: Display all books in the system.
Search Book by ISBN: Search for a book using its ISBN.
Installation
Clone the Repository:

bash
Copy code
git clone https://github.com/tevinp23/ResourceManagementSystem.git
Navigate to the Project Directory:

bash
Copy code
cd ResourceManagementSystem
Compile the Java Files:

bash
Copy code
javac Main.java
Run the Application:

bash
Copy code
java Main
Usage
Upon running the application, you will be presented with a menu to perform different actions. Here’s how you can use each feature:

Add Book: Enter the title, author, and ISBN when prompted to add a new book.
Remove Book: Provide the ISBN of the book you wish to remove.
Update Book Availability: Enter the ISBN and specify the availability status (true for available, false for not available).
View All Books: Displays a list of all books currently in the system.
Search Book by ISBN: Enter the ISBN to find a specific book.
Example
Here's how you can interact with the system:

--- Book Resource Management System ---
1. Add Book
2. Remove Book
3. Update Book Availability
4. View All Books
5. Search Book by ISBN
6. Exit
Choose an option: 1
Enter title: The Great Gatsby
Enter author: F. Scott Fitzgerald
Enter ISBN: 9780743273565
Book added: The Great Gatsby by F. Scott Fitzgerald (ISBN: 9780743273565) - Available
Contributing
If you'd like to contribute to the development of this project, please follow these steps:

Fork the Repository.
Create a New Branch: git checkout -b feature-branch
Make Your Changes.
Commit Your Changes: git commit -am 'Add new feature'
Push to the Branch: git push origin feature-branch
Create a Pull Request.
License
This project is licensed under the MIT License - see the LICENSE file for details.

Contact
For any questions or feedback, please contact Tevin Parathattal.

Acknowledgments
Thanks to Java Community for providing a robust language to build this application.
Inspired by various book management systems and tutorials available online.
