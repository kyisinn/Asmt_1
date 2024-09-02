package ExtraAsgmt;

public class MyPoint {
	private int x=0;
	private int y=0;
	
	public MyPoint() {
		
	}
	public MyPoint(int x,int y) {
		this.x=0;
		this.y=0;
		
	}
	public void setXY(int x ,int y) {
		this.x=x;
		this.y=y;
		
		
	}
	public double distance(int x1,int y1) {
		double xy=0;
		return xy =Math.sqrt(Math.pow(this.x-x1,2)+Math.sqrt(Math.pow(this.y-y1, 2)));
		
	}
	public double distance(MyPoint another) {
		double distance=0;
		return distance (another. x,another. y);
		
	}
	public String toString(){
		String str="SetX : "+x+"\n";
		str+="SetY : "+y+"\n";
		return str;
		
	}
	public void display() {
		
	}
	
	
}
