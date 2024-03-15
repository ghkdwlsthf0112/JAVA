package quiz;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class E07_Copy {
	
	public static void main(String[] args) {
		// copyTextFilesOnly("./myfiles/", "./mytxts/");
		copyImageFilesOnly("./myfiles/", "./myimages/");
	}
	
	// 1. myflies의 파일들 중 .txt 파일들을 mytxts 폴더에 복사해보세요	
	public static void copyTextFilesOnly(String src, String dst) {
		File srcDir = new File(src);
		File dstDir = new File(dst);
		
		if (!dstDir.exists()) {
			dstDir.mkdirs();
		}
				
		for (File srcFile : srcDir.listFiles()) {
			if (srcFile.isDirectory()) {
				continue;
			}
			
			String fileName = srcFile.getName();
			// 파일이름에 .이 포함되어 있는 경우에 대비하여
			// indexOf() 대신에 .의 위치를 위에서부터 찾는
			// last
			String ext = fileName
					.substring(fileName.indexOf('.'));
			
			System.out.printf("파일이름은 %s이고 확장자는 %s입니다.\n",
					fileName, ext);
			
			if (ext.equals(".txt")) {
				File dstFile = new File(dstDir,fileName);
				
				FileReader in = null;
				FileWriter out = null;
				try {
					in = new FileReader(srcFile);
					out = new FileWriter(dstFile);
					
					char[] buff = new char[1024];
					int len;
					while ((len = in.read(buff)) != -1) {
						out.write(buff, 0, len);
					}
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					try {
						if (in != null) {
							in.close();
						}
					} catch (IOException e){
						e.printStackTrace();
					}
					
					try {
						if (out != null) {
							out.close();
						}
					} catch (IOException e){
						e.printStackTrace();
					}
				}				
			}
		}
	}
	
	public static Set<String> IMAGE_EXTENIONS = new HashSet<>();
	
	static
	
	// 2. myfiles의 파일들 중 그림 파일들을 myimages 폴더에 복사해보세요
	public static void copyImageFilesOnly(String src, String dst) {
		File srcDir = new File(src);
		File dstDir = new File(dst);
		
		if (!dstDir.exists()) {
			dstDir.mkdirs();
		}
				
		for (File srcFile : srcDir.listFiles()) {
			if (srcFile.isDirectory()) {
				continue;
			}
			
			String fileName = srcFile.getName();
			String ext = fileName
					.substring(fileName.indexOf('.'));
			
			if (IMAGE_EXTENIONS.contains(ext)) {
				File dstFile = new File(dstDir,fileName);
				
				// 이ㅣ미지 파일은 바이트 단위로 복사
				FileInpuStream in = null;
				FileOutpuStream out = null;
				try {
					in = new FileInpuStream(srcFile);
					out = new FileOutpuStream(dstFile);
					
					out.write(in.readAllByte);
				}
				
			}
		}
	}
}





















