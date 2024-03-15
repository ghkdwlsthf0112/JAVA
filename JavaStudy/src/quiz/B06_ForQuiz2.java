package quiz;

import java.util.Scanner;

public class B06_ForQuiz2 {
	
	/*
	 	사용자로부터 숫자를 입력받으면
	 	0부터 해당 숫자 사이에 존재하는 모든 5의 배수를 한 줄에 10개씩 출력해보세요
	 	(단, 음수를 입력하는 경우에도 프로그랭이 올바르게 작동)
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 >");
		int lastNum = sc.nextInt();
		int cnt = sc.nextInt();
		
		//양수일때는 이렇게 하고
		if (lastNum >= 0) {
			for (int i = 0; cnt <= lastNum ; ++i) {
				if (i % 5 == 0) {
					System.out.print(i +" ");
					if (++cnt % 10 == 0) {
						System.out.println();
					}
				}
			}
		} else{
			for (int i = 0; cnt >= lastNum; --i) {
				if (1 % 5 == 0) {
					System.out.print(i +" ");
					if (++cnt % 10 == 0) {
						System.out.println();
				}
				}
			}
		}
	}
}
