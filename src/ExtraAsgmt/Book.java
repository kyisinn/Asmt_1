package ExtraAsgmt;

public class Book {
	private String name;
	private Author author;
	private double price;
	private int qtyInStock;
	public Book(String name,double price,int qtyInStock) {
		this.name=name;
		this.qtyInStock=qtyInStock;
		this.price=price;
		
	}
	public Book(String name,Author author,double price,int qtyInStock) {
		this.name=name;
		this.author=author;
		this.price=price;
		this.qtyInStock=qtyInStock;
		
	}
	public String getName() {
		return name;
		
	}
	public Author getAuthor() {
		return author;
		
	}
	public double getPrice() {
		return price;
		
	}
	public String toString() {
		String books="Name :  "+ name +"\n";
		books+="Author :"+author +"\n";
		books+= "Price : "+ price +"\n";
		books+="qtyInStock :"+qtyInStock+"\n";
		return books;
		
	}
//	public void display() {
//		System.out.println("Name :"+this.name);
//		System.out.println("Author namee :"+this.author);
//		System.out.println("Price :"+this.price);
//		System.out.println("qtyinStock :"+this.qtyInStock);	
//		
//	}

	
	


}
