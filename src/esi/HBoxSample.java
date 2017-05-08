/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Pedro
 */
public class HBoxSample extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage){
        primaryStage.setTitle("My first JavaFX App");
        // remplacer par HBOX BorderPane root =new BorderPane();
        VBox root=new VBox(10);
        root.setAlignment(Pos.CENTER_LEFT);
        root.setLayoutX(10);// Décale le layout de 10 pixel sur l'axe X
        CheckBox cb=new CheckBox("First");
        cb.setSelected(true);
        
        CheckBox cb2=new CheckBox("Second");
        cb2.setIndeterminate(true);
        
        CheckBox cb3=new CheckBox("Thrid");
        cb3.setAllowIndeterminate(true);
        
        root.getChildren().addAll(cb,cb2,cb3);
        Scene scn=new Scene(root,250,150);
        primaryStage.setScene(scn);
        primaryStage.show();
    }
}
