package quiz;

import java.util.Scanner;

public class B09_Prime {
	/*
	 	사용자가 정수를 입력하면 1부터 입력한 정수 사이에 있는 모든 소수를 출력해보세요
	 	
	 	* 소수 (prime) : 나누어 떨어지는 수가 1과 자기 자신밖에 없는 수
	 		
	 	>> 10
	 	2 3 5 7
	 	
	 	>> 30
	 	2 3 5 7 11 13 17 19 23 29 
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print(">> ");
		int num = sc.nextInt();
			
		//이번 숫자 i에 대한 약수 개수 검사
		for (int i = 2; i <= num; ++i) {
			int count = 0;
			
			for (int chk =1; chk <= i; ++chk) {
				if (i % chk == 0) {
					++count;
					//System.out.printf("%d는 %d로 나누어떨어집니다. "
					//		+ "[약수의 개수:%d개]\n", i, chk, count);
				}
			}
			// 검사가 끝났을 때 약수가 2개라면 소수
			//System.out.printf("%d는 소수인가요? %s\n", i, count == 2);
			
			if (count == 2) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

}
