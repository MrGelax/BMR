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
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Pedro
 */
public class HelloWorld extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage){
        primaryStage.setTitle("My first JavaFX App");
        BorderPane root =new BorderPane();
        Label lb=new Label("Bonjour");
        lb.setFont(Font.font("Times New Roman",20));
        lb.setUnderline(true);
        lb.setTextFill(Color.RED);
        
        System.out.println("Le message du libellé est "+lb.getText());
        System.out.println("La police du libellé est "+lb.getFont());
        System.out.println("la couleur du libellé est "+lb.getTextFill());
        
        root.setCenter(lb);
        Scene scn=new Scene(root,500,400);
        primaryStage.setScene(scn);
        primaryStage.show();
    }
    @Override
    public void init() throws Exception {
        System.out.println("Initialisation Ecrant");
    }
    @Override
    public void stop() throws Exception {
        System.out.println("Fin ecran");
    }
}
