package view;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import graphics.DrawGraphics;


public class DrawGraphicsView extends JFrame{
	public DrawGraphicsView() {
		this.setTitle("Thi GK");
		this.setSize(800, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		DrawGraphics drawGraphics = new DrawGraphics();
		
		this.setLayout(new BorderLayout());
		this.add(drawGraphics, BorderLayout.CENTER);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new DrawGraphicsView();
	}
}
