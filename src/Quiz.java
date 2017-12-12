import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Combo;

public class Quiz {

	protected Shell shell;
	private Text text;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Quiz window = new Quiz();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(627, 780);
		shell.setText("Java Quiz");
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setBounds(10, 25, 253, 15);
		lblNewLabel.setText("1. What is an android programming language?");
		
		Label lblNewLabel_1 = new Label(shell, SWT.NONE);
		lblNewLabel_1.setBounds(10, 146, 253, 15);
		lblNewLabel_1.setText("2. What do you need to develop a java app?");
		
		Button btnRadioButton = new Button(shell, SWT.RADIO);
		btnRadioButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnRadioButton.setBounds(20, 46, 90, 16);
		btnRadioButton.setText("C++");
		
		Button btnRadioButton_1 = new Button(shell, SWT.RADIO);
		btnRadioButton_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnRadioButton_1.setBounds(20, 76, 90, 16);
		btnRadioButton_1.setText("Java");
		
		Button btnRadioButton_2 = new Button(shell, SWT.RADIO);
		btnRadioButton_2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnRadioButton_2.setBounds(20, 107, 90, 16);
		btnRadioButton_2.setText("CSS");
		
		Button btnRadioButton_3 = new Button(shell, SWT.RADIO);
		btnRadioButton_3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnRadioButton_3.setBounds(20, 167, 295, 35);
		btnRadioButton_3.setText("A special computer designed for Java development");
		
		Button btnRadioButton_4 = new Button(shell, SWT.RADIO);
		btnRadioButton_4.setBounds(20, 208, 231, 16);
		btnRadioButton_4.setText("Developing enviroment of your choice");
		
		Button btnRadioButton_5 = new Button(shell, SWT.RADIO);
		btnRadioButton_5.setBounds(20, 243, 143, 16);
		btnRadioButton_5.setText("Neither of the above");
		
		Label lblWhichOf = new Label(shell, SWT.NONE);
		lblWhichOf.setBounds(10, 287, 357, 15);
		lblWhichOf.setText("3. Which of these is another java-like programming language?");
		
		Combo combo = new Combo(shell, SWT.NONE);
		combo.setBounds(19, 318, 91, 23);
		combo.setText("Python");
		
		Label lblWhatIs = new Label(shell, SWT.NONE);
		lblWhatIs.setBounds(10, 359, 357, 23);
		lblWhatIs.setText("4. What is the name of the folder where your java source files are ?");
		
		Button btnRadioButton_6 = new Button(shell, SWT.RADIO);
		btnRadioButton_6.setBounds(20, 388, 90, 16);
		btnRadioButton_6.setText("src");
		
		Button btnRadioButton_7 = new Button(shell, SWT.RADIO);
		btnRadioButton_7.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnRadioButton_7.setBounds(20, 416, 90, 16);
		btnRadioButton_7.setText("files");
		
		Button btnRadioButton_8 = new Button(shell, SWT.RADIO);
		btnRadioButton_8.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnRadioButton_8.setBounds(20, 445, 90, 16);
		btnRadioButton_8.setText("packages");
		
		Label lblNewLabel_2 = new Label(shell, SWT.NONE);
		lblNewLabel_2.setBounds(10, 482, 295, 15);
		lblNewLabel_2.setText("5. When was Java first developed? Enter the year below.");
		
		text = new Text(shell, SWT.BORDER);
		text.setBounds(34, 515, 76, 21);
		
		Label lblUsingJava = new Label(shell, SWT.NONE);
		lblUsingJava.setBounds(10, 564, 208, 15);
		lblUsingJava.setText("6. Using Java, can you write:?");
		
		Button btnCheckButton = new Button(shell, SWT.CHECK);
		btnCheckButton.setBounds(10, 598, 136, 16);
		btnCheckButton.setText("Online Applications");
		
		Button btnCheckButton_1 = new Button(shell, SWT.CHECK);
		btnCheckButton_1.setBounds(169, 598, 146, 16);
		btnCheckButton_1.setText("Mobile applications");
		
		Button btnCheckButton_2 = new Button(shell, SWT.CHECK);
		btnCheckButton_2.setBounds(10, 637, 153, 16);
		btnCheckButton_2.setText("Desktop programs");
		
		Label lblNewLabel_3 = new Label(shell, SWT.NONE);
		lblNewLabel_3.setBounds(10, 683, 357, 15);
		lblNewLabel_3.setText("7. What is the name of an developing enviroment for Java?");
		
		Button btnRadioButton_9 = new Button(shell, SWT.RADIO);
		btnRadioButton_9.setBounds(20, 715, 90, 16);
		btnRadioButton_9.setText("Eclipse IDE");
		
		Button btnRadioButton_10 = new Button(shell, SWT.RADIO);
		btnRadioButton_10.setBounds(116, 715, 90, 16);
		btnRadioButton_10.setText("Sunrise X");
		
		Button btnRadioButton_11 = new Button(shell, SWT.RADIO);
		btnRadioButton_11.setBounds(212, 715, 90, 16);
		btnRadioButton_11.setText("FullMoon");
		
		Button btnCheck = new Button(shell, SWT.NONE);
		btnCheck.setBounds(154, 107, 75, 25);
		btnCheck.setText("Check");
		
		Button btnCheck_1 = new Button(shell, SWT.NONE);
		btnCheck_1.setBounds(154, 256, 75, 25);
		btnCheck_1.setText("Check");

	}
}
