package testApp;

import java.awt.EventQueue;
import javax.swing.*;  

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginPage extends LoginBtnWindow{

	private JFrame frame;
	private JTextField reg;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage window = new LoginPage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setBounds(100, 100, 699, 419);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 663, 358);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(176, 196, 222));
		panel_1.setBounds(187, 0, 476, 358);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		reg = new JTextField();
		reg.setBounds(199, 167, 220, 25);
		panel_1.add(reg);
		reg.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Registration :");
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 13));
		lblNewLabel.setBounds(71, 168, 102, 21);
		
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password :");
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 13));
		lblNewLabel_1.setBounds(71, 203, 66, 23);
		panel_1.add(lblNewLabel_1);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String us  = reg.getText();
				LoginBtnWindow obj = new LoginBtnWindow();
				obj.setVisible(true);
						
			}
		});
		btnLogin.setBounds(179, 261, 118, 25);
		panel_1.add(btnLogin);
		
		JLabel lblNewLabel_2 = new JLabel("Login Details");
		lblNewLabel_2.setBackground(new Color(255, 255, 224));
		lblNewLabel_2.setForeground(new Color(0, 0, 128));
		lblNewLabel_2.setFont(new Font("Verdana", Font.BOLD, 15));
		lblNewLabel_2.setBounds(167, 111, 105, 25);
		panel_1.add(lblNewLabel_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(199, 205, 220, 25);
		panel_1.add(passwordField);
		
 }
}
