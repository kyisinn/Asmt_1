package ExtraAsgmt;

public class TestPoint {

	public static void main(String[] args) {
		MyPoint point =new MyPoint();
		
		point.setXY(0, 3);
		System.out.println(point);
		
		MyPoint point2 =new MyPoint(4,0);
		point2.setXY(4, 0);
		System.out.println(point2);
		
		
		System.out.println("The point one :"+point.distance(4,0));
		System.out.println();
		System.out.println("The point two :"+point.distance(point2));
		
		
		

	}

}
