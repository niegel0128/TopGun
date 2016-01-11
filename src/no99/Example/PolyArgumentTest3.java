package no99.Example;

import java.util.*;
//입고기능 추가
class Product  //
{
	int price;			// 제품의 가격
	int bonusPoint;		// 제품구매 시 제공하는 보너스점수
	
	int amount;//수량(입고,출고)
	int stock; //재고
	
	Product(int price) {
		this.price = price;
		bonusPoint =(int)(price/10.0);
	}

	Product() {
		price = 0;
		bonusPoint = 0;
		stock = 0; //수량의 초기재고
		amount = 0; //수량
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

class Buyer {			// 고객, 물건을 사는 사람
	int money = 1000;	// 소유금액
	int bonusPoint = 0;	// 보너스점수
	Vector item = new Vector();	// 구입한 제품을 저장하기 위한 배열

	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살수 없습니다.");
			return;
		}
//
//		if(손님이 구입할 수량>매장재고)
//		{
//			System.out.println("매장 재고가 부족하여 물건을 살수 없습니다.");
//			return;
//		}
//		
//		if(손님이 구입할 수량<매장재고)
		{
			money -= p.price;	        // 가진 돈에서 구입한 제품의 가격을 뺀다.
			bonusPoint += p.bonusPoint;	// 제품의 보너스 점수를 추가한다.
			item.add(p);	        // 제품을 Product[] item에 저장한다.
			System.out.println(p + "을/를 구입하셨습니다.");
		}
//		
		
//		money -= p.price;	        // 가진 돈에서 구입한 제품의 가격을 뺀다.
//		bonusPoint += p.bonusPoint;	// 제품의 보너스 점수를 추가한다.
//		item.add(p);	        // 제품을 Product[] item에 저장한다.
//		System.out.println(p + "을/를 구입하셨습니다.");
	}

	void refund(Product p)
	{
		if(item.remove(p)) 
		{
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p+"을/를 반품하셨습니다.");
//			
//			수량 += 제품수량
//					
		}
		else
		{
			System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
		}
	}
	
	void summary() {		    // 구매한 물품에 대한 정보를 요약해서 보여 준다.
		int sum = 0;		 	// 구입한 물품의 가격합계
		String itemList =""; 	// 구입한 물품목록

		// 반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
		
		if(item.isEmpty()) 
		{
			System.out.println("구입하신 제품이 없습니다.");
			return;
		}
		
		for(int i=0; i<item.size();i++) {
			Product p = (Product)item.get(i);
			sum += p.price;
			itemList += (i==0) ? "" + p :  ", " + p;
		}
		System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
//		System.out.println("구입하신 제품의 수량은 " + 미정 + "입니다.");
	}
}

class PolyArgumentTest3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.관리자모드  2.사용자모드");
		int mod = sc.nextInt();
		
		Product p = new Product();
		
		if(mod == 1 )
		{
//			Admin ad = new Admin();
			
			System.out.print("입고하실 상품 종류를 선택해 주세요 : ");
			System.out.print("1.tv \n 2.computer \n 3.audio");
			
			
			System.out.print("입고하실 수량을 입력해 주세요 : ");
			p.amount = sc.nextInt();
			
			p.stock += p.amount;
			
			System.out.println("입고하신 수량은 "+p.amount +"입니다.");
			System.out.println("입고하신 재고은 "+p.stock +"입니다.");
			
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