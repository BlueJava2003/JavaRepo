package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.TaiXiuController;
import model.TaiXiuModel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class TaiXiuView extends JFrame {
	public TaiXiuModel taiXiuModel;
	private JPanel contentPane;
	public JTextField moneyInputTextField;
	public JLabel Dice2Label;
	public JLabel Dice3Label;
	public JLabel Dice1Label;
	public JLabel resultLabel;
	public JLabel moneyLabel;
	public Font font;
	public TaiXiuView() {
		taiXiuModel = new TaiXiuModel();
		font = new Font("Arial", Font.PLAIN, 20);
		setTitle("Tài xỉu in JAVA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 818, 588);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_top = new JPanel();
		panel_top.setPreferredSize(new Dimension(10,50));
		contentPane.add(panel_top, BorderLayout.NORTH);
		panel_top.setLayout(null);
		
		//ActionListener
		ActionListener actionListener = new TaiXiuController(this);
		
		JLabel titleLabel = new JLabel("TÀI XỈU");
		titleLabel.setBounds(282, 10, 283, 25);
		titleLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_top.add(titleLabel);
		
		JPanel panel_left = new JPanel();
		panel_left.setPreferredSize(new Dimension(200,100));
		contentPane.add(panel_left, BorderLayout.WEST);
		panel_left.setLayout(null);
		
		JLabel accountLabel = new JLabel("$ Tài khoản");
		accountLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		accountLabel.setBounds(10, 10, 180, 25);
		panel_left.add(accountLabel);
		
		moneyLabel = new JLabel("0");
		moneyLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		moneyLabel.setBounds(10, 45, 139, 25);
		panel_left.add(moneyLabel);
		
		JLabel moneyCurrencyLabel = new JLabel("VNĐ");
		moneyCurrencyLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		moneyCurrencyLabel.setBounds(145, 45, 45, 25);
		panel_left.add(moneyCurrencyLabel);
		
		JPanel panel_bottom = new JPanel();
		panel_bottom.setPreferredSize(new Dimension(10,50));
		contentPane.add(panel_bottom, BorderLayout.SOUTH);
		panel_bottom.setLayout(null);
		
		JButton historyBtn = new JButton("Lịch sử nạp");
		historyBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		historyBtn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		historyBtn.setBounds(621, 10, 163, 35);
		panel_bottom.add(historyBtn);
		
		JButton napTienBtn = new JButton("Nạp tiền");
		napTienBtn.addActionListener(actionListener);
		napTienBtn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		napTienBtn.setBounds(437, 10, 135, 35);
		panel_bottom.add(napTienBtn);
		
		JPanel panel_right = new JPanel();
		panel_right.setPreferredSize(new Dimension(200,100));
		contentPane.add(panel_right, BorderLayout.EAST);
		panel_right.setLayout(null);
		
		JPanel panel_center = new JPanel();
		contentPane.add(panel_center, BorderLayout.CENTER);
		panel_center.setLayout(null);
		
		JButton datCuocBtn = new JButton("Đặt cược");
		datCuocBtn.addActionListener(actionListener);
		datCuocBtn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		datCuocBtn.setBounds(210, 373, 137, 41);
		panel_center.add(datCuocBtn);
		
		JLabel moneyInput = new JLabel("Nhập số tiền ");
		moneyInput.setFont(new Font("Tahoma", Font.PLAIN, 20));
		moneyInput.setBounds(210, 258, 137, 41);
		panel_center.add(moneyInput);
		
		moneyInputTextField = new JTextField();
		moneyInputTextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		moneyInputTextField.setBounds(210, 297, 137, 31);
		panel_center.add(moneyInputTextField);
		moneyInputTextField.setColumns(10);
		Dice2Label = new JLabel("");
		Dice2Label.setIcon(null);
		Dice2Label.setBounds(198, 66, 46, 56);
		Dice3Label = new JLabel("");
		Dice3Label.setIcon(null);
		Dice3Label.setBounds(130, 66, 46, 56);
		Dice1Label = new JLabel("");
		Dice1Label.setBounds(158, 132, 46, 56);
		panel_center.add(Dice2Label);
		panel_center.add(Dice3Label);
		panel_center.add(Dice1Label);
		
		resultLabel = new JLabel("");
		resultLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
		resultLabel.setBounds(148, 198, 153, 45);
		panel_center.add(resultLabel);
		
		JButton TaiButton = new JButton("Tài");
		TaiButton.addActionListener(actionListener);
		TaiButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		TaiButton.setBounds(201, 338, 70, 30);
		panel_center.add(TaiButton);
		
		JButton XiuButton = new JButton("Xỉu");
		XiuButton.addActionListener(actionListener);
		XiuButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		XiuButton.setBounds(287, 338, 70, 30);
		panel_center.add(XiuButton);
		
		JButton resetBtn = new JButton("Reset");
		resetBtn.addActionListener(actionListener);
		resetBtn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		resetBtn.setBounds(55, 373, 137, 41);
		panel_center.add(resetBtn);
	}
	String[] iconStrings = new String[]{"0","1.png", "2.png","3.png","4.png","5.png","6.png"};
	
	public String changeIcon(int temp) {
		return iconStrings[temp];
	}
}
