
public class B02_Operator {
	
	/*
	 	# 비교 연산자
	 
	 	- 두 값을 비교하는 연산
	 	 비교 연산의 결과는 항상 창
	 	 
	 	 # 논리 연산
	 	 
	 	 - boolean 값으로 연산하는 연산자
	 	 - && : 양 옆의 두 값의 모두 true일때 (AND연산)
	 	 - || : 양옆의 두 값중 하나만 true 여도 true (OR연산) || -> shift + 역슬래시
	 	 -  ! : true이면 false, false면 true (not 연산)
	 	(비교 연산의 결과는 항상 boolean 타입이다)
	 */
	public static void main(String[] args) {
		int a = 10, b = 3;
		
		System.out.println(a > b); // > : 왼쪽이 크면true
		System.out.println(a < b); // < 오른쪽이 크면 true
		System.out.println(a >= b); // >= 왼쪽이 크거나 같으면 true
		System.out.println(a <= b); // <= 오른쪽이 크고나 같으면 true
		System.out.println(a == b); // == 두 값이 같으면 true
		System.out.println(a != b); // a,b랑 다르니
		
		//비교연산은 우선 순위가 낮다
		// ()가 없어도 산술 연산을 먼저하고 비교 연산을 진행
		System.out.println(a + 5 > b * 10);
		
		// a를 2로 나누었을때 나머지가 0이면 true 
		System.out.println(a % 2 == 0);
		
		//a가 5배수가 아닐 때 true
		System.out.println(a % 5 != 10);
		
		// 논리연산자는 비교 연산자 보가 우선 순위가 낮기 때문에
		//  ()없이도 비교 연산을 먼
		System.out.println("#### AND ####");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		// a를 3으로 나누었을 때 나머지가 0이면 true, a보다 100이 크면 true, -100보다 a가 크면 true 
		System.out.println(a % 3 == 0 && a < 100 && a > -100);
		
		System.out.println("#### OR ####");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println(a % 3 == 0 || a < 10);
		
		
		
	}

}
