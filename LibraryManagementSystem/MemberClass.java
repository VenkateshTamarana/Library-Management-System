package LibraryManagementSystem;

public class MemberClass 
{
    private String name;
    private int Id;
    private String borrowedbooks;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	@Override
	public String toString() {
		return "MemberClass [name=" + name + ", Id=" + Id + ", borrowedbooks=" + borrowedbooks + "]";
	}
	public String getBorrowedbooks() {
		return borrowedbooks;
	}
	public void setBorrowedbooks(String borrowedbooks) {
		this.borrowedbooks = borrowedbooks;
	}
    
}
//i used in this encapusulation because it uses for hiding data& better to modify the data & calling a specific variable by using setter and getter methods
