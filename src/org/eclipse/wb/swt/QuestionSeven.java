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

public class QuestionSeven extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuestionSeven frame = new QuestionSeven();
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
	public QuestionSeven() {
		setTitle("Question 7");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("7. What is the name of an developing enviroment for Java?");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 21, 386, 14);
		contentPane.add(lblNewLabel);
		
		JRadioButton radioeclipse = new JRadioButton("Eclipse IDE");
		radioeclipse.setFont(new Font("Tahoma", Font.PLAIN, 14));
		radioeclipse.setBounds(10, 62, 109, 23);
		contentPane.add(radioeclipse);
		
		JRadioButton radiosunrise = new JRadioButton("Sunrise X");
		radiosunrise.setFont(new Font("Tahoma", Font.PLAIN, 14));
		radiosunrise.setBounds(10, 106, 109, 23);
		contentPane.add(radiosunrise);
		
		JRadioButton radiofullmoon = new JRadioButton("FullMoon");
		radiofullmoon.setFont(new Font("Tahoma", Font.PLAIN, 14));
		radiofullmoon.setBounds(10, 157, 109, 23);
		contentPane.add(radiofullmoon);
		
		JButton btnNewButton = new JButton("Next");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				QuestionEight q = new QuestionEight();
				q.setVisible(true);
			}
		});
		btnNewButton.setBounds(335, 227, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("Check!");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String String;
				if (radioeclipse.isSelected())
					String = "message";
					String message = "Correct!";
						JOptionPane.showMessageDialog (null, message);
					
			}
		});
		button.setBounds(335, 189, 89, 23);
		contentPane.add(button);
	}

}
