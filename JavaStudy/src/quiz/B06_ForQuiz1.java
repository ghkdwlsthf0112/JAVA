package quiz;

public class B06_ForQuiz1 {
	
	/*
	 	1. 1000부터 2000사이의 8의 배수를 모두 출력해보세요
	 	
	 	2. 100부터 300까지의 총합을 구해보세요
	 	
	 	3. 1000부터 2000까지의 10의 배수를 한 줄에 5개씩 출력해보세요	
	 */
	public static void main(String[] args) {
		
		// A between B : A와 B를 모두 포함해야한다
		
		// 1000부터 2000까지 반복하면서
		for (int num = 1000; num <= 2000; ++num) {
			// 8의 배수만 출력문을 만날 수 있다
			if (num % 8 == 0) {
		}
				System.out.println(" "+num);	
		
		int total = 0;
			
		for (num = 100; num <= 300; ++num) {
			total += num;
		}
		System.out.println("더 더해진 결과: " + total);
		
		int count = 0;
		for (num = 1000; num <= 2000; ++num) {
		}//숫자가 10의 배수일때만 참
			if (num % 10 == 0) {
				System.out.print(num + " ");
				++count; // 숫자를 출력하고 1증가(=숫자를 출력한 횟수)
			}
				//숫자를 출력하는 횟수를 세서 5의 배수라면 줄 바꿈을 출력
				if (++count % 5 == 0) {
					System.out.println();
				}	
			}
		}
}



