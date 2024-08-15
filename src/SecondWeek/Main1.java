package SecondWeek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1 {
	static BufferedReader br =new BufferedReader (new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String [] arr;
		//int aniCount=0;
		String flag;
		Animal[] animalsArray=new Animal[100];
		do {
			System.out.println("Enter animals name: ");
			String name=br.readLine();
			System.out.println("Enter age :");
			int age=Integer.parseInt(br.readLine());
			System.out.println("Enter species: ");
			String species=br.readLine();
			Animal animals=new Animal();
			animals.name=name;
			
			
			Animal ani =new Animal();
			ani.name = name;
            ani.age = age;
            ani.species = species;
			
			animalsArray[Animal.aniCount]=ani;
			Animal.aniCount++;
			
			System.out.println("Do you want to enter another animas ?(yes/no)");
			
			flag=br.readLine();
			}while(flag.equals("yes"));
		System.out.println("\nTotal number of animals: " + Animal.aniCount);
		
		for (int i=0;i<Animal.aniCount;i++) {
			System.out.println("\nAnimal " + (i + 1) + ":");
			animalsArray[i].display();
			
		}
		


	}

}
