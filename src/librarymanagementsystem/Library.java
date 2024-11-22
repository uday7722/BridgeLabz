package librarymanagementsystem;

import java.util.Scanner;

public class Library {

	public static void main(String[] args) {


		Scanner scanner=new Scanner(System.in);

		Book book1=new Book("Happy","Uday",101);
		Book book2=new Book("Cricket","Vinod",102);
		Book book3=new Book("Football","Umar",103);	

		Book[] books= {book1,book2,book3};

		for(Book book:books) {
			book.displayBookDetails();
			System.out.println("------");
		}

		System.out.println("Enter the Isbn number of the book that you want to update:");

		int bookIsbn=scanner.nextInt();
		scanner.nextLine();

		Book updatedBook=null;
		for(Book book:books) {
			if(book.getIsbn()==bookIsbn) {
				updatedBook=book;
				break;
			}
		}

		if(updatedBook!=null) {

			System.out.println("Updating the book details of: "+bookIsbn);

			System.out.println("Enter the title of the book:");
			updatedBook.setTitle(scanner.nextLine());
			

			System.out.println("Enter the author of the book:");
			updatedBook.setAuthor(scanner.nextLine());
			
			System.out.println("Details of Updaated book: ");
			updatedBook.displayBookDetails(); 

		}
		else {
			System.out.println("No Book Isbn Found!!");
		}	 

	}


}
