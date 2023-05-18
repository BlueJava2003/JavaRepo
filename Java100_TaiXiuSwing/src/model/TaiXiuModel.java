package model;

public class TaiXiuModel {
	private int dice1;
	private int dice2;
	private int dice3;
	private String value;
	private int totalDice;
	
	public TaiXiuModel() {
		this.dice1 = 0;
		this.dice2 = 0;
		this.dice3 = 0;
		this.totalDice = 0;
		this.value = "";
	}
	
	public int getDice1() {
		return dice1;
	}
	public void setDice1(int dice1) {
		this.dice1 = dice1;
	}
	public int getDice2() {
		return dice2;
	}
	public void setDice2(int dice2) {
		this.dice2 = dice2;
	}
	public int getDice3() {
		return dice3;
	}
	public void setDice3(int dice3) {
		this.dice3 = dice3;
	}

	public int getTotalDice() {
		return totalDice;
	}

	public void setTotalDice(int totalDice) {
		this.totalDice = totalDice;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	
}
