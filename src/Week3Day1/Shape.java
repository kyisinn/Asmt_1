package Week3Day1;

public abstract class Shape {
	private static int count;
		
	public Shape() {
		count++;
	}

	public double Area() {
		
		return 0;
	}

	public static int getCount() {
		// TODO Auto-generated method stub
		return count;
	}

	public abstract void display();//don't want to write body implementaion 

	public static void setCount(int count) {
		Shape.count = count;
	}
	

}
