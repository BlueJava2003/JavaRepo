package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.CalculatorView;

public class CalculatorController implements ActionListener {
	private boolean click = true;
	private String phep = "=";

	private CalculatorView calculatorView;

	public CalculatorController(CalculatorView calculatorView) {
		this.calculatorView = calculatorView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand();
		
		// Nếu nút là số hay dấu .
        if ('0' <= s.charAt(0) && s.charAt(0) <= '9' || s.equals(".")) {
            // Nếu số được click đầu tiên
            if (click) {
                // Hiển thị số vào textfield
            	calculatorView.inputTextField.setText(s);
            } else { // Nếu không phải là số được bấm đầu tiên
                // Thêm các dấu vào sau số ở trong textfield
            	calculatorView.inputTextField.setText(calculatorView.inputTextField.getText() + s);
            }

            // Thiết lậ p lại để làm dấu số đầu tiên được bấm
            click = false;
        } else { // Neu khong phai la so hoac dau cham
            if (click) {
                // Neu la dau - ma lai la ky tu dau tien la dau am
                if (s.equals("-")) {
                	calculatorView.inputTextField.setText(s);
                    click = false;
                } else {
                    phep = s;
                }
            } else { // Neu da co so, nut vua an la phep toan
                double x = Double.parseDouble(calculatorView.inputTextField.getText());
                calculator(x);
                phep = s;
                click = true;
            }
        }
	}
	
	// Dinh nghia ham tinh toan
    public void calculator(double n) {
        if (phep.equals("+")) {
            calculatorView.calculatorModel.result += n;
        } else if (phep.equals("-")) {
        	calculatorView.calculatorModel.result -= n;
        } else if (phep.equals("*")) {
        	calculatorView.calculatorModel.result *= n;
        } else if (phep.equals("/")) {
        	calculatorView.calculatorModel.result /= n;
        } else if (phep.equals("=")) {
        	calculatorView.calculatorModel.result = n;
        }

        calculatorView.inputTextField.setText(calculatorView.calculatorModel.result + "");
    }
}

	
