package no05.a;

class Data1
{
	int value;
}

class Data2
{
	int value;
	Data2(int x) //�Ű������� �ִ� ������
	{
		value = x;
	}
}


public class ConstructorTest 
{
	public static void main(String[] args)
	{
		Data1 d1 = new Data1();
		//Data2 d2 = new Data2();// compile error�߻� //������ �Ű�����(int x)�� �ִµ�, �̰� ��� ������ ��. �ǰ��Ͽ��� new Data2() ��ȣ �ȿ� �Ű������� �������
	}
}
