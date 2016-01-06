package no03.Flow;

public class FlowEx03 
{
	public static void main(String[] atgs)
	{
		int score = 45;
		char grade = ' '; // 학점을 저장하기위한 변수, 공백으로 초기화함.
		
		if (score >=  90)
		{
			grade = 'A';			
		}
		else if (score >= 80)
		{
			grade = 'B';
		}
		else 
		{
			grade = 'C';
		}
		
		System.out.println("당신의 학점은 " + grade + "입니다.");		
	}
}
