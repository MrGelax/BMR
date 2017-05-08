/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 *
 * @author Pedro
 */
public class GridPaneSample extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage){

        
        primaryStage.setTitle("My first JavaFX App");
        // remplacer par HBOX BorderPane root =new BorderPane();
        GridPane root=new GridPane();
        root.setPadding(new Insets(10));
        root.setHgap(10);
        root.setVgap(5);
        
        Label lbTitle =new Label("JavaFX Course Login");
        lbTitle.setFont(Font.font("System", FontWeight.BOLD, 20));
        lbTitle.setTextFill(Color.RED);
        root.add(lbTitle, 0, 0,2,1);
        GridPane.setHalignment(lbTitle, HPos.CENTER);
        GridPane.setMargin(lbTitle,new Insets(0,0,10,0));
        
        Label lbUserName=new Label("User Name or Mail");
        GridPane.setHalignment(lbUserName, HPos.RIGHT);
        root.add(lbUserName,0,1);
        
        TextField tfUserName=new TextField();
        tfUserName.setPrefColumnCount(20);
        root.add(tfUserName,1,1);
        
        Label lbPassword =new Label("Password");
        root.add(lbPassword,0,2);
        
        TextField tfPassword=new TextField();
        tfPassword.setPrefColumnCount(20);
        root.add(tfPassword,1,2);
        
        GridPane.setHalignment(lbPassword, HPos.RIGHT);
        GridPane.setFillWidth(tfPassword,false);
        Scene scn=new Scene(root);
        primaryStage.setScene(scn);
        primaryStage.show();
        
    }
}
