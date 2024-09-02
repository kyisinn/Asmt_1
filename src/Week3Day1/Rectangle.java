package Week3Day1;

public class Rectangle extends Shape{
	private double length;
	private double width; 
	private static int count=0;
	public Rectangle(double length,double width) {
		this.length = length ;
		this.width  =width ;
		++count;
	}
	@Override
	public double Area() {
		double area =this.length*this.width;
		return area;	
	}
	public static int getcount() {
		return count;
		
		
	}
	public void display() {
		System.out.println("Length :" +this.length );
		System.out.println("Width :" +this.width );
		System.out.println("Area :" + this.Area());
		
	}

}
