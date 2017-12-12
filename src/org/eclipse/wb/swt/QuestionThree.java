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
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class QuestionThree extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuestionThree frame = new QuestionThree();
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
	public QuestionThree() {
		setTitle("Question 3");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 332);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("3. Which of these are programming languages?");
		lblNewLabel.setBounds(10, 22, 424, 17);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblNewLabel);
		
		JCheckBox a = new JCheckBox("Python");
		a.setFont(new Font("Tahoma", Font.PLAIN, 14));
		a.setBounds(18, 67, 97, 23);
		contentPane.add(a);
		
		JCheckBox checkboxdiamond = new JCheckBox("Diamond");
		checkboxdiamond.setFont(new Font("Tahoma", Font.PLAIN, 14));
		checkboxdiamond.setBounds(17, 103, 97, 23);
		contentPane.add(checkboxdiamond);
		
		JCheckBox b = new JCheckBox("Ruby");
		b.setFont(new Font("Tahoma", Font.PLAIN, 14));
		b.setBounds(117, 67, 97, 23);
		contentPane.add(b);
		
		JCheckBox checkboxrattle = new JCheckBox("RattleSnake");
		checkboxrattle.setFont(new Font("Tahoma", Font.PLAIN, 14));
		checkboxrattle.setBounds(216, 67, 97, 23);
		contentPane.add(checkboxrattle);
		
		JCheckBox checkboxkobra = new JCheckBox("Kobra");
		checkboxkobra.setFont(new Font("Tahoma", Font.PLAIN, 14));
		checkboxkobra.setBounds(116, 103, 97, 23);
		contentPane.add(checkboxkobra);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				QuestionFour q = new QuestionFour();
				q.setVisible(true);
			}
		});
		btnNext.setBounds(320, 259, 89, 23);
		contentPane.add(btnNext);
		
		JButton button = new JButton("Check!");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				
	if (a.isSelected())
		System.out.println("Correct!");
		
			if (b.isSelected())
				System.out.println("Correct!");
	
			
			String String = "message";
			String message = "Correct";
				JOptionPane.showMessageDialog (null, message);
			}		
		});
		button.setBounds(320, 225, 89, 23);
		contentPane.add(button);
	}
}
