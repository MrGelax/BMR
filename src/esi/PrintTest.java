/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi;

import java.awt.Color;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 *
 * @author Pedro
 */
public class PrintTest extends Application{   
    
    private final BorderPane root=new BorderPane();
    
    private final HBox btnPanel=new HBox(10);
    private final Label lblTitle =new Label("Event Handling");
    private final TextArea txaMsg = new TextArea();
    private final Button btnInsert=new Button("Insert");
    private final TextField tfCharac=new TextField();
    private final Button btnQuit=new Button("Quit");
    
    
    public static void lancement(String[]args){
        launch(args);
    }
    
    @Override
    public void start(Stage stage){
        stage.setTitle("Event Handling");
        root.setPadding(new Insets(10));
        lblTitle.setFont(Font.font("System", FontWeight.BOLD,20));
        lblTitle.setStyle("-fx-text-inner-color:green;");
        BorderPane.setAlignment(lblTitle,Pos.CENTER);
        BorderPane.setMargin(lblTitle,new Insets(0,0,10,0));
        root.setTop(lblTitle);
        
        txaMsg.setWrapText(true);
        txaMsg.setPrefColumnCount(15);
        txaMsg.setPrefRowCount(10);
        root.setCenter(txaMsg);
        
        btnInsert.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent ev){
                txaMsg.appendText(tfCharac.getText());
            }
        });
        btnQuit.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent ev){
                stage.close();
            }
        });
        
        btnPanel.getChildren().add(btnInsert);
        btnPanel.getChildren().add(tfCharac);
        btnPanel.getChildren().add(btnQuit);
        btnPanel.setAlignment(Pos.CENTER_RIGHT);
        btnPanel.setPadding(new Insets(10,0,0,0));
        root.setBottom(btnPanel);
        
        Scene sc=new Scene(root);
        /*
        stage.addEventFilter(MouseEvent.MOUSE_CLICKED,new GraphDisplayHandler("Stage Filter"));
        stage.addEventHandler(MouseEvent.MOUSE_CLICKED,new GraphDisplayHandler("Stage Handler"));
        
        sc.addEventFilter(MouseEvent.MOUSE_CLICKED,new GraphDisplayHandler("Scene Filter"));
        sc.addEventHandler(MouseEvent.MOUSE_CLICKED,new GraphDisplayHandler("Scene Handler"));
        
        root.addEventFilter(MouseEvent.MOUSE_CLICKED,new GraphDisplayHandler("BorderPane Filter"));
        root.addEventHandler(MouseEvent.MOUSE_CLICKED,new GraphDisplayHandler("BorderPane Handler"));
        
        btnInsert.addEventFilter(MouseEvent.MOUSE_CLICKED,new GraphDisplayHandler("Insert Button Filter"));
        btnInsert.addEventHandler(MouseEvent.MOUSE_CLICKED,new GraphDisplayHandler("Insert Button Handler"));
        
        btnPanel.addEventFilter(MouseEvent.MOUSE_CLICKED,new GraphDisplayHandler("HBox Filter"));
        btnPanel.addEventHandler(MouseEvent.MOUSE_CLICKED,new GraphDisplayHandler("HBox Handler"));
        */
        tfCharac.addEventFilter(KeyEvent.KEY_TYPED,new EventHandler<KeyEvent>(){
            @Override
            public void handle(KeyEvent ke){
                if (Character.isLetter(ke.getCharacter().charAt(0)))
                ke.consume();
                
            }
        });
        
        
        stage.setScene(sc);
        stage.show();
    }
}
