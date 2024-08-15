package Student_Marks_Management_system;

import java.util.Arrays;

public class Student {
	private String name;
	private  String nickName;
	private String address1;
	private String address2;
	int[] marks;
	private static int studentCount=0;
	private static int AllTotalMarks=0;// class code
	
	public Student() {
		
	}
	public Student(String name,String nickName,String address1,int[] marks) {
		this.name = name;
		this.nickName = nickName;
		this.address1 =address1;
		this.marks=marks;
		studentCount++;
		AllTotalMarks+=this.totalMark();	
	}
	public Student(String name,String nickName,String address2,String address1,int[] marks) {
		this.name = name;
		this.nickName = nickName;
		this.address1 =address1;
		this.address2 =address2;
		this.marks=marks;
		studentCount++;
		AllTotalMarks+=this.totalMark();
		
		
		
	}
	
	private int totalMark() {
		int total=0;
		for (int i =0;i<this.marks.length;i++) {
			total+=this.marks[i];
		}
		return total;
		
	}
	
	
	public double CalculateGPA() {
		double GPA=0;
		int total=this.totalMark();
		
		GPA=total/this.marks.length;	
		return GPA;
		
	}
	public static double getMeanmark() {
		double mean =AllTotalMarks/studentCount;
		return mean;
		
	}
//	
	
	public void display() {
	    System.out.println("Student Name: " + this.name);
	    System.out.println("Nick Name: " + this.nickName);
	    System.out.println("Address 1: " + this.address1);
	    System.out.println("Address 2: " +  this.address2);
	    System.out.println("Marks: " + Arrays.toString(this.marks));
	    System.out.println("GPA: " + this.CalculateGPA());
	}

	
		
		
	
	public static int getStudentCount(){
		return studentCount;
		
	}
	public double gethighestGPT() {
		return this.CalculateGPA();
		
	}
	public int[] getMarks() {
		// TODO Auto-generated method stub
		return marks;
	}
	

}
