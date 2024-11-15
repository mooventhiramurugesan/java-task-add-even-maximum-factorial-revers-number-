package Task;

public class AddandEven
{
	 public static void main(String[]args) 
     {
          int add=0;
          int even=0;
		 for(int i=1;i<=10;i++)
		 {
			 if(i%2==0)
			 {
				 add=add+i;
			 }
			 else
			 {
				even= even+i; 
			 }
		 }
		 System.out.println("add number count: "+add);
		 System.out.println("add number count: "+even);
	 }
}
