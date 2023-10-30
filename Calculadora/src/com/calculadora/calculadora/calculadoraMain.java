package com.calculadora.calculadora;

import javax.swing.BoxLayout;
import javax.swing.JFrame;

public class calculadoraMain extends JFrame {

	private final int WIDTH = 460;
	private final int HEIGHT = 300;

	private display visor;

	public calculadoraMain(){

		setSize(WIDTH, HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);

		BoxLayout layout = new BoxLayout(Y_AXIS, 2);
		setLayout(layout);

		visor = new display(WIDTH, HEIGHT);
		

	}

	public static void main(String[] args) {
		
	}
}