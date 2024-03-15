
public class B04_Switch {
	
	/*
	 	Switch_case 문
	 	
	 	-()안의 값에 ㄸ라 실행할 코드를 결정하는 방법
	 	-()안에 boolean 타입
	 	- if문으로 완벽하게 대체 가능하기 때문에 자주 사용하는 문법은 아니다
	 	- default는 if문의  elae같으 역할을 한다
	 	()안의 값에 해당하는 case가 정의 되어있지 않응 경우 default를 실행한다
	 	 -break를 적지 않으면
	 	  break를 만날때까지 해당 case보다 밑에 있는 모든 case를 실행한다
	 */
	public static void main(String[] args) {
		
		
		switch (1) {
			case 1:
				System.out.println("1일때 출력되는 문장");
				break;
			case 2:
				System.out.println("2일때 출력되는 문장");
				break;
			case 3:
				System.out.println("3일때 출력되는 문장");
				break;
			default:
				System.out.println("위의 case에 해당하는 것이 없을 때");
				break;
		}
		
	String cmd = "help";
	
	switch (cmd) {
		case "run";
			System.out.println("실행합니다.");
			break;
	switch (cmd) {
		case "help";
			System.out.println("실행합니다.");
			break;
	switch (cmd) {
		case "cd";
			System.out.println("실행합니다.");
			break;
		default:
			System.out.println("위의 case에 해당하는 것이 없을 때");
	
			break;
			}
			}
		}
	}
}
