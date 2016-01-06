package no02.Operator;
//2015.12.30(5)
public class OperatorEx25 
{
	public static void main(String[] args)
	{
		char x = 'j';
		
		if((x>'a' && x <= 'z') || (x>='A' && x <= 'Z'))
		{
			System.out.println("유효한 문자입니다.");
		}
		
		/*
		if((x>='A' && x <= 'Z'))
		{
			System.out.println("(x>='A' && x <= 'Z')");
		}
		*/
		/*
		if((x>='A'))
		{
			System.out.println("x>='A'");
		}
		
		else if((x <= 'Z'))
		{
			System.out.println("x <= 'Z'");
		}
		*/
		
		else
		{
			System.out.println("유효하지 않은 문자입니다.");
		}
	}
}
