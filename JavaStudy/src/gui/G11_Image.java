package gui;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class G11_Image {
	
	// 해당 컴포넌트 이미지를 setIcon 메서드로 교체할 수 있다

	public static void main(String[] args) {
		JFrame f = new JFrame("Image Sample");
		
		f.setLayout(new BorderLayout());
		
		JLabel imageLabel = new JLabel("");
		
		// 이미지 크기가 알맞지 않은 상태
//		imageLabel.setIcon(
//				new ImageIcon("myfiles/images/fruits/apple/apple1.jpg"));
		
		// 이미지 크기 수정해서 사용하기		
		try {
			// 1.이미지 크기를 수정하기 위해 불러온다.
			BufferedImage bufferedImage = 
					ImageIO.read(new File("myfiles/images/animals/dog.jpg"));
			
			// 2. 불러온 이미지로부터 사이즈가 조절된 새로운 인스턴스를 받을 수 있다.
			 Image scaledImage =
					bufferedImage.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
					
			// 2-1. 이미지 일부를 잘라서 활용하는 방법
//			 Image subImage = 
//					bufferedImage.getSubimage(100, 100, 150, 150);
			
			// 크기조절된 이미지를 라벨에 붙인다 
//			imageLabel.setIcon(new ImageIcon(subImage));
			 
			imageLabel.setIcon(new ImageIcon(scaledImage));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		 //imageLabel.setIcon(null);

		JButton southBtn = new JButton("다음!");
		
		f.add(imageLabel, "Center");	
		f.add(southBtn, "South");
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(100, 100, 500, 500);
		f.setVisible(true);	
	}
}
