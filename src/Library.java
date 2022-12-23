import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Price implements Comparator<Book> {
	public int compare(Book o1, Book o2) {
		return Double.compare(o1.getBookPrice(),o2.getBookPrice());
	}
}

class ReversePrice implements Comparator<Book> {
	public int compare(Book o1, Book o2) {
			return Double.compare(o2.getBookPrice(),o1.getBookPrice());
		}
	}

public class Library{
    public ArrayList<Book> allBook = new ArrayList<Book>();
    
    public void addBook(Book book) {
		allBook.add(book);
	}

    public String toString() {
        return Library.this.toString();
    }

	public void displayAll() {
		for(Book book : allBook) {
			System.out.println(book.toString());
		}
	}
	
	public void deleteBook(int id) {
		boolean flag = false;
		for (Book book : allBook) {
			if(book.getBookID() == id) {
				allBook.remove(book);
				flag = true;
				break;
			}
		}
		if(!flag) System.out.println("There no Id for this book = "+id);
		else System.out.println("Delete compelete");
	}

	public void updateBook(double price, Scanner in) {
		Book book = null;
		for (Book b : allBook) {
			if(b.getBookPrice() == price) {
				book = b; 
				break;
			}
		}
		book.toString();
	}
	
	public List<Book> findAuthor(String author){
		List<Book> authorResult = new ArrayList<>();
		for (Book book : allBook) {
			if(book.getBookAuthor().contains(author)) {
				authorResult.add(book);
			}
		}
		return authorResult;
	}
	
	public List<Book> findLanguage(String language){
		List<Book> languageResult = new ArrayList<>();
		for (Book book : allBook) {
			if(book.getBookLanguage().contains(language)) {
				languageResult.add(book);
			}
		}
		return languageResult;
	}
	public void findPrice() {
		Collections.sort(allBook, new Price());
	}
	
	public void findReversePrice() {
		Collections.sort(allBook, new ReversePrice());
	}
	

}

    