package no04.Array;

public class ArrayEx02 
{
	public static void main(String[] args)
	{
//		int[] score = {79,88,91,33,100,55,95};
		int[] score = {79,88,91,33,100,55,95,99,1};
		
		
		int max = score[0]; //배열의 첫번째 값으로 최대값을 초기화.
		int min = score[0]; //배열의 첫번째 값으로 최소값을 초기화.
		
		System.out.println("score[0] :  " + score[0]);
		
		for(int i=1;i<score.length;i++)
		{
			if(score[i]>max)
			{
				max = score[i];
//				System.out.println(score[i]+" 최대값 : "+max);
			}
			if(score[i]<min)
			{
				min = score[i];
//				System.out.println(score[i]+" 최소값 : "+min);
			}
		}
		
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
	}
}
