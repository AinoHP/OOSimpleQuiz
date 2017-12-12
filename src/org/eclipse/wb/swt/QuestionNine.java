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
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class QuestionNine extends JFrame {

	private JPanel contentPane;
	private JTextField youranswers;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuestionNine frame = new QuestionNine();
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
	public QuestionNine() {
		setTitle("Question 9");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("9. What does UI stand for?");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 23, 191, 14);
		contentPane.add(lblNewLabel);
		
		youranswers = new JTextField();
		youranswers.setBounds(22, 65, 163, 20);
		contentPane.add(youranswers);
		youranswers.setColumns(10);
		
		JButton btnCheck = new JButton("Next");
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				QuestionTen q = new QuestionTen();
				q.setVisible(true);
			}
		});
		btnCheck.setBounds(335, 227, 89, 23);
		contentPane.add(btnCheck);
		
		JButton button = new JButton("Check!");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String String;
				if (youranswers.equals("user interface"))
					String = "message";
					String message = "Correct!";
						JOptionPane.showMessageDialog (null, message);
					
			}
		});
		button.setBounds(335, 188, 89, 23);
		contentPane.add(button);
	}

}
