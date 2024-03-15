
public class A01_Hello {

	public static void main(String[] args) {
		///
		System.out.println("Hello, world!");
		System.out.println(123456);
		System.out.println(1231233333355156L);
		System.out.println("오늘의 메뉴: 토마토 스파게티");
		System.out.println('김');
		System.out.println("Hello, world!");
		System.out.println(true);
		System.out.println(false);
		///
		
		//숫자끼리는 +,-,* / 등 계산을 할 수 있다
		System.out.println(25 * 88);
		System.out.println(99 / 3);
		System.out.println(91 / 3); //정수끼리 계산하면 몫만 구한다
		System.out.println(91 / 3.0); //소수점 계산
		System.out.println(33333333L / 1234.333);
		
		//문자열은 다른타입과 +를 통해 이어붙이기를 할 수 있다
		System.out.println("Apple" + "Pen");
		System.out.println("평균 점수: " + 85.8);
		System.out.println(300 + "개");
		System.out.println("오늘 점심을 먹었는가? " + true);
		System.out.println("안경을 썼는가? " + false);
		
		// ()를 통해 연산 순서를 조절할 수 있다
		System.out.println("오늘 총 점심값: " + 5000 * 4 + "원");
		System.out.println("오늘 총 점심값: " + (3500 + 5500) + "원");
		
	}

}
/*
        // #()안에 전달할 수 있는 데이터 종류(자바의 리터럴)

         1. 그냥 숫자 : 정수(ㅑㅜ\\integer), 계산 가능
         2. ""사이에 들어간 표준 문자 : 문자열
         3. ''사이에 들어간 단 하나의 문자(두 글자 이상은 안 됨)
           :문자(Character), 계산이 가능하긴 하다
         4. 소수 : 긴 실수(Double), 계산 가능
         5. true 또는 false :참/거짓 데이터
         6. 아주 큰 숫자 뒤에 L : 큰 정수(Long). 계산 가능
         7. 소수 뒤에 F : 짧은 실수(float), 계산 가능
         
        "" : 문자열 데이터
        '' : 문자 데이터
        123 : 정수 데이터
        123.12 : 실수 데이터
*/
        
         