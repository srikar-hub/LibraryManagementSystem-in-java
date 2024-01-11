	package project;
	
	import java.util.*;
	
	public class Books {
		Scanner sc=new Scanner(System.in);
		List<Book> bookArray = new ArrayList<>();
int count=0;
public int check(Book b1, Book b2) {
			if (b1.getbSno()==b2.getbSno()) {
				return 0;
			}
			return 1;
		}
	
		public void addBook(Book b) {
			for (int i = 0; i < count; i++) {
				if (check(b, bookArray.get(i)) == 0) {
					System.out.println("You cannot add the Book it is already Present in the Library");
					return;
				}
			}
			bookArray.add(b);
			count++;
		}
	
		
	
		public void display() {
			System.out.println("Book-Name\t\tBook-SerialNumber\t\tBook-Author\t\tBook-copies");
			for (Book i : bookArray) {
				System.out.println(" "+i.getbName() + "\t\t\t " + i.getbSno() + "\t\t\t\t " + i.getAuthorName()+"\t\t\t  "+i.getBookCopies());
			}
		}
		
		public void search() {
			
			int sno=sc.nextInt();
			for(int i=0;i<count;i++) {
				if(sno ==bookArray.get(i).getbSno()) {
					System.out.println("Book-Name\t\tBook-SerialNumber\t\tBook-Author\t\tBook-copies");
				    System.out.println(bookArray.get(i).getbName()+"\t\t\t"+bookArray.get(i).getbSno()+"\t\t\t\t"
				    	+bookArray.get(i).getAuthorName()+"\t\t\t "+bookArray.get(i).getBookCopies()
				    		);
				}
			}
			}
		}
	
