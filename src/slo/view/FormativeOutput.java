package slo.view;

import slo.controller.FormativeController;
import javax.swing.JOptionPane;

public class FormativeOutput
{
	public boolean booleanInt;
	public boolean booleanDouble;
	public boolean booleanString;
	
	public void displayAnswers()
	{
		if (booleanInt == true)
		{	
		JOptionPane.showMessageDialog(null, "That is correct");
		}
		else
		{
		JOptionPane.showMessageDialog(null, "That is incorrect");
		}
		
		if (booleanDouble == true)
		{
		JOptionPane.showMessageDialog(null, "That is correct");
		}
		else
		{	
		JOptionPane.showMessageDialog(null, "That is incorrect");
		}
		
		if (booleanString == true)
		{
		JOptionPane.showMessageDialog(null, "Go to starwars.com");
		}
		else
		{	
		JOptionPane.showMessageDialog(null, "You may exit this application");
		}
	}

}	