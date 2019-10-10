package indexx;


import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;

public class menuExercice extends JFrame {
	/**
	 * asfffffffffffffffffffffffffffffffffffffffffffffffffffffsdfsfsdfsf
	 * sfsdfsfffffffffffffffffffffffffffffffffffffffffffffffffff
	 * sfdaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
	 * safdddddddddddddddddddddddd
	 */
	
	public static void main(String []args) {
		
	}
	/**
	 * Creating private attribute of the table
	 */
	private JPanel contentPane;
	private JTable table_2;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public menuExercice() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 714, 482);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		/**
		 * Create the first panel.
		 */
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(94, 29, 604, 381);
		panel_1.setBackground(Color.white);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		panel_1.setVisible(false);
		/**
		 * Creating the button student and the putting its action listener.
		 */
		JButton btnStudent = new JButton("Student");
		btnStudent.setFont(new Font("Calibri",Font.BOLD,14));
		btnStudent.setBounds(-8, 29, 103, 46);
		contentPane.add(btnStudent);
		btnStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel_1.setVisible(true);
				btnStudent.setForeground(Color.white);
				btnStudent.setBackground(Color.blue);
			}
		});
		/**
		 * Creating the button course.
		 */
		JButton btnCourse = new JButton("Course");
		btnCourse.setFont(new Font("Calibri",Font.BOLD,14));
		btnCourse.setBounds(-8, 79, 103, 46);
		contentPane.add(btnCourse);
		/**
		 * Creating the button course unit .
		 */
		JButton btnCourseUnit = new JButton("Course unit");
		btnCourseUnit.setFont(new Font("Calibri",Font.BOLD,14));
		btnCourseUnit.setBounds(-8, 128, 103, 46);
		contentPane.add(btnCourseUnit);
		/**
		 * Creating the button lecturer.
		 */
		JButton btnLecturers = new JButton("Lecturers");
		btnLecturers.setFont(new Font("Calibri",Font.BOLD,14));
		btnLecturers.setBounds(-8, 177, 103, 46);
		contentPane.add(btnLecturers);
		/**
		 * Creating the menu bar and other related dropdown.
		 */
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 698, 31);
		contentPane.add(menuBar);
		
		JMenu mnAction = new JMenu("Action");
		menuBar.add(mnAction);
		
		JMenu mnBack = new JMenu("Back");
		mnAction.add(mnBack);
		
		JMenu mnLogout = new JMenu("Logout");
		mnAction.add(mnLogout);
		
		JMenu mnRestart = new JMenu("Restart");
		mnAction.add(mnRestart);
		
		JMenu mnNewMenu = new JMenu("Exit");
		mnAction.add(mnNewMenu);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenu mnConect = new JMenu("Connect ");
		mnHelp.add(mnConect);
		
		JMenu mnSearch = new JMenu("Search");
		mnHelp.add(mnSearch);
		
		JMenu menu = new JMenu("help content");
		mnHelp.add(menu);
		/**
		 * Creating another panel.
		 */
		JPanel panel = new JPanel();
		panel.setForeground(Color.WHITE);
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 409, 698, 34);
		contentPane.add(panel);
		/**
		 * Creating the labels and different textfield.
		 */
		JLabel lblCopyRightWww = new JLabel("Copy Right WWW3 2019");
		panel.add(lblCopyRightWww);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 0, 604, 381);
		panel_1.add(panel_3);
		panel_3.setBackground(Color.WHITE);
		panel_3.setLayout(null);
		panel_3.setVisible(false);
		
		JLabel lblNewLabel = new JLabel("First Name :");
		lblNewLabel.setBounds(10, 82, 143, 23);
		panel_3.add(lblNewLabel);
		
		JLabel lblLastName = new JLabel("Last Name :");
		lblLastName.setBounds(10, 130, 143, 23);
		panel_3.add(lblLastName);
		
		JLabel lblSex = new JLabel("Sex :");
		lblSex.setBounds(10, 164, 143, 23);
		panel_3.add(lblSex);
		
		JLabel lblRegistrationNumber = new JLabel("Registration Number :");
		lblRegistrationNumber.setBounds(10, 250, 143, 23);
		panel_3.add(lblRegistrationNumber);
		
		textField = new JTextField();
		textField.setBounds(137, 78, 260, 30);
		panel_3.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(137, 116, 260, 30);
		panel_3.add(textField_1);
		/**
		 * Creating the combox of the male,female, others, i don't wanna tell.
		 */
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[]{"Male", "Female", "Others", "I dont wanna tell"}));
		comboBox.setBounds(137, 160, 260, 30);
		panel_3.add(comboBox);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(137, 246, 260, 30);
		panel_3.add(textField_2);
		JButton btnEdit = new JButton("Edit");
		btnEdit.setBounds(239, 32, 130, 39);
		btnEdit.setForeground(Color.WHITE);
		btnEdit.setBackground(Color.ORANGE);
		btnEdit.setFont(new Font("Calibri",Font.BOLD,25));
		panel_1.add(btnEdit);
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				DefaultTableModel model=(DefaultTableModel) table_2.getModel();
				 if(table_2.getSelectedRow()==-1) {
					 if(table_2.getRowCount()==0) {
						 JOptionPane.showMessageDialog(null,"No data to edit","WWe 2019",JOptionPane.OK_OPTION);
					 }
					 else {
						 JOptionPane.showMessageDialog(null,"select a row to edit","WWe 2019",JOptionPane.OK_OPTION);
					 }
					
				 } else {
					 
				 }
				
			}
		});
		
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(422, 31, 130, 39);
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setBackground(Color.RED);
		btnDelete.setFont(new Font("Calibri",Font.BOLD,25));
		panel_1.add(btnDelete);
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultTableModel model=(DefaultTableModel) table_2.getModel();
				 if(table_2.getSelectedRow()==-1) {
					 if(table_2.getRowCount()==0) {
						 JOptionPane.showMessageDialog(null,"No data to delete","WWe 2019",JOptionPane.OK_OPTION);
					 }
					 else {
						 JOptionPane.showMessageDialog(null,"select a row to delete","WWe 2019",JOptionPane.OK_OPTION);
					 }
					
				 } else{
					 model.removeRow(table_2.getSelectedRow());
				 }
				
			}
		});
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.setBounds(52, 31, 130, 39);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setFont(new Font("Calibri",Font.BOLD,25));
		panel_1.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel_3.setVisible(true);
				 btnNewButton.setVisible(false);
				 btnEdit.setVisible(false);
				 btnDelete.setVisible(false);
			}
		});

		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 panel_3 .setVisible(false);
				 btnNewButton.setVisible(true);
				 btnDelete.setVisible(true);
				 btnEdit .setVisible(true);
				DefaultTableModel model=(DefaultTableModel) table_2.getModel();
				model.addRow(new Object[] {
						textField_3.getText(),
						textField.getText(),
						textField_1.getText(),
						comboBox.getSelectedItem(),
						textField_4 .getText(),
						textField_2.getText(),
						
						
						
				});
				
				if(table_2.getSelectedRow()==1) {
					if(table_2.getRowCount()==0) {
						JOptionPane.showConfirmDialog(null,"Membership Update confirmed","System message",JOptionPane.OK_OPTION);
					}
				}
				
			}
		});
		btnSubmit.setBackground(Color.GREEN);
		btnSubmit.setForeground(Color.WHITE);
		btnSubmit.setBounds(101, 320, 125, 38);
		panel_3.add(btnSubmit);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel_3.setVisible(false);
				btnNewButton.setVisible(true);
				btnEdit.setVisible(true);
				btnDelete.setVisible(true);
			}
		});
		btnCancel.setBackground(Color.RED);
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setBounds(363, 320, 125, 38);
		panel_3.add(btnCancel);
		
		JLabel lblReferenceNumber = new JLabel("Reference number :");
		lblReferenceNumber.setBounds(10, 35, 143, 23);
		panel_3.add(lblReferenceNumber);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(137, 31, 260, 30);
		panel_3.add(textField_3);
		
		JLabel lblCourse = new JLabel("Course :");
		lblCourse.setBounds(10, 212, 143, 23);
		panel_3.add(lblCourse);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(137, 209, 260, 30);
		panel_3.add(textField_4);
		
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 81, 584, 289);
		panel_1.add(scrollPane);
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{"123456", "Amani", "Cirhuza", "Male", "BSSE", "18/0045/BSSE-J"},
			},
			
			new String[] {
				"\u25BC Ref Number #", "\u25BC Fist Name", "\u25BC Last Name", "\u25BC Sex", "\u25BC Course", "\u25BC Registration #"
			}
		));
		scrollPane.setViewportView(table_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 0, 604, 370);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		
		
		
	}
}
