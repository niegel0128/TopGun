package no99.Example;

public class calcolator_console2 
{
	public static void main(String[] args) throws java.io.IOException
	{
		int a = 0;
		int b = 0;
		int c = 0;
		
		System.out.println("��Ģ������� �Դϴ�.");
		System.out.println("���Ḧ ���Ͻø� 'x'�� �Է����ּ���.");
		System.out.print("ù��° ��¥���� �Է����ּ���. ��) 1+1 ");
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
				System.out.print((a+c)+"�Դϴ�.");
				System.out.print("02 : "+"a: "+a+" b: "+b+" c: "+c);
			}
			
			else if(b=='-')
			{
				System.out.print("= ");
				System.out.print((a-c)+"�Դϴ�.");
				System.out.print("03 : "+"a: "+a+" b: "+b+" c: "+c);
			}
			
			else if(b=='*')
			{
				System.out.print("= ");
				System.out.print((a*c)+"�Դϴ�.");
				System.out.print("04 : "+"a: "+a+" b: "+b+" c: "+c);
			}
			
			else if(b=='/')
			{
				System.out.print("= ");
				System.out.print((a/c)+"�Դϴ�.");
				System.out.print("05 : "+"a: "+a+" b: "+b+" c: "+c);
			}
			
			else
			{
				System.out.print("�߸��� ������ �Դϴ�.���α׷��� �����մϴ�.");
				System.out.print("06 : "+"a: "+a+" b: "+b+" c: "+c);
			}
		}
		while(a != 'x' && b != 'x' && c != 'x');
	}
}
