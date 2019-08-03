package com.swingtris.view;

import javax.swing.JFrame;

public class Window extends JFrame{
	private static final long serialVersionUID = 1L;
	
	public Window(int height, int width) {
		this.setSize(width, height);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
