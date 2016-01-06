package no04.Array;

public class ArrayEx03 
{
	public static void main(String[] args)
	{
		int[] number = new int[10];
		///////////////////////////////////
		for(int i=0; i<number.length;i++)
		{
			number[i] = i;
			System.out.print(number[i]);
		}
		//////////////////////////////////이 과정으로 인해 int[10] = new int[]{0,1,2,3,4,5,6,7,8,9}가 된다.
		System.out.println();
		/////////////////////////////////////////////////////////////////////////////////////////
		for(int i=0; i<100;i++)
		{
			int n = (int)(Math.random()*10);
			System.out.println("n "+n);
			int temp  = number[0];
			System.out.println("number[0] "+number[0]);
			number[0] = number[n];
			System.out.println("number[n] "+number[n]);
			number[n] = temp;
			System.out.println("temp "+temp);
		}
		/////////////////////////////////////////////////////////////////////////////////////////
		//     과정설명(예제)
		//		n 5 - 랜덤한 숫자*10 을 하여 나온수.
		//		number[0] 0 - temp = number[0] 이므로,number[0]의 값(0) 을 출력한다.
		//		number[n] 5 - number[0] = number[n] 이므로, number[n] 의 n 이 5이므로, number[5] =  5 가 출력된다. 
		//		temp 0 = temp는 초기에 0 으로 선언되었으므로,number[n]은 0이다.
		/////////////////////////////////////////////////////////////////////////////////////////
		for (int i=0; i<number.length;i++)
		{
			System.out.print(number[i]);
		}
	}
	
}
