package no02.Operator;
//2015.12.30(5)
public class OperatorEx25 
{
	public static void main(String[] args)
	{
		char x = 'j';
		
		if((x>'a' && x <= 'z') || (x>='A' && x <= 'Z'))
		{
			System.out.println("��ȿ�� �����Դϴ�.");
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
			System.out.println("��ȿ���� ���� �����Դϴ�.");
		}
	}
}
