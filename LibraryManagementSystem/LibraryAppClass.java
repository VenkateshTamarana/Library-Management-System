package LibraryManagementSystem;

import java.util.Arrays;
import java.util.Scanner;

public class LibraryAppClass
{
	static int i;
	static int j;
	static Scanner s = new Scanner(System.in);
	static
	{
		System.out.println("=================================================================================================================");
		System.out.println("*****************************Welcome TO The Library**************************************************************");
		System.out.println("=================================================================================================================");
		System.out.println("Available Books In the Library : ");
		BookClass book2 = new BookClass("Ignited Minds","A.P.J. Abdul Kalam","2",true);
		BookClass book3 = new BookClass("On the Molecular Diffraction of Light","C.V. Raman","3",true);
		BookClass book4 = new BookClass("Response in the Living and Non-living","Jagadish Chandra Bose","4",true);
		BookClass book5 = new BookClass("The Nervous Mechanism of Plants","Jagadish Chandra Bose","5",true);
		BookClass book6 = new BookClass("Êstatistique de Bose-Einstein","bhahdbhj","6",true);
		
		
		//LibraryClass.setBooks(book1, i++); // book1, 0
		LibraryClass.setBooks(book2, i++); // book2,1
		LibraryClass.setBooks(book3, i++);//book3,2
		LibraryClass.setBooks(book5, i++);
		LibraryClass.setBooks(book6, i++);
		LibraryClass.setBooks(book4, i++);
		
		BookClass[] books = LibraryClass.getBooks();
		for(BookClass O:books) // Datatype identif : arrayname
		{
			if(O!=null && O.getAvailabilitystatus()==true)
			System.out.println(O); // book class object
		
		}
	}
	
	static void addBook()
	{
		BookClass a = new BookClass();// null,null,null,false
		System.out.println("Enter The Book Title(Name) ");
		String Title = s.nextLine();
		a.setTitle(Title); // Title null null flase;
		System.out.println("Enter The Author Name ");
		String Author = s.nextLine();
		a.setAuthor(Author); // title authoer null false
		System.out.println("Enter The Book ISBN Number ");
	      String ISBN = s.nextLine();
		a.setISBN(ISBN); // title authoer isbn false
		//System.out.println("Enter the book is availability ");
		boolean av = true;
		
		a.setAvailabilityStatus(av);
		   // title , authoer , isbn,true.
		
		LibraryClass.setBooks(a,i++);// book[], book
		  //(a,index)
		System.out.println("Book Is Added Successfully");
				
	}
	
	
	static void borrowBook()
	{
		MemberClass a  = new MemberClass();
		System.out.println("Please Fill The Details Below : ");
		System.out.println("--------------------------------\n");
		System.out.println("Enter Your Name : ");
		String name = s.next();
		s.nextLine();
		System.out.println("Enter Your I'D(Number Only) : ");
        int id = s.nextInt();
        s.nextLine();
        System.out.println("Memeber is Registered \n");
        
        //upto now member details are successfully stored in memeber array
        System.out.println("Enter Your Book Name :");
        String bname = s.nextLine();
        
  
        BookClass[] books = LibraryClass.getBooks();
        int length = books.length;
        int o=0;
        
        for(BookClass b:books)
        {
        
        	if(b!=null && b.getTitle().equalsIgnoreCase(bname) && b.getAvailabilitystatus()==true)
        		// if u not returning null it will search all remaing books if i write !null it will search available books
        	{
        		
        	      System.out.println("Book is Available In The Library ");
        		
        		 b.setAvailabilityStatus(false);
        		 System.out.println("Book Borrowed Successfully ");
        		 
        		 a.setId(id);
        		 a.setName(name);
    		 
        		// a.setBooks(new String[]{bname});
        		 a.setBorrowedbooks(bname);
        		LibraryClass.setMember(a, j++);
        	break;
	 
        	}else 
        	{
        		
        		o=o+1;
        	if(o!=length)
        	{
        		continue;
        	}
        	else
        	{
        	System.out.println("Book is Not Avaialble");	
        	}
        	}  
        }
	
	}
	static void returnbook()
	{
		MemberClass a  = new MemberClass();//myntra example
		System.out.print("Please Register Again For Return Book ");
		System.out.println(" **Remember** I'D should be same as Previous I'D ");
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		System.out.print("Enter your name :");
		String name = s.nextLine();
		s.nextLine();
		System.out.print("Enter your id :");
        int id = s.nextInt();

        System.out.println("Do you want to return the Book (yes/no)");
        String choice=s.nextLine();
        s.nextLine();
        BookClass[] books = LibraryClass.getBooks();
        System.out.println("Enter ur book name ");
        String bname = s.nextLine();
        for(int i=0;i<books.length;i++)
        {
        	
        	if(books[i]!=null && books[i].getTitle().equalsIgnoreCase(bname))
        	{
        		System.out.println("Book returned Successfully ");
        		 books[i].setAvailabilityStatus(true);
//        		 MemberClass[] member = LibraryClass.getMember();
//        		System.out.println(Arrays.toString(member));
        		 
        	}
        }
	}
	public static void main(String[] args)
	{	
		while(true)
		{
			System.out.println("\nEnter 1 To Add Book To The Library ");
			System.out.println("Enter 2 to See The Available Books");
			System.out.println("Enter 3 to Borrow Books");
			System.out.println("Enter 4 to Return Books");
			System.out.println("Enter 5 to All Borrowed Books");
			System.out.println("Enter 6 to To Display Borrowed Book Details");
			int i = s.nextInt();
		switch(i)
		{
		case 1:
		{
			LibraryAppClass.addBook();
			break;
		}
		case 2:
		{			
			BookClass[] books = LibraryClass.getBooks();
			for(BookClass O:books) // Datatype identif : arrayname
			{
				if(O!=null && O.getAvailabilitystatus()==true)
				System.out.println(O);
			}
			break;
		}
		case 3: 
		{
			LibraryAppClass.borrowBook();;
			break;			
		}
		case 4:
		{
			LibraryAppClass.returnbook();
			break;
		}
		case 5:
		{
			MemberClass[] member = LibraryClass.getMember();
			for(MemberClass m:member)
			{
				if(m!=null)
				System.out.println(m.getBorrowedbooks());
			}
			break;
		}	
		case 6:
		{

			MemberClass[] member = LibraryClass.getMember();
			for(MemberClass m:member)
			{
				if(m!=null)
				System.out.println(m);
			}
			break;
		}
		default :
		{
			System.out.println("invalid input");	
			}			
			}
		}
	}
}