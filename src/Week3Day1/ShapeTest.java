package Week3Day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShapeTest {
	static BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
	//static Rectangle []rectangles =new  Rectangle[100];//to store the array of rectangle
	//static Circle [] circles =new Circle[100];//1
	//static Square [] squares =new Square [100];
	
	static Shape [] shapes =new Shape [300];
	
	public static Rectangle getRectangle()throws IOException {
		
		System.out.println("Enter the length : ");
		double length =Double.parseDouble(br.readLine());
		System.out.println("Enter the width : ");
		double width =Double.parseDouble(br.readLine()) ;
		
		Rectangle rectangle =new Rectangle(length,width);
		return rectangle;
		
	}
	public static Circle getCircle() throws IOException {
		System.out.println("Enter Radius : ");
		double radius=Double.parseDouble(br.readLine());
		
		
		Circle circle =new Circle(radius);//create the circle // step 
		return circle;
		
	}
	public static Square getSquare() throws IOException{
		System.out.println("Enter Square side : "); 
		double side =Double.parseDouble(br.readLine());
		
		Square square =new Square (side);	
		
		return square;
		
	}
	
	public static void getInfo()throws IOException {
		String flag=" ";
		do {
			System.out.print("Enter shape type :");
			String type = br.readLine();
		if (type.equalsIgnoreCase("Rectangle")) {
			Rectangle rectangle =getRectangle();
			shapes[Shape.getCount()-1]=rectangle;// to store the array of index //getCount-1 ka 0 a kan ka ny lo chin loh 
				
		}
		else if (type.equalsIgnoreCase("Circle")) {
			Circle circles =getCircle();
			shapes[Shape.getCount()-1]=circles;//step 3	post fix count++	
			
		}
		else if (type.equalsIgnoreCase("Square")) {	
			Square square =getSquare();
			shapes[Shape.getCount()-1] =square;// pre fix ++count
				
		}
		System.out.println("Do y want to add new shape ?(yes or no):  ");
		flag =br.readLine();
		
		}while(flag.equalsIgnoreCase("yes"));
		
	}
	@Override
	public String toString() {
		return "ShapeTest [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	public static void displayShapes() {
		System.out.println("**Shapes**");
		for(int i=0;i< Shape.getCount();i++) {
			shapes[i].display();
			
		}
	}	
	

	public static void displyShape() {
		//displayRectangle();
		//displayCircle();
		//displaySquare();	
		
	}
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		getInfo();
		displayShapes();
	
			
		
	}

}
