package quiz;

public class B06_ForQuiz2_2 {

	public static void main(String[] args) {
		
		//입력은 받았다고 가정
		int lastNum = 10;
		int cnt = 0;
		
		boolean isMinus = lastNum < 0;
		lastNum =Math.abs(lastNum);
		
		for (int i = 0; i <= lastNum; ++i) {
			if (i % 5 == 0) {
				if (isMinus) {
					System.out.printf("-%d ", i);
				} else {
					System.out.print(i + " ");
				}
			
				if(++cnt % 10 == 0) {
					System.out.println();
				}
			}
		}
	}
}	