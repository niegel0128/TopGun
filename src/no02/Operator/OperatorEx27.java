package no02.Operator;
//2015.12.30(7)
public class OperatorEx27 
{
	public static void main(String[] args)
	{
	int x = 10;
	int y = -10;
	
	int absX = (x >= 0) ? x: -x; //���׿�����, (x >= 0)�� �´ٸ� x,�ƴϸ� -x�� ��� 
	int absY = (y >= 0) ? y : -y;
	
	System.out.println("x = 10�� ��, x�� ���밪��" + absX);
	System.out.println("y = -10�� ��, y�� ���밪��"+absY);
	}
}
