package no99.Example;

class Employee
{
		String name;	//이름
		int age;		//나이
		int EmployeNumber; //사원번호
		String TeamName;//업종
		String position;//직위
		
		void working() 
		{
			System.out.print("계속 ");
			System.out.println("일함");
		}
}

public class EmployeeData
{
	public static void main(String[] args)
	{
		Employee e1 = new Employee();
		e1.name = "조성용";
		e1.age = 99;
		
		System.out.println("사원이른 : "+ e1.name);
		System.out.println("사원나이 : "+ e1.age);

		e1.working();
		
	}
}