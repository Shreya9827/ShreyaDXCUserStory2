public class Book implements Comparable<Book> {
	int bookid;
    String title;
    String author;
    String publisher;
    double price;
	
    public Book() {
    	
    }

public Book(int bookid, String title, String author,String publisher, double price) {
	super();
	this.bookid = bookid;
	this.title = title;
	this.author = author;
	this.publisher = publisher;
	this.price = price;
	
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((author == null) ? 0 : author.hashCode());
	result = prime * result + bookid;
	long temp;
	temp = Double.doubleToLongBits(price);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + ((publisher == null) ? 0 : publisher.hashCode());
	result = prime * result + ((title == null) ? 0 : title.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Book other = (Book) obj;
	if (author == null) {
		if (other.author != null)
			return false;
	} else if (!author.equals(other.author))
		return false;
	if (bookid != other.bookid)
		return false;
	if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
		return false;
	if (publisher == null) {
		if (other.publisher != null)
			return false;
	} else if (!publisher.equals(other.publisher))
		return false;
	if (title == null) {
		if (other.title != null)
			return false;
	} else if (!title.equals(other.title))
		return false;
	return true;
}

@Override
public String toString() {
	return "Book [bookid=" + bookid + ", title=" + title + ", author=" + author + ", publisher=" + publisher
			+ ", price=" + price + "]";
}

@Override
public int compareTo(Book arg0) {
	// TODO Auto-generated method stub
	return this.bookid-arg0.bookid;
}
}

