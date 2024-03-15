package quiz;

import java.util.Scanner;

public class B03_AppleQuzi {
	/*
	 * 사과를 10개씩 담을 수 있는 바구니가 있을때, 사용자가 사과의 개수를 입력하면 사과를 모두 담기 위해 바구니가 총 몇 개 필요한지 알려주는
	 * 프로그램을 만들어보세요
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사과개수입력");
		int apple_count = sc.nextInt();
		
		int basket_count = apple_count / 10;
		
		if (apple_count < 0) {
			System.out.println("사과 개수가 0보다 작음");
		} else if (apple_count > 0) {
		} if (apple_count % 10 == 0) {
			System.out.println(basket_count);
		} else if (apple_count % 10 > 0) {
			System.out.println(basket_count + 1);
		}
	}
}









