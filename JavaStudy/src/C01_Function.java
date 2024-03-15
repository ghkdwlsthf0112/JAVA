
public class C01_Function {
	
	/*
	 	# 함수 (Function)
	 	
	 	- 기능을 미리 정의해두고 나중에 불러다 쓰는 것
	 	- 함수는 정의한 시점에서는 실행되지 않고 나중에 불러써야 실행된다
	 	- 나중에 재사용 할 가능성이 있는 코드들을 함수로 만들어두면
	 	  작업의 반복을 줄일 수 잇다 (프로그래머의 생산성이 올라간다)
	 	- 클래스 내부에 있는 함수는 메서드(method)라고 부른다
	 	
	 	# 함수의 매개변수 
	 	
	 	- 함수를 호출 할 때 해당 함수에 전달 할 수 있는 값
	 	- 함수를 호출 할 때 ()에 전달하는 값을 인자라고 한다
	 	- 함수를 호출 할 때 ()에 선언하는 인자를 받을 수 있는 변수를 매개변수라고 한다
	 	- 메개변수의 개수에는 제한이 없다
	 	- 메개변수 타입에 ...을 쓰면 해당 타입의 인자를 무한대로 받을 수 있다
	 	
	 	# 함수의 타입 (리턴 타입)
	 	
	 	-해당 함수의 실행 결과 얻게 되는 값의 타입을 지정해놓을 수 있다
	 	- void : 이 함수는 실행 결과로 아무 값도 돌아오지 않습나더ㅏ
	 	- 그외 타입들: 합수를 실행하면 해
	 */
	
	/**
	 
	 * @param apple
	 * @param size
	 */
	public static void howManyBasket(int apple , int size) {
		if (apple % size == 0) {
			System.out.println("필요한 바구니 개수: "+ apple / size);
		}else {
			System.out.println("필요한 바구니 개수: "+ apple / size);
		}
	}
	public static void minus(int...num) {
		// ...으로 선언한 메개변수는 배열이 된다
		for (int i = 0; i < num.length; ++i) {
			System.out.println("빼내야하는 수 : "+ num[1]);
		}		
	}

			
	public static void plus(int a, int b) {
		System.out.println(a + b);
	}
	public static void rabbit() {
		System.out.println(" /)/) ");	
		System.out.println("(  ..)");	
		System.out.println("(   >&");
	}
	public static void main(String[] args) {
		for (int i =0; i < 300; ++i) {
			rabbit();
		}
		plus(30, 33);
		
		
	}
}

