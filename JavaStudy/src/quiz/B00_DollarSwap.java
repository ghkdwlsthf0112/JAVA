package quiz;

import java.util.Scanner;

public class B00_DollarSwap {

	// 금액을 입력받고 그 금액을 달러로 바꿔보세요
	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		System.out.print("바꾸고 싶은 돈을 입력하세요 > ");
		int krw = sc.nextInt();
		
		double exchange_rate  = 1332.74;
		
		//한국돈으로 달러 구하는 법 (한국돈 / 환율 = 달러)
		double usd  = krw / exchange_rate;
				
		System.out.printf("%dKRW은 %.3fUSD입니다,\n", krw, usd); //.3 = 3자릿수까지 나옴, .2 = 2자릿수
		
	}
}
