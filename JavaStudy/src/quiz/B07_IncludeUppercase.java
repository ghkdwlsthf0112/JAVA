package quiz;

import java.util.Scanner;

public class B07_IncludeUppercase {

	/*
	 	사용자가 단어를 입력했을 때 해당 단어에
	 	대문자가 포함되어 있는지 여부를 체크하는 프로그램을 만들어보세요
	 	
	 	-> 한글자씩 보면서 대문자가 있을 때 표시한다
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단어 입력 >");
		String word = sc.next();
		
		String result = "";
		
		boolean 대문자있다 = false;
		
		for (int i = 0; i < word.length(); ++i) {
			char ch = word.charAt(i);
			
			if (ch >= 'A' && ch <= 'Z' ) {
				대문자있다 = true;
			}
		}
		System.out.println("대문자가 있습니까? " + 대문자있다);
	}
}
