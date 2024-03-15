package quiz;

public class C01_FunctionQuiz3 {
	
	/*
	 	실행하면 1 ~ 45의 중복없는 7개의 숫자로 이루어진 int[]을 반환하는 함수를 만들어 보세요
	 	
	 */
	public static int[] getLottoset() {
		int[] winNum = new int[7];
		
		for (int i = 0; i < winNum.length; ++i) {
			winNum[i] = (int)(Math.random() * 45 + 1);
			
			for (int j = 0; j < i; ++j) {
				if (winNum[j] == winNum[i]) {
					--i;
					break;
				}
			}
		}
		return winNum;
	}

}
