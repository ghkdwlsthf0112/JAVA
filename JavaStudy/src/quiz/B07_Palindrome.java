package quiz;

import java.util.Scanner;

public class B07_Palindrome {
	/*
	 	사용자가 단어를 입력하면
	 	해당 단어가 좌우대칭인지 판별해주는 프로그램을 만들어보세요
	 	
	 	>> LEVEL
	 	-> 좌우대칭입니다
	 	
	 	>> FATHER
	 	-> 좌우대칭이 아닙니다
	 	
	 	* 어려움 ()
	 	>> Eye
	 	-> 대/소문자가 다르지만 좌우대칭입니다
	 */
	public static void main(String[] args) {
		
		// 1. 맨 앞부터 글자를 하나씩 비교해나간다(절반까지만)
		String word = "Eye";
		
		// 대문자 소문자가 모두 포함되었는지 여부를 체크
		// 대문자 소문자의 개수를 세었을 때 둘 다 1이상이면 true
		boolean hasDiffCase = false;
		
		int upperCount = 0;
		int lowerCount = 0;
		
		for (int i = 0; i < word.length(); ++i) {
			char ch = word.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				++upperCount;
			} else if (ch >= 'a' && ch <= 'z') {
				++lowerCount;
			}
		}
		boolean hasDiffCase1 = upperCount > 0;
		
		String lowercased = "";
		// 대문자를 모두 소문자로 바꾼다
		for (int i = 0; i < word.length(); ++i) {
			char ch = word.charAt(1);
			if (ch >= 'A' && ch <= 'Z') {
				lowercased += (char)(ch + 32);
			} else {
				lowercased += ch;
				}
			}
		
		int len = word.length();
		int incorrectCount = 0;
		boolean palindrome =  true;
		
		for (int i = 0, half = len / 2; i <= half; ++i) {
			 char frontCh = word.charAt(i);
			 char behindCh = word.charAt(len - 1 - i);
			 
			 if (frontCh != behindCh) {
				 ++incorrectCount;
				 System.out.printf("c와 %c를 비교\\n, front, behindCh");
			 	}
			 }
			 if (incorrectCount > 0) {
				 System.out.println("좌우대칭이 아닙니다.");
			 } else if (hasDiffCase) {
				 System.out.println("대/소문자가 다르지만 좌우대칭입니다");
			 } else {
				 System.out.println("좌우대칭입니다.");
			 }
	}
}
	
	


