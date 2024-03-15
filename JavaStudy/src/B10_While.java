
public class B10_While {
	
	/*
	 	- for문과 사용법이 약간 다른 반보ㅛㄱ문
	 	- 초기값과 증감값의 위치가 정해뎌 있지 않아 for문보다 자유롭다
	 	- ()안의 내용이 true라면 {}안에 내용을 계속 반복한다
	 	- 증감값의 위치에 따라 결과가 달라지는 것에 주의해야 한다
	 */
	public static void main(String[] agrs) {
		
		
		// 0 ~ 9까지 10개
		int i = 0;
		while (i < 10) {
			System.out.println(i++);	
		}
		
		System.out.println("--------------");
		
		
		// 1 ~ 10까지 10개
		i = 0;
		while (++i < 10) {
			System.out.println(++i);
		}
		
		System.out.println("--------------");
		
		
		i = 0;
		while (i < 10) {
			System.out.println(i);
		}
		
		System.out.println("--------------");
		
		// 10이라고 했지만 1~9까지 9개
		i = 0;
		while (i < 10) {
			System.out.println(i);
		}
		
		
		// while문으로 문자열 탐색해보기
		String str = "대장동 사건 관련 허위 인터뷰 의혹을 수사하는 검찰이 14일 '김만배-신학림"
					+"녹취파일'을 보도한 뉴스타파에 대한 압수수색에 나섰다."
					+"서울중앙지검 '대선개입 여론조작 사건' 특별수사팀(팀장 강백신"
					+"반부패수사3부장)은 이날 오전 서울 중구 뉴스타파 사무실에 검사와 수사관을"
					+"보내 정보통신망법상 명예훼손 등 혐의로 압수수색 절차를 진행하고 있다.\r\n";
					

				
		int len = str.length();
		int index = 0;
		
		while (index < len) {
			char ch = str.charAt(index);
			System.out.printf("[%d]: %c\n", index, str.charAt(index++));
			
			++index;
			
		}
	}
}
