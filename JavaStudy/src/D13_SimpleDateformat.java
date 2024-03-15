import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class D13_SimpleDateformat {
	
	/*
	 	 # SimpleDateFormat
	 	 
	 	 - Date타입 인스턴스를 서식을 사용해 문자열로 변환할 수 있는 클래스
	 	 - y : 년
	 	 - M : 월
	 	 - d : 일
	 	 - h : 12시
	 	 - H : 24시
	 	 - m : 분
	 	 - s : 초
	 	 - S :밀리초
	 	 - E : 요일 (짧게)
	 	 - EEEE : 요일 (길게)
	 	 - a : 오전/오후
	 	 - z : 타임존
	 */
	public static void main(String[] args) {
		SimpleDateFormat sdf =
				new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		
		System.out.println(sdf.format(new Date()));
		
//		for (String id : TimeZone.getAvailableIDs()) {
//			System.out.println(id);
//		}
		
		System.out.println(TimeZone.getDefault());
		System.out.println(TimeZone.getTimeZone("America/New_york"));
		
		Calendar cocos = Calendar.getInstance();
		String result = sdf.format(cocos.getTime());
		System.out.println(result);
	}
}
