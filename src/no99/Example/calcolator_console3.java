package no99.Example;

public class calcolator_console3 
{
	public static void main(String[] args) throws java.io.IOException
	{
		int a = ' ';

		System.out.println("������ ��ȯ�� �Դϴ�.");
		System.out.println("���Ḧ ���Ͻø� 'x'�� �Է����ּ���.");
		System.out.println("���������� ��ȯ�Ͻ� ���ڸ� �Է����ּ���. ��) 2");
		System.out.println("");
		do
		{		
			a = (int)System.in.read() - 48;	
			System.out.println(+a+" �� �ش��ϴ� 2�������� "+ Integer.toBinaryString(a) + "�Դϴ�.");
			System.out.println("");
		}
		while(a != 'x' && a < 0);
	}
}
