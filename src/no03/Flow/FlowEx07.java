package no03.Flow;

public class FlowEx07 
{
	public static void main(String[] args)
	{

		int score = 0 ;
		char ch = (char)(Math.random() *4 + 'A');

		switch (ch)
		{
			case 'A':
				score = 90;
				break;
			case 'B':
				score = 80;
				break;			
			case 'C':
				score = 70;
				break;
			case 'D':
				score = 60;
				break;
			
		}
		System.out.println("당신의 점수는 " + score + "점 이상 입니다.");
	}
}
