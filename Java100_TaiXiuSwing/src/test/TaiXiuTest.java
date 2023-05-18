package test;

import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import view.TaiXiuView;

public class TaiXiuTest {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			TaiXiuView frame = new TaiXiuView();
			frame.setVisible(true);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
