
public class B01_Operater {

	
	/*
	 #d 연산자
	 
	 #산술 연산자
	 
	 + : 더하기
	 - : 빼기
	 * : 곱하기
	 / : 나누기는 정수끼리 나누면 몫만 구하고 실수가 포함되어 있으면 정확한 결과를 구한다
	  		* 정수끼리 산술 연산 결과는 정수고, 정수와 실수의 산술 연산 결과는 실수다
	 % : 나머지

	 */
	
	public static void main(String[] args) {
		int a = 10, b = 12;
		double c = 7.0;
				
		System.out.println("a + b:" + (a + b));
		System.out.println("a - b:" + (a - b));
		System.out.println("a * b:" + (a * b));
		System.out.println("a / b:" + (a / b));
		System.out.println("a % b:" + (a % b));
		
		// n \으로 나눈 나머지 연산의 결과는 0 ~ n -1이다), 
		// 8로 나누면 결과는 0 ~ 7)이다
		System.out.println(10 % 5);
		System.out.println(11 % 5);
		System.out.println(12 % 5);
		System.out.println(13 % 5);
		System.out.println(25369 % 8);
		
		// char타입은 정수로 보여주는 것 처럼
		//double/float 타입은 정수를 .0을 붙여서 보여준다
		
		// 정수와 실수의 연산 결과 확인
		System.out.println("a + c:" + (a + c));
		System.out.println("a - c:" + (a - c));
		System.out.println("a * c:" + (a * c));
		System.out.println("a / c:" + (a / c));
		System.out.println("a % c:" + (a % c));
		
		// Math.pow(a, b) : a 제곱 b의 결과를 반환한다
		double result = Math.pow(2 , 10);
		
		System.out.println("pow의 결과" + result);
	
		result = Math.sqrt(2);
		System.out.println("sqrt의 결과" + result);
		
		//Math.abs(a) :a의 절대값을 변환한다 (넣었던 타입으로 변환한다)
		int abs1 = Math.abs(-7);
		
		System.out.println("abs1");
		
		// Math.round(a) : a 소수 첫째 자리에서 반올림한 결과를 반환한다.
		// (5가 돼야 반올림 가능)
		System.out.println(Math.round(123.456));
		
		// Math ceil(a) a를 소수 첫째 자리에서 올림한 결과를 변환
		System.out.println(Math.ceil(123.111));
				
		// Math floor a를 소수 첫째 자리에서 버림한 결과를 반환
		System.out.println(Math.floor(123.111));
		
		/*
		 #원하는 자리에서 반올림하는 방법
		 
		 1. 반올림하고 싶은 자리를 소수 첫 번째 자리로 만든다
		 2. 반올림하고 다시 원래대로 돌려놓는다
		 3. 원래대로 돌려놓기 위해서는 소수로 나눠야 한다
		 
		 */
		double value = 123.123456;
	
		
		// 연습1 : 12500을 반올림하여 13000으로 만들어 보세요
		// (정수에서 실수로 만들고 싶으면 뒤에 .0을 붙여야 함 ,*를 하면 소수점이 뒤로)
		int q1 = 12500;
		
		System.out.println(Math.round(q1 / 1000.0) * 1000);
		
		// 연습2 : 1.138을 내림하여 1.13으로 만들어보세요
		// ( /를 하면 소수점이 앞으로)
		double q2 = 1.138;
		
		System.out.println(Math.floor(q2 * 100) / 100);
		
		System.out.println("#### NOT ####");
		System.out.println(!true);
		System.out.println(!false);
		
		//a가 3보다 크지 않을 때 true
		System.out.println(!(a > 3));
		
		
		
		
		
		
		
	}
}
