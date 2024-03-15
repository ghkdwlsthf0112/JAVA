package quiz;

import java.util.Scanner;

public class B00_AgeCalculator {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("태어난 해를 입력하세요 >");
		int birthYear = sc.nextInt();
		
		int thisYear = 2023;
		int age = thisYear - birthYear + 1;
		
		// System.out.printf : ,
		// System.out.print, System.out.println : +
		
		// System.out.printf("입력한 숫자: ", age);
		
		System.out.printf("당신의 나이는 %d입니다", age);
	}
}
