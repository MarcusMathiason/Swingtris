package com.swingtris.view;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import model.Cell;

public class Window extends JFrame{
	private static final long serialVersionUID = 1L;
	
	private JPanel gamePanel;
	
	public Window(int width, int height) {
		this.setSize(width, height);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		this.gamePanel = new JPanel();
		this.gamePanel.setLayout(new GridLayout(20, 10));
		//this.gamePanel.setSize(width, height);
		
	}
	
	public void fillPanel() {
		
		for(int i = 0 ; i < 20; i++) {
			for (int j = 0; j < 10; j++){
				Cell c = new Cell();
				this.gamePanel.add(c);
			}
		}
		
		this.add(this.gamePanel);
		this.setVisible(true);
	}
}
