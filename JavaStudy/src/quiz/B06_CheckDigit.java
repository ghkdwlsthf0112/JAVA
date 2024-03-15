package quiz;

import java.util.Scanner;

public class B06_CheckDigit {
	
	/* 
		사용자가 숫자를 입력하면 해당 숫자가 몇 자리 숫자인지
	 	알려주는 프로그램을 만들어보세요
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 >");
		
		int digit = 0;
		
		//입력받은 숫자를 10씩 나눠서 몇 번 나눴는자 구하기
		for (int num = sc.nextInt(); num > 0; num /= 10) {
			System.out.printf("%d번째 나누기 : %\n", digit++, num);
		}
		
/*		
		int digit = 0;
		// 숫자를 10배씩 크게 만들면서 10을 몇번 곱했는지 세어서 알아내기
		for (int compare = 1; compare < num; compare *= 10) {
			System.out.println("compare" + compare);
			++digit;
		}
		
		System.out.println(digit + "자리 숫자 입니다.");
*/		
	}
}
