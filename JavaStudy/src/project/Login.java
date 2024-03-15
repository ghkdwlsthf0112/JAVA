package project;

import java.awt.GridLayout;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import gui.G09_JPasswordField;

public class Login extends JFrame {
	
	public Login() {
		super("JTextField Sample");
		setLayout(new GridLayout(4, 2));
	
		JLabel idLabel = new JLabel("ID:");
		JTextField idFiled = new JTextField();
		
		add(idLabel);
		add(idFiled);
		
		JLabel pwLabel = new JLabel("PW:");
		JPasswordField pwFiled = new JPasswordField();
		
		add(pwLabel);
		add(pwFiled);
		
		JLabel emailLabel = new JLabel("EMAIL: ");
		JTextField emailFiled = new JTextField();
		
		add(emailLabel);
		add(emailFiled);
		
		JButton btn = new JButton("LOGIN");
		
		add(btn);
		
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
		setBounds(790, 240, 250, 130);
		setVisible(true);	
	}
		
	public static void main(String[] args) {
		new Login();
	}
}
