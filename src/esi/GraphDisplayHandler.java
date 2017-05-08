/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author Pedro
 */
public class GraphDisplayHandler implements EventHandler<MouseEvent>{
    
    private final String txt;
    
    
    public GraphDisplayHandler(String component){
        this.txt=component;
    }
    
    @Override
    public void handle(MouseEvent event){
        System.out.println("--->"+txt);
    }
    
}
