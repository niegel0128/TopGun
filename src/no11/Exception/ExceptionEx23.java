package no11.Exception;

public class ExceptionEx23 
{
	public static void main(String[] args)
	{
		try {
			method1();
		} catch(Exception e) {
			System.out.println("main�޼��忡�� ���ܰ� ó���Ǿ����ϴ�.");
		}
	}
	
	static void method1() throws Exception
	{
		try { 
			throw new Exception();
		} catch ( Exception e)
		{
			System.out.println("method�޼��忡�� ���ܰ� ó���Ǿ����ϴ�.");
			throw e;
		}
	}
	
}