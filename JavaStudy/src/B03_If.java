
public class B03_If {
	/*
	 	# if문
	 	
	 	-()안의 값이 true면 {}안으ㅔ 코드를 실행하는 문법
	 	-()안의 값이 false면 {}안의 코드를 무시한다 
	 	
	 	# else if
	 	
	 	-위의 if문에서 조건이 맞지 않아 실행되지 않았다면 if문처럼 작동한다
	 	-여러번 사용할 수 없다
	 	-단독으로 사용x
	 	
	 	#else 
	 	
	 	- 위에 있는 모든 if문, else if 문이 모두 실행되디 않았을 때 
	 	{}의 사용을 무조건 실행
	 	- 단독으로 사용할 수 없다
	 	-else가 붙어있으면 
	 */
	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		
		int a = 15;
		
		if (a > 10) {
			System.out.println("a가 10보다 작으면 실행되는 곳 ");	
		} else if (a % 2 == 0) {
			System.out.println("a가 10보다 작으면서 짝수일때 실행되는 곳!");
		} else if (a > -30) {
			System.out.println("a가 10보다 작으면서 짝수도 아니면서"
					+"-30보다 큰 곳" );
		} else {
			System.out.println("위의 모든 조건이 성립하지 않았습니다." );		
		}
		
		
		char appleGrade = 'X';
		int price;
		
	if(appleGrade == 'A') {
		price = 1200;
		
	} else if(appleGrade == 'B') {
		price = 800;
	} else if(appleGrade == 'C') {
		price = 600;
	} else {
		price = 0;
		}
		System.out.println("프로그램 끝!");
	}
}


