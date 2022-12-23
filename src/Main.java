import java.util.Scanner;
public class Main {
	static Scanner in = new Scanner(System.in);
	static Library lib = new Library();
	public static void showMenu() {
		System.out.println("_______________________________________________");
		System.out.println("|I.BOOKS                                       |");
		System.out.println("|______________________________________________|");
		System.out.println("|1. Insert a new book \t |2. Update a book     |");
		System.out.println("|3. Delete a book \t |4. Display all       |");
		System.out.println("|________________________|_____________________|");
		System.out.println("|II.TOOLS                                      |");
		System.out.println("|______________________________________________|");
		System.out.println("|5. Filter by author \t |6.Filter by language |");
		System.out.println("|7. Filter by PriceAsce  |8.Filter by PriceDesc|");
		System.out.println("|________________________|_____________________|");
		System.out.println("|                     9.End                    |");
		System.out.println("|______________________________________________|");
	}
	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(System.in);
			int option = -1;
			do {
				showMenu();
				System.out.println("\nINPUT: ");
				option = Integer.parseInt(in.nextLine());
				switch (option) {
				case 1:
					addBook();
					break;
					
				case 2:
					System.out.println("\nInput price book to update:");
					Double price = Double.parseDouble(in.nextLine());
					lib.updateBook(price, in);
					break;
					
					
				case 3:
					System.out.print("\nInput Id: ");
					int id = Integer.parseInt(in.nextLine());
					lib.deleteBook(id);
					
					
				case 4:
					lib.displayAll();
					break;
					
					
				case 5:
					System.out.print("\nInput author name:");
					String author = in.nextLine() ;
					System.out.println(lib.findAuthor(author));
					break;
					
				case 6:
					System.out.print("\nInput language:");
					String language = in.nextLine() ;
					System.out.println(lib.findLanguage(language));
					break;
					
				case 7:
					System.out.println("\n Sort by price:");
					lib.findPrice();
					lib.displayAll();
					break;
					
				case 8:
					System.out.println("\n Sort by Descending price:");
					lib.findReversePrice();
					lib.displayAll();
					break;
				case 9:
					System.out.println("You close this app,Goodbye.End.");
					break;
				default:
					System.out.println("Input incorrect!");
					break;
				}
			} while (option != 9);
			in.close();
		}
		catch(Exception NumberFormatException) {
			System.out.println("!!!ERROR !!!  input number only  !!!ERROR!!!");
		}
	}
	private static void addBook() {
		 String bookTitle;
	     String bookAuthor;
	     int bookID;
	     String bookLanguage;
	     double bookPrice;
	     String bookDate;
	     String bookIsbn;
	     System.out.println("\n(enter the characters)Title:");
	     bookTitle = in.nextLine();
	     System.out.println("\n(enter the characters)Author:");
	     bookAuthor = in.nextLine();
	     System.out.println("\n(enter the numbers)ID:");
	     bookID = Integer.parseInt(in.nextLine());
	     System.out.println("\n(enter the characters)Language:");
	     bookLanguage = in.nextLine();
	     System.out.println("\n(enter the numbers)Price:");
	     bookPrice = Double.parseDouble(in.nextLine());
	     System.out.println("\n(enter the numbers)Date:");
	     bookDate = in.nextLine();
	     System.out.println("\n(enter the numbers)ISBN:");
	     bookIsbn = in.nextLine();
	     Book b = new Book(bookTitle, bookAuthor, bookID, bookLanguage, bookPrice, bookDate, bookIsbn);
	     lib.addBook(b);
	}
}






