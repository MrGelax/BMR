/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi;

import java.awt.Color;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author Pedro
 */
public abstract class Test extends Application{
    public static void lancement(String []args){
        launch(args);
    }
    
    @Override
    public void start(Stage stage){

        stage.setTitle("My first JavaFX App");
        // remplacer par HBOX BorderPane root =new BorderPane();
        stage.setTitle("My First JavaFX Appli");
        stage.getIcons().add(new Image(("file:sante.jpg"))); //pour mettre changer l'icon de la fenêtre 
        stage.setResizable(false);
        stage.setMinHeight(200);
        stage.setMinWidth(300);
        VBox root=new VBox();
        HBox hb=new HBox(10);
        
        Button bt=new Button("On/Off");
        ChoiceBox cb=new ChoiceBox();
        cb.getItems().addAll(Color.red,Color.BLUE,Color.GREEN,Color.BLACK);
        hb.getChildren().addAll(bt,cb);
        //Led ld=new Led();
        root.getChildren().addAll(hb);
        Scene sc=new Scene(root);
        root.setAlignment(Pos.CENTER);
        stage.setScene(sc);
        stage.show();
    }
    
    public static void main(String[] args) {
        lancement(args);
        //BMR.lancement(args);
        //PrintTest.lancement(args);
    }
}
