package no03.Flow;

public class FlowEx03 
{
	public static void main(String[] atgs)
	{
		int score = 45;
		char grade = ' '; // ������ �����ϱ����� ����, �������� �ʱ�ȭ��.
		
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
		
		System.out.println("����� ������ " + grade + "�Դϴ�.");		
	}
}
