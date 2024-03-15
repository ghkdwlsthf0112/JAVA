package myobj;

public class Apple {
	// 사과의 속성
	public int price = 1000;
	public int sweet = 3;
	public double weigth = 7.7;
	public String color ="Pink";
	
	// 사과의 생성자 (이 클래스의 인스턴스)
	// 생성자도 오버로딩을 통해 하나의 클래스에 여러개의 생성자를 보유할 수 있다
	public Apple() {}
	
	public Apple(int price) {
		// 가격만 받아서 채우고 나머지는 기본값을 사용하는 생성자
		this.price = price;
		this.sweet = 5; 
		this.weigth = 10.0;
		this.color = "빨간색";
	}
	
	public Apple(int price, int sweet, double weigth, String color) {
		// 인스턴스 생성과 동시에 필드값을 초기화
		
		// 메서드의 매개변수 이름과 필드명이 같은 겨우
		// this를 통해 명확하게 구분할 수 있따
		this.price = price;
		this.sweet = sweet; 
		this.weigth = weigth;
		this.color = color;
	}

	// 사과의 매서드 (인스턴스는 변수를 변화시키거나 활용한다)
	public void info() {
		System.out.printf("%d원/%d/%.2fg/%s\n",
				price, sweet, weigth, color);
	}
}
