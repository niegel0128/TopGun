package no03.Flow;

import java.io.IOException;

public class FlowEx24 
{
	public static void main(String[] args) throws java.io.IOException {
	{
			int input = 0;
			
			System.out.println("������ �Է��ϼ���.");
			System.out.println("�Է��� ��ġ���� x�� �Է��ϼ���.");
			do
			{
				input = System.in.read(); // read() �Է� > buffer�� ���� > ���� buffer���̴����� �۵�.
				System.out.print((char)input);//���ڸ� �޾ұ⶧���� char���� ĳ���� ����.
			}
			while(input!=-1 && input != 'x');// ctrl + z �� �Է��ϸ� -1�� ���޵� , x�� '���� x'
		}
	}
}