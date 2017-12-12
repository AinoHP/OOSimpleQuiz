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
import java.util.Scanner;
public class QuestionFive extends JFrame {

	private JPanel contentPane;
	private JTextField youranswer;
	private JButton button;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuestionFive frame = new QuestionFive();
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
	public QuestionFive() {
		setTitle("Question 5");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblwhenWasJava = new JLabel("5.When was Java first developed? Enter the year below.");
		lblwhenWasJava.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblwhenWasJava.setBounds(10, 22, 351, 14);
		contentPane.add(lblwhenWasJava);
		
		youranswer = new JTextField();
		youranswer.setBounds(10, 59, 86, 20);
		contentPane.add(youranswer);
		youranswer.setColumns(10);
		
		JButton btnNewButton = new JButton("Next");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				QuestionSix q = new QuestionSix();
				q.setVisible(true);
			}
		});
		
		btnNewButton.setBounds(335, 227, 89, 23);
		contentPane.add(btnNewButton);
		
		button = new JButton("Check!");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String String;
				if (youranswer.equals("1995"))
					String = "message";
					String message = "Correct";
						JOptionPane.showMessageDialog (null, message);
			}
		});
		button.setBounds(335, 193, 89, 23);
		contentPane.add(button);
	}
}
