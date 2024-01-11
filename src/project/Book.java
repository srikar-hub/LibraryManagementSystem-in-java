package project;

import java.util.Scanner;

public class Book {
    private String bName;
    private int bSno;
    private int bookCopies;
    private String authorName;

    public Book() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Serial Number of the Book:");
        this.bSno = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the Name of the Book:");
        this.bName = sc.nextLine();

        System.out.println("Enter the Author name:");
        this.authorName = sc.nextLine();

        System.out.println("Enter the Number of copies of the Book:");
        this.bookCopies = sc.nextInt();
    }

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public int getbSno() {
		return bSno;
	}

	public void setbSno(int bSno) {
		this.bSno = bSno;
	}

	public int getBookCopies() {
		return bookCopies;
	}

	public void setBookCopies(int bookCopies) {
		this.bookCopies = bookCopies;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

    // Getters and setters go here...

    
}
