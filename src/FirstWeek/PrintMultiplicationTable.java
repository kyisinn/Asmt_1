package FirstWeek;

import java.util.Scanner;

public class PrintMultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a number :");
		
		int num = scan.nextInt();
		int res = 0;	
		System.out.println("Multiplication Table for " + num );
		for (int i = 1 ;i <= 10 ; i++) {
			res= num * i;	
			System.out.println(num +" * " + i + " = " +res);
		}
		

		
	}

}
