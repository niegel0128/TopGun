package no99.Example;

public class calcolator_console4 
{

		public static void main(String[] args) throws java.io.IOException
		{
			
			int z = 0;
			int y = 0;
			System.out.println("***********한자리 수만 가능 합니다************");
			System.out.println("***********음수는 불가 합니다************");
			System.out.println("원하시는 계산기를 선택해주세요");
			System.out.println("1.사칙연산계산기");
			System.out.println("2.이진법계산기");
			
			z = (int)System.in.read() - 48;	
			y = (int)System.in.read() - 13;	
			//System.out.println(z+y);
			
			if((z-y)==1){
				
				
//				System.out.print("01 : "+"a: "+a+" b: "+b+" c: "+c+" z: "+z);
//				System.out.println(" z: "+z);
				
				System.out.println("사칙연산계산기 입니다.");
				System.out.println("종료를 원하시면 'x'를 입력해주세요.");
				System.out.print("첫번째 숫짜부터 입력해주세요. 예) 1+1 ");
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
						System.out.print((a+c)+"입니다.");
					}
					
					else if(b=='-')
					{
						System.out.print("= ");
						System.out.print((a-c)+"입니다.");
					}
					
					else if(b=='*')
					{
						System.out.print("= ");
						System.out.print((a*c)+"입니다.");
					}
					
					else if(b=='/')
					{
						System.out.print("= ");
						System.out.print((a/c)+"입니다.");
					}
					else
					{
						System.out.print("잘못된 연산자 입니다.프로그램을 종료합니다.");
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
				System.out.println("이진볍 변환기 입니다.");
				System.out.println("종료를 원하시면 'x'를 입력해주세요.");
				System.out.println("이진법으로 변환하실 숫자를 입력해주세요. 예) 2");
				System.out.println("");
				do
				{		
					d = System.in.read() - 48;
					a = (int)System.in.read() - 48;	
					System.out.println(+a+" 에 해당하는 2진법수는 "+ Integer.toBinaryString(a) + "입니다.");
					System.out.println("");
				}
				while(a != 'x' && a < 0);
			}
			else {
				System.out.println("계산기를 잘못 입력하셨습니다. 프로그램을 종료합니다.");
			}
			
		}
}
