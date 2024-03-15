package gui;

import javax.swing.JButton;
import javax.swing.JFrame;

public class G01_JavaSwing {
	
	/*
		# JavaSwing
		
		- 자바로 GUI 프로그램을 만들 수 있는 API
		- GUI(Graphic User Interface) : 컴퓨터 화면을 이미지로 제어할 수 없는 환경
		- 컨테이너 위해 컴포넌트를 베치허는 방식으로 와면을 구성할 수 있다
		
		# Swing 
		
		- 컨테이너 위에느느 여러각지 컴포넌트들을 배치할 수 있다
		- JFrame,  JFrame, JFrame, .. 등 컨테이너로 분류돠는 다양한 클래스들이 존쟇ㄴ가
	*/
	
	public static void main(String[] args) {
		
		// JFwame : 대표적인 컨테이너 (초기에는 보이지 않는 상태)
		JFrame frame = new JFrame();
		
		// JButton : 여러 컴포넌트들 중 한 종류, 누를 수 있다
		JButton button1 = new JButton();
		JButton button2 = new JButton();
		
		button1.setSize(150, 80);
		
		// Swing의 일부 컴포넌트 라벨에서 html문법이 동작한다
		button1.setText("<html>저는 버튼입니다<br>눌러주세요...</html>");
		button1.setLocation(300, 300); // 테두리 길이를 정해줌
		
		// setBounds == setLocation + setSize
		button2.setBounds(100, 300, 150, 80);
		button2.setText("버튼2");
		
		// 만든 컴포넌트를 프레임에 붙인다
		frame.add(button1);
		
		// 해당 프레임의 레이아웃관리자를 설정
		// (레이아웃관리자 - 컴포넌트를 부착할 때 위치를 제어해주는 클래스)
		frame.setLayout(null);
		// 해당 프레임의 X버튼을 눌렀을 때 동작을 설정하는 메서드
		// - EXIT_ON_CLOSE : 누르면 프로그램 종료
		// - HIDE_ON_CLOSE : 누르면 창을 숨김
		// - DONOTHING_ON_CLOSE : 눌러도 아무것도 안하다
		// - DISPOSE_ON_CLOSE : 누르면 해당 창만 종료하는데 프로그램은 종료하지 않음 (기본값)
		// 해당 프레임의 제목을 설정하는 메서드
		frame.setTitle("My GUI program");
		// 해당 프레임의 초기 크기를 설정하는 메서드
		frame.setLocation(100, 100);
		// 해당 프레임을 보이는 상태로 설정
		frame.setSize(500, 500);
		// 프레임을 보이는 상태로 설정
		frame.setVisible(true);
	
	}

}
