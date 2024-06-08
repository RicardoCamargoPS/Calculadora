package com.calc.app;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Visor extends JPanel {

    private int width, height;
    private JTextField tfTop, tfDown;       
       

    public Visor(){       

        this.width = 300;
        this.height = 90;   
        
        setPreferredSize(new Dimension( this.width, this.height));        
        setMaximumSize(new Dimension( this.width, this.height));        
        setBounds(5, 5, this.width, this.height); 
        setBackground(new Color(255,255,255,1));
        
        tfTop = new JTextField();
        tfTop.setHorizontalAlignment(4);
        tfTop.setPreferredSize(new Dimension( this.width - 19, this.height / 3));
        tfTop.setBorder(BorderFactory.createEmptyBorder());

        tfDown = new JTextField(); 
        tfDown.setHorizontalAlignment(4);
        tfDown.setPreferredSize(new Dimension( this.width - 19, this.height / 3));
        tfDown.setBorder(BorderFactory.createEmptyBorder());
       
        add(tfTop);
        add(tfDown);
    }

    public void setTexttfDown(String texto){
        tfDown.setText(texto);        
    }

    public void setTexttfTop(String texto){
        tfTop.setText(texto);       
    }
    
}
