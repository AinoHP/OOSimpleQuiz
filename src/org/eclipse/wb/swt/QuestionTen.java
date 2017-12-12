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
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class QuestionTen extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuestionTen frame = new QuestionTen();
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
	public QuestionTen() {
		setTitle("Question 10");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblChooseAll = new JLabel("10. Choose All words that apply to Java as a programming language.");
		lblChooseAll.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblChooseAll.setBounds(10, 11, 414, 22);
		contentPane.add(lblChooseAll);
		
		JCheckBox dynamic = new JCheckBox("Dynamic");
		dynamic.setBounds(10, 51, 97, 23);
		contentPane.add(dynamic);
		
		JCheckBox object = new JCheckBox("Object Oriented");
		object.setBounds(10, 95, 134, 23);
		contentPane.add(object);
		
		JCheckBox highperf = new JCheckBox("High Performance");
		highperf.setBounds(123, 51, 134, 23);
		contentPane.add(highperf);
		
		JCheckBox slow = new JCheckBox("Slow");
		slow.setBounds(143, 95, 97, 23);
		contentPane.add(slow);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CorrectAnswers q = new CorrectAnswers();
				q.setVisible(true);
			}
		});
		btnNext.setBounds(335, 227, 89, 23);
		contentPane.add(btnNext);
		
		JButton button = new JButton("Check!");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
	if (dynamic.isSelected());
		
			if (object.isSelected());
			
			
			if (highperf.isSelected());
			
			String String = "message";
			String message = "Correct";
				JOptionPane.showMessageDialog (null, message);
			
			}	
			
		
			
		
		});
		button.setBounds(335, 187, 89, 23);
		contentPane.add(button);
	}

}
