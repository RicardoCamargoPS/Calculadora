package com.calc.app;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;


public class Visor extends JPanel {

    private Canvas visor;
    private int width, height;   

    private String linhaCima = "", linhaBaixo = "0";

       

    public Visor(){       

        this.width = 320;
        this.height = 120;     
        
        setSize(new Dimension( this.width, this.height));

       setBounds(5, 5, this.width, this.height);        

        visor = new Canvas(){
            public void paint(Graphics g){
                g.setColor(Color.white);
                g.fillRect(0, 0, getWidth(), getHeight());

                g.setColor(Color.black);
                Font font = new Font("Bahnschrift", Font.PLAIN, 36);
                g.setFont(font);

                g.drawString(linhaCima,  width - 60, height - 80);

                font = new Font("Bahnschrift", Font.PLAIN, 64);
                g.setFont(font);

                g.drawString(linhaBaixo, width - 70, height - 10);

            }
        };
        visor.setBackground(Color.white);
        visor.setSize(this.width - 20, this.height + 10);          
        
        add(visor);   

    }

    public void setLinhaCima(String texto){
        this.linhaCima = texto;
        visor.repaint();
    }

    public void setLinhaBaixo(String texto){
        this.linhaBaixo = texto;
        visor.repaint();
    }
    
}
