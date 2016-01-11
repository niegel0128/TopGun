package no11.Exception;

public class ExceptionEx8 
{
	public static void amin(String args[])
	{
		try{
			throw new Exception();
		}
		catch(Exception e)
		{
			System.out.println("Exception이 발생했습니다.");
		}
	}
}
