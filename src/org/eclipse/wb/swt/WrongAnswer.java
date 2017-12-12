package org.eclipse.wb.swt;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class WrongAnswer extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WrongAnswer frame = new WrongAnswer();
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
	public WrongAnswer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblYourAnswerIs = new JLabel("Your answer is incorrect. Try again?");
		lblYourAnswerIs.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblYourAnswerIs.setBounds(79, 83, 265, 53);
		contentPane.add(lblYourAnswerIs);
		
		JButton btnReturn = new JButton("Return");
		btnReturn.setBounds(79, 161, 89, 23);
		contentPane.add(btnReturn);
		
		JButton btnExitGame = new JButton("Exit Game");
		btnExitGame.setBounds(233, 161, 89, 23);
		contentPane.add(btnExitGame);
	}

}
