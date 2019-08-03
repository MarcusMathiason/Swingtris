package model;

import java.awt.Color;
import java.util.Random;

import javax.swing.JPanel;

public class Cell extends JPanel{
	private static final long serialVersionUID = 1L;
	
	private boolean isOccupied;
	private Random rand = new Random();
	
	public Cell() {
		
		
		this.isOccupied = false;
		this.setSize(1000, 1000);
		this.setBackground(new Color(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255)));
		System.out.println("Color: " + this.getBackground());
		this.setOpaque(true);
	}

	public boolean isOccupied() {
		return isOccupied;
	}

	public void setOccupied(boolean isOccupied) {
		this.isOccupied = isOccupied;
	}
	
	
}
