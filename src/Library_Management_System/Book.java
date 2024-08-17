package Library_Management_System;

public class Book {
	 
	private  String title;
	private  String subtitle;
	private static int totalnumberBook=0;
	
	
	public Book() {
		
	}
	public Book(String title) {
		this.title =title;
		totalnumberBook++;
		
		
	}
	public Book(String title,String subtitle) {
		this.title =title;
		this.subtitle =subtitle;
		totalnumberBook++;
	}
	
	public void displayInfo() {
		if(this.subtitle != null){
            System.out.println("Title: " + this.title);
            System.out.println("Subtitle: " + this.subtitle);
        }else{
            System.out.println("Title: " + this.title);
            System.out.println("");
        }
		
	}
	public static int getAllNumberBook() {
		return totalnumberBook;
		
	}
	
	
		
	

}
