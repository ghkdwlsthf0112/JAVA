package quiz;

public class A02_SwapValue {

	public static void main(String[] args) {
		
		int a = (int)(Math.random() + 30);
		int b = (int)(Math.random() * 30);
		
		System.out.println("바꾸기 전 a: " + a);
		System.out.println("바꾸기 전 b: " + b);
		
		//코드를 추가해 두 변수의 값을 서로 바꿔서 출력해보시오
		
		int temp = a; //b에 a를 넣기전에 임시변수를 만들어서 a값을 뻬놓는다
		a = b;
		b = temp; // 임시 변수에 저장해놨던 a의 원래 값을 b에 넣는다
		
		//////////////////////////////////
		
		System.out.println("바꾸기 후 a: " + a);
		System.out.println("바꾸기 후 b: " + b);
		
		
		 
		
	}
}
