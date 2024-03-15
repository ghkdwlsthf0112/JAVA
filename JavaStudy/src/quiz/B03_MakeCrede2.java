package quiz;

import java.util.Scanner;

public class B03_MakeCrede2 {
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

	System.out.println("국어를 점수 입력 >");
	int kor = sc.nextInt();
	System.out.println("영어를 점수 입력 >");
	int eng = sc.nextInt();
	System.out.println("수학를 점수 입력 >");
	int math = sc.nextInt();
	
	if (kor > 100 || kor < 0 || eng > 100 || eng < 0 || math > 0 || math < 0) {
		
		System.out.println("\t점수\t등급");
		System.out.println("국어\t0\t등급");
		System.out.println("영어\t0\t등급");
		System.out.println("수학\t0\t등급");
	} else {
		char korGrade, engGrade, mathGrande; 
		
		if (kor >= 90) {
			korGrade = 'A';
		} else if (kor >= 80) {
			korGrade = 'B';
		} else if (kor >= 70) {
			korGrade = 'C';
		} else if (kor >= 60) {
			korGrade = 'D';
		} else {
			korGrade = 'F';
		}
		
		if (eng >= 90) {
			engGrade = 'A';
		} else if (eng >= 80) {
			engGrade = 'B';
		} else if (eng >= 70) {
			engGrade = 'C';
		} else if (eng >= 60) {
			engGrade = 'D';
		} else {
			engGrade = 'F';
		}
	} 
	
	}
}


















