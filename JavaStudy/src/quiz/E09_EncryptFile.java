package quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class E09_EncryptFile {
	
	/*
	 	Frankenstein.txt를 시저 암호방식으로 암호한 파일
	 	Frankenstein.Encrypted.enc를 생성해보세요
	 	
		(1) char 방식으로 한 글자씩 암호화하는 속도 측정해보기
		
		(2) char[] 방식으로 암호화하는 속도 측정해보기 
		
		(3) 버퍼를 추가하여 암호화하는 속도 측정해보기
		
		(4) 암호화 했던 파일의 복호화 파일 생성 해보기	
	*/
	final private static String CAESAR_CHARSET =
			"ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()-_+\\ "
		  	 + "abcdefghijklmnopqrstuvwxyz/<>?,.";
	
	final private static int  CAESAR_LENGTH =  CAESAR_CHARSET.length();
	
	public static int encrypt(int ch, int key) {
		
		int idx = CAESAR_CHARSET.indexOf(ch);
		
		if (idx == -1) {
			return ch;
		} else {
			return CAESAR_CHARSET.charAt((idx + key) % CAESAR_LENGTH);
		}
	}
	
	public static char[] encrypt(char[] text, int key, int len) {		
		for (int i = 0; i < len; ++i) {
			text[i] = (char)encrypt(text[i], key);
		}
		return text;
	}
	
	public static int getRandomKey() {
		return (int)(Math.random() * (CAESAR_LENGTH -1) +1);
	}
	
	public static int encryptTextFile(String path) {
		File srcFile = new File(path);
		
		String srcFileName = srcFile.getName();
		
		File tagetFile = new File(
				srcFile.getParentFile(),
				srcFile.getName().substring(0, srcFileName.lastIndexOf('.')) 
				+ "_encrypted.enc");
		
		int key = getRandomKey();
		
		try (
			FileReader in = new FileReader(srcFile);
			FileWriter out= new FileWriter(tagetFile);	
		) {
			char[] buff = new char[1024];
			
			int len;
			while ((len = in.read(buff)) != -1) {
				for (int i = 0; i < len; ++i) {
					buff[i] = (char)encrypt(buff[i], key);
				}
				out.write(buff);
			}
			
			return key;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return -1;
		} catch (IOException e) {
			e.printStackTrace();
			return -1;
		}

	public static int encryptTextFile2(String path) {
		File srcFile = new File(path);
		
		String srcFileName = srcFile.getName();
		
		File tagetFile = new File(
				srcFile.getParentFile(),
				srcFile.getName().substring(0, srcFileName.lastIndexOf('.')) 
				+ "_encrypted2.enc");
		
		int key = getRandomKey();
		
		try (
			FileReader in = new FileReader(srcFile);
			FileWriter out= new FileWriter(tagetFile);	
		) {
			char[] buff = new char[1024];
			
			int len;
			while ((len = in.read(buff)) != -1) {
				out.write(encrypt(buff, key, len));
			}
			
			return key;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return -1;
		} catch (IOException e) {
			e.printStackTrace();
			return -1;
		}
		
	}
	
	public static int encryptTextFile3(String path) {
		File srcFile = new File(path);
		
		String srcFileName = srcFile.getName();
		
		File tagetFile = new File(
				srcFile.getParentFile(),
				srcFile.getName().substring(0, srcFileName.lastIndexOf('.')) 
				+ "_encrypted3.enc");
		
		int key = getRandomKey();
		
		try (
			FileReader fin = new FileReader(srcFile);
			BufferedReader in = new BufferedReader(fin);
			FileWriter fout= new FileWriter(tagetFile);	
			BufferedWriter out = new BufferedWriter(fout);
		) {
			int ch;
			while ((ch = in.read()) != -1) {
				out.write(encrypt(ch, key));
			}
			
			return key;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return -1;
		} catch (IOException e) {
			e.printStackTrace();
			return -1;
		}
		
	}
	
	public static void main(String[] args) {
		long before = System.currentTimeMillis();		
		
		encryptTextFile("myfiles/frankenstein.txt");
		
		long after = System.nanoTime();
		
		System.out.println("time :" + (after - before) + "ms");
		
		before = System.currentTimeMillis();		
		
		encryptTextFile2("myfiles/frankenstein.txt");
		
		after = System.nanoTime();
		
		System.out.println("time2 :" + (after - before) + "ms");
		
		before = System.currentTimeMillis();		
		
		encryptTextFile3("myfiles/frankenstein.txt");
		
		after = System.nanoTime();
		
		System.out.println("time3 :" + (after - before) + "ms");		
	}
}
