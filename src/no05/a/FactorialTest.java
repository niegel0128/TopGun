package no05.a;

public class FactorialTest 
{
	public static void main(String[] args)
	{
		System.out.println(factorial(4));
	}
	
	
	//return (n==1)?1:n*factorical(n-1) 
	//위와같이 해도됨.
	static long factorial(int n)
	{
		long result = 0;
		
		if(n == 1)
		{
			result = 1;
		}
		else 
		{
			result = n * factorial(n-1);
		}
		
		return result;
	}
}
