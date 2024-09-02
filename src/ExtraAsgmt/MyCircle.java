package ExtraAsgmt;

public class MyCircle {
	private MyPoint center;
	private double radius=1.0;
	public MyCircle() {
		
	}
	public MyCircle(int xCenter,int yCenter,double radius) {
		this.center=new MyPoint(xCenter,yCenter);
		this.radius=radius;
		
		
	}
	public MyCircle(MyPoint center,double radius) {
		this.center=center;
		this.radius=radius;
		
	}
	
	public MyPoint getCenter() {
		return center;
		
	}
	public void setCenter(MyPoint center) {
		this.center=center;
	}
	public double getRadius() {
		return radius;
		
	}
	public int getCenterX() {
        return center.getX();
    }

    // Setter for center's x-coordinate
    public void setCenterX(int x) {
        center.setX(x);
    }	
	
	public void setCenterY(int y) {
		center.setY(y);
		
	}
	public int getCenterY() {
		return yCenter;
		
	}
	public void setCenterXY(int x ,int y) {
		this.center.setXY(x,y);
		
		
		
	}
	
	
	


}
