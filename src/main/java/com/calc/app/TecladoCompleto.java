package com.calc.app;

import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;

public class TecladoCompleto extends JPanel {

	private JButton mButton0, mButton1, mButton2, mButton3, mButton4, mButton5,
	mButton6, mButton7, mButton8, mButton9, mButtonDec, mButtonSinal,

	mButtonAdi, mButtonSub, mButtonMul, mButtonDiv, mButtonRes, 

	mButtonPor, mButtonCE, mButtonBack, mButtonPot,
	mButtonFat, mButtonRad, mButtonSen, mButtonCos,
	mButtonAbreChave, mButtonFechaChave, mButtonTan;

	private JPanel teclado;

	public TecladoCompleto() {		
		
		setBackground(new Color(211, 211, 211));
		initComponentes();
	}

	private void initComponentes() {

		mButton0     = new JButton(new ImageIcon(TecladoBasico.class.getResource("icons/bt0.png")));
		mButton1     = new JButton(new ImageIcon(TecladoBasico.class.getResource("icons/bt1.png")));
		mButton2     = new JButton(new ImageIcon(TecladoBasico.class.getResource("icons/bt2.png")));
		mButton3     = new JButton(new ImageIcon(TecladoBasico.class.getResource("icons/bt3.png")));
		mButton4     = new JButton(new ImageIcon(TecladoBasico.class.getResource("icons/bt4.png")));
		mButton5     = new JButton(new ImageIcon(TecladoBasico.class.getResource("icons/bt5.png")));
		mButton6     = new JButton(new ImageIcon(TecladoBasico.class.getResource("icons/bt6.png")));
		mButton7     = new JButton(new ImageIcon(TecladoBasico.class.getResource("icons/bt7.png")));
		mButton8     = new JButton(new ImageIcon(TecladoBasico.class.getResource("icons/bt8.png")));
		mButton9     = new JButton(new ImageIcon(TecladoBasico.class.getResource("icons/bt9.png")));
		mButtonDec   = new JButton(new ImageIcon(TecladoBasico.class.getResource("icons/btdec.png")));
		mButtonSinal = new JButton(new ImageIcon(TecladoBasico.class.getResource("icons/btsinal.png")));

		mButtonAdi  = new JButton(new ImageIcon(TecladoBasico.class.getResource("icons/btsoma.png")));
		mButtonSub  = new JButton(new ImageIcon(TecladoBasico.class.getResource("icons/btsub.png")));
		mButtonMul  = new JButton(new ImageIcon(TecladoBasico.class.getResource("icons/btmult.png")));
		mButtonDiv  = new JButton(new ImageIcon(TecladoBasico.class.getResource("icons/btdiv.png")));
		mButtonRes  = new JButton(new ImageIcon(TecladoBasico.class.getResource("icons/btresul.png")));

		mButtonPor  = new JButton(new ImageIcon(TecladoBasico.class.getResource("icons/btporc.png")));
		mButtonCE   = new JButton(new ImageIcon(TecladoBasico.class.getResource("icons/btce.png")));
		mButtonBack = new JButton(new ImageIcon(TecladoBasico.class.getResource("icons/btback.png")));
		mButtonPot  = new JButton(new ImageIcon(TecladoBasico.class.getResource("icons/btpot.png")));
		mButtonFat  = new JButton(new ImageIcon(TecladoBasico.class.getResource("icons/btfat.png")));
		mButtonRad  = new JButton(new ImageIcon(TecladoBasico.class.getResource("icons/btrad.png")));       
		mButtonSen  = new JButton(new ImageIcon(TecladoBasico.class.getResource("icons/btsen.png")));
		mButtonCos  = new JButton(new ImageIcon(TecladoBasico.class.getResource("icons/btcos.png")));       
		mButtonTan  = new JButton(new ImageIcon(TecladoBasico.class.getResource("icons/bttan.png")));         
		mButtonAbreChave  = new JButton(new ImageIcon(TecladoBasico.class.getResource("icons/btab_chave.png")));
		mButtonFechaChave = new JButton(new ImageIcon(TecladoBasico.class.getResource("icons/btfx_chave.png")));

		teclado = new JPanel(); 

		teclado.setLayout(new GridLayout(7,4,10,10));
		teclado.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

		teclado.add(mButtonAbreChave);
		teclado.add(mButtonFechaChave);
		teclado.add(mButtonPot);
		teclado.add(mButtonFat);
		
		teclado.add(mButtonRad);       
		teclado.add(mButtonSen);
		teclado.add(mButtonCos);
		teclado.add(mButtonTan);
		
		teclado.add(mButtonPor);
		teclado.add(mButtonCE);
		teclado.add(mButtonBack);
		teclado.add(mButtonDiv);
		
		teclado.add(mButton7);
		teclado.add(mButton8);
		teclado.add(mButton9);
		teclado.add(mButtonMul);
		
		teclado.add(mButton4);
		teclado.add(mButton5);
		teclado.add(mButton6);
		teclado.add(mButtonSub);
		
		teclado.add(mButton1);
		teclado.add(mButton2);
		teclado.add(mButton3);
		teclado.add(mButtonAdi);
		
		teclado.add(mButtonDec);
		teclado.add(mButton0);
		teclado.add(mButtonSinal);
		teclado.add(mButtonRes);   
		teclado.setBackground(new Color(211, 211, 211));

		add(teclado);
	}
}
