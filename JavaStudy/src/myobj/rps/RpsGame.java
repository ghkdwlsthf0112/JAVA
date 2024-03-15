package myobj.rps;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class RpsGame {
	
	final private static String[] SHAPE_LABELS = {"가위", "바위", "보"};

	final public static int ROCK = 0;
	final public static int SCISSORR = 0;
	final public static int PAPER = 0;
	
	private int win;
	private int lose;
	private int draw;
		
	public RpsGame() {
		// 파일에서 꺼내서 win/lose/draw를 채울 것
		try {
			FileInputStream in = new FileInputStream("myfiles/record.sav");
			
			byte[] arr = new byte[4];
			
			int len;
			
			in.read(arr);
			win = byteArrayToint(arr);
			in.read(arr);
			draw = byteArrayToint(arr);
			in.read(arr);
			lose = byteArrayToint(arr);
			
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fight(int shape) {
		int userShape = shape;
		int comShape = (int)(Math.random() * 3);
		
		System.out.println("YOU\t\tCOM");
		System.out.printf("%s\tVS\t%s\n", 
				SHAPE_LABELS[userShape], SHAPE_LABELS[comShape]);
		
		if ((userShape + 1) % 3 == comShape) {
			System.out.print("당신이 이겼습니다.");
			++win;
		} else if ((comShape + 1) %3 == userShape) {
			System.out.print("패배했습니다.");
			++lose;
		} else {
			System.out.printf("무승부입니다.");
			++draw;
		}
		System.out.printf("(현재 %d승 %d무 %d패)\n", win, draw, lose);
	}
	
	final public static int byteArrayToint(byte[] bytes) {
		int value = 0;
		
//		System.out.println("0:" + bytes[0]);
//		System.out.println("1:" + bytes[1]);
//		System.out.println("2:" + bytes[2]);
//		System.out.println("3:" + bytes[3]);
		
		
		value |= bytes[0] << 24;
		value |= (bytes[1] & 0xFF) << 16;
		value |= (bytes[2] & 0xFF) << 8;
		value |= (bytes[3] & 0xFF);
		
		return value;
	}
	
	final public static byte[] intToByteArray(int value) {		
		// 255일때 (0000 0000/ 0000 0000/ 0000 0000/ 1111 1111)
		
		// byte[]로는 (0, 0, 0, -128)
		
		return new byte[] {
				(byte)(value >>> 24),
				(byte)(value >>> 16),
				(byte)(value >>> 8),
				(byte)(value)};
	}
	
	// 파일에 현적을 기록하는 기능
	public void save() {
		try {
			FileOutputStream out = new FileOutputStream("myfiles/record.sav");
			
			out.write(intToByteArray(win));
			out.write(intToByteArray(draw));
			out.write(intToByteArray(lose));
			
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}














