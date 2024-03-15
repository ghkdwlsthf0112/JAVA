package eatra;

import java.util.Scanner;

public class A01_Variable {

	/*
	 	#변수
	 
	 	-각 데이터는 알맞은 타입 변수에 보관해놓고 두고두고 볼 수 있다
	 	-변수명은 아무거나 써도 된다
	 	-타입은 그 변수에 넣고 싶은 타입을 사용여야 한다 
	 	-앞자리는 소문자만 가능 (중간은 대문자가 들어갈 수 있음)
	 	
	 	"" 	==>	string
	 	'' 	==>	char
	 	10	==>	int, byte, short, iong
	 	0.2	==>	double
	 	0.2	==>	float
	 */
	
	
	public static void main(String[] args) {
		
		//f를 넣으면 작아진다 (작은 트럭)
		float f = 0.1f; 
		
		// 100, 87, 55 세사람의 평균을 구하시오
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("민수의 점수를 입력하세요 > ");
		int minsu = sc.nextInt();
		System.out.print("수민의 점수를 입력하세요 > ");
		int sumin = sc.nextInt();
		System.out.print("철수의 점수를 입력하세요 > ");
		int chulsu = sc.nextInt();
		
		
		
		
		
		
		
		
		
		//정수랑 정수를 나누면 몫만 구한다
		System.out.println(100/3);
		//정수랑 실수를 나누면 실수로 정확한 계산을 한다
		System.out.println(100/ (double)3);
		
		
		System.out.println((minsu+chulsu+sumin)/ (double)3);
	
		
		
		
		
		
		

		
		
		
		
		
		
	}
}
