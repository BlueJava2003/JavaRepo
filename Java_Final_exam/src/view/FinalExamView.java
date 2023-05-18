package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.AbstractListModel;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JRadioButtonMenuItem;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.ButtonGroup;

public class FinalExamView extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FinalExamView frame = new FinalExamView();
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
	public FinalExamView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 658, 435);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(53, 50, 153, 107);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Khối thi");
		lblNewLabel.setBounds(38, 10, 68, 25);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Tự nhiên");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(17, 43, 130, 21);
		panel.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Xã hội");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(17, 80, 103, 21);
		panel.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(312, 74, 109, 194);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Môn học");
		lblNewLabel_1.setBounds(16, 5, 76, 25);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(lblNewLabel_1);
		
		JList list_xaHoi = new JList();
		list_xaHoi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		list_xaHoi.setBounds(26, 40, 57, 84);
		panel_1.add(list_xaHoi);
		
		JList list_main = new JList();
		list_main.setBounds(428, 200, 70, 87);
		contentPane.add(list_main);
		list_main.setModel(new AbstractListModel() {
			String[] values = new String[] {"Toán ", "Văn", "Anh"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list_main.setFont(new Font("Tahoma", Font.PLAIN, 20));
	}
}
