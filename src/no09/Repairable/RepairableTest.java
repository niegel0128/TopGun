package no09.Repairable;

class RepairableTest
{
	public static void main(String[] args) 
	{
		Tank tank = new Tank();
		Dropship dropship = new Dropship();

		Marine marine = new Marine();
		SCV	scv = new SCV();

		scv.repair(tank);		// SCV�� Tank�� �����ϵ��� �Ѵ�.
		scv.repair(dropship);
//		scv.repair(marine);		// ����! repair(Repairable)  in SCV cannot be applied to (Marine)
	}
}

interface Repairable {}
class GroundUnit extends Unit {
	GroundUnit(int hp) {
		super(hp);
	}
}

class AirUnit extends Unit {
	AirUnit(int hp) {
		super(hp);
	}
}

class Unit
{
	int hitPoint;
	final int MAX_HP;
	Unit(int HP) 
	{
		MAX_HP = HP;
	}
}

class Tank extends GroundUnit implements Repairable 
{
	Tank() 
	{
		super(150);
		hitPoint = MAX_HP;
	}
	
	public String toString() 
	{
		return "Tank";
	}
}

class Dropship extends AirUnit implements Repairable
{
	Dropship()
	{
		super(125);
		hitPoint = MAX_HP;
	}
	
	public String toString() 
	{
		return "Dropship";
	}
}

class Marine extends GroundUnit
{
	Marine()
	{
		super(40);
		hitPoint = MAX_HP;
	}
}

class SCV extends GroundUnit implements Repairable
{
	SCV()
	{
		super(60);
		hitPoint = MAX_HP;
	}
	
	void repair(Repairable r)
	{
		if(r instanceof Unit)
		{
			Unit u = (Unit)r;
			while(u.hitPoint !=u.MAX_HP)
			{
				u.hitPoint++;
			}
			System.out.println(u.toString() + "�� ������ �������ϴ�.");
		}
	}
}