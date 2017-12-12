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
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Text;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class QuestionOne extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				try {
					QuestionOne frame = new QuestionOne();
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
	public QuestionOne() {
		setTitle("Question 1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 369);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWhat = new JLabel("1. What is an android programming language?");
		lblWhat.setBounds(10, 31, 424, 31);
		lblWhat.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(lblWhat);
		
		JRadioButton rdbtnC = new JRadioButton("C++");
		rdbtnC.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnC.setBounds(33, 74, 79, 31);
		contentPane.add(rdbtnC);
		
		JRadioButton rdbtnCss = new JRadioButton("CSS");
		rdbtnCss.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnCss.setBounds(33, 122, 79, 31);
		contentPane.add(rdbtnCss);
		
		JRadioButton rdbtnJava = new JRadioButton("Java");
		rdbtnJava.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnJava.setBounds(33, 158, 79, 37);
		contentPane.add(rdbtnJava);
		
		
		JButton btnNewButton = new JButton("Check!");
		btnNewButton.addActionListener(new ActionListener() {
			private String String;

			public void actionPerformed(ActionEvent e) {

				if (rdbtnJava.isSelected())
					String = "message";
					String message = "Correct";
						JOptionPane.showMessageDialog (null, message);

		
			}
		});
		
		
		btnNewButton.setBounds(292, 248, 89, 23);
		contentPane.add(btnNewButton);
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				QuestionTwo q = new QuestionTwo();
				q.setVisible(true);
			}
		});
		btnNext.setBounds(292, 296, 89, 23);
		contentPane.add(btnNext);
		
	}


}
