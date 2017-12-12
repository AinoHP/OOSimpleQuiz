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

public class QuestionSix extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuestionSix frame = new QuestionSix();
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
	public QuestionSix() {
		setTitle("Question 6");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsingJava = new JLabel("6. Using Java, can you write:?");
		lblUsingJava.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUsingJava.setBounds(10, 27, 292, 14);
		contentPane.add(lblUsingJava);
		
		JCheckBox checkboxonline = new JCheckBox("Online apps");
		checkboxonline.setFont(new Font("Tahoma", Font.PLAIN, 12));
		checkboxonline.setBounds(10, 64, 97, 23);
		contentPane.add(checkboxonline);
		
		JCheckBox checkboxmobile = new JCheckBox("Mobile apps");
		checkboxmobile.setFont(new Font("Tahoma", Font.PLAIN, 12));
		checkboxmobile.setBounds(10, 112, 97, 23);
		contentPane.add(checkboxmobile);
		
		JCheckBox checkboxdesktop = new JCheckBox("Desktop programs");
		checkboxdesktop.setFont(new Font("Tahoma", Font.PLAIN, 12));
		checkboxdesktop.setBounds(10, 161, 159, 23);
		contentPane.add(checkboxdesktop);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				QuestionSeven q = new QuestionSeven();
				q.setVisible(true);
			}
		});
		btnNext.setBounds(324, 227, 89, 23);
		contentPane.add(btnNext);
		
		JButton button = new JButton("Check!");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
	if (checkboxonline.isSelected())
	;
		
			if (checkboxmobile.isSelected())
				;
			
			
			if (checkboxdesktop.isSelected())
			;
			
			String String = "message";
			String message = "Correct!";
				JOptionPane.showMessageDialog (null, message);
			
			
			}	
			
			
			
		});
		button.setBounds(324, 193, 89, 23);
		contentPane.add(button);
	}

}
