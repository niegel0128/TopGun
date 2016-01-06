package no03.Flow;

public class FlowEx19 
{
	public static void main(String[] args)
	{
		long starttime = System.currentTimeMillis();
		for(int i = 0; i < 1000000000;i++)
		{
			;
		}
		long endtime =  System.currentTimeMillis();
		
		System.out.println("시작시간 : " + starttime);
		System.out.println("종료시간 : " + endtime);
		System.out.println("소요시간 : " + (endtime - starttime));
	}
}
