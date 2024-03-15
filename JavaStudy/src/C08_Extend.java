
public class C08_Extend {
	
	/*
	 	클래스 상속
	 	
	 	-이미 만들어져 있는 클래스를 그대로 물려받아 사용하는 문법
	 	-클래스를 물려받아 기능을 새로 추가하거나 고쳐슬 수 있다
	 	-기능을 고쳐 사용하는 것을 '오버라이드(Override)' 라고 한다
	 	-상속 받은 자식 클래스는 반드시 가장 먼저 부모 클래싀 생성자를 호출해야 한다
	 	
	 	# super
	 	
	 	-  자식 클래스로 생성됨 인스턴스는 두 부분으로 분류할 수 있다
	 	-  this는 해당 인스턴승릐 현재 클래스 부분을 의미한다
	 	-  super는 해당 인스턴스의 부모 부분을 의미한다
	 	-  this()는 현재 클래스의 다른 생성자를 호출할 때 사용한다
	 	-  super()는 현재 클래스의 부모 생성자를 호출할 때 사용한다
	 	
	 	연습: myobj 패키지에 상속관계인 클래스들을 정의해보세요
	 */
	public static void main(String[] args) {
		Car c1 = new Car("레이", "기아", 200);
		Car c2 = new Car("아반떼", "현대", 550);
		
		c1.accelerate();
		
		
		DumpTruck d1 = new DumpTruck();
		
		d1.accelerate(); // Car 메서드
		d1.decelerate();
		d1.addCargo(10);
		d1.reduceCargo(3); // DumpTruck의 메ㅔ서드
		d1.info();
	}
}

class Car{
	String name;
	String brand;
	final int MAX_SPEED;
	int fuel;
	int speed;
	
	public Car(String name, String brand, int MAX_SPEED) {
		this.name = name;
		this.brand = brand;
		this.MAX_SPEED = MAX_SPEED;
	}
	
	void accelerate() {
		++speed;
	}
	void decelerate() {
		--speed;
	}
}

// Car 클래스를 상속받은 DumoTruck 클래스
class DumpTruck extends Car {
	
	final int MAX_WEIGTH;
	int weight;
	
	public DumpTruck() {
		super("덤프트럭", "볼보", 160);  // 부모 클래스의 성\생성자 호출
		this.MAX_WEIGTH = 10000;
	}
	
	public DumpTruck(String name, String brand,
			int MAX_SPEED, int MAX_WEIGTH) {
		super(name, brand, MAX_SPEED);
		this.MAX_WEIGTH = MAX_WEIGTH;
	}
	
	void addCargo(int kg) {
		this.weight += kg;
	}
	
	void reduceCargo(int kg) {
		this.weight -= kg;
	}
	
	void removeCargo() {
		weight = 0;
	}
	
	void info() {
		//부모에만 있는 필드는 this와 super로 모드 접근할 수 있다
		System.out.println("현재 속도(Car에서 만든 필드): "
				+ this.speed);
		// 부모와 자식 모두에 있는 필드(메서드)는 super와 super로 구분하여 사용할 수 있다
		System.out.println("현재 적재량(DumpTruck에서 만든 필드): "
				+ this.weight);
		System.out.println("트렁크 공간(Car에서 만든 필드): "
				+ this.weight);
	}
}




















