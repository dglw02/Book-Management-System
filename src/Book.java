public class Book {
    private String bookTitle;
    private String bookAuthor;
    private int bookID;
    private String bookLanguage;
    private double bookPrice;
    private String bookDate;
    private String bookIsbn;
    
//
    
    public Book(String bookTitle, String bookAuthor, int bookID, String bookLanguage, double bookPrice,
			String bookDate, String bookIsbn) {
		super();
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookID = bookID;
		this.bookLanguage = bookLanguage;
		this.bookPrice = bookPrice;
		this.bookDate = bookDate;
		this.bookIsbn = bookIsbn;
	}
          
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public int getBookID() {
		return bookID;
	}

	public void setBookID(int bookID) {
		this.bookID = bookID;
	}

	public String getBookLanguage() {
		return bookLanguage;
	}

	public void setBookLanguage(String bookLanguage) {
		this.bookLanguage = bookLanguage;
	}

	public double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}

	public String getBookDate() {
		return bookDate;
	}

	public void setBookDate(String bookDate) {
		this.bookDate = bookDate;
	}

	public String getBookIsbn() {
		return bookIsbn;
	}

	public void setBookIsbn(String bookIsbn) {
		this.bookIsbn = bookIsbn;
	}


    @Override
	public String toString() {
		return "Book [bookTitle=" + bookTitle + ", bookAuthor=" + bookAuthor + ", bookID=" + bookID + ", bookLanguage="
				+ bookLanguage + ", bookPrice=" + bookPrice + ", bookDate=" + bookDate + ", bookIsbn=" + bookIsbn + "]";
	}
    
   
    	
}