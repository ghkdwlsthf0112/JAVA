
public class C05_Static {
	
	/*
	 	# Static (정적 영역, 클래스 영역)
	 	
	 	- 인스턴스 영역과 대조되는 개념의 영역
	 	- 같은 클래스로 만들어진 모든 인스턴스들이 함께 사용하는 공통 영역을 의미한다
	 	- 앞에 Static 이라는 키워드를 모든 자원(변수, 매서드)들은
		  모든 인스턴스들이 함께 사용하는 공동 영역에 있는 자원이 된다
	 */
	public static void main(String[] args) {
		
		Wall[] walls = new Wall[100];
		
		for (int i = 0; i < walls.length;  ++i) {
			walls[i] = new Wall();
		}
	}

}


class Wall {
	//생성된 모든 벽에서 동일할 값
	static int def;
	static int maxHp;
	
	// 각 벽마다 다를 값
	int hp;
	int x;
	int y;
}


/* 현실 객체를 참고하여 static 필드를 포함한 클래스를 하나 만들어 보세요 */

class MegaCoffee {
			
	int size;
	int price;
	String taste;

	
}












