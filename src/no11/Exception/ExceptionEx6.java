package no11.Exception;

public class ExceptionEx6 
{
	public static void main(String args[])
	{
		try{
			Exception e= new Exception("고의발생");
			throw e;
		}
		catch(Exception e)
		{
			System.out.println("에러 메시지 : " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램이 정상 종료되었음");
	}
}
