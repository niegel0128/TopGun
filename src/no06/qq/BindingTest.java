package no06.qq;

public class BindingTest 
{
	public static void main(String[] args)
	{
		//p.19 다형성에 대한 이해가 필요  // 부모는 자식에게 존재하는 인스턴스를 사용할수없고, 자식은 부모에게 존재하는걸 재선언 할경우 오버라이팅이 되기때문에 child부분이 출렫외게됨.
		Parent p = new Child(); // 이럴떄 클래스를 읽는 부분은? (형태에 대한 설명요구) 클래스 이름 (Parent) 변수(p) = new 클래스이름();
		Child c = new Child();
		
		System.out.println("p.x = " +p.x);
		p.method();
		
		System.out.println("c.x = " +c.x);
		c.method();
	}
}
/*
class Parent 
{
	int x =100;
	
	void method()
	{
		System.out.println("Parent Method");
	}
}

class Child extends Parent 
{
	int x =200;
	
	void method()
	{
		System.out.println("Child Method");
	}
}
*/