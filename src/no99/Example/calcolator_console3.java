package no99.Example;

public class calcolator_console3 
{
	public static void main(String[] args) throws java.io.IOException
	{
		int a = ' ';

		System.out.println("이진볍 변환기 입니다.");
		System.out.println("종료를 원하시면 'x'를 입력해주세요.");
		System.out.println("이진법으로 변환하실 숫자를 입력해주세요. 예) 2");
		System.out.println("");
		do
		{		
			a = (int)System.in.read() - 48;	
			System.out.println(+a+" 에 해당하는 2진법수는 "+ Integer.toBinaryString(a) + "입니다.");
			System.out.println("");
		}
		while(a != 'x' && a < 0);
	}
}
