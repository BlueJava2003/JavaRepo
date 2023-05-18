import javax.swing.UIManager;

import view.CalculatorView;

public class test {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			new CalculatorView();
		} catch (Exception ex) {
			ex.printStackTrace();
		}	
	}
}
