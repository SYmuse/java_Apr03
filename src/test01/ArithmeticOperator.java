package test01;

import java.util.Scanner;

public class ArithmeticOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input the integer: ");
        int time=scanner.nextInt();  //input integer    
        int second = time%60;        //The remainder when divided by 60 is second  
        int minute = (time/60)%60;   //The quotient divided by 60 is divided 60 and the remainder is minutes
        int hour = (time/60)/60;     //The quotient divided by 60 is divided 60 is hour
        
        System.out.print(time +" seconds is ");
        System.out.print(hour + " hour(s) " );
        System.out.print(minute + "minute(s) ");
        System.out.print(second + "second(s).");
        
        scanner.close();
        
		
		
	}

}
