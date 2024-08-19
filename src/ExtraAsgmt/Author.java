package ExtraAsgmt;

public class Author {
	private String name;
	private String email;
	private char gender;
	static int count=0;
	
	
	public Author(String name,String email,char gender) {
		this.name=name;
		this.email=email;
		this.gender=gender;	
		count++;
	}
	public String getName() {
		return name;	
	}
	public void setEmail(String email) {
		this.email=email;	
	}
	public String getEmail() {
		return email;
		
	}
	public char getGender() {
		return gender;
	
	}
	public int getCount() {
		return count;
		
	}
	
	public void display() {
		//for (int i =0;i<getCount();i++)
			//System.out.println(i);
			
		System.out.println("**Author**");
		System.out.println("Count :"+getCount());
//		
	}
	@Override
	public String toString() {
		String obj="Author name :"+ name +"\n";
		obj+="Email : "+ email +"\n";
		obj+="Gender  : "+ this.getGender() +"\n";
		return obj;
		
		 
	}
	
}

