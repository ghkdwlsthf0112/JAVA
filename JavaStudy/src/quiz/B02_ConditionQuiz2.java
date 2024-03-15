package quiz;

import java.util.Scanner;

public class B02_ConditionQuiz2 {
	
	public static void main(String[] args) {
		
	 	// 1. char형 변수 a가 'q'또는 'Q'일때 true
	 	char a = 'q';
		System.out.println();
		
	 	// 2. char형 변수 b가 공백이나 탭이 아닐 때 true
	 	char b = 'f';
	 	System.out.println(b != ' ' && b != '\t');
	 	
	 	// 3. char형 변수 c가 '0' ~ '9'일 때 true
		char c = 'f';
		System.out.println(c >= '0' && c <= '9');
	 	
	 	// 4. char형 변수 d가 영문자(대문자 또는 소문자)일 때 true
		
	 	// 5. char형 변수 e가 한글일 때 true (한글의 범위는 유니코드 검색)
		char e = '밈';
		System.out.println();
		
	 	// 6. 사용자가 입력한 문자열이 quiz일 때 true
		
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		word.equals("quiz");
		
		System.out.println("정말 나가시겠습니까? (quiz) > ");
		System.out.println(new Scanner(System.in).next().equals("I quiz"));		
	}
}
