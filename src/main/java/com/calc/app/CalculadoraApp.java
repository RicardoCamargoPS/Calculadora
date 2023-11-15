package com.calc.app;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;




public class CalculadoraApp extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final int WIDTH = 340;
    private int height;    
    private JMenuBar menuBar;
    private JMenu options;
    private JMenuItem padrao, completa;

    public static Visor visor;

    private Font font = new Font("Arial", Font.PLAIN, 24);


    private JButton mButton0, mButton1, mButton2, mButton3, mButton4, mButton5,
		mButton6, mButton7, mButton8, mButton9, mButtonDec, mButtonSinal,
		mButtonAdi, mButtonSub, mButtonMul, mButtonDiv, mButtonRes,
		mButtonPor, mButtonCE, mButtonBack, mButtonPot,
        mButtonFat, mButtonRad, mButtonSen, mButtonCos,
        mButtonAbreChave, mButtonFechaChave, mButtonTan;

    private JPanel tecladoBasico, tecladoComp;
    private Map<JButton, String> buttonActionMap = new HashMap<>();
	

    
    
    private boolean isBasic = false;

    CalculadoraApp(){

        initComponentes();
        menuBar = new JMenuBar();
        options = new JMenu("Opções");
        padrao = new JMenuItem("Padrão");
        completa = new JMenuItem("Completa");
        options.add(padrao);
        options.add(completa);
        menuBar.add(options);
        setJMenuBar(menuBar);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        
        visor = new Visor();        
        visor.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    
        add(visor);


       
        //tecComp = new TecladoCompleto();

        if(isBasic) {   
	        height = 500;
            tecladoBasico.setVisible(true);
            //tecComp.setVisible(false);

	                    
        }else{
            height = 600;
	        tecladoBasico.setVisible(false);
	        //tecComp.setVisible(true);     
        }

        add(tecladoBasico);
        //add(tecComp);  

        setTitle("Calculador");
        setSize(new Dimension(WIDTH, height));
        setPreferredSize(new Dimension(WIDTH, height));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

        padrao.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e){  
                
                height = 500;
                setSize(new Dimension(WIDTH, height));
                tecladoBasico.setVisible(true);
                //tecComp.setVisible(false);  
     
            }
            
        });       

        completa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){

                height = 600;
                setSize(new Dimension(WIDTH, height));
                tecladoBasico.setVisible(false);
                //tecComp.setVisible(true);  
            
            }
        }); 
        
    }

    public void initComponentes(){

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

        mButtonPot = createButton("bt0", "bt0");		
        mButtonFat = createButton("bt1", "bt1");
        mButtonRad = createButton("bt2", "bt2");
        mButtonSen = createButton("bt3", "bt3");
        mButtonCos = createButton("bt4", "bt4");
        mButtonTan = createButton("bt5", "bt5");
        mButtonAbreChave = createButton("bt6", "bt6");
        mButtonFechaChave = createButton("bt7", "bt7"); 
        tecladoBasico = new JPanel();
  

        tecladoBasico.setLayout(new GridLayout(5, 4, 10, 10));
        tecladoBasico.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        tecladoBasico.add(mButtonPor);
        tecladoBasico.add(mButtonCE);
        tecladoBasico.add(mButtonBack);
        tecladoBasico.add(mButtonDiv);
        tecladoBasico.add(mButton7);
        tecladoBasico.add(mButton8);
        tecladoBasico.add(mButton9);
        tecladoBasico.add(mButtonMul);
        tecladoBasico.add(mButton4);
        tecladoBasico.add(mButton5);
        tecladoBasico.add(mButton6);
        tecladoBasico.add(mButtonSub);
        tecladoBasico.add(mButton1);
        tecladoBasico.add(mButton2);
        tecladoBasico.add(mButton3);
        tecladoBasico.add(mButtonAdi);
        tecladoBasico.add(mButtonDec);
        tecladoBasico.add(mButton0);
        tecladoBasico.add(mButtonSinal);
        tecladoBasico.add(mButtonRes);
    }

    private JButton createButton(String text, String actionCommand) {
	JButton button = new JButton(new ImageIcon(CalculadoraApp.class.getResource("icons/" + text + ".png")));		
	button.setActionCommand(actionCommand);
	buttonActionMap.put(button, actionCommand);
	return button;
}


    public static void main(String[] args) {

        new CalculadoraApp();
        
    }
}
