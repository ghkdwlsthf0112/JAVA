package gui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class G10_CardLayout {
	
	/*
	 	다음 카드를 넘기 듯이 컴포넌트를 넘기면서 보여줄 수 있는 레이아웃
	 	ex : 설치 프로그램
	*/
	public static void main(String[] args) {
		JFrame f = new JFrame("CadLayout Sample");
		
		CardLayout card = new CardLayout();
		
		f.setLayout(card);
		
		JPanel panel1 = new JPanel(new BorderLayout());
		JPanel panel2 = new JPanel(new GridLayout());
		JPanel panel3 = new JPanel(null);
		
		JButton panel1NextBtn = new JButton("다음");
		panel1NextBtn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// 카드 레이아웃을 조정하기 위해서는 해당 카드에이 아웃의
					// 부모 컨테이너를 전달하여야 한다
					card.next(f.getContentPane());	
				}
		});
		
		panel1.add(panel1NextBtn, "South");
		
		for (int i = 0; i < 9; ++i) {
			JButton btn = new JButton("Button" + i);
			
			if (i == 4) {
				btn.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						card.next(f.getContentPane());
					}
				});
			}	
			
			panel2.add(btn);
		}
		JButton panel3PrevBtn = new JButton("Prev");
		JButton panel3Page1Btn = new JButton("Page1");
		JButton panel3Page2Btn = new JButton("Page2");
		JButton panel3NextBtn = new JButton("Next");
		
		panel3PrevBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				card.previous(f.getContentPane());
			}
		});
		
		panel3Page1Btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				card.show(f.getContentPane(), "apple");
			}
		});
		
		panel3PrevBtn.setBounds(50, 200, 80, 50);
		panel3Page1Btn.setBounds(170, 200, 80, 50);
		panel3Page2Btn.setBounds(270, 200, 80, 50);
		panel3NextBtn.setBounds(390, 200, 80, 50);
		
		panel3.add(panel3Page1Btn);
		panel3.add(panel3Page2Btn);
		panel3.add(panel3NextBtn);
		
		// 카드 레이아웃에 컴포넌트를 추가할 때 이름 설정을 해두면 좋다
		f.add("apple", panel1);
		f.add("bnana", panel2);
		f.add("orange",panel3);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(100, 100, 500, 500);
		f.setVisible(true);	
	}

}





































