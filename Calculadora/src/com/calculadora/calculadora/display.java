package com.calculadora.calculadora;

import javax.swing.JPanel;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.image.BufferStrategy;

public class display {

    private JPanel displayPanel;
    private Canvas canvas;

    private int whidth, height;

    public display(int whidth, int height){

        this.whidth = whidth - 10;
        this.height = height / 4;

        canvas = new Canvas();
        canvas.setSize(new Dimension(this.whidth, this.height));

        displayPanel = new JPanel();
        displayPanel.add(canvas);
    }

    public BufferStrategy getBufferStrategy(){  
        return canvas.getBufferStrategy();
    }
    public void createBufferStrategy(){
        canvas.createBufferStrategy(3);
    }    
}
