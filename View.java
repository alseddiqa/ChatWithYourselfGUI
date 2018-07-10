package mvcTry;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class View extends JFrame {

	private JTextField textField;
	private JTextArea textArea;
	private JButton addButton;
	
	public View()
	{
		this.setSize(300,300);
		
		addButton = new JButton("add");
		textField = new JTextField(this.getWidth());
		textArea = new JTextArea();
		setScreen();
	
	}
	
	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public JTextArea getTextArea() {
		return textArea;
	}

	public void setTextArea(JTextArea textArea) {
		this.textArea = textArea;
	}

	public JButton getAddButton() {
		return addButton;
	}

	public void setAddButton(JButton addButton) {
		this.addButton = addButton;
	}


	
	public void setScreen()
	{
		
		textField.setText("Enter a message");
		
		this.getContentPane().setLayout(new BorderLayout());
		this.add(addButton, BorderLayout.NORTH);
		this.add(textArea, BorderLayout.CENTER);

		this.add(textField, BorderLayout.SOUTH);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
