package doublyLinkedList;



public class Book {

	private int BookNo;
	private String bookName;
	private String Author;
	private int bookCost;

	Book next;
	Book prev;

	public int getBookNo() {	
		return BookNo;
	}

	public void setBookNo(int bookNo) {
		BookNo = bookNo;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public int getBookCost() {
		return bookCost;
	}

	public void setBookCost(int bookCost) {
		this.bookCost = bookCost;
	}

	public Book(int bookNo, String bookName, String author, int bookCost) {
		super();
		BookNo = bookNo;
		this.bookName = bookName;
		Author = author;
		this.bookCost = bookCost;
		next = null;
		prev = null;
	}

	@Override
	public String toString() {
		return "Book [BookNo=" + BookNo + ", bookName=" + bookName + ", Author=" + Author + ", bookCost=" + bookCost
				+ "]";
	}


	
	
	

}
