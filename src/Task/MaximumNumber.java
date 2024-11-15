package Task;

import java.util.Scanner;

public class MaximumNumber 
{
	 public static void main(String[] args)
	 {
		 
		 Scanner Number=new Scanner (System.in);
		 
		 System.out.println("Enter Your first number:");
		 int number1 =Number.nextInt();
		 
		 System.out.println("Enter Your second number:");
		 int number2 =Number.nextInt();
		 
		 System.out.println("Enter Your third number:");
		 int number3 =Number.nextInt();
	        
	        int maximum = 0;

	        
	        if (number1 > number2 && number1 > number3) 
	        {
	            maximum = number1;
	        } 
	        else if (number2 > number1 && number2 > number3)
	        {
	            maximum = number2;
	        } 
	        else if (number3 > number1 && number3 > number2) 
	        {
	            maximum = number3;
	        } 
	        else 
	        {
	            
	            System.out.println("There is a tie or invalid input.");
	        }

	       
	        if (maximum != 0) {
	            System.out.println("The maximum number is: " + maximum);
	        }
	 }
}
