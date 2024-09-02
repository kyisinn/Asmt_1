package Week3Day1;

public class Square extends Shape{
	private double side;
	private static int count=0;
	
	public Square(double side) {
		this.side=side;
		++count;
		
	}
	@Override
	public double Area() {
		
		double area=Math.pow(2, this.side);
		return area;
		
		
	}
	public static int getCount() {
		return count;
		
	}
	public void display() {
		System.out.println("side  :" +this.side);
		System.out.println("Area of square  :" + this.Area());
		
	}

}
