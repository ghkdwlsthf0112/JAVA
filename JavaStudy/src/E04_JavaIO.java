import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class E04_JavaIO {

	/*
	 	# Java IO (Input/Output)
	 	
	 	- 자바에서는 스트림이라는 개념을 통해 프로그램의 입출력을 다룬다
	 	- 프로그램으로 데이터가 들어오는 것을 입력(input)이라고 한다
	 	- 프로그램에서 데이터가 나가는 것을 출력(Output)이라고 한다
	 
	 	# Stream
	 	
	 	- 데이터가 전송되는 통로
	 	- 데이터들이 프로그램으로 들어오는 통로를 InputStream이라고 한다
	 	- 데이터들이 프로그램에서 나가는 통로를 OutputStream이라고 한다
	 	- 데이터들이 Stream을 통해 전송되기 위해서는 해당 데이터를 byte타입으로
	 	  변환시켜야 한다 (byte타입이 가장 0과 1로 변환하기 쉽기 때문)
	*/
	
	public static void main(String[] args) {
		
		// java.io.FileOutputStream
		try {
			// Javastudy에 폴더 만든다
			// ctrl + F11 실행 후 myfiles 폴더 F5 새로고침
		FileOutputStream out = new FileOutputStream("myfiles/test.txt");
		
		out.write(65);
		out.write(66);
		out.write(67);
		
		// "".getBytes() : 해당 문자열을 
		out.write("Hello , world!!".getBytes());
		out.write("안녕하세요".getBytes());
		
		// 다 쓰고나면 반드시 달아야한다
		out.close();
		System.out.println("쓰기완료");
		} catch (FileNotFoundException e){
			System.out.println("파일 경로를 찾지 못했습니다");
		} catch (IOException e) {
			System.out.println("쓰다가 뭔가 문제가 생겼습니다");
		}
	}
}
