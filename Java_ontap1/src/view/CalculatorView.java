package view;

import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.CalculatorController;
import model.CalculatorModel;

public class CalculatorView extends JFrame{
	
	public CalculatorModel calculatorModel;
	
	public JTextField inputTextField;

	public CalculatorView()
	{
		calculatorModel = new CalculatorModel();
		this.Init();
		this.setVisible(true);
	}

	private void Init() {
		
		
		this.setTitle("Calculator");
		this.setSize(300,500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		Font font = new Font("Arial", Font.PLAIN, 25);
		//TextField
		JPanel panel_textfield = new JPanel();
		inputTextField = new JTextField();
		inputTextField.setFont(font);
		
		inputTextField.setHorizontalAlignment(JTextField.RIGHT);
		//inputTextField.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        
		panel_textfield.setLayout(new BorderLayout());
		panel_textfield.add(inputTextField,BorderLayout.CENTER);
		this.add(panel_textfield, BorderLayout.NORTH);
		
		//Button
		JPanel buttonJPanel = new JPanel();
		buttonJPanel.setLayout(new GridLayout(4,4));
//		for(int i = 0 ;i<=9;i++)
//		{
//			JButton iButton = new JButton(i+"");
//			iButton.setFont(font);
//			buttonJPanel.add(iButton);
//		}
//		JButton addButton = new JButton("+");
//		addButton.setFont(font);
//		JButton minusButton = new JButton("-");
//		minusButton.setFont(font);
//		JButton mulButton = new JButton("*");
//		mulButton.setFont(font);
//		JButton devButton = new JButton("/");
//		devButton.setFont(font);
//		JButton equalsButton = new JButton("=");
//		equalsButton.setFont(font);
//		buttonJPanel.add(addButton);
//		buttonJPanel.add(minusButton);
//		buttonJPanel.add(mulButton);
//		buttonJPanel.add(devButton);
//		buttonJPanel.add(equalsButton);
//		this.add(buttonJPanel,BorderLayout.CENTER);
		ActionListener actionListener = new CalculatorController(this);
		inputTextField.enable(false);
		String[] arr = {"7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"};
		for (int i = 0; i < arr.length; i++) {
            JButton button = new JButton(arr[i]);
            button.setFont(font);
            button.addActionListener(actionListener);
            buttonJPanel.add(button);
        }
		this.add(buttonJPanel,BorderLayout.CENTER);
		
	}
	
}
