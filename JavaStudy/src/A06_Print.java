
public class A06_Print {	
	/*
	  	# 함수
	  	
	  	-뒤에 () 붙은 것
	  	-뒤에 ()가 붙고 class 내부가 있으면 메서드
	 
	 	# 콘솔에 출력하기 위한 함수들
	 	
	 	 1. println()
	 	 
	 	 -()안에 전달한 데이터를 콘솔에 출력하고 줄을 자동으로 바꿔준다
	 	 -데이터 뒤에 자동으로 추가하여 출력
	 	 
	 	 2. print()
	 	 
	 	 -()안에 전달한 데이터를 콘솔에 출력한다
	 	 
	 	 3.print format
	 	 
	 	  -print format
	 	  -원하는 서식을 출력하고 해덩 서식대로 이미지 출력
	 	  -\n
	 	  
	 	  *서식 문자의 종류
	 	  
	 	 %d %x %o : 숫자를 넣는 자리
	 	  %s 문자열 넣는 자리
	 	  %d : 해당 자리에 전달한 정수값을 16진수(소문자)로 출력
	 	  %d : 해당 자리에 전달한 정수값을 16진수(대문자)로 출력
	 	  %f : 실수
	 	  %s : 문자열
	 	  %c : 문자
	 	  %% : 그냥 %를 출력하고 싶을때 사용
	 	  
	 	  * 서식 문자 옵션 - 서식 문자의 %의 문자 사이에 넣어서 사용
	 	  
	 	   1. %숫자d : 숫자만큼 자릿수를 확보하면서 출력
	 	   2. %-숫자d  숫자를 자릿수를 확보한 후 왼쪽 정렬 하여 출력
	 	   2. %+d : 부효를 출력
	 	   4. %0d : 남은 자리에 0을 추가하여 출력
	 	   5. %.숫자f : 소수점 자리수를 출력하여 출력한다
	 */
	public static void main(String[] args) {
		
		System.out.println("Hello, world!\n");
		System.out.println("Hello, world!\n");
		System.out.println("Hello, world!\n");
		System.out.println("Hello, world!\n");
		
		int year = 2023;
		int month = 9;
		int date = 6; 
		int hour = 11;
		int minute = 12;
		int second = 40;
		String ampm = "AM";
		
		System.out.println(year + "년 " + month + "월 "+ date + "일 " 
		+ ampm + " " +hour + ":" + minute + ":" + second);
		
		System.out.printf("%x년 %d월 %d일 %s %d:%d:%d\n",
				year, month, date, ampm, hour, minute, second);
		
		double successRate =  60.8;
		System.out.printf("%.1f%%의 확률로 강화에 성공합니다.\n",successRate);
		
		int money = 1234;
		
		System.out.printf("보유금액 : %10d원\n" , money);
		System.out.printf("보유금액 : %010d원\n" , money);
		System.out.printf("보유금액 : %-10d원\n" , money);
		System.out.printf("보유금액 : %+-25d원\n" , money);
		
		double dollar = 10.15;
		
		System.out.printf("remains : %,2f$\n" , dollar);
		
	}

}
