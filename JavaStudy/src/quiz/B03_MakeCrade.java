package quiz;

import java.util.Scanner;

public class B03_MakeCrade {
	/*
	 	국어 영어 수학 점수를 순서대로 입력 받아 평균 점수를 구한 후에
	 	각 과목의 점수와 등급 및 평균 점수를 출력해주는 프로그램을 만들어보세요
	 	
	 	(1) 90점 이상은 A
	 	 	80점 이상은 B
	 	 	70점 이상은 C
	 		60점 이상은 D
	 		그 외 F
	 	
	 	(2) 각 과목의 유효 점수는 0 ~ 100점이다
	 		유효하지 않은 점수가 하나라도 있다면 모든 과목이 F이고
	 		평균 점수는 0점
	 	
	 	(3) 평균 점수는 소수 둘째 자리에서 반올림한 변수에 지정한 후 출력	 	
	*/

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어, 영어, 수학 점수를 입력하세요");
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		System.out.println("평균 점수: " + (A + B + C)/ 3);
		
		
		
		
	
		
		
		
		
		
	}
}
