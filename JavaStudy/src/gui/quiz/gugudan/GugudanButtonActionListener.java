package gui.quiz.gugudan;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;

public class GugudanButtonActionListener implements ActionListener {

	final private int GUGUDAN_SIZE;
	
	List<JLabel> gugudanLabels;
	int dan = 2;
	
	JButton prevBtn;
	JButton nextBtn;
	
	public GugudanButtonActionListener(GugudanFrame mainFrame) {
		GUGUDAN_SIZE = mainFrame.GUGUDAN_SIZE;
		gugudanLabels = mainFrame.gugudanLabels;
		prevBtn = mainFrame.prevBtn;
		nextBtn = mainFrame.nextBtn;
		
		prevBtn.setEnabled(false);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// 이벤트를 구현하기 위해 필요한 재료 : JPanel 9단, 현재 단

		if (e.getSource() == prevBtn) {
			--dan;
			
			if (dan == 8) {
				nextBtn.setEnabled(true);
			} else if (dan == 2) {
				prevBtn.setEnabled(false);
			}
			
		} else if (e.getSource() == nextBtn) {
			System.out.println("next가 눌림");
			++dan;
			if (dan == 3) {
				prevBtn.setEnabled(true);
			} else if (dan == 9) {
				nextBtn.setEnabled(false);
			}
		}
		
		prevBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				--dan;
				for (int i = 0; i < 9; ++i) {
					JLabel gugudanLabel = gugudanLabels.get(i);
					int gop = i + 1;
					gugudanLabel.setText(
							String.format("%d X %d = %d", dan, gop, dan * gop));
				}
				
				if (dan == 8) {
					nextBtn.setEnabled(true);
				} else if (dan == 2) {
					prevBtn.setEnabled(false);
				}
			}
		});
		
	}
	
}
