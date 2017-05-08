/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi;

import com.sun.prism.paint.Color;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author Pedro
 */
public class Tab extends Application {
    /*String nom,prenom;
    Image img;
    
    public Image getImg(){return this.img;}
    
    public Tab(String nom,String prenom,Image img){
        this.nom=nom;
        this.prenom=prenom;
        this.img=img;
    }
    */
    public static void main(String[] args) {
        launch(args);
    }
    
    
   @Override
    public void start(Stage stage){       
        //Tab test=new Tab("Pedro","Da Silva",new Image("pomme.jpg"));
        // remplacer par HBOX BorderPane root =new BorderPane();
        ImageView[][] tab=new ImageView[3][3];
        tab[0][0]=new ImageView(new Image("file:sante.jpg"));
        tab[0][1]=new ImageView(new Image("file:sante.jpg"));
        stage.setTitle("My First JavaFX Appli");
        stage.getIcons().add(new Image(("file:sante.jpg"))); //pour mettre changer l'icon de la fenêtre 
        stage.setResizable(false);
        stage.setMinHeight(200);
        stage.setMinWidth(300);
        
//Création différents compo
        VBox root= new VBox(10);
        root.setPadding(new Insets(20));
        GridPane gp=new GridPane();
        GridPane gp2=new GridPane();
        
        Button bt=new Button("Bonjour");
        gp.setVgap(5);
        gp.add(bt, 1, 2);
        gp.add(tab[0][0],0,0);
        gp.add(tab[0][1],1,0);
        gp.add(new ImageView(new Image("file:sante.jpg")), 2, 1);
        gp2.add(new ImageView(new Image("file:un.jpg")),0,0);
        
        gp.getChildren().add(gp2);
        gp.setGridLinesVisible(true);
        
        root.getChildren().addAll(gp);
        root.setAlignment(Pos.CENTER);
        //mise en place des deux gridPane
        Scene scn=new Scene(root);
        stage.setScene(scn);
        stage.show();   
    }
}
