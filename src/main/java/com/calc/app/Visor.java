package com.calc.app;

import java.awt.Canvas;
import java.awt.Color;

import javax.swing.JPanel;


public class Visor extends JPanel {

    private Canvas visor;
    private int width, height;  
       

    public Visor(){       

        this.width = 320;
        this.height = 120;     
        
        //setSize(new Dimension( this.width, this.height));

       //setBounds(5, 5, this.width, this.height);        

        visor = new Canvas();
        visor.setBackground(Color.white);
        visor.setSize(this.width - 20, this.height + 10);   
        
        
        add(visor);   

    }
    
}
