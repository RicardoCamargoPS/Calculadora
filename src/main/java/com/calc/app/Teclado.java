package com.calc.app;

import java.util.HashMap;
import java.util.Map;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Teclado extends JPanel {

    private JButton mButton0, mButton1, mButton2, mButton3, mButton4, mButton5,
		mButton6, mButton7, mButton8, mButton9, mButtonDec, mButtonSinal,
		mButtonAdi, mButtonSub, mButtonMul, mButtonDiv, mButtonRes,
		mButtonPor, mButtonCE, mButtonBack, mButtonPot,
        mButtonFat, mButtonRad, mButtonSen, mButtonCos,
        mButtonAbreChave, mButtonFechaChave, mButtonTan;

    private JPanel teclado, basico, completo;
    private Map<JButton, String> buttonActionMap = new HashMap<>();    
    private boolean isBasica = true;

    public Teclado(){    
        
        initComponent(); 
        add(teclado);        

    }

    private void initComponent(){       

        basico = new JPanel();        
        basico.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        basico.setLayout(new GridLayout(5, 4, 10, 10));       

        completo = new JPanel();        
        completo.setBorder(BorderFactory.createEmptyBorder(10, 10, 0, 10));
        completo.setLayout(new GridLayout(2, 4, 10, 10));
       
        teclado = new JPanel();  
        teclado.setLayout(new BoxLayout(teclado, BoxLayout.Y_AXIS));      

        mButton0 = createButton("bt0", "bt0");		
        mButton1 = createButton("bt1", "bt1");
        mButton2 = createButton("bt2", "bt2");
        mButton3 = createButton("bt3", "bt3");
        mButton4 = createButton("bt4", "bt4");
        mButton5 = createButton("bt5", "bt5");
        mButton6 = createButton("bt6", "bt6");
        mButton7 = createButton("bt7", "bt7");
        mButton8 = createButton("bt8", "bt8");
        mButton9 = createButton("bt9", "bt9");
        mButtonDec = createButton("btdec", "btdec");
        mButtonSinal = createButton("btsinal", "btsinal");
        mButtonAdi = createButton("btsoma", "btsoma");
        mButtonSub = createButton("btsub", "btsub");
        mButtonMul = createButton("btmult", "btmult");
        mButtonDiv = createButton("btdiv", "btdiv");
        mButtonRes = createButton("btresul", "btresul");
        mButtonPor = createButton("btporc", "btporc");
        mButtonCE = createButton("btce", "btce");
        mButtonBack = createButton("btback", "btback");

        mButtonPot = createButton("btp", "btp");		
        mButtonFat = createButton("btf", "btf");
        mButtonRad = createButton("btr", "btr");
        mButtonSen = createButton("bts", "bts");
        mButtonCos = createButton("btc", "btc");
        mButtonTan = createButton("btt", "btt");
        mButtonAbreChave = createButton("btac", "btac");
        mButtonFechaChave = createButton("btfc", "btfc");    

        
        completo.add(mButtonPot);
        completo.add(mButtonFat);
        completo.add(mButtonRad);
        completo.add(mButtonSen);
        completo.add(mButtonCos);
        completo.add(mButtonTan);
        completo.add(mButtonAbreChave);
        completo.add(mButtonFechaChave);
        
        basico.add(mButtonPor);
        basico.add(mButtonCE);
        basico.add(mButtonBack);
        basico.add(mButtonDiv);
        basico.add(mButton7);
        basico.add(mButton8);
        basico.add(mButton9);
        basico.add(mButtonMul);
        basico.add(mButton4);
        basico.add(mButton5);
        basico.add(mButton6);
        basico.add(mButtonSub);
        basico.add(mButton1);
        basico.add(mButton2);
        basico.add(mButton3);
        basico.add(mButtonAdi);
        basico.add(mButtonDec);
        basico.add(mButton0);
        basico.add(mButtonSinal);
        basico.add(mButtonRes);     
        
        
        completo.setVisible(false);
      
                
        teclado.add(completo);
        teclado.add(basico);          
    }

    public void setBasica(boolean isBasica) {
        this.isBasica = isBasica;

        if(isBasica){
            completo.setVisible(false);

        }else{
            completo.setVisible(true);
        }
        revalidate();
        
    }


    private JButton createButton(String text, String actionCommand) {
	    JButton button = new JButton(new ImageIcon(CalculadoraApp.class.getResource("icons/" + text + ".png")));		
	    button.setActionCommand(actionCommand);
	    buttonActionMap.put(button, actionCommand);
	    return button;
    }

    

}
