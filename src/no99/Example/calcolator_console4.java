package no99.Example;

public class calcolator_console4 
{

		public static void main(String[] args) throws java.io.IOException
		{
			
			int z = 0;
			int y = 0;
			System.out.println("***********���ڸ� ���� ���� �մϴ�************");
			System.out.println("***********������ �Ұ� �մϴ�************");
			System.out.println("���Ͻô� ���⸦ �������ּ���");
			System.out.println("1.��Ģ�������");
			System.out.println("2.����������");
			
			z = (int)System.in.read() - 48;	
			y = (int)System.in.read() - 13;	
			//System.out.println(z+y);
			
			if((z-y)==1){
				
				
//				System.out.print("01 : "+"a: "+a+" b: "+b+" c: "+c+" z: "+z);
//				System.out.println(" z: "+z);
				
				System.out.println("��Ģ������� �Դϴ�.");
				System.out.println("���Ḧ ���Ͻø� 'x'�� �Է����ּ���.");
				System.out.print("ù��° ��¥���� �Է����ּ���. ��) 1+1 ");
				System.out.println("");
				do
				{		
					int a = 0;
					int b = 0;
					int c = 0;
					
					int d = 0;
					int e = 0;
					int f = 0;
					
					d = System.in.read();
					//e = System.in.read();
					//f = System.in.read();
					
					a = (int)System.in.read() - 48;	
					b = System.in.read(); 	
					c = (int)System.in.read() - 48 ; 

					//System.out.println("03 : "+"a: "+a+" b: "+b+" c: "+c+" d: "+d+" e: "+e+" z: "+z);
					
					if(b=='+')
					{
						System.out.print("= ");
						System.out.print((a+c)+"�Դϴ�.");
					}
					
					else if(b=='-')
					{
						System.out.print("= ");
						System.out.print((a-c)+"�Դϴ�.");
					}
					
					else if(b=='*')
					{
						System.out.print("= ");
						System.out.print((a*c)+"�Դϴ�.");
					}
					
					else if(b=='/')
					{
						System.out.print("= ");
						System.out.print((a/c)+"�Դϴ�.");
					}
					else
					{
						System.out.print("�߸��� ������ �Դϴ�.���α׷��� �����մϴ�.");
						System.out.print("03 : "+"a: "+a+" b: "+b+" c: "+c+" d: "+d+" e: "+e+" z: "+z);
					}
				}
//				while(a != 'x' && b != 'x' && c != 'x' && z !='x');
				while(z !='x');
				
			}
			else if((z-y)==2){
				int a = ' ';
				int d = 0;
				//System.out.print("07 : "+"a: "+a + " z: "+z);
				System.out.println("������ ��ȯ�� �Դϴ�.");
				System.out.println("���Ḧ ���Ͻø� 'x'�� �Է����ּ���.");
				System.out.println("���������� ��ȯ�Ͻ� ���ڸ� �Է����ּ���. ��) 2");
				System.out.println("");
				do
				{		
					d = System.in.read() - 48;
					a = (int)System.in.read() - 48;	
					System.out.println(+a+" �� �ش��ϴ� 2�������� "+ Integer.toBinaryString(a) + "�Դϴ�.");
					System.out.println("");
				}
				while(a != 'x' && a < 0);
			}
			else {
				System.out.println("���⸦ �߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
			}
			
		}
}
