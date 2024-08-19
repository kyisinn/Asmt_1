package ExtraAsgmt;

public class TestAuthor {

	public static void main(String[] args) {
		Author author = new Author("kyi", "kyi@au.edu",'m');
		Author author2=new Author("Peter Lee", "peter@nowhere.com", 'm');
		
		System.out.println(author);
		System.out.println(author2);
		author.display();
		
		
		Book book = new Book("Java for dummmies", author, 9.99, 88);
		Book book2 =new Book ("Java for more dummies",19.99, 8);
		//book.display();
		System.out.println(book);
		System.out.println(book2);
		
		
		

	}

}
