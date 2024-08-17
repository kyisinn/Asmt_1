package Library_Management_System;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//static Library[] library=new Library[100]; // Creae a library to store to 100 book in libray

public class Main {
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	
	public static Book getBookinfo() throws IOException {
		
		System.out.print("Enter details for a new book : Title : ");
		String title=br.readLine();
		
		System.out.print("Subtitle (or press Enter to skip) : ");
		String subtitle=br.readLine();
	
		
		Book Book;
		if (subtitle.isEmpty()) {
			Book = new Book(title);
			return Book;
        } else {
        	Book = new Book(title,subtitle);
        	
            System.out.println("Subtitle: " + subtitle);
        }
		
		return Book;
	
		
	}
		
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Library library =  new Library (100);//creat the library 
		
		String flag=" ";
		do {
			Book Book =getBookinfo();
			library.addBook(Book);
			
			System.out.print("Do you want to enter another book? (yes/no): ");
			System.out.println();
    
        	flag =br.readLine();
		}while(flag.equalsIgnoreCase("yes"));
		System.out.println();
		System.out.println("Libray Inverntory: ");
		library.displayAllBooks();
		
	
	

	}

}
