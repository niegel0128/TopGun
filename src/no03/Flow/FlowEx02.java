package no03.Flow;

public class FlowEx02 
{
	public static void main(String[] args)
	{
		int visitCount = 5;
		if(visitCount <1)
		{
			System.out.println("ó�����̱���. �湮���ּż� �����մϴ�.");
		}
		else
		{
			System.out.println("�ٽ� �湮�� �ּż� �����մϴ�.");
		}
		System.out.println("�湮Ƚ���� " + ++visitCount + "�� �Դϴ�.");
	}
}