package quiz;

import java.util.Scanner;

public class B02_ConditionQuiz {
	
	public static void main(String[] args) {
		
		//int형 변수 a가 10보다 크고 20보다 작을 때 true 
		int a = 13;
		System.out.println(a > 10 && a < 20);
		 
		//int형 변수 b가 짝수 일 때 true 
		int b = 10;
		System.out.println(b % 2 == 0);
		
		//int형 변수 c가 7의 배수일 때 true 
		//나누기는 무조건 0
		int c = 7;
		System.out.println(c % 7 <= 0);
		
		//int형 변수 d가 e의 차이가 30일 때 true 
		int d = 10, e = 40;
		System.out.println(e - d == 30 || d - e == 30);
		System.out.println(Math.abs(a - d) == 30);
		
		//int형 변수 year가 400으로 나누어 떨어지거나
		//	또는  4로 나누어 떨어지고 100으로 나누어 떨어지지않을 때 true 
		//	(2월이 하루 더 있는 해를 구하는 방식)
		int year = 2023; 
		// &&을 ||보다 먼저 계산 한다
		System.out.println(year % 4 == 400 || year % 4 == 0 && year %  10 !=0 );
		
		boolean powerOn = false;
		System.out.println(!powerOn);
		
		Scanner sc = new Scanner(System.in);
		
		String str = "yes";
				
		System.out.print("정말 제출 하시겠습니까? (yes/no) > ");
		String userInput = sc.next();
				
		System.out.println(str == "yes");
		System.out.println(userInput);
	
	}

}
