package com.calc.app;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class CalculadoraApp extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final int WIDTH = 340;
    private int height;
    private TecladoBasico tecBasic;
    private TecladoCompleto tecComp;
    private JMenuBar menuBar;
    private JMenu options;
    private JMenuItem padrao, completa;
    private Visor visor;
    
    private boolean isBasic = true;

    CalculadoraApp(){

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
        
        tecBasic = new TecladoBasico();
        tecComp = new TecladoCompleto();

        if(isBasic) {   
	        height = 500;
            tecBasic.setVisible(true);
            tecComp.setVisible(false);

	                    
        }else{
            height = 600;
	        tecBasic.setVisible(false);
	        tecComp.setVisible(true);     
        }

        add(tecBasic);
        add(tecComp);  

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
                tecBasic.setVisible(true);
                tecComp.setVisible(false);  
     
            }
            
        });       

        completa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){

                height = 600;
                setSize(new Dimension(WIDTH, height));
                tecBasic.setVisible(false);
                tecComp.setVisible(true);  
            
            }
        });           

    }

    public static void main(String[] args) {

        new CalculadoraApp();
        
    }
}
