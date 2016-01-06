package no99.Example;

public class calculator_console1 
{
	public static void main(String[] args)
	{
		//»çÄ¢¿¬»ó ÇÁ·Î±×·¥ console.
		//µ¡¼À
		System.out.println("µ¡¼À");
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
		
		//»¬¼À
		/*
		for(int i=9;i>=1;i--)
		{
			for(int j=1;j<=9;j++)
			{
				System.out.println("" +i+ " - "+j+ " = "+(i-j)+"");
			}
		}
		*/
		System.out.println("»¬¼À");
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
		//°ö¼À
		System.out.println("°ö¼À");
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
		
		//³ª´«¼Â
		System.out.println("³ª´«¼À");
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
