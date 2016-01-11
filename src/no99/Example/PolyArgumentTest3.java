package no99.Example;

import java.util.*;
//�԰��� �߰�
class Product  //
{
	int price;			// ��ǰ�� ����
	int bonusPoint;		// ��ǰ���� �� �����ϴ� ���ʽ�����
	
	int amount;//����(�԰�,���)
	int stock; //���
	
	Product(int price) {
		this.price = price;
		bonusPoint =(int)(price/10.0);
	}

	Product() {
		price = 0;
		bonusPoint = 0;
		stock = 0; //������ �ʱ����
		amount = 0; //����
	}
	
}

class Tv extends Product {
	Tv() {
		super(100);	
	}

	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	Computer() {
		super(200);
	}

	public String toString() {
		return "Computer";
	}
}

class Audio extends Product {
	Audio() {
		super(50);
	}

	public String toString() {
		return "Audio";
	}
}
/*
class Admin
{
	Product p = new Product();
}
*/

class Buyer {			// ��, ������ ��� ���
	int money = 1000;	// �����ݾ�
	int bonusPoint = 0;	// ���ʽ�����
	Vector item = new Vector();	// ������ ��ǰ�� �����ϱ� ���� �迭

	void buy(Product p) {
		if(money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ ��� �����ϴ�.");
			return;
		}
//
//		if(�մ��� ������ ����>�������)
//		{
//			System.out.println("���� ��� �����Ͽ� ������ ��� �����ϴ�.");
//			return;
//		}
//		
//		if(�մ��� ������ ����<�������)
		{
			money -= p.price;	        // ���� ������ ������ ��ǰ�� ������ ����.
			bonusPoint += p.bonusPoint;	// ��ǰ�� ���ʽ� ������ �߰��Ѵ�.
			item.add(p);	        // ��ǰ�� Product[] item�� �����Ѵ�.
			System.out.println(p + "��/�� �����ϼ̽��ϴ�.");
		}
//		
		
//		money -= p.price;	        // ���� ������ ������ ��ǰ�� ������ ����.
//		bonusPoint += p.bonusPoint;	// ��ǰ�� ���ʽ� ������ �߰��Ѵ�.
//		item.add(p);	        // ��ǰ�� Product[] item�� �����Ѵ�.
//		System.out.println(p + "��/�� �����ϼ̽��ϴ�.");
	}

	void refund(Product p)
	{
		if(item.remove(p)) 
		{
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p+"��/�� ��ǰ�ϼ̽��ϴ�.");
//			
//			���� += ��ǰ����
//					
		}
		else
		{
			System.out.println("�����Ͻ� ��ǰ �� �ش� ��ǰ�� �����ϴ�.");
		}
	}
	
	void summary() {		    // ������ ��ǰ�� ���� ������ ����ؼ� ���� �ش�.
		int sum = 0;		 	// ������ ��ǰ�� �����հ�
		String itemList =""; 	// ������ ��ǰ���

		// �ݺ����� �̿��ؼ� ������ ��ǰ�� �� ���ݰ� ����� �����.
		
		if(item.isEmpty()) 
		{
			System.out.println("�����Ͻ� ��ǰ�� �����ϴ�.");
			return;
		}
		
		for(int i=0; i<item.size();i++) {
			Product p = (Product)item.get(i);
			sum += p.price;
			itemList += (i==0) ? "" + p :  ", " + p;
		}
		System.out.println("�����Ͻ� ��ǰ�� �ѱݾ��� " + sum + "�����Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ�� " + itemList + "�Դϴ�.");
//		System.out.println("�����Ͻ� ��ǰ�� ������ " + ���� + "�Դϴ�.");
	}
}

class PolyArgumentTest3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.�����ڸ��  2.����ڸ��");
		int mod = sc.nextInt();
		
		Product p = new Product();
		
		if(mod == 1 )
		{
//			Admin ad = new Admin();
			
			System.out.print("�԰��Ͻ� ��ǰ ������ ������ �ּ��� : ");
			System.out.print("1.tv \n 2.computer \n 3.audio");
			
			
			System.out.print("�԰��Ͻ� ������ �Է��� �ּ��� : ");
			p.amount = sc.nextInt();
			
			p.stock += p.amount;
			
			System.out.println("�԰��Ͻ� ������ "+p.amount +"�Դϴ�.");
			System.out.println("�԰��Ͻ� ����� "+p.stock +"�Դϴ�.");
			
		}
		if(mod == 2 )
		{
		Buyer b = new Buyer();
		Tv tv = new Tv();
		Computer com = new Computer();
		Audio audio = new Audio();
		
		b.buy(tv);
		b.buy(com);
		b.buy(audio);
		b.summary();
		System.out.println();
		b.refund(com);
		b.summary();
		}
	}
}