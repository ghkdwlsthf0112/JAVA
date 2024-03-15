import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class D08_String {
	
	public static void main(String[] args) {
		
		String fruits = "apple/banana/orange/kiwi/blueberry";
		
		// "".split() : 문자열을 원하는 기준으로 달라서 문자열 배열로 만들어 변환
		String[] fruitArr = fruits.split("/");
		
		System.out.println(Arrays.toString(fruitArr));
		
		// "".join(delim, iterable)
		// String
		// ; 모든 요소를 딜리미터로 이어붙인 하나의 문자열을 반환
		// iterable - 하나씩 꺼내 쓸 수 있는 모든 것
		Set<String> snackSet = new HashSet<>();
		
		snackSet.add("포카칩");
		snackSet.add("초코파이");
		snackSet.add("오감자");
		snackSet.add("오예스");
		
		String joinResult = String.join("++", fruitArr);
		String joinResult2 = String.join("--", snackSet);
			
		System.out.println("join 결과: " + joinResult);
		System.out.println("Set의 join 결과: " + joinResult2);
		
		// "".contains(CharSeq) 해당 문자열에 전달한 문자열이 포함되어 있는지 확인한다
		System.out.println("초코파이".contains("초코"));
		System.out.println("초코하임".contains("초코"));
		System.out.println("화이트하임".contains("초코"));
		
		// "".startsWith(CharSeq) : 해당 문자열이 전달한 문자열이 시작하는지 확인한다
		// "".endsWith(CharSeq) : 해당 문자열이 전달한 문자열로 끝나는지 검사한다
		String ur1 = "http://naver.com";
		
		System.out.println(ur1.startsWith("https://"));
		System.out.println(ur1.startsWith("ftp://"));
		
		System.out.println(ur1.endsWith(".co.kr"));
		System.out.println(ur1.endsWith(".com"));
		System.out.println(ur1.endsWith(".jpg"));
		
		// "".replace(CharSeq) : 문자열 내부에서 원하는 문자열을 교체한다
		String email = "minsu1234@naver.com";
		
		String replacedEamil = email.replace("naver", "gamil");
		
		System.out.println(email.replace("naver", "gmail"));
		
		System.out.println("원본: " + email);	
		System.out.println("수정본: " + replacedEamil);
		
		// "".substring(index) : 문자열을 해당 위치부터 마지막까지 자른 후 반환
		System.out.println(email.substring(0));
		
		// "".substring(beginIndex, endIndex)
		// 눈자열을 시작 인덱스부터 끝나는 인덱스 미만까지 자른 인스턴스를 반환
		System.out.println(email.substring(0, 3));
		
		//"".IndexOf(str)
		// : 문자열에서 찾고자 하는 문자열의 위치를 찾아 반환한다
		// 만약 문자열을 못찾는 경우 -1 반환
		
		System.out.println(fruits.indexOf("pineapple"));
		System.out.println(fruits.indexOf("kiwi"));
		System.out.println(fruits.charAt(20));
		
		System.out.println("이메일의 아이디 부분만 자르기: " +
				email.substring(0, email.indexOf('@')));
		System.out.println("이메일의 도메인 부분만 자르기: " +
				email.substring(email.indexOf('0') +1));
		
		// "".trim() : 문자열의 바깥쪽의 공백을 제거한다 (내부의 공백은 제거하지 않는다)
		String passwordAnswer = "abcd1234";
		String input1 = "	abcd1234 ";
		
		System.out.println(passwordAnswer.equals(input1));
		System.out.println(passwordAnswer.equals(input1.trim()));
		
		// "".toUpperCase() ; 해당 문자열을 모두 대문자로 변환
		// "".toLowerCase() ; 해당 문자열을 모두 소문자로 변환
		String message = "Hello, world!";
		System.out.println(message.toUpperCase());
		System.out.println(message.toLowerCase());
		
		// String.format(fmt, args) : 
		String timeStr = String.format("%d:%d:%d", 14, 55, 33);
		System.out.println(timeStr);
	}
}

















