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
    private int widthTxt = 60, txtPx, nPixel = 0;
    private int fonSize = 64;

       

    public Visor(){       

        this.width = 320;
        this.height = 120;  
        
        txtPx = width - 60;
        
        setSize(new Dimension( this.width, this.height));

        setBounds(5, 5, this.width, this.height);        

        visor = new Canvas(){
            public void paint(Graphics g){
                g.setColor(Color.white);
                g.fillRect(0, 0, getWidth(), getHeight());

                g.setColor(Color.black);
                Font font = new Font("Bahnschrift", Font.PLAIN, 36);
                g.setFont(font);

                g.drawString(linhaCima,  txtPx, height - 80);

                font = new Font("Bahnschrift", Font.PLAIN, fonSize);
                g.setFont(font);

                g.drawString(linhaBaixo, txtPx, height - 10);

            }
        };
        visor.setBackground(Color.white);
        visor.setSize(this.width - 20, this.height + 10);          
        
        add(visor);   

    }

    public void setLinhaCima(String texto, int digitos){
        this.linhaCima = texto;
        pxText(digitos);
        visor.repaint();
    }

    public void setLinhaBaixo(String texto, int digitos){
        
        this.linhaBaixo = texto;
        pxText(digitos);
        visor.repaint();
        revalidate();
    }

    public void pxText(int digitos){
        int maxDigits = 10; // Máximo de dígitos na linha

        // Calcula a largura total disponível para o texto
        int totalWidth = this.width - 20;
        int textWidth = Math.min(totalWidth, maxDigits * fonSize);

        // Calcula o espaço vazio à esquerda do texto
        txtPx = totalWidth - textWidth;

        // Atualiza o tamanho da fonte com base na largura disponível
        fonSize = textWidth / digitos;

        // Certifica-se de que o tamanho da fonte não fique muito pequeno
        fonSize = Math.max(fonSize, 12); // Tamanho mínimo da fonte

        txtPx = totalWidth - textWidth;

        if (txtPx < 0) {
            txtPx = 0;
        }
    }

    public void pixelDigito(int nPixel){
        this.nPixel = nPixel;
    }


    
}
