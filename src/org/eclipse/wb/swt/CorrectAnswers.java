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

public class CorrectAnswers extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CorrectAnswers frame = new CorrectAnswers();
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
	public CorrectAnswers() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 704);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCorrectAnswers = new JLabel("CORRECT ANSWERS");
		lblCorrectAnswers.setFont(new Font("Bebas Neue", Font.PLAIN, 50));
		lblCorrectAnswers.setBounds(74, 0, 305, 87);
		contentPane.add(lblCorrectAnswers);
		
		JLabel lblJava = new JLabel("ANSWER: Java");
		lblJava.setBounds(74, 105, 121, 14);
		contentPane.add(lblJava);
		
		JLabel lblDevelopingEnviroment = new JLabel("ANSWER: Developing enviroment of your choice");
		lblDevelopingEnviroment.setBounds(87, 148, 236, 14);
		contentPane.add(lblDevelopingEnviroment);
		
		JLabel lblNewLabel = new JLabel("1. What is an android programming language?");
		lblNewLabel.setBounds(45, 84, 231, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblWhatDo = new JLabel("2. What do you need to develop a java app?");
		lblWhatDo.setBounds(45, 130, 231, 14);
		contentPane.add(lblWhatDo);
		
		JLabel lblWhich = new JLabel("3. Which of these are programming languages?");
		lblWhich.setBounds(45, 173, 264, 14);
		contentPane.add(lblWhich);
		
		JLabel lblAnswerPythonAnd = new JLabel("ANSWER: Python and Ruby");
		lblAnswerPythonAnd.setBounds(79, 198, 208, 14);
		contentPane.add(lblAnswerPythonAnd);
		
		JLabel lblWhatIs = new JLabel("4. What is the name of the folder where your java source files are ?");
		lblWhatIs.setBounds(45, 223, 334, 14);
		contentPane.add(lblWhatIs);
		
		JLabel lblAnswerSrc = new JLabel("ANSWER: src");
		lblAnswerSrc.setBounds(86, 248, 109, 14);
		contentPane.add(lblAnswerSrc);
		
		JLabel lblwhenWasJava = new JLabel("5.When was Java first developed? ");
		lblwhenWasJava.setBounds(45, 273, 334, 14);
		contentPane.add(lblwhenWasJava);
		
		JLabel lblAnswer = new JLabel("ANSWER: 1995");
		lblAnswer.setBounds(86, 294, 109, 14);
		contentPane.add(lblAnswer);
		
		JLabel lblUsingJava = new JLabel("6. Using Java, can you write:?");
		lblUsingJava.setBounds(45, 319, 160, 14);
		contentPane.add(lblUsingJava);
		
		JLabel lblAnswerOnlineApps = new JLabel("ANSWER: Online apps, mobile apps and desktop programs");
		lblAnswerOnlineApps.setBounds(86, 344, 305, 14);
		contentPane.add(lblAnswerOnlineApps);
		
		JLabel lblWhatIs_1 = new JLabel("7. What is the name of an developing enviroment for Java?");
		lblWhatIs_1.setBounds(45, 369, 297, 14);
		contentPane.add(lblWhatIs_1);
		
		JLabel lblAnswerEclipseIde = new JLabel("ANSWER: Eclipse IDE");
		lblAnswerEclipseIde.setBounds(87, 394, 109, 14);
		contentPane.add(lblAnswerEclipseIde);
		
		JLabel lblNewLabel_1 = new JLabel("8. Which of these is a toolkit included with Java?");
		lblNewLabel_1.setBounds(45, 419, 322, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblAnswerSwing = new JLabel("ANSWER: Swing");
		lblAnswerSwing.setBounds(87, 444, 121, 14);
		contentPane.add(lblAnswerSwing);
		
		JLabel lblWhatDoes = new JLabel("9. What does UI stand for?");
		lblWhatDoes.setBounds(45, 477, 231, 14);
		contentPane.add(lblWhatDoes);
		
		JLabel lblAnswerUserInterface = new JLabel("ANSWER: user interface");
		lblAnswerUserInterface.setBounds(87, 502, 131, 14);
		contentPane.add(lblAnswerUserInterface);
		
		JLabel lblChooseAll = new JLabel("10. Choose All words that apply to Java as a programming language.");
		lblChooseAll.setBounds(45, 527, 379, 14);
		contentPane.add(lblChooseAll);
		
		JLabel lblAnswer_1 = new JLabel("ANSWER: Dynamic, Object Oriented, High Performance");
		lblAnswer_1.setBounds(87, 552, 292, 14);
		contentPane.add(lblAnswer_1);
		
		JButton btnReturn = new JButton("Return");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OpeningScreen q = new OpeningScreen();
				q.setVisible(true);
			}
		});
		btnReturn.setBounds(171, 619, 89, 23);
		contentPane.add(btnReturn);
	}

}
