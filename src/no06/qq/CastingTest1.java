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
		fe2 = (FireEngine)car;//car는 바로위쪽 Car car 에서 car이고, FireEngine은 밑에 클래스를 가져온거임. 이유는 조상의경우 자손클래스의 인스턴스를 쓸때 선턴해줘야하기떄문임
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
//InstanceofTest 파일 실행때문에 주석화 원래는 주석아님
//class FireEngine extends Car 
//{
//	void water()
//	{
//		System.out.println("water");
//	}
//}
