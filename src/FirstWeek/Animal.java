package FirstWeek;

import java.util.Scanner;

public class Animal {
	String name ;
	int age;
	String species;
	void inputData() {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter animal name: ");
		
		name=scan.nextLine();
		System.out.println("Enter age :");
		age=scan.nextInt();
		System.out.println("Enter species :");
		species=scan.nextLine();	
		
	}
	void display() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Species :"+species);
		
	}

	

}
