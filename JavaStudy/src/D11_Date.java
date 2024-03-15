import java.util.Date;

public class D11_Date {
	
	/*
	 	# java.util.date
	 	
	 	- 시간 및 날짜 정보를 저장할 수 있는 클래스
	 	- 오래된 클랙스이기 때문에 데이터를 보관하는 용도로만 사용하고
	 	  메서드는 잘 사용하지 않는다
	 */
	public static void main(String[] args) {
		
		// 새 인스턴스를 생성하면 현재 시간이 인스턴스로 저장된다
		Date now = new Date();		
		System.out.println(now);
		
		// long타입으로 Unix타입을 넣어서 시간을 생성할 수도 있다
		Date time1 = new Date(10L);
		Date time2 = new Date(10000000L);
		
		System.out.println(time1);
		System.out.println(time2);
		
		/*
		 	# System.currentTimeMillis()
		 	
		 	- 시스템으로부터 현재 유닉스타임을 받아오는 메서드
		 	※ Unix Time -1970년 1월 1일부터 지금까지 몇 밀리초 지났는지 센 것 
		*/
		System.out.println(System.currentTimeMillis());

		// date.after(date2) : date1이 date2보다 뒤인 시간인지 검사한다
		// date.after(date2) : date1이 date2보다 전의 시간인지 검사한다
		System.out.println("time1이 time2보다 더 뒤인가요?" + time1.after(time2));
		System.out.println("time1이 time2보다 더 앞인가요?" + time1.before(time2));

	}
}
