/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi;

import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author Pedro
 */
public class Led{
    
    public Led(double resImc, Label lb){
        Rectangle r=new Rectangle();
        r.setWidth(10);
        r.setHeight(30);
        if (resImc==0)
            r.setFill(Color.TRANSPARENT);
        else
            switch((int)resImc){
            case 18:case 19:case 20:case 21:case 22:case 23:case 24:case 25:r.setFill(Color.GREEN);
                lb.setText("Vous êtes dans la claisfication Normal (entre 18.5 et 24.9)");break;
            case 26:case 27:case 28:case 29:case 30: r.setFill(Color.ORANGE);
                lb.setText("Vous êtes dans la claisfication Surpoids (entre 25 et 29.9)");break;
            case 31:case 32:case 33:case 34:case 35: r.setFill(Color.RED);
                lb.setText("Vous êtes dans la claisfication Obésité (plus de 30)");break;
        }
    }
    
    
}
