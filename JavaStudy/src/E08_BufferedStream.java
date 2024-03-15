import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E08_BufferedStream {

	/*
	 	# Buffer (버퍼)
	 	
	 	- 데이터를 하나씩 전송하는 것이 아니라 모아서 한번에 전송하는 것
	 	- BufferedRwader/Writer : 버퍼를 사용한 문자 단위로 데이터를 입출력
	 	- BufferedInpStream/OutputStream
	 		: 버퍼를 사용하고 바이트 단위로 데이터를 입출력
	 */
	public static void main(String[] args) {
		
		File f = new File("myfiles/emails.txt");
		
		// 기존의 FileReder에 버퍼 기능을 추가해 사용
		try (
			FileReader fin = new FileReader(f);
			BufferedReader in =	new BufferedReader(fin);
		) {
			String line;
			
			while ((line = in.readLine()) != null) {
				System.out.println(line);
			}	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//		new BufferedInputStream();
//		new BufferedWriter();
//		new BufferedOutputStream();
		
		BufferedInputStream in = new BufferedInputStream(System.in);
		
		try {
			System.out.print(">> ");
			int data = in.read();
			System.out.println(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		// 바이트 단위릐
		InputStreamReader isr = new InputStreamReader(System.in);
		
		try {
			System.out.print("isr >> ");
			int ch = isr.read();
			
			System.out.println((char)ch);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 콘솔의 내용을 문자로 다루면서 한 줄씩 입력받기위해 BufferedReader로
		// 업그레이드 해서 사용
		BufferedReader bin = new BufferedReader(isr);
		
		try {
			System.out.println("buffered >> ");
			String line = bin.readLine();
			
			System.out.println(line);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}






