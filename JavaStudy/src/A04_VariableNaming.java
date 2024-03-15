
public class A04_VariableNaming {

/*
	# 우리가 변수를 사용하는 이유
	
	1. 코드의 가독성을 높일 수 있음
	2.여러 곳에서 시행되는 값을 한번에 변경할 수 있다 (재사용)
	==하나의 값을 여러 개 사용할 수 있다
	
	# 변수의 작명 규칙 (권장 지키지 않아도 에러가 발생하지 않음
	
	1.두 단어 이상 이어붙인 변수명을 사용할 때 _를 사용해 붙인다(snake_case)
		ex) apple_price
		
	2. 두 단어 이상을 이어붙인 변수명을 사용할 때 대문자를 사용한다
		ex) appleprice
		
	3. 변수명의 첫 번째 글자는 소문자를 사용하는 것이 좋다
		ex) Apple(X), apple(o)
		
	4. 클래스명의 첫 번째 글자는 대문자를 사용하는 것이 좋다
		ex)PersonInfo (O), personInfo (X)
	
	5. 패키지명은 모두 소문자를 사용한다
		ex)quiz(O),  Quiz(X)
		
	6. 프로 그램에서 항상 변하지 않고 동일해야하는 값은 모두 대문자를 사용한다. (상수)
		ex) MAX_COUPON_SLOT
		
	7. 변수안에 들어 있는 값을 쉽게 파악할 수 있는 단어를 사용하자
		ex) a1, a2, a3
		
	# 변수의 직영 규칙 (필수 - 지키지 않으면 에러 발생)
		
	1. 변수의 첫번째 글자는 숫자를 사용할 수 없다	
		ex) 1st, 2st, 3st (x)
		
		2. 변수명 사이에는 공백 x
		
		3. 특수문자는 _와 $만 사용할 수 있다
		
		4. 자바에서는 이미 사용하고 있는 키워드들은 변수명으로 사용할 수 없다.
		(Eclipse에서 보라색으로 보이는 단어들, 예약어)
		e) public, static
	*/
			public static void main(String[] args) {
		
		int apple_price = 837;
		int apple_qty = 55;
		double apple_weight = 195;
		System.out.println("사과의 개당 가격" + apple_price);
		System.out.println("사과의 개수" + apple_qty + "개");
		System.out.println("사과의 개당 가격" + apple_price * apple_qty + "원");
		System.out.println("사과의 총 무게" + apple_weight * apple_qty + "g");
		System.out.println("1g당 가격" + apple_price / apple_weight + "원");
		
	}
}
