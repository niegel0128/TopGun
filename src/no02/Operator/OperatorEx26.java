package no02.Operator;
//2015.12.30(6)�����û.
public class OperatorEx26 
{
	public static void main(String[] arg)
	{
		int x = 3;
		int y = 5;
		
		System.out.println("x�� " + x + "�̰�, y��" + y + "�� ��, ");
		System.out.println("x | y = " + (x|y)); // |�� or 2���� ��ȯ�Ͽ� ����� �����ϳ��� 1�ΰ�� ����
		System.out.println("x & y = " + (x&y));	// &�� and 2���� ��ȯ�Ͽ� ����� �� �� 1�ΰ�� ����
		System.out.println("x ^ y = " + (x^y));	// �����ϳ��� 2������ ��ȯ������ �����ϳ��� 1�ΰ�쿡�� ����.
		
		System.out.println("true | false = " + (true|false)); //�����ϳ��� true�ΰ�� true���
		System.out.println("true & false = " + (true&false));
		System.out.println("true ^ false = " + (true^false));
	}
}
