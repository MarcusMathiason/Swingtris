package model;

import java.awt.GridLayout;

import javax.swing.JPanel;

import com.swingtris.view.Window;

public class Game {
	
	public Game() {
		init();
		
	}
	
	public void init() {
		Window window = new Window(600, 800);
		
		window.fillPanel();
		
	}

	public static void main(String[] args) {
		Game game = new Game();
	}

}
