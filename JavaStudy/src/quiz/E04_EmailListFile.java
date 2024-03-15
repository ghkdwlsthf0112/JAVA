package quiz;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E04_EmailListFile {

	// D10번 문제 기자들의 이메일들로만 이루어진 파일을 myfiles로 밑에 생성해보세요

	public static void main(String[] args) {

		try {
			FileOutputStream out = new FileOutputStream("myfiles/emails.txt");

			Matcher matcher = Pattern.compile("(.+@.+)").matcher(D10_ReporterList.emails);

			while (matcher.find()) {
				out.write(matcher.group(1).getBytes());
				out.write('\n');
			}

			// 다 쓰고나면 반드시 달기
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
