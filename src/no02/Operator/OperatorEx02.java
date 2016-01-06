package no02.Operator;
//2015.12.29(11)
public class OperatorEx02 
{
	public static void main(String atg[])
	{
		int i=5;
		int j=0;
		j = i++;
		System.out.println("j=i++ 실행 후 , i=" + i +", j=" +j);
		
		i=5;
		j=0;
		j = ++i;
		System.out.println("j=++i 실행 후 , i=" + i +", j=" +j);
	}
}
