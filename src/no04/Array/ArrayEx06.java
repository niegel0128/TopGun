package no04.Array;

public class ArrayEx06 
{
	public static void main(String[] args)
	{
//		int[] number = new int[10];
//		int[] counter = new int[10];
		
		int[] number = new int[100];
		int[] counter = new int[100];
		
		for(int i=0; i<number.length; i++)
		{
			System.out.print(number[i] = (int)(Math.random() * 10));
		}
		System.out.println();
		
		for(int i =0; i<number.length; i++)
		{
			counter[number[i]]++;
		}
		for(int i=0; i<number.length; i++)
		{
			System.out.println(i+"�� ����: "+counter[i]);
		}
		
	}
}
