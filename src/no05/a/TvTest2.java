package no05.a;
/*CaptionTv사용을 위해 주석처리함 원래는 주석처리 안되어있었음
class Tv 
{
	// Tv의 속성(멤버변수)
	String color;	//색상
	boolean power;	//전원상태(on/off)
	int channel;	//채널
	
	//Tv의 기능(메서드)
	void power() { power = !power; } //tv를 켜거나 끄는 기능
	void channelUp() {++channel;}	//tv의 채널을 높이는 기능
	void channelDown(){--channel;}	//tv의 채널을 낮추는 기능
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
		System.out.println("현재 채널은 " + t.channel + " 입니다.");
	}
}

class TvTest2
{
	public static void main(String[] args)
	{
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
		
		t1.channel = 7;
		System.out.println("t1의 channel값을 1로 변경하였습니다.");
		
		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
		
	}
}