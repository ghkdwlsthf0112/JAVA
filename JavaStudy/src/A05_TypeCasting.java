
public class A05_TypeCasting {

	/*
	 	#타입 캐스팅
	 
	 - 타입 캐스팅에는 명시하지 않아도 타입이 자동으로 변하는 자동캐스팅과 
	 	데이터의 타입을 강제로 변환하는 강제 타입 캐스팅이 있다
	 - 데이터 또는 변수 앞에 (타입)을 적으면 타입이 강제로 변한다
	 
	 # 자동 타입 캐스팅
	 
	 - 작은 타입에서 큰 타입으로 변하는 경우
	 - 그 외 타입이 변하더라도 특별히 문제가 발생하지 않는 경우
	 - 값이 손상될 경우가 없다
	 
	 #강제 타입 캐스팅
	 
	 - 큰 타입의 값을 작은 타입에 억지로 넣어야 하는 경우
	 - 그 외 타입이 변했을 때 특정 기능이
	 	
	 	 #타입의 크기 순서
	 	 
	 	 byte(1) < shot(2) , char(2) < int(4) < long(8) < float(4) < double(8)
	 	 
	 	 - 작은 타입의 값을 큰 타입 변수에 넣을 때는 아무런 문제도 발생하지 않는다
	 	 - 큰 타입의 값을 작은 타입 변수에 넣을 때는 위험하다면서 에러가 발생한다
	 	 
	 */
	public static void main(String[] args) {
		
		// 작은 타입 값을 큰 타입에 넣기(정상 작동)
		// 자동으로 byte 타입 값을 int 타입으로 변환하여 넣어둠 (자동 타입캐스팅)
		byte b =127;
		int i =b;
				
		// 큰 타입 값을 작은 타입에 넣기
		// int 타입 값을 강제로 byte 타입으로 변환하여 넣을 수 있음 (강제 타입캐스팅)
		
		int i2 = 130;
		byte b2 = (byte)i2;
		
		System.out.println("강제로 짤린 12의 결과: " + b2);
		
		// long은 8바이트고 float은 4바이트지만 소수를 더 큰 것으로 간주한다
		long l1 = 100000000000L;
		float f1 = (int)l1;
		
		System.out.println(f1); 
		
		// short, char 모두 2byte 이지만
		// short는 음수값이 존재할 위험이 있으므로 확인(강제 타입캐스팅)이 필요하다
		short s1 = 70;
		char ch1 = (char) s1;
		
		System.out.println(ch1);
		
		// char에서 short로 갈때도 32767보다 큰 양수가 포함되어 있을 가능성이 있으므로
		// 강제 타입캐스팅을 통한 확인이 필요하다
		char ch2 = 'F';
		Short s2 = (short) ch2;
		
		// 해당 문자 코드 값의 문자 형태를 보고 싶은 경우
		// 타입 캐스팅을 사용해 간편하게 사용할 수 있다
		int value = 44033;
		
		System.out.println(value);
		System.out.println((char)value);
		
	}
}
