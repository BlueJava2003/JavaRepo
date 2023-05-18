package controller;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.xml.stream.events.Comment;

import view.TaiXiuView;

public class TaiXiuController implements ActionListener {
	private TaiXiuView taiXiuView;

	public TaiXiuController(TaiXiuView taiXiuView) {
		super();
		this.taiXiuView = taiXiuView;
	}

	@Override	
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		if (command.equals("Đặt cược")) {
			this.taiXiuView.resultLabel.setVisible(true);
			Random xucSac1 = new Random();
			Random xucSac2 = new Random();
			Random xucSac3 = new Random();
			int giaTri1 = xucSac1.nextInt(5) + 1;
			int giaTri2 = xucSac2.nextInt(5) + 1;
			int giaTri3 = xucSac3.nextInt(5) + 1;
			int tong = giaTri1 + giaTri2 + giaTri3;
			this.taiXiuView.taiXiuModel.setDice1(giaTri1);
			this.taiXiuView.taiXiuModel.setDice2(giaTri2);
			this.taiXiuView.taiXiuModel.setDice3(giaTri3);
			this.taiXiuView.taiXiuModel.setTotalDice(tong);
			this.taiXiuView.Dice1Label.setIcon(new ImageIcon(Toolkit.getDefaultToolkit()
					.createImage(TaiXiuView.class.getResource(taiXiuView.changeIcon(giaTri1)))));
			this.taiXiuView.Dice2Label.setIcon(new ImageIcon(Toolkit.getDefaultToolkit()
					.createImage(TaiXiuView.class.getResource(taiXiuView.changeIcon(giaTri2)))));
			this.taiXiuView.Dice3Label.setIcon(new ImageIcon(Toolkit.getDefaultToolkit()
					.createImage(TaiXiuView.class.getResource(taiXiuView.changeIcon(giaTri3)))));
			if (tong >= 4 && tong <= 10) {
				this.taiXiuView.resultLabel.setText("Xỉu");
			} else if (tong > 10 && tong <= 18)
				this.taiXiuView.resultLabel.setText("Tài");
			String tmpString = this.taiXiuView.moneyInputTextField.getText();
			int soTienDatCuoc = Integer.parseInt(tmpString);
			int soTienTrongTaiKhoan = Integer.parseInt(this.taiXiuView.moneyLabel.getText());
			if (soTienTrongTaiKhoan < soTienDatCuoc) {
				JOptionPane.showMessageDialog(taiXiuView, "Số tiền trong tài khoản không đủ để đặt cược",
						"System error", JOptionPane.ERROR_MESSAGE);
			} else {
				if (taiXiuView.taiXiuModel.getValue().equals(this.taiXiuView.resultLabel.getText())) {
					soTienTrongTaiKhoan += soTienDatCuoc;
					this.taiXiuView.moneyLabel.setText(soTienTrongTaiKhoan + "");
				} else {
					soTienTrongTaiKhoan -= soTienDatCuoc;
					this.taiXiuView.moneyLabel.setText(soTienTrongTaiKhoan + "");
				}
			}
		} else if (command.equals("Tài")) {
			this.taiXiuView.taiXiuModel.setValue("Tài");
		} else if (command.equals("Xỉu")) {
			this.taiXiuView.taiXiuModel.setValue("Xỉu");
		} else if (command.equals("Nạp tiền")) {
			String s = (String) JOptionPane.showInputDialog(taiXiuView, 
					"\nNhập số tiền nạp:",
					"Nạp tiền cho nhà cái đến từ Đà Nẵng:", 
					JOptionPane.PLAIN_MESSAGE);
			try {
				int temp = Integer.parseInt(s);
				if(temp > 0) {
					this.taiXiuView.moneyLabel.setText(s);
					JOptionPane.showMessageDialog(taiXiuView,
							"Quý khách đã nạp " + temp + " VNĐ vào tài khoản."
							);
				} else {
					JOptionPane.showMessageDialog(taiXiuView,
						    "Số tiền nạp phải lớn hơn 0 VNĐ",
						    "System error",
						    JOptionPane.ERROR_MESSAGE);
				}
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(taiXiuView,
					    "Số tiền quý khách nạp không hợp lệ",
					    "System error",
					    JOptionPane.ERROR_MESSAGE);
			}
		} else if(command.equals("Reset")) {
			this.taiXiuView.Dice1Label.setIcon(null);
			this.taiXiuView.Dice2Label.setIcon(null);
			this.taiXiuView.Dice3Label.setIcon(null);
			this.taiXiuView.resultLabel.setVisible(false);
		}
	}
}
