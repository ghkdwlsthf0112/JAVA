import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class E05_FileInputStream {

	public static void main(String[] args) {
		try {
		FileInputStream in = new FileInputStream("myfiles/emails.txt");
		
		// read() ; 한 바이트씩 읽는다. 마지막에 도달하면 -1을 리턴한다
		int b;
		
		while ((b = in.read()) != -1) {
			System.out.println((char)b);
		}
		
		// readAllBytes() : 해당 파일의 모든 데이터들을 byte[]로 읽어버린다
		// 파일의 마지막(EDF)에 도달하면 -1을 리턴한다
		// 읽은 내용이 있다면 몇 byte를 읽었는지 길이를 반환하다
//		byte[] buffer = new byte[1024];
//		
//		int len;
//		
//		while ((len = in.read(buffer)) != -1) {
//			System.out.println("유효 길이: " + len);
//			System.out.println(Arrays.toString(buffer));
//			
//			// byte[]에서 유효한 길이까지만 문자열로 만들 수 있다
//			System.out.println(new String(buffer, 0 , len));	
//		}
		
		// readAllBytes() : 해당 파일의 모든 데이터들을 byte[]로 읽어버린다
		// byte[] = allBytes = in.readAllBytes();

		// byte[]도 다시 String으로 쉽게 바꿀 수 있다
		// System.out.println(Arrays.toString(allBytes));
		// System.out.println(newString(allBytes));
		
		// 다 쓰고나면 반드시 달아야 한다
		in.close();
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	}
}
