package LibraryManagementSystem;

public class BookClass 
{
	private String title;
	private String author;
	private String isbn;
	private boolean Availabilitystatus;

	
	
	
	public BookClass(String title, String author, String isbn, boolean availabilitystatus) {
		super();
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		Availabilitystatus = availabilitystatus;
	}
	public void setTitle(String title)
	{
		this.title=title;
	}
	public String getTitle()
	{
		return title;
	}
	public void setAuthor(String author)
	{
		this.author=author;	
	}
	public String getAuthor()
	{
		return author;

	}
	public void setISBN(String isbn)
	{
		this.isbn=isbn;
	}
	public String getISBN() 
	{
		return isbn;
	}
	public void setAvailabilityStatus(boolean availabilitystatus ) 
	{
		this.Availabilitystatus=availabilitystatus;
	}
	public boolean getAvailabilitystatus() 
	{
		return Availabilitystatus;
	}
	@Override
	public String toString() {
		return "BookClass [title=" + title + ", author=" + author + ", isbn=" + isbn + ", availabilitystatus="
				+ Availabilitystatus + "]";
	}
	public BookClass() {
	super();
}
	
	
	
	
}	
//i used in this encapusulation because it uses for hiding data& better to modify the data & calling a specific variable by using setter and getter methods
		
