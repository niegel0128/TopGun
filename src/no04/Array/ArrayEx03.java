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
		//////////////////////////////////�� �������� ���� int[10] = new int[]{0,1,2,3,4,5,6,7,8,9}�� �ȴ�.
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
		//     ��������(����)
		//		n 5 - ������ ����*10 �� �Ͽ� ���¼�.
		//		number[0] 0 - temp = number[0] �̹Ƿ�,number[0]�� ��(0) �� ����Ѵ�.
		//		number[n] 5 - number[0] = number[n] �̹Ƿ�, number[n] �� n �� 5�̹Ƿ�, number[5] =  5 �� ��µȴ�. 
		//		temp 0 = temp�� �ʱ⿡ 0 ���� ����Ǿ����Ƿ�,number[n]�� 0�̴�.
		/////////////////////////////////////////////////////////////////////////////////////////
		for (int i=0; i<number.length;i++)
		{
			System.out.print(number[i]);
		}
	}
	
}
