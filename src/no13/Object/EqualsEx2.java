package no13.Object;

class Person
{
	long id;
	public boolean equals(Object obj)
	{
		if(obj !=null && obj instanceof Person)
		{
			return id == ((Person)obj).id;
		} else {
			return false;
		}
	}
	
	Person(long id){
		this.id = id;
	}
}

public class EqualsEx2 
{
	public static void main(String[] args)
	{
		Person p1 = new Person(8011081111222L);
		Person p2 = new Person(8011081111222L);
		
		if(p1==p2){ //주소값을 비교했을때 다름~값으은 같으나, 생성된 위치가 달라서 false임
			System.out.println("p1과 p2는 같은 사람입니다.");
		} else {
			System.out.println("p1과 p2는 다른 사람입니다.");
		}
		
		if(p1.equals(p2)){
			System.out.println("p1과 p2는 같은 사람입니다.");
		} else
		{
			System.out.println("p1과 p2는 다른 사람입니다.");
		}
	}
}
