package no99.Example;

class Employee
{
		String name;	//�̸�
		int age;		//����
		int EmployeNumber; //�����ȣ
		String TeamName;//����
		String position;//����
		
		void working() 
		{
			System.out.print("��� ");
			System.out.println("����");
		}
}

public class EmployeeData
{
	public static void main(String[] args)
	{
		Employee e1 = new Employee();
		e1.name = "������";
		e1.age = 99;
		
		System.out.println("����̸� : "+ e1.name);
		System.out.println("������� : "+ e1.age);

		e1.working();
		
	}
}