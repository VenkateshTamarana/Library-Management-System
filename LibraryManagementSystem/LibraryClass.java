package LibraryManagementSystem;

import java.util.Arrays;

public class LibraryClass 
{
	private static  BookClass[] books = new BookClass[100];
	// why we using static because we are want to call with class name.if we are calling with instance every time new object will be created and there 100 copies 
	// int[] a = new Int[100];

private static MemberClass[] member = new MemberClass[100];


public LibraryClass(BookClass[] books, MemberClass[] member) {
super();
this.books = books;
this.member = member;
}

public static BookClass[] getBooks() {
return books; // a , a, 
}
public static void setBooks(BookClass books,int i)
//a,0
// why we using int i because we want to add one-by-one book in index position wise
{
LibraryClass.books[i] = books;
// Library.book[0] = a;

}
public static MemberClass[] getMember() {
return member;
}
public static void setMember(MemberClass member, int i) {
LibraryClass.member[i] = member;
// Library.member[0] = member;
}
@Override
public String toString() {
return "Library [books=" + Arrays.toString(books) + ", member=" + Arrays.toString(member) + "]";
}

		
}


