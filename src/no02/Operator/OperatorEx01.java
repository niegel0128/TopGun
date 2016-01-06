package no02.Operator;
//2015.12.29(10)
public class OperatorEx01 
{
	public static void main(String args[])
	{
		int i=5;
		i++;					//i=i+1 과 같은 의미이다. ++i로 바꿔써도 결과는 같다.
		System.out.println(i);
		i=5;					//결과 비교를 위해 i를 다시 5로 변경.
		++i;
		System.out.println(i);
	}
}
