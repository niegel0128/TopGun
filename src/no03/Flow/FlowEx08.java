package no03.Flow;

public class FlowEx08 
{
	public static void main(String[] args)
	{
		int score = 1;
		
		switch(score * 100)
		{
			case 100:
				System.out.println("당신의 점수는 100이고,삼품은 자전거 입니다.");
			case 200:
				System.out.println("당신의 점수는 200이고,삼품은 tv 입니다.");
			case 300:
				System.out.println("당신의 점수는 300이고,삼품은 노트북 입니다.");
			case 400:
				System.out.println("당신의 점수는 400이고,삼품은 자동차 입니다.");
			System.out.println("죄송하지만 당신의 점수에 해당하는 상품이 없습니다.");
		}
	}
}
