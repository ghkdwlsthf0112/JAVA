package quiz;

import java.util.Scanner;

public class B12_Count369 {
	
	/*
	 	100 ~ 500 사이의 랜덤 양의 정수를 하나 생성하고
	 	해당 숫자까지 369를 진행한다면 박수를 총 몇 번 쳐야하는지 출력해보세요
	 */
	public static void main(String[] args) {
		
		int ran =(int)(Math.random() * 401 + 100);

		int ClapCount = 0;
		
		for (int i = 1; i <= ran; ++i) {
			System.out.print(i + ": ");
			
			// (1) 숫자를 문자열로 바꿔서 센다
			String numStr = "" + i;
			
			for (int j = 0; j < numStr.length(); ++j) {
				char ch = numStr.charAt(i);
			
			if (ch == '3' || ch == '6' || ch  == '9') {
				System.out.print("짝");	
				++ClapCount;
				}
			}
			// (2) 숫자를 한자리씩 검사하며 3, 6, 9인지 센다
			
			System.out.print("\t\t- 누적 " + ClapCount + "회");
			System.out.println();
		}  
			
		System.out.printf("총 박수 횟수는 %d회 입니다");
	}

}
