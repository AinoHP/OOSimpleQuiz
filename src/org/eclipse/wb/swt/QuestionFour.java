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

public class QuestionFour extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuestionFour frame = new QuestionFour();
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
	public QuestionFour() {
		setTitle("Question 4");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 352);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("4. What is the name of the folder where your java source files are ?");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 11, 414, 14);
		contentPane.add(lblNewLabel);
		
		JRadioButton buttonsource = new JRadioButton("src");
		buttonsource.setFont(new Font("Tahoma", Font.PLAIN, 14));
		buttonsource.setBounds(24, 53, 109, 23);
		contentPane.add(buttonsource);
		
		JRadioButton buttonfile = new JRadioButton("file");
		buttonfile.setFont(new Font("Tahoma", Font.PLAIN, 14));
		buttonfile.setBounds(24, 91, 109, 23);
		contentPane.add(buttonfile);
		
		JRadioButton buttonpackages = new JRadioButton("packages");
		buttonpackages.setFont(new Font("Tahoma", Font.PLAIN, 14));
		buttonpackages.setBounds(24, 133, 109, 23);
		contentPane.add(buttonpackages);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				QuestionFive q = new QuestionFive();
				q.setVisible(true);
			}
		});
		btnNext.setBounds(335, 279, 89, 23);
		contentPane.add(btnNext);
		
		JButton button = new JButton("Check!");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String String;
				if (buttonsource.isSelected())
					String = "message";
					String message = "Correct!";
						JOptionPane.showMessageDialog (null, message);
			}
		});
		button.setBounds(335, 245, 89, 23);
		contentPane.add(button);
	}
}
