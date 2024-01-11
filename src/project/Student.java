package project;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
    Scanner sc = new Scanner(System.in);
    private int Sid;
    private String Sname;
  List<Book>borrowedBooks=new ArrayList<Book>();
 
    public int getSid() {
        return Sid;
    }

    public String getSname() {
        return Sname;
    }

    // Constructor for registering a student
    public Student() {
     try {
    	   System.out.println("Enter the Registration Number");
           this.Sid = sc.nextInt();
           sc.nextLine();
           System.out.println("Enter the Name");
           this.Sname = sc.nextLine();
           if(!Sname.matches("[a-zA-Z]+")) {
        	   throw new  IllegalArgumentException("Please Enter correct Input");
           }
     }catch(NumberFormatException e) {
    	 System.out.println("Invalid Input please Re-Enter ");
     }catch(IllegalArgumentException e) {
    	 System.out.println(e.getMessage());
     }
     
    }

   
//    public boolean hasBorrowedBook(Book book) {
//        return borrowedBooks.contains(book);
//    }
//
    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

//    public void returnBook(Book book) {
//        borrowedBooks.remove(book);
//    }
    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }


}
