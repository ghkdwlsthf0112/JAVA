package gui.quiz.gugudan;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GugudanFrame extends JFrame {
	
	final int GUGUDAN_SIZE;
	int dan = 2;
	
	List<JLabel> gugudanLabels = new ArrayList<>();
	Font gugudanLabelsFont = new Font("Consolas", Font.PLAIN, 25);
	
	
	// 이 프래임에
	JPanel topPanel = new JPanel(new GridLayout(9, 1));
	JPanel bottomPanel = new JPanel(new GridLayout(1, 2));
	
	JButton prevBtn = new PrevButton(this);
	JButton nextBtn = new NextButton(this);
	
	ActionListener gugudanButtonAction;
	
	public GugudanFrame() {
		this(9);
	}

	public GugudanFrame(int size) {
		GUGUDAN_SIZE = size;
		
		gugudanButtonAction =
				new GugudanButtonActionListener(false);
		
		setLayout(new BorderLayout());
		
		Container pane = getContentPane();
		
		for (int i = 0; i < 9; ++ i) {
			JLabel gugudanLabel = new JLabel();
			
			gugudanLabel.setText(String.format("2 X %d = %d", gop, 2 * gop);
			
			
			gugudanLabels.add(gugudanLabel);
			pane.add(gugudanLabel);
		}
		
		pane.add(topPanel, "Center");
		pane.add(bottomPanel, "South");
		
		// 이 프레임의 하위 컴포넌트에서 현재 컴포넌트의 모든것을 알 수 있돌로
		// 데이터를 전달해주는 것이 편하다
		bottomPanel.add(prevBtn);
		bottomPanel.add(nextBtn);
		
		prevBtn.addActionListener(gugudanButtonAction);
		nextBtn.addActionListener(gugudanButtonAction);
		
		setTitle("구구단");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 400);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
	 new GugudanFrame();
	}
	
}
