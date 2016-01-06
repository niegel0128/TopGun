package no00;
//2015.12.29(4)
public class CharToCode 
{
	public static void main(String[] args)
	{
		char ch 	= 'A';		 //char ch = '\u0041';로 바꿔 써도 같음
		int code 	= (int)ch;	 // ch에 저장된 값을 int형으로 변환.
	
		System.out.println(ch);
		System.out.println(code);
		//////////////////////////////////////////////////////////
		char A	= '\u0041';		 //char ch = '\u0041';로 바꿔 써도 같음
		System.out.println(A);
		//////////////////////////////////////////////////////////
	}
}
