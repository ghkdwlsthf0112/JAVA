package quiz;

import java.util.Scanner;

public class B14_ShuffIeText {
	
	/*
	 	사용자로부터 문자열을 입력받으면
	 	해당 단어를 랜덤으로 석어주는 프로그램을 만들어보세요
	 	
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 >>");
		String word = sc.next();

		int len = word.length();
		int[] ranIndex = new int[len];
	
		for (int i = 0; i < len; ++i) {
			ranIndex[i] = (int)(Math.random() * len);
			
			for (int j = 0; j < i; ++j) {
				if (ranIndex[i] == ranIndex[j]) {
					break;
				}
				++j;
			}
			++i;
		}
		for (int i = 0; i < ranIndex.length; ++i) {
			System.out.print(word.charAt(ranIndex[i]));
		}
	}
}
