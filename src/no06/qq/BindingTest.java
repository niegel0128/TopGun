package no06.qq;

public class BindingTest 
{
	public static void main(String[] args)
	{
		//p.19 �������� ���� ���ذ� �ʿ�  // �θ�� �ڽĿ��� �����ϴ� �ν��Ͻ��� ����Ҽ�����, �ڽ��� �θ𿡰� �����ϴ°� �缱�� �Ұ�� ������������ �Ǳ⶧���� child�κ��� �⎹�ܰԵ�.
		Parent p = new Child(); // �̷��� Ŭ������ �д� �κ���? (���¿� ���� ����䱸) Ŭ���� �̸� (Parent) ����(p) = new Ŭ�����̸�();
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