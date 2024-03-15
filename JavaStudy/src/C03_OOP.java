
public class C03_OOP {
	
	/*
	 	# 객체 지향 프로그램 (Object Oriented Progr)
			
		- 변수와 함수들을 하나의 개념으로 묶어서 생각한느 프로그래밍 방식
		- 변수와 함수들을 무분별하게 사용하다보면 여러가지 문제점들이 발생하기 때문에
		  현실에 존재하는 하나의 개념(객체)으로 묶어서 생각하기 시작
		- 변수는 주로 객체의 현재상태를 나타낸다
		- 함수는 주오 해당 객체의 여러 기능들을 나타낸다
		- 함수는 해당 객체의 현재 상태를 변화시킨다
		- 객체 내부에서 해당 객체의 상태를 변화시키는 함수를 매서드라고 부른다

	ex) 책 (Book)
	
	-책의 현재 상채 (변수) :
		현재 보고 있는 페이지, 현재페이지, 발행일, 제목, 글쓴이,
		각 페이지의 낙서들, 각 낙서들의 좌표, 가격 등
		
	- 책의 기능 (매서드) :
		 책을 다음 페이지로 넘긴다, 여러 페이지 넘긴다, 앞으로 넘긴다,
		 특정 페이지에 책갈피를 꽂는다, 새로운 메모를 추가한다 등
		 채의 현재 상태를 변화시킬 수 있는 것들
		 
	# 클래스 
	
		- 객체지향에서 말하는 객체라는 존재를 프로그래밍 언어로 표현하는 문법
		- 클래스는 해당 객체와ㅑ 솔계도 역할을 한다
		- 클래스를 정의한 시점에서 실제 객체가 존재하지 않는다
		- 클래스를 통해 만들어내는 실제 객체를 인스턴드라고 부른다
	 */
	public static void main(String[] args) {
		
		// Book 클래스의 인스턴트
		Book b1 = new Book();
		Book b2 = new Book();
		Book b3 = new Book();
		
		// 셍성된 인스턴스 .을 찍고 해당 플래스의 변수의 매서드를 사용할 수 있다
		
		// 책들마다 각자의 태를 다르게 설정할 수 있다
		b1.maxPage = 100;
		b1.currentPage = 37;
		
		b2.maxPage = 200;
		b2.currentPage = 3;
		
		b3.used = true;
		
		b1.printBookInfo();
		b2.printBookInfo();
		b3.printBookInfo();
		
		// 클래스에 정의한 매서드로 각 인스턴스를 변화시닐 수 있다
		for (int i = 0; i < 100; ++i) {
			b1.nextPage();
			b2.prevPage();
		}
		
		b1.printBookInfo();
		b2.printBookInfo();
		b3.printBookInfo();
		
		
	
	
	}
}

// 책 클래스 (설계도)
class Book{
	// 두 가지의 변수(현재 상태)를 가지고 있다
	//	== 인스턴트 변수, 멤버 변수, 필드, ...
	int maxPage;
	int currentPage;
	boolean used;
	String[] contents;
	
	// 클래스의 인스턴스 변수는 배열처럼 자동으로 초기화가 되어있다
	// int - 0, false, double - 0.0, boolean - false ...
	
	// 클래스 내부의 함수 (매서드)
	// - 주로 현재 인스턴스(this)의 상태를 변화시키는 역할을 한다
	void nextPage() {
		if (this.maxPage > this.currentPage) {
			++this.currentPage;
		} else {
			System.out.println("[Warning] 이미 맨 뒤 페이지입니다");
		}
	}
	
	void prevPage() {
		if(this.currentPage > 0) {
			--this.currentPage;
		} else {
			System.out.println("[Warning] 이미 맨 앞 페이지입니다");
		}
	}
	
	void printBookInfo() {
		System.out.printf("현재 책 상태: %d/%d(%s)\n",
				this.currentPage, this.maxPage,
				this.used ? "중고" : "새 제품");
				
	}
}

/*
 	실제로 존재하는 현실의 객체를 하나 참고하여 클래스를 생성한 후
 	해당 클래스의 인스턴스를 생성하고 각 인스턴스의 상태를 출력해보세요
 	(인스턴스 3개 이상, 필드 3개 이상, 매서드 2개 이상, 책x)
 */


	













