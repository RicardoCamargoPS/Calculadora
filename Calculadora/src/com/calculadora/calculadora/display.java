package com.calculadora.calculadora;

import javax.swing.JPanel;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

public class display {

    private JPanel displayPanel;
    private Canvas canvas;
    private BufferedImage layer;

    private int width, height;

    public display(int whidth, int height){

        this.width = whidth - 10;
        this.height = height / 4;

        canvas = new Canvas();
        canvas.setSize(new Dimension(this.width, this.height));

        displayPanel = new JPanel();
        displayPanel.add(canvas);
    }


    public void render(){
        BufferStrategy bs = canvas.getBufferStrategy();
        if(bs == null){
           canvas.createBufferStrategy(3);
            bs = canvas.getBufferStrategy();
        }
        Graphics g = layer.getGraphics();
        g.setColor(Color.white);
        g.fillRect(0, 0, width, height);        
                                                              
                                
        g = bs.getDrawGraphics();
        g.drawImage(layer, 0, 0, width, height, null);
        g.dispose();
        bs.show();
    }

}
