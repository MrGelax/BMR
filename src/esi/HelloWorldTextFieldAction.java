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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author Pedro
 */
public class HelloWorldTextFieldAction extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage){
        primaryStage.setTitle("My first JavaFX App");
        BorderPane root =new BorderPane();
        Label userName =new Label("User Name");
        Label test =new Label("User Name saved!");
        
        TextField tfUserName=new TextField();
        tfUserName.setPrefColumnCount(12);
        tfUserName.setAlignment(Pos.CENTER_LEFT);
        
        tfUserName.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                root.setBottom(test);
                BorderPane.setAlignment(test, Pos.CENTER);
                tfUserName.setEditable(false);
                tfUserName.setAlignment(Pos.CENTER);
            }
        });
        
        root.setTop(userName);
        BorderPane.setAlignment(userName,Pos.CENTER);
        root.setCenter(tfUserName);
        
        Scene scn=new Scene(root,250,150);
        primaryStage.setScene(scn);
        primaryStage.show();
    }
}