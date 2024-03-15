package quiz;

import java.util.Scanner;

public class B07_ChangeCase {
	
	/*
	 	사용자가 문자를 입력하고
	 	대문자는 소문자로, 소문자는 대문자로 바꿔서 출력해보세요
	 	(영어가 아닌 문자는 그대로 출력)
	 */

	public static void main(String[] args) {

		//문장을 입력받고
		System.out.print("문장을 입력 > ");
		String text = new Scanner(System.in).nextLine();
		
		String result = "";
		
		// 한글자씩 검사
		for (int i = 0;i  < text.length(); ++i) {
			char ch = text.charAt(i); 
		
			if (ch >= 'a' && ch <= 'z') {
				result += (char)(ch - 32);
			} else if (ch >= 'A' && ch <= 'z') {
				result += (char)(ch + 32);
			} else {
				result += ch;
			}
		}
		
		System.out.println("원본: " + text);
		System.out.println("바뀐것: " + result);

	}
}
