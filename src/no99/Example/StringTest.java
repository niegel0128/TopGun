package no99.Example;

public class StringTest 
{
	public static void main(String args[])
	{
		String s = new String ("Hello");
		
		char [] c = {'H','e','l','l','o'};
		String s1 = new String(c);
		String s2 = "Hello";
		String s3 = s.concat("World");
		
		System.out.println(s);
		System.out.println(c);
		System.out.println(s1);
		System.out.println(s3);
		
		
		String s4 = "java.lang.Object";
		int idx1 = s4.lastIndexOf('.');
		int idx2 = s4.indexOf('.');
		
		System.out.println(s4);
		System.out.println(idx1);
		System.out.println(idx2);
		
	}
}
