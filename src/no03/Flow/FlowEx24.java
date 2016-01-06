package no03.Flow;

import java.io.IOException;

public class FlowEx24 
{
	public static void main(String[] args) throws java.io.IOException {
	{
			int input = 0;
			
			System.out.println("문장을 입력하세요.");
			System.out.println("입력을 마치려면 x를 입력하세요.");
			do
			{
				input = System.in.read(); // read() 입력 > buffer에 저장 > 엔터 buffer값이누르면 작동.
				System.out.print((char)input);//문자를 받았기때문에 char으로 캐스팅 해줌.
			}
			while(input!=-1 && input != 'x');// ctrl + z 를 입력하면 -1가 전달됨 , x는 '문자 x'
		}
	}
}