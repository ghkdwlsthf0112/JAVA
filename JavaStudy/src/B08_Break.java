
public class B08_Break {

	/*
	 	#break
	 	
	 	- switch-case문 내에서 사용해 해당 case를 탈출한다
	 	- 반복문 내부에서 사용하면 반복문을 탈출한다
	 	- if문 내부에서 사용한다고 해서 if문을 탈출하지 않는다
	 	
	 	# continue
	 	
	 	- 반복문 내부에서 사용하면 다음번 반복으로 넘어간다
	 */
	
	public static void main(String[] args) {
		
		// ex 1
		for (int i = 0; i < 100; ++i) {
			
			if (i == 80)
			break;
		}
		
		// ex2
		String str = "김정은, 우주기지로…푸틴과 오늘 회담·만찬"
				+ " 김 위원장이 하산역에서 내려 러시아 측 환영을 받는 영상도 공개됐는데요";
		
		for (int index = 0; index < str.length(); ++index) {
			char ch = str.charAt(index);
			// System.out.printf("%d번째 문자는 \"%c"입니다.\n" , index,);"
			System.out.print(ch);
			if(ch == ',') {
				break;
			}
		}
			
		
		//continue
		for (int i= 0; i < 100; ++i) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}
	}
	
}
