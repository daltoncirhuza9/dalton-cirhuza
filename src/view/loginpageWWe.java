package indexx;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class loginpageWWe extends JFrame {
	

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
	}

	/**
	 * Create the frame.
	 */
	public loginpageWWe() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 687, 493);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(70, 130, 180));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 153, 255));
		panel_1.setBounds(10, 11, 641, 422);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblLoginPage = new JLabel("Login Page");
		lblLoginPage.setFont(new Font("NSimSun", Font.BOLD, 64));
		lblLoginPage.setBackground(Color.WHITE);
		lblLoginPage.setToolTipText("");
		lblLoginPage.setBounds(151, 0, 375, 65);
		panel_1.add(lblLoginPage);
		
		JLabel lblUsername = new JLabel("Username :");
		lblUsername.setFont(new Font("SimSun", Font.ITALIC, 30));
		lblUsername.setBounds(30, 129, 192, 31);
		panel_1.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setFont(new Font("SimSun", Font.ITALIC, 30));
		lblPassword.setBounds(30, 198, 192, 31);
		panel_1.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(204, 129, 335, 32);
		panel_1.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(204, 198, 335, 32);
		panel_1.add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String uname=textField .getText();
				@SuppressWarnings("deprecation")
				String pass=passwordField.getText();
				
				if (uname.contains("dalton") && pass.contains("1234")) {
				
				JOptionPane.showMessageDialog(null, "you are successfully logged in","WWe",JOptionPane.INFORMATION_MESSAGE);
				textField .setText(null);
				passwordField.setText(null);
				
				setVisible(false);
				/**
				 * Creating private attribute of the tablesadfdsdajkfhfskskjfhsjfkhslfss
				 * safsdafsdjfsfhjdsfhfdsjdsfsfsdf
				 * safdsgdffdggddgdfgdfgdfgdfgdfg
				 * asgdsdgdfgfshghsgfhsghffgg
				 * fdhsfhfhghfh
				 * 
				 */
				}
				
				else
				{
					JOptionPane.showMessageDialog(null, "Invalid Username or Password","WWe",JOptionPane.WARNING_MESSAGE);
					
				}
			}
		});
		btnLogin.setFont(new Font("SimSun", Font.PLAIN, 30));
		btnLogin.setBackground(new Color(220, 20, 60));
		btnLogin.setForeground(new Color(240, 248, 255));
		btnLogin.setBounds(144, 314, 120, 38);
		panel_1.add(btnLogin);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField .setText(null);
				passwordField.setText(null);
			}
		});
		btnCancel.setForeground(new Color(240, 248, 255));
		btnCancel.setFont(new Font("SimSun", Font.PLAIN, 28));
		btnCancel.setBackground(new Color(220, 20, 60));
		btnCancel.setBounds(427, 314, 120, 38);
		panel_1.add(btnCancel);
	}
}
