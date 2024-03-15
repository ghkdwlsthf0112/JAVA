package quiz;

public class B08_ContinueQuiz {
	
	public static void main(String[] args) {
		
		int total = 0;
		
		// 600부터 800사이에 있는 7의 배수를 모두 출력
		for (int num = 600; num <= 800; ++num) {
			if (num % 7 != 0) {
				continue;
			}
			System.out.println(num);
			total += num;
		}
		
		// 1부터 200까지의 숫자 중 2의 배수도 아니고 3의 배수도 아닌 숫자들을 모두 출력
		for (int num = 1; num <= 200; ++num) {
			if(num % 2 == 0 || num % 3 == 0) {
				continue;
			}
			System.out.println(num);
			total += num;
		}
		// 출력했던 모든 숫자들의 합을 출력
	}
}

