package no99.Example;

public class calculator_console1 
{
	public static void main(String[] args)
	{
		//��Ģ���� ���α׷� console.
		//����
		System.out.println("����");
		for(int i=1;i<=9;i++)
		{
			System.out.println("********"+i+" + "+"x" + " = ? " + "********");
			System.out.println("**************************");
			for(int j=1;j<=9;j++)
			{
				System.out.println("\t" +i+ " + "+j+ " = "+(i+j)+"");
			}
			System.out.println("**************************");
		}
		
		//����
		/*
		for(int i=9;i>=1;i--)
		{
			for(int j=1;j<=9;j++)
			{
				System.out.println("" +i+ " - "+j+ " = "+(i-j)+"");
			}
		}
		*/
		System.out.println("����");
		for(int i=1;i<=9;i++)
		{
			System.out.println("********"+i+" - "+"x" + " = ? " + "********");
			System.out.println("**************************");
			for(int j=1;j<=9;j++)
			{
				System.out.println("\t" +i+ " - "+j+ " = "+(i-j)+"");
			}
			System.out.println("**************************");
		}
		//����
		System.out.println("����");
		for(int i=1;i<=9;i++)
		{
			System.out.println("********"+i+" * "+"x" + " = ? " + "********");
			System.out.println("**************************");
			for(int j=1;j<=9;j++)
			{
				System.out.println("\t" +i+ " * "+j+ " = "+(i*j)+"");
			}
			System.out.println("**************************");
		}
		
		//������
		System.out.println("������");
		for(int i=1;i<=9;i++)
		{
			System.out.println("********"+i+" / "+"x" + " = ? " + "********");
			System.out.println("**************************");
			for(int j=1;j<=9;j++)
			{
				System.out.println("\t" +i+ " / "+j+ " = "+(i/j)+"");
			}
			System.out.println("**************************");
		}
		
	}
}
