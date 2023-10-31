package com.calculadora.calculadora;


import javax.swing.JFrame;

public class calculadoraMain extends JFrame {

	private final int WIDTH = 335;
	private final int HEIGHT = 540;

	private display visor;

	public calculadoraMain(){

		setSize(WIDTH, HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);

		initComponent();

}

public void initComponent(){

	visor = new display(WIDTH, HEIGHT);
	visor.render();
	add(visor);
	

}
	public static void main(String[] args) {

		new calculadoraMain();
		
	}
}