package Student_Marks_Management_system;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Student_Main {
	static BufferedReader student =new BufferedReader (new InputStreamReader(System.in));
	static Student [] studentarray=new Student[100];
	private static int StudentCount;

	public static Student getStudentInfo() throws IOException {
		System.out.println("All Student: ");
		System.out.println("Enter details for a new students : ");// Requesting the student information

		System.out.print("Name :");
		String name= student.readLine();
		
		System.out.print("Enter Student NickName: ");
		String nickName=student.readLine();
	
		
		System.out.println("Enter marks for 6 subjects (or less,defaults to 0 )");
		int [] marks =new int[6];
		for (int i =0 ;i<6 ;i++) {	
			System.out.println("Subject " +(i+1)+":");
			int mark=Integer.parseInt(student.readLine());
			marks[i]=mark;
				
		}
		System.out.println("Enter address1: ");
		String address1=student.readLine();
		
		System.out.println("Enter address2 (or press Enter to skip )");
		String address2=student.readLine();
		
		Student student;
		if (address2.isEmpty()) {
			student =new Student( name, nickName, address1,marks);	
		}
		else {
			student =new Student(name,nickName,address1,address2,marks);
		}
		studentarray[StudentCount] = student;// update studentCount when i put new students
        StudentCount++;
		return student;
		
	}
	public static void main(String[] args) throws IOException {
		String flag="";
		// TODO Auto-generated method stub
		do {
			Student students =getStudentInfo();
			studentarray[Student.getStudentCount()-1]=students;			
		
		//do while use ml cause loop body can do 1 time
		System.out.print("Do you want to enter another new student?(yes or no)");
		flag =student.readLine();
	
		} while(flag.equalsIgnoreCase("yes"));// whatever capital or small letter
		
		display();
        displayHighestGPAStudent();
		displayMeanMarks();
	}
	
	   
	public static void display() {
        for (int i = 0; i < StudentCount; i++) {
            studentarray[i].display();
            System.out.println();
        }

        System.out.println("Mean Mark : " + Student.getMeanmark());
        System.out.println();
        System.out.println("Total Students : " + Student.getStudentCount());
    }

    public static void displayHighestGPAStudent() {
        if (StudentCount == 0) {
            System.out.println("No students available.");
            
        }

        Student highestGPAStudent = studentarray[0];
        for (int i = 1; i < StudentCount; i++) {
            if (studentarray[i].gethighestGPT() > highestGPAStudent.gethighestGPT()) {
                highestGPAStudent = studentarray[i];
            }
        }

        System.out.println("Student with the Highest GPA:");
        highestGPAStudent.display();
    }
    public static void displayMeanMarks() {
    	//double [] meanMarks =new double[6];
		if (StudentCount==0) {
			System.out.println("No students availabe");
			
		}
		double [] meanMarks =new double[6];
		for (int i =0;i< StudentCount;i++) {
			
			int []marks=studentarray[i].getMarks();//
			
			for (int j = 0; j < marks.length; j++) {
	            meanMarks[j] += marks[j];
	        }
		}
		System.out.println();
		System.out.println("Mean Marks : ");
	    for (int i = 0; i < meanMarks.length; i++) {
	        meanMarks[i] /= StudentCount;
	        System.out.println("Subject " + (i + 1) + ": " + meanMarks[i]);
	    }
		
    }
}
	
	
		
		