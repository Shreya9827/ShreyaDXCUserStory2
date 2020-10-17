
import java.util.Iterator;
import java.util.TreeSet;

public class DataBase {
 
		public static Object db;
		TreeSet<Book> ts =new TreeSet<Book>();
		public  DataBase() {
			Book b1 = new Book(101,"Harry Potter","J.K.Rowling","Penguin Pubs",200.03);
			Book b2 = new Book(102,"Fault in our Stars","John Green","Macmillan Pubs",170.22);
			Book b3 = new Book(103,"Alchemist","Paulo Coelho","HarperCollins Pubs",150.50);
			Book b4 = new Book(104,"3 Mistakes of Life","Chetan Bhagat","Penguin Pubs",220.00);
			ts.add(b1);
			ts.add(b2);
			ts.add(b3);
			ts.add(b4);
		}
		public void viewAll() {
			// TODO Auto-generated method stub
			Iterator<Book> itr = ts.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
		}
		public Book viewByName(String name) {
			// TODO Auto-generated method stub
			for (Book b :ts) {
				if(b.title.equals(name)) {
					return b;
				}
			}
			return null;
		}
		
		public void delete(int bookid1) {
			// TODO Auto-generated method stub
			Iterator<Book> itr=ts.iterator();
			if(bookid1==itr.next().bookid) {
				itr.remove();
				System.out.println("Book Deleted!");
			}
			else
			{
				System.out.println("No book found!");
			}
		}
		
		
		
		public void update(int id, double pr) {
			// TODO Auto-generated method stub
			Iterator<Book> itr = ts.iterator();
			while(itr.hasNext()) {
				Book bTemp = itr.next();
				if(bTemp.bookid==id) {
					String title = bTemp.title;
					String author = bTemp.author;
					String publisher = bTemp.publisher;
					itr.remove();
					Book b = new Book(id,title,author,publisher,pr);
					ts.add(b);
					System.out.println("Details updated!");
				}
			}
		}
		public void insert(Book b1) {
			// TODO Auto-generated method stub
			
			ts.add(b1);
			System.out.println("Data Inserted!");
		}
			
		
	}