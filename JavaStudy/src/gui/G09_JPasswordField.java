package gui;

import java.awt.GridLayout;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class G09_JPasswordField extends JFrame {

	// 비밀번호를 사용하는 필드
	
	public G09_JPasswordField() {
		super("JTextField Sample");
		setLayout(new GridLayout(2, 2));
	
		JLabel idLabel = new JLabel("ID:");
		JTextField idFiled = new JTextField();
		
		add(idLabel);
		add(idFiled);
		
		JLabel pwLabel = new JLabel("PW:");
		JPasswordField pwFiled = new JPasswordField();
		
		add(pwLabel);
		add(pwFiled);
		
		this.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentMoved(ComponentEvent e) {
				System.out.println(
						"x: " + e.getComponent().getX() +
						", y:" + e.getComponent().getY());				
			}
			
			@Override
			public void componentResized(ComponentEvent e) {
				System.out.println(
						"width: " + e.getComponent().getWidth() +
						", height:" + e.getComponent().getHeight());
			}
		});
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(790, 240, 250, 80);
		setVisible(true);	
	}
		
	public static void main(String[] args) {
		new G09_JPasswordField();
	}
	
}
