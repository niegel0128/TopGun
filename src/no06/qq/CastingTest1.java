package no06.qq;

public class CastingTest1 
{
	public static void main(String[] args)
	{
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe;
		fe2 = (FireEngine)car;//car�� �ٷ����� Car car ���� car�̰�, FireEngine�� �ؿ� Ŭ������ �����°���. ������ �����ǰ�� �ڼ�Ŭ������ �ν��Ͻ��� ���� ����������ϱ⋚����
		fe2.water();
	}
}

class Car
{
	String color;
	int door;
	
	void drive()
	{
		System.out.println("drive, Brr~");
	}
	
	void stop()
	{
		System.out.println("Stop!!!");
	}
}
//InstanceofTest ���� ���ට���� �ּ�ȭ ������ �ּ��ƴ�
//class FireEngine extends Car 
//{
//	void water()
//	{
//		System.out.println("water");
//	}
//}
