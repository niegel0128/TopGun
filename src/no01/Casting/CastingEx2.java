package no01.Casting;
//2015.12.29(8)
public class CastingEx2 
{
	public static void main(String[] args)
	{
		byte b 	= 10;
		int i 	= (int)b;
		System.out.println("i=" + i);
		System.out.println("b=" + b);
		
		int i2 	= 900;
		byte b2 = (byte)i2;
		System.out.println("i2=" + i2);
		System.out.println("b2=" + b2);
		///////////////////////////////////
		byte b3 = -128; //byte -128~127
		System.out.println("b3=" + b3);
		///////////////////////////////////
	}
}
