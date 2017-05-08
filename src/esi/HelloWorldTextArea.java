/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author Pedro
 */
public class HelloWorldTextArea extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage){
        primaryStage.setTitle("My first JavaFX App");
        BorderPane root =new BorderPane();
        TextArea txaUserName=new TextArea();
        txaUserName.setPrefColumnCount(12);
        txaUserName.setPrefRowCount(5);
        txaUserName.setWrapText(true);
        Button btnPrint=new Button("Print");
        btnPrint.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                System.out.println(txaUserName.getText());
            }
        });
        root.setTop(txaUserName);
        BorderPane.setAlignment(txaUserName,Pos.CENTER);
        root.setCenter(btnPrint);
        
        Scene scn=new Scene(root,250,150);
        primaryStage.setScene(scn);
        primaryStage.show();
    }
}
