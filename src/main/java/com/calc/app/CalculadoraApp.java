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

    
	private static final long serialVersionUID = 1L;
	private final int WIDTH = 340;
    private int height = 440;    
    private JMenuBar menuBar;
    private JMenu options;
    private JMenuItem padrao, completa;

    public static Visor visor; 
    private Teclado teclado;   
    
    

    CalculadoraApp(){      
        
        initComponent(); 

        setTitle("Calculador");
        setSize(new Dimension(WIDTH, height));        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setJMenuBar(menuBar);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));    

        add(visor); 
        add(teclado);       

        revalidate();
        
    }

    public void initComponent(){


        menuBar = new JMenuBar();
        options = new JMenu("Opções");


        padrao = new JMenuItem("Padrão");
        completa = new JMenuItem("Completa");


        options.add(padrao);
        options.add(completa);
        menuBar.add(options);

        visor = new Visor();        
        visor.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));  
        teclado = new Teclado();
        
        
        padrao.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e){  
                                
                height = 440;    
                teclado.setBasica(true);                                           
                setSize(new Dimension(WIDTH, height));      
                
     
            }            
        });       

        completa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                                
                height = 540;                
                teclado.setBasica(false);
                setSize(new Dimension(WIDTH, height));                          
            
            }
        });         
        
    }

    public static void main(String[] args) {

        new CalculadoraApp();
        
    }
}
