package no00;
//2015.12.29(3) 오버플로우
public class ByteOverflow {
	public static void main(String[] args)
	{
		byte b 	= 0; // byte형 변수 b를 선언하고 0 으로 초기화
		int i 	= 0;
		
		//반복문을 이용해서 b의 값을 1씩, 0부터 270까지 증가시킨다.
		
		for(int x=0; x<= 270; x++)
		{
			System.out.print(b++);
			System.out.print('\t');
			System.out.println(i++);
		}

	}
}
