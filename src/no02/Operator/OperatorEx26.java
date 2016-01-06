package no02.Operator;
//2015.12.30(6)설명요청.
public class OperatorEx26 
{
	public static void main(String[] arg)
	{
		int x = 3;
		int y = 5;
		
		System.out.println("x는 " + x + "이고, y는" + y + "일 때, ");
		System.out.println("x | y = " + (x|y)); // |는 or 2진수 변환하여 연산시 둘중하나가 1인경우 받음
		System.out.println("x & y = " + (x&y));	// &는 and 2진수 변환하여 연산시 둘 다 1인경우 받음
		System.out.println("x ^ y = " + (x^y));	// 둘중하나가 2진수로 변환했을때 둘중하나가 1인경우에만 받음.
		
		System.out.println("true | false = " + (true|false)); //둘중하나가 true인경우 true출력
		System.out.println("true & false = " + (true&false));
		System.out.println("true ^ false = " + (true^false));
	}
}
