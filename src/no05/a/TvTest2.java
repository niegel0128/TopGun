package no05.a;
/*CaptionTv����� ���� �ּ�ó���� ������ �ּ�ó�� �ȵǾ��־���
class Tv 
{
	// Tv�� �Ӽ�(�������)
	String color;	//����
	boolean power;	//��������(on/off)
	int channel;	//ä��
	
	//Tv�� ���(�޼���)
	void power() { power = !power; } //tv�� �Ѱų� ���� ���
	void channelUp() {++channel;}	//tv�� ä���� ���̴� ���
	void channelDown(){--channel;}	//tv�� ä���� ���ߴ� ���
}
*/
class TvTest
{
	public static void main(String[] args)
	{
		Tv t;
		t = new Tv();
		t.channel = 7;
		t.channelDown();
		System.out.println("���� ä���� " + t.channel + " �Դϴ�.");
	}
}

class TvTest2
{
	public static void main(String[] args)
	{
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		System.out.println("t1�� channel���� " + t1.channel + "�Դϴ�.");
		System.out.println("t2�� channel���� " + t2.channel + "�Դϴ�.");
		
		t1.channel = 7;
		System.out.println("t1�� channel���� 1�� �����Ͽ����ϴ�.");
		
		System.out.println("t1�� channel���� " + t1.channel + "�Դϴ�.");
		System.out.println("t2�� channel���� " + t2.channel + "�Դϴ�.");
		
	}
}