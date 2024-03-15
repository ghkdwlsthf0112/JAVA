package quiz;

public class B09_Gugudan {
	/*
	 	1. 구구단을 다음과 같이 가로로 출력해보세요
	 	
	 	2단: 2X1=2 2X1=2 ...
	 	3단: 3x1=3 3x3=6 ...
	 	4단: ...
	 	
	 	2. 구구단을 다음과 같이 세로로 출력해보세요
	 	
	 	2단		3단		4단
	 	2X1=2	3x1=3	4x1=4
	 	2X1=2	3x3=6 	4x2=8
	 	...		...		...
	 */
	public static void main(String[] args) {
		
		// 1. 가로로
		for (int line = 0; line < 8; ++line) {
			
			int step = line +2;
			// 한줄의 시작
			System.out.printf("%d단: ", step);
			
			for (int mul = 1; mul < 9; ++mul) {
				System.out.printf("%dx%d=%-2d ", step, mul, step * mul);
			}
			System.out.println();
			// 한 줄의 끝
		}
		// 2. 세로로
		for (int line = 0; line < 10; ++line) {
			int mul = line;
			for (int step = 2; step <= 9; ++step) {
				if (line == 0) {
					System.out.printf("%d단\t\t ", step);
				} else {
					System.out.printf("%d x %d = %d\t ", 
							step, mul, step * mul);
				}
			}
			System.out.println();
		}
		
	}

}
