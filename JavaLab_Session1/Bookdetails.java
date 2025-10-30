class Book
{
	public String bname, bookno, author, genre;
	public int compartment;
	
	public Book(String bname, String bookno, String author, String genre, int compartment)
	{
		this.bname=bname;
		this.bookno=bookno;
		this.author=author;
		this.genre=genre;
		this.compartment=compartment;
	}
	public void display()
	{
		System.out.println("Name of the book is: " + bname);
		System.out.println("With number: " + bookno);
		System.out.println("Written By: " + author);
		System.out.println("Genre of the book is: " + genre);
		System.out.println("Compartment No.: " + compartment);
	}
}
public class Bookdetails
{
	public static void main(String args[])
	{
		Book std = new Book("Pride and Prejudice", "1BK9273", "Jane Austen", "Fiction", 234);
		std.display();
	}
}
