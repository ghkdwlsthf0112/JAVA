import myobj.school.SubScience;
import myobj.school.Subject;

public class C13_LocalInnerClass {
	
	/*
	  	# 지역 내부 클래스
	  	
	  	- 클래스는 메서드 내부(local)메서트 선언할 수 있다
	  	- 해당 메서드 밖에서는 사용할 수 없는 아주 일시적인 클래스가 된다
	  	
	  	# 익명 지역 내부 클래스
	  	
	  	- 메서드 내부에서 클래스를 바로 상속받아 사용하는 방식
	  	- 클래스 이름을 지정할 수 없기 때문에 익명 클래스라고 불린다
	  	
	  	
	 */
	public static void main(String[] args) {
		// 지역 내부 클래스
		class Apple {
			int color;
			int sweet;
			int price;
		}
		Apple a = new Apple();
		System.out.println(a.color);
		
		// 익명 클래스
		Subject s1 = new Subject();
		Subject s2 = new SubScience();
		// 클래스르 만듦과 동시에 상속
		// 이름을 알 수 없기 때문에 일회용이다
		Subject s3 = new Subject() {
			int c = 80;
			int java = 90;
			
			@Override
			public int getTotal() {
				return (c + java);
			}
			@Override
			public void printScores() {
				System.out.println("컴퓨터 과목의 성적표 출력 메서드 입니다");
			}
			
		};
		// 문과 클래스의 인스턴스가 아닌
		// 문과 클래스를 상속받는 무언가의 인스턴스가 된다
		
		
		s2.printScores();
		
		System.out.println(s3.getTotal() + "점");
		s3.printScores();
	}

}
