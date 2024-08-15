package SecondWeek;

public class Animal {
	public String name;
	public int age;
	public String species;
	public static int aniCount=0;//share use loh ya dl cause of static
public Animal(){
	
}
public Animal(String name, int age, String species) {
	super();
	this.name = name;
	this.age = age;
	this.species = species;
	//aniCount++;

}
public void display() {
	System.out.println("Name :"+name);
	System.out.println("Age :"+age );
	System.out.println("Species :"+species+"\n");
}

	
	
	
	

}
