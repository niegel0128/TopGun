package no99.Example;

public class calcolator_console2 
{
	public static void main(String[] args) throws java.io.IOException
	{
		int a = 0;
		int b = 0;
		int c = 0;
		
		System.out.println("사칙연산계산기 입니다.");
		System.out.println("종료를 원하시면 'x'를 입력해주세요.");
		System.out.print("첫번째 숫짜부터 입력해주세요. 예) 1+1 ");
		System.out.println("");
		
		System.out.print("01 : "+"a: "+a+" b: "+b+" c: "+c);
		
		do
		{		
			a = (int)System.in.read() - 48;	
			b = System.in.read(); 	
			c = (int)System.in.read() - 48 ; 

			if(b=='+')
			{
				System.out.print("= ");
				System.out.print((a+c)+"입니다.");
				System.out.print("02 : "+"a: "+a+" b: "+b+" c: "+c);
			}
			
			else if(b=='-')
			{
				System.out.print("= ");
				System.out.print((a-c)+"입니다.");
				System.out.print("03 : "+"a: "+a+" b: "+b+" c: "+c);
			}
			
			else if(b=='*')
			{
				System.out.print("= ");
				System.out.print((a*c)+"입니다.");
				System.out.print("04 : "+"a: "+a+" b: "+b+" c: "+c);
			}
			
			else if(b=='/')
			{
				System.out.print("= ");
				System.out.print((a/c)+"입니다.");
				System.out.print("05 : "+"a: "+a+" b: "+b+" c: "+c);
			}
			
			else
			{
				System.out.print("잘못된 연산자 입니다.프로그램을 종료합니다.");
				System.out.print("06 : "+"a: "+a+" b: "+b+" c: "+c);
			}
		}
		while(a != 'x' && b != 'x' && c != 'x');
	}
}
