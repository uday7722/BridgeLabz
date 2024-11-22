package librarymanagementsystem;

public class Book {

	private String title;
	private String author;
	private int isbn;
	
	public Book() {
		this.title="Unkown";
		this.author="None";
		this.isbn=0000;
	}


	public Book(String title, String author, int isbn) {
		super();
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public void displayBookDetails() {
		System.out.println("Title: "+title);
		System.out.println("Author: "+author);
		System.out.println("Isbn: "+isbn);
	}


}
