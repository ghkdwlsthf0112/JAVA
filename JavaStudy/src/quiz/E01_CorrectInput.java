package quiz;

import java.util.Scanner;

public class E01_CorrectInput {
	
	/*
		 사용자로부터 스캐너로 숫자를 입력받되
		 숫자가 아닌 문자를 입력하더라도 다시 입력받을 수 있는 프로그램을 만들어보세요 
	*/
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		int num;
		
		while(true) {
			try {
				System.out.print("숫자만 입력해주세요");
				num = sc.nextInt();
				break;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("숫자 아닌 문자열이 들어왔습니다");
				sc.nextLine(); // 비우기
			}	
		}
		System.out.println("입력을 잘 받았습니다: " + num);
	}
}
