package project;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {
    Scanner sc = new Scanner(System.in);
    List<Student> students = new ArrayList<>();
    List<Book>borrowedBooks = new ArrayList<>();
    List<Book> returnedBooks = new ArrayList<>();

    public int checkStudent(Student s1, Student s2) {
        if (s1.getSid() == s2.getSid()) {
            return 0;
        }
        return 1;
    }

    public void addStudent(Student s) {
        for (int i = 0; i < students.size(); i++) {
            if (checkStudent(s, students.get(i)) == 0) {
                System.out.println("This Number is Already Registered");
                return;
            }
        }
        students.add(s);
        System.out.println("Student Registered Successfully");
    }

    public void displayStudents() {
        System.out.println("Student-ID\t\tStudent-Name");
        for (Student student : students) {
            System.out.println(student.getSid() + "\t\t\t " + student.getSname());
        }
    }

    public void borrowBook(Books b) {
        System.out.println("Enter the Registration number of the Student");
        int regnumber = sc.nextInt();
        sc.nextLine();

        Student borrowStudent = null;
        for (Student i : students) {
            if (regnumber == i.getSid()) {
                borrowStudent = i;
                break;
            }
        }

        if (borrowStudent == null) {
            System.out.println("Please Register first");
            return;
        }

        System.out.println("Enter the name of the Book");
        String name = sc.nextLine();

        for (Book j : b.bookArray) {
            if (name.equalsIgnoreCase(j.getbName()) && j.getBookCopies() > 0) {
                borrowedBooks.add(j);
                j.setBookCopies(j.getBookCopies() - 1);
                System.out.println("Book '" + j.getbName() + "' has been Borrowed Successfully");
                borrowStudent.borrowBook(j);
                return;
            }
        }

        System.out.println("Book is not found in the Library or no available copies.");
    }


    public void displayBorrowedBooks() {
        System.out.println("Student-Name\t\tBook-Name\t\tBook-sNo\t\tBook-Author\t\tBook-Copies");
        for (Student student : students) {
            List<Book> studentBorrowedBooks = student.getBorrowedBooks();
            if (!studentBorrowedBooks.isEmpty()) {
                for (Book borrowedBook : studentBorrowedBooks) {
                    System.out.println(
                            student.getSname() + "\t\t\t  "     +
                                    borrowedBook.getbName() + "\t\t\t   "   +
                                    borrowedBook.getbSno() + "\t\t\t\t"    +
                                    borrowedBook.getAuthorName()    +
                                    "\t\t\t" + borrowedBook.getBookCopies()
                    );
                }
            }
        }
    }


    public void returnBook(Student student, Books book) {
        System.out.println("Enter the Name of the Book to return:");
        String name = sc.nextLine();

        for (Book borrowedBook : borrowedBooks) {
            if (name.equalsIgnoreCase(borrowedBook.getbName())) {
                borrowedBooks.remove(borrowedBook);
                returnedBooks.add(borrowedBook);
                borrowedBook.setBookCopies(borrowedBook.getBookCopies() + 1);
                System.out.println("You have returned '" + borrowedBook.getbName() + "' successfully.");
                return;
            }
        }

        System.out.println("Book not found in your borrowed list.");
    }

    public void displayReturnedBooks() {
        if (returnedBooks.isEmpty()) {
            System.out.println("No books returned.");
            return;
        }
        System.out.println("Book-Name\t\tBook-sNo\t\tBook-Author\t\tBook-Copies");
        for (Book returnedBook : returnedBooks) {
            System.out.println(
                    returnedBook.getbName() + "\t\t  " +
                            returnedBook.getbSno() + "\t\t\t " +
                            returnedBook.getAuthorName() +
                            "\t\t\t  " + returnedBook.getBookCopies()
            );
        }
    }
}
