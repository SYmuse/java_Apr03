package test01;

import java.util.Scanner;

public class Input_test31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("Input your name: ");
	   Scanner scanner =new Scanner(System.in);
	   
	   String name =scanner.next();
	 
	   System.out.println("Your name is " +name +"." );		
		
	   System.out.println("Input your age :"  );
	   
	   int age=scanner.nextInt();
	   
	   System.out.println(name+"'s  age is "+age+ ".");
	   
	   System.out.println("Input your height and weight:");
	   
	   double height =scanner.nextDouble();
	   double weight =scanner.nextDouble();
	   
	   System.out.print("Height:" + height+"cm  ");
	   System.out.print("Weight:" + weight+"kg" );
	}

}
