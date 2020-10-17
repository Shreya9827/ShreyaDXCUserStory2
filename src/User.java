
import java.util.Scanner;
public class User {

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	DataBase db = new DataBase();
	char c;
	do {
		System.out.println("Press 1 to view all books");
		System.out.println("Press 2 to search books by title");
		System.out.println("Press 3 to insert a new book");
		System.out.println("Press 4 to delete a book");
		System.out.println("Press 5 to update the book");
		int choice = sc.nextInt();
	switch(choice) {
	case 1:
		db.viewAll();
		break;
		
	case 2:
		System.out.println("Enter the title of the book");
		String name = sc.next();
		Book b2 = db.viewByName(name);
		if(b2 != null) {
		System.out.println(b2);
		}
		else 
		{
		System.out.println("No book Found!");	
		}
		break;
		
	case 3:
		System.out.println("Enter the book id:");
		int bookid = sc.nextInt();
		System.out.println("Enter the book name:");
		String title = sc.next();
		System.out.println("Enter the book author:");
		String author = sc.next();
		System.out.println("Enter the book publisher:");
		String publisher = sc.next();
		System.out.println("Enter the book price:");
		double price = sc.nextDouble();
		Book b1 = new Book(bookid,title,author,publisher,price);
		db.insert(b1);
		break;
	
	case 4:
		System.out.println("Enter id of the book you want to delete:");
		int bookid1= sc.nextInt();
		db.delete(bookid1);
		break;
		
	case 5:
		System.out.println("Enter the id:");
		int id = sc.nextInt();
		System.out.println("Enter the price:");
		double pr= sc.nextDouble();
		db.update(id,pr);
		break;
	default:
		break;
	}
	System.out.println("Press y for main menu:");
	c=sc.next().charAt(0);
	}
	while(c=='Y' || c== 'y');	
}
			
	}

