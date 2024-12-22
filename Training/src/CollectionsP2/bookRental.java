package CollectionsP2;

import java.util.ArrayList;
import java.util.Iterator;

class Book{
	private int isbnno;
	private String bookName;
	private String author;
	public int getIsbnno() {
		return isbnno;
	}
	public void setIsbnno(int isbnno) {
		this.isbnno = isbnno;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
}

class Library{
	private ArrayList<Book> bookList = new  ArrayList<Book>();
	public ArrayList<Book> getBookList() {
		return bookList;
	}
	public void setBookList(ArrayList<Book> bookList) {
		this.bookList = bookList;
	}
	public void addBook(Book bobj) {
		bookList.add(bobj);
	}
	public boolean isEmpty() {
		if(bookList.isEmpty()) {
			return true;
			}
		return false;
	}
	public ArrayList<Book> viewAllBooks(){
		return bookList;
	}
	public ArrayList<Book> viewBooksByAuthor(String author){
		ArrayList<Book> result=new ArrayList<Book>();
        Iterator<Book> iter=bookList.iterator();
        while(iter.hasNext())
        {
            Book b= iter.next();
            if(b.getAuthor().equalsIgnoreCase(author))
            result.add(b);
        }
        return result;
		
	}
	public int countnoofbook(String bname) {
		int ans=0;
		Iterator<Book> itr= bookList.iterator();
		while(itr.hasNext()) {
			Book b= itr.next();
			if(b.getBookName().equalsIgnoreCase(bname)) {
				ans++;
				}
			}
		return ans;
		}
}

public class bookRental {
	public static void main(String[] args) {
		
	}
}
