package no03.Flow;

public class FlowEx05 
{
	public static void main(String[] args)
	{
		int score = 82;
		String grade = "";
		
		System.out.println("����� ������ " + score + " �Դϴ�.");
		
		if (score >= 90 )
		{
			grade = "A";
			if(score >= 98)
			{
				grade += "+";
			}
			else if (score < 94)
			{
				grade += "-";
			}
		}
		else if(score >= 80)
		{
			grade = "B";
			if( score >= 88)
			{
				grade += "+";				
			}
			else if ( score < 84)
			{
				grade += "-";
			}
		}
		else 
		{
			grade = "C";
		}
		System.out.println("����� ������ " + grade + " �Դϴ�.");		
	}
}
