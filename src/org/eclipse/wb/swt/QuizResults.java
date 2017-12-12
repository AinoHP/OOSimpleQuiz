package org.eclipse.wb.swt;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class QuizResults extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuizResults frame = new QuizResults();
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
	public QuizResults() {
		setTitle("Your Results");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 414);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblYourResults = new JLabel("YOUR RESULTS");
		lblYourResults.setFont(new Font("Bebas Neue", Font.PLAIN, 50));
		lblYourResults.setBounds(98, 31, 236, 69);
		contentPane.add(lblYourResults);
		
		JButton btnReturn = new JButton("Return");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OpeningScreen q = new OpeningScreen();
				q.setVisible(true);
			}
		});
		btnReturn.setBounds(282, 323, 89, 23);
		contentPane.add(btnReturn);
		
		JButton ViewCorrectAnswers = new JButton("View Correct Answers");
		ViewCorrectAnswers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CorrectAnswers q = new CorrectAnswers();
				q.setVisible(true);
			
			}
		});
		ViewCorrectAnswers.setBounds(21, 323, 160, 23);
		contentPane.add(ViewCorrectAnswers);
	
	}

}
