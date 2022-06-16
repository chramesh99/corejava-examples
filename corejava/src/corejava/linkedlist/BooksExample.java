package corejava.linkedlist;

public class BooksExample {
	private int id;
	String bookName;
	String publisher;
	String author;
	int quantity;
	
	public BooksExample(int id, String bookName, String publisher, String author, int quantity) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.publisher = publisher;
		this.author = author;
		this.quantity = quantity;
	}

	

	public int getId() {
		return id;
	}



	public String getBookName() {
		return bookName;
	}



	public String getPublisher() {
		return publisher;
	}



	public String getAuthor() {
		return author;
	}



	public int getQuantity() {
		return quantity;
	}



	@Override
	public String toString() {
		return "BooksExample [id=" + id + ", bookName=" + bookName + ", publisher=" + publisher + ", author=" + author
				+ ", quantity=" + quantity + "]";
	}
	
	
	
}
