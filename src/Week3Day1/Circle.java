package Week3Day1;

public class Circle extends Shape{
	private double radius;
	private static int count=0;
	public Circle(double radius) {
		this.radius=radius;
		++count;
	}
	@Override
	public double Area() {
		double area  = Math.PI*Math.pow(2, this.radius);
		return area;
		
		
	}
	public static int getCount() {
		return count;
		
	}
	public void display() {
		System.out.println("Radius  :" +this.radius );
		
		System.out.println("Area of circle :" + this.Area());
		
	}

}
