package com.calc.app;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class TecladoBasico extends JPanel{

	private JButton mButton0, mButton1, mButton2, mButton3, mButton4, mButton5,
	mButton6, mButton7, mButton8, mButton9, mButtonDec, mButtonSinal,

	mButtonAdi, mButtonSub, mButtonMul, mButtonDiv, mButtonRes, 

	mButtonPor, mButtonCE, mButtonBack;

	private JPanel teclado;	
	private Map<JButton, String> buttonActionMap = new HashMap<>();

	public TecladoBasico(){
		initComponentes();
	}

	private void initComponentes(){       

		mButton0     = createButton("bt0", "bt0");
		mButton1     = createButton("bt1", "bt1");
		mButton2     = createButton("bt2", "bt2");
		mButton3     = createButton("bt3", "bt3");
		mButton4     = createButton("bt4", "bt4");
		mButton5     = createButton("bt5", "bt5");
		mButton6     = createButton("bt6", "bt6");
		mButton7     = createButton("bt7", "bt7");
		mButton8     = createButton("bt8", "bt8");
		mButton9     = createButton("bt9", "bt9");
		mButtonDec   = createButton("btdec", "btdec");
		mButtonSinal = createButton("btsinal", "btsinal");
		mButtonAdi  = createButton("btsoma", "btsoma");
		mButtonSub  = createButton("btsub", "btsub");
		mButtonMul  = createButton("btmult", "btmult");
		mButtonDiv  = createButton("btdiv", "btdiv");
		mButtonRes  = createButton("btresul", "btresul");
		mButtonPor  = createButton("btporc", "btporc");
		mButtonCE   = createButton("btce", "btce");
		mButtonBack = createButton("btback", "btback");


		ActionListener buttonListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String actionCommand = e.getActionCommand();
                // Encontre o botão associado à ação
                for (JButton button : buttonActionMap.keySet()) {
                    if (buttonActionMap.get(button).equals(actionCommand)) {
                        // Lógica para o botão correspondente
                        //System.out.println("Botão " + button.equals(mButton0) + " clicado");
                        // Adicione lógica personalizada para a ação

						if("bt9".equals(actionCommand)){
							CalculadoraApp.visor.setLinhaBaixo("9");
						}
                    }
                }
            }
        };

		for (JButton button : buttonActionMap.keySet()) {
            button.addActionListener(buttonListener);
        }


		teclado = new JPanel();   

		teclado.setLayout(new GridLayout(5,4,10,10));
		teclado.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));


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

		add(teclado);
	} 

	private JButton createButton(String text, String actionCommand) {
        JButton button = new JButton(new ImageIcon(TecladoBasico.class.getResource("icons/" + text + ".png")));
        button.setActionCommand(actionCommand);
        buttonActionMap.put(button, actionCommand);
        return button;
    }
}
