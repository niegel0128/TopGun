package no05.a;

class Data1
{
	int value;
}

class Data2
{
	int value;
	Data2(int x) //매개변수가 있는 생성자
	{
		value = x;
	}
}


public class ConstructorTest 
{
	public static void main(String[] args)
	{
		Data1 d1 = new Data1();
		//Data2 d2 = new Data2();// compile error발생 //위쪽은 매개변수(int x)가 있는데, 이건 없어서 에러가 쯤. 되게하여면 new Data2() 괄호 안에 매개변수를 넣으면됨
	}
}
