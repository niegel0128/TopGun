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
		
		System.out.println("���۽ð� : " + starttime);
		System.out.println("����ð� : " + endtime);
		System.out.println("�ҿ�ð� : " + (endtime - starttime));
	}
}
