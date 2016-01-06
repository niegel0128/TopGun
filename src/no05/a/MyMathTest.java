package no05.a;

public class MyMathTest 
{
	public static void main(String[] args)
	{
		MyMath mm = new MyMath();
		long result1 = mm.add(5L, 3L);
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L); //long 보다 double이 크니까, 내부적으로 형변환이 일어남.
		System.out.println("add(5L,3L) = " +result1);
		System.out.println("subtract(5L,3L) = " +result2);
		System.out.println("multuply(5L,3L) = " +result3);
		System.out.println("divide(5L,3L) = " +result4);
	}
}

class MyMath 
{
	long add(long a, long b)
	{
		long result = a+b;
		return result;
		//return a+b;위의 두줄을 이와같이 한줄로 간단히 할 수 있다.
	}
	long subtract(long a,long b)
	{
		return a = b;
	}
	long multiply(long a,long b)
	{
		return a * b;
	}
	
	double divide(double a,double b)
	{
		return a/b;
	}
}
