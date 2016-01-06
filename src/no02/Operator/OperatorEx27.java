package no02.Operator;
//2015.12.30(7)
public class OperatorEx27 
{
	public static void main(String[] args)
	{
	int x = 10;
	int y = -10;
	
	int absX = (x >= 0) ? x: -x; //삼항연산자, (x >= 0)가 맞다면 x,아니면 -x를 출력 
	int absY = (y >= 0) ? y : -y;
	
	System.out.println("x = 10일 때, x의 절대값은" + absX);
	System.out.println("y = -10일 때, y의 절대값은"+absY);
	}
}
