package Task;

public class FactorialNumber {

	public static void main(String[] args) {
		
		int factorial =1;
		
		for(int i=1;i<=5;i++)
		{
			factorial=factorial*i;
		}
		
		System.out.println("5! total factorial value: "+factorial);
	}

}
