package no05.a;

public class MemberCall 
{
	int iv = 10;
	static int cv = 20;
	
	int iv2 = cv;	
	//static int cv2 = iv ; //����.Ŭ�����������ν��Ͻ� ������ �����
	static int cv2 = new MemberCall().iv; //��ó�� ��ü�� �����ؾ� ��밡��
	
	static void staticMethod1()
	{
		System.out.println(cv);
		MemberCall c = new MemberCall();
		System.out.println(c.iv); //��ü�� ������ �Ŀ��� �ν��Ͻ�������
	}
	
	void instanceMethod1()
	{
		System.out.println(cv);
		System.out.println(iv); //�ν��Ͻ� �ż��忡���� �ν��Ͻ� ������ �ٷ�
	}
	
	static void staticMethod2()
	{
		staticMethod1();
//		instanceMethod(); // ����. Ŭ�����޼��忡���� �μ��Ͻ��޼��带 ȣ��
		MemberCall c = new MemberCall();
		c.instanceMethod1(); // �ν��Ͻ��� ������ �Ŀ��� ȣ���� �� ����.
	}
	
	void instanceMethod2()
	{
		staticMethod1();
		instanceMethod1();
	}
}
