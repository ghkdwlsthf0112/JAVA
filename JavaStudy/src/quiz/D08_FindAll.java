package quiz;

import java.util.Arrays;

public class D08_FindAll {
	
	public static void findAll(String text, char ch) {
		int foundIndex = text.indexOf(ch);
		int i = 0;
		while (foundIndex != -1) {
			System.out.printf("%d번째 %c의 위치: %d\n", i++, ch, foundIndex);
			foundIndex = text.indexOf(ch, foundIndex + 1);
		}
	}
	
	public static void main(String[] args) {
		
		// 문자열과 찾을 문자열을 전달하면 해당 문자의 모든 위치를 출력해주는
		// 메서드를 만들어보세요 (indexOf를 사용)
		String text = "apple/banana/orange/podo/gyul/pineapple/watermelon";
		
		findAll(text, 'a');
		findAll(text, 'e');		
	}

}







