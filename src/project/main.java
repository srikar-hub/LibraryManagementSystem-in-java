package project;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        System.out.println("\t\t\t\t\tLibrary Management System");
        Scanner sc = new Scanner(System.in);
        int choice;
        Books book = new Books();
        Students student = new Students();
        Student s1 = null;

        do {
        	System.out.println("Press 0 to exit:");
            System.out.println("Press 1 to Add a Book in the Library");
            System.out.println("Press 2 to Show All Books");
            System.out.println("Press 3 to search for a Book in a Library");
            System.out.println("Press 4 to get Register");
            System.out.println("Press 5 to get the List of Registered Students");
            System.out.println("Press 6 to Borrow Books in Library");
            System.out.println("Press 7 to display the Borrowed Books");
            System.out.println("Press 8 to Return a Borrowed Book");
            System.out.println("Press 9 to Display Returned Books");
           
            System.out.println("Enter Your choice");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Book b = new Book();
                    book.addBook(b);
                    break;
                case 2:
                    book.display();
                    break;
                case 3:
                    book.search();
                    break;
                case 4:
                    s1 = new Student();
                    student.addStudent(s1);
                    break;
                case 5:
                    student.displayStudents();
                    break;
                case 6:
                    if (s1 != null) {
                        student.borrowBook(book);
                    } else {
                        System.out.println("Please register a student first.");
                    }
                    break;


                case 7:
                    student.displayBorrowedBooks();
                    break;
                case 8:
                    if (s1 != null) {
                        student.returnBook(s1, book);
                    } else {
                        System.out.println("Please register a student first.");
                    }
                    break;
                case 9:
                    student.displayReturnedBooks();
                    break;
            }
        } while (choice != 0);

        sc.close();  
    }
}
