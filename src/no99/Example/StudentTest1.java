package no99.Example;

class Student
{
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	int getTotal(int a,int b,int c)
	{
		return a+b+c;
	}
	
	int getAverage(int a,int b,int c)
	{
		return (a+b+c)/3;
	}
}

class StudentTest1 
{
	public static void main(String[] args)
	{
		Student st = new Student();
		st.name = "È«±æµ¿";
		st.ban = 1;
		st.no =  1;
		st.kor = 100;
		st.eng = 100;
		st.math = 100;
		int getTotal = st.getTotal(st.kor,st.eng ,st.math);
		int getAverage = st.getAverage(st.kor,st.eng ,st.math);
		
		System.out.println("ÀÌ¸§ : " + st.name + " ÃÑÁ¡ : " + getTotal + " Æò±Õ : " + getAverage);
		
		
	}
}
