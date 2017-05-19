/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.ObjectPropertyBase;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.scene.Parent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 *
 * @author Pedro
 */
public class Led extends Parent{
    private final BooleanProperty on;
    private final ObjectProperty<Color> color;
    private final Circle cr;
    
    public Led(){
        on=new SimpleBooleanProperty(true);
        color=new ObjectPropertyBase<Color>(){
            @Override
            public Object getBean(){
                return this;
            }
            @Override
            public String getName(){
                return "Color";
            }
        };
        cr=new Circle(50);
        cr.setStroke(Color.BLACK);
        getChildren().add(cr);
        setColor(Color.RED);
    }
    public final void setOn(Boolean on){
        this.on.set(on);
        cr.setFill(on?color.get():Color.TRANSPARENT);
    }
    public final boolean isOn(){
        return on.get();
    }
    public BooleanProperty onProperty(){
        return on;
    }
    public final Color getColor(){
        return color.get();
    }
    public final void setColor(Color color){
        this.color.set(color);
        cr.setFill(isOn()?getColor():Color.TRANSPARENT);
    }
    public final ObjectProperty<Color> colorProperty(){
        return color;
    }
    
    
}
