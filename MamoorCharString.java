/**
 * @(#)CharStringProgram.java
 *
 *
 * @Shoueb Mamoor
 * @version 1.00 2016/6/27
 */


import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MamoorCharString extends JFrame
{
	private JPanel panel;
    private JLabel messageTitle;
    private JTextField messageLabel;
    private JRadioButton letterOrDigitButton;
    private JRadioButton stringIdenticalButton;
    private JRadioButton stringEqualButton;
    private JRadioButton stringUpperOrLowerButton;
    private JRadioButton stringConcatButton;
    private JRadioButton stringReverseButton;
    private JRadioButton stringWordCounterButton;
    private JRadioButton stringReplaceAToEButton;
    private JRadioButton stringLengthButton;
    private JRadioButton exitButton;
    private ButtonGroup radioButtonGroup;
    private final int WINDOW_WIDTH = 500;
    private final int WINDOW_HEIGHT = 175;
    
    public MamoorCharString()
    {
    	// Labels the Window
        setTitle("MamoorCharString Program");  
        // Sets the size of the window
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT); 
        // Determines what happens when the window is closed.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        
        buildPanel();
        add(panel);
        setVisible(true);
    }
    
    private void buildPanel()
    {
    	 messageTitle = new JLabel("Choose an Option");
        // Creates the Radio Buttons for selection
        letterOrDigitButton = new JRadioButton("Letter or Digit");
        stringIdenticalButton = new JRadioButton("Two Identical Strings");
        stringEqualButton = new JRadioButton("Two Equal Strings");
        stringUpperOrLowerButton = new JRadioButton("UpperCase or LowerCase a String");
        stringConcatButton = new JRadioButton("Concat Two Strings");
        stringReverseButton = new JRadioButton("Reverse A String");
        stringWordCounterButton = new JRadioButton("Count Words in a String");
        stringReplaceAToEButton = new JRadioButton("Replace A's with E's in a String");
        stringLengthButton = new JRadioButton ("Length of a String");
        exitButton = new JRadioButton ("Exit");
        // Adds the buttons to the ButtonGroup so that only one can be selected. 
        radioButtonGroup = new ButtonGroup();
        radioButtonGroup.add(letterOrDigitButton);
        radioButtonGroup.add(stringIdenticalButton);
        radioButtonGroup.add(stringEqualButton);
        radioButtonGroup.add(stringUpperOrLowerButton);
        radioButtonGroup.add(stringConcatButton);
        radioButtonGroup.add(stringReverseButton);
        radioButtonGroup.add(stringWordCounterButton);
        radioButtonGroup.add(stringReplaceAToEButton);
        radioButtonGroup.add(stringLengthButton);
        radioButtonGroup.add(exitButton);
        // Creates an ActionListener for each button to determine which option is selected. 
        letterOrDigitButton.addActionListener(new RadioButtonListener());
        stringIdenticalButton.addActionListener(new RadioButtonListener());
        stringEqualButton.addActionListener(new RadioButtonListener());
        stringUpperOrLowerButton.addActionListener(new RadioButtonListener());
        stringConcatButton.addActionListener(new RadioButtonListener());
        stringReverseButton.addActionListener(new RadioButtonListener());
        stringWordCounterButton.addActionListener(new RadioButtonListener());
        stringReplaceAToEButton.addActionListener(new RadioButtonListener());
        stringLengthButton.addActionListener(new RadioButtonListener());
        exitButton.addActionListener(new RadioButtonListener());
        // Creates the panel before adding the items.
        panel = new JPanel();
        panel.add(messageTitle);
        panel.add(letterOrDigitButton);
        panel.add(stringIdenticalButton);
        panel.add(stringEqualButton);
        panel.add(stringUpperOrLowerButton);
        panel.add(stringConcatButton);
        panel.add(stringReverseButton);
        panel.add(stringWordCounterButton);
        panel.add(stringReplaceAToEButton);
        panel.add(stringLengthButton);
        panel.add(exitButton);
    }
    
    private class RadioButtonListener implements ActionListener
    {
    	public void actionPerformed(ActionEvent e)
    		 {
                if (e.getSource() == letterOrDigitButton)
                {
                    new letterOrDigitGUI();
                }
                else if (e.getSource() == stringIdenticalButton)
                {
                    new stringIdenticalGUI();   
                }
                else if (e.getSource() == stringEqualButton)
                {
                    new stringEqualGUI();
                }
                else if (e.getSource() == stringUpperOrLowerButton)
                {
                    new stringUpperOrLowerGUI();
                }
                else if (e.getSource() == stringConcatButton)
                {
                    new stringConcatGUI();
                }
                else if (e.getSource() == stringReverseButton)
                {
                    new stringReverseGUI();
                }
                else if (e.getSource() == stringWordCounterButton)
                {
                    new stringWordCounterGUI();
                }
                else if (e.getSource() == stringReplaceAToEButton)
                {
                    new stringReplaceAToEGUI();
                }
                else if (e.getSource() == stringLengthButton)
                {
                    new stringLengthGUI();
                }
                else if (e.getSource() == exitButton)
                {
                    System.exit(0);
                }
            }
    }
    
         public static void main(String[] args)
            {
                new MamoorCharString();
            }
}