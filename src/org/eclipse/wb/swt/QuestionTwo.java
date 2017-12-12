package org.eclipse.wb.swt;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Scanner;
import javax.swing.JOptionPane;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class QuestionTwo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuestionTwo frame = new QuestionTwo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public QuestionTwo() {
		setTitle("Question 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 360);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("2. What do you need to develop a java app?");
		lblNewLabel.setBounds(5, 11, 424, 20);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(lblNewLabel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Special computer designed for java development");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton.setBounds(22, 61, 407, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton enviroment = new JRadioButton("Developing enviroment of your choice");
		enviroment.setFont(new Font("Tahoma", Font.PLAIN, 14));
		enviroment.setBounds(22, 108, 351, 23);
		contentPane.add(enviroment);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Neither of the above");
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton_2.setBounds(22, 148, 220, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JButton button = new JButton("Next");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				QuestionThree q = new QuestionThree();
				q.setVisible(true);
			}
		});
		button.setBounds(324, 287, 89, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Check!");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String String;
				if (enviroment.isSelected())
				String = "message";
				String message = "Correct";
					JOptionPane.showMessageDialog (null, message);

			
			}
			
		});
		button_1.setBounds(324, 250, 89, 23);
		contentPane.add(button_1);
	}
}
