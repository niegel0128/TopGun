package no04.Array;

public class ArrayEx02 
{
	public static void main(String[] args)
	{
//		int[] score = {79,88,91,33,100,55,95};
		int[] score = {79,88,91,33,100,55,95,99,1};
		
		
		int max = score[0]; //�迭�� ù��° ������ �ִ밪�� �ʱ�ȭ.
		int min = score[0]; //�迭�� ù��° ������ �ּҰ��� �ʱ�ȭ.
		
		System.out.println("score[0] :  " + score[0]);
		
		for(int i=1;i<score.length;i++)
		{
			if(score[i]>max)
			{
				max = score[i];
//				System.out.println(score[i]+" �ִ밪 : "+max);
			}
			if(score[i]<min)
			{
				min = score[i];
//				System.out.println(score[i]+" �ּҰ� : "+min);
			}
		}
		
		System.out.println("�ִ밪 : "+max);
		System.out.println("�ּҰ� : "+min);
	}
}
