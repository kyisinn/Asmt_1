package Library_Management_System;

public class Library {

	private Book[]booklist;// creating list to store a booklist
	
	private int bookCount=0;	
	public Library() {	
	}
	
	public Library(int size) {
		  this.booklist = new Book[size]; //initalize the array with a size
		
		
	}
	public void addBook(Book book) {
		
		//Book book =new Book();
		if(bookCount<booklist.length) {
			booklist[bookCount]=book;
			bookCount++;	
		}
		else {
			System.out.println("Cannot add more books to the library");
			
		}
	}
	public void displayAllBooks() {
		
		
		for (int i=0;i<bookCount;i++) {
			booklist[i].displayInfo();
			System.out.println();
		}
		System.out.println("Total number of books Created :"+Book.getAllNumberBook());
		
	}
}



