package quiz;

import java.util.Random;

public class B12_TempPassword {
	
	/*
	 	4자리 랜덤 알파벳 대문자 구성된 비밀번호를 생성하여 출력하는 
	 	프로그램을 만들어보세요
	 	
	 	-> 65 ~ 90
	 */
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		for (int i = 0; i < 4; ++i) {
			char ch = (char)(Math.random() * 26 + 65);
			System.out.print(ch);
		}
		System.out.println();
	}

}
