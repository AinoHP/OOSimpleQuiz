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
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class QuestionEight extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuestionEight frame = new QuestionEight();
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
	public QuestionEight() {
		setTitle("Question 8");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("8. Which of these is a toolkit included with Java?");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 27, 366, 14);
		contentPane.add(lblNewLabel);
		
		JRadioButton porch = new JRadioButton("Porch");
		porch.setFont(new Font("Tahoma", Font.PLAIN, 12));
		porch.setBounds(26, 68, 109, 23);
		contentPane.add(porch);
		
		JRadioButton swing = new JRadioButton("Swing");
		swing.setFont(new Font("Tahoma", Font.PLAIN, 12));
		swing.setBounds(26, 111, 109, 23);
		contentPane.add(swing);
		
		JRadioButton playground = new JRadioButton("Playground");
		playground.setFont(new Font("Tahoma", Font.PLAIN, 12));
		playground.setBounds(26, 160, 109, 23);
		contentPane.add(playground);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				QuestionNine q = new QuestionNine();
				q.setVisible(true);
				
			}
		});
		btnNext.setBounds(335, 227, 89, 23);
		contentPane.add(btnNext);
		
		JButton button = new JButton("Check!");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		String String;
		if (porch.isSelected())

				String = "message";
				String message = "Correct!";
					JOptionPane.showMessageDialog (null, message);
			}
		});
		button.setBounds(335, 187, 89, 23);
		contentPane.add(button);
	}

}
