package mvcTry;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.ArrayList;

public class Controller {

	private View screen;
	private Model dataModel;

	public Controller() {
		screen = new View();
		dataModel = new Model(new ArrayList<String>());
		
		addListeners();
	}

	public void addListeners() {
		screen.getAddButton().addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e)
			{
				String line = screen.getTextField().getText();
				dataModel.getData().add(line);
				updateTextArea();
			}
		});
		
		
		screen.getTextField().addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void focusGained(FocusEvent e) {
				screen.getTextField().setText("");
			}
			
		});
	}

	protected void updateTextArea() {
		
		screen.getTextArea().setText("");
		
		for(String s : dataModel.getData())
		{
			screen.getTextArea().append(s + "\n");
		}
		screen.repaint();
	}
}
