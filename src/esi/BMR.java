/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Root;
import java.util.ArrayList;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author Pedro
 */
public class BMR extends Application{
    public static void lancement(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage){
        ArrayList<TextField> tfList=new ArrayList();
        stage.setTitle("My first JavaFX App");
        // remplacer par HBOX BorderPane root =new BorderPane();
        stage.setTitle("My First JavaFX Appli");
        stage.getIcons().add(new Image(("file:sante.jpg"))); //pour mettre changer l'icon de la fenêtre 
        stage.setResizable(false);
        stage.setMinHeight(200);
        stage.setMinWidth(300);
        
        
//Création différents compo
        VBox root= new VBox();
        GridPane gp=new GridPane();
        gp.setVgap(5);
        gp.setPadding(new Insets(10));
        //gp.setGridLinesVisible(true);
        GridPane gp2=new GridPane();
        gp2.setPadding(new Insets(10));
        gp2.setVgap(5);
        //gp2.setGridLinesVisible(true);
        HBox hb=new HBox(10);
        HBox hbBis=new HBox(10);
        hbBis.setAlignment(Pos.CENTER);
        Scene scn=new Scene(root);
        //mise en place des deux gridPane
        
        
        //Creation des menu
        MenuBar menu=new MenuBar();
        menu.prefWidthProperty().bind(stage.widthProperty());
        Menu menFile=new Menu("File");
        //Item Exit
        MenuItem exit=new MenuItem("Exit");
        exit.setOnAction(new EventHandler <ActionEvent>(){
            public void handle(ActionEvent ev){
                stage.close();
            }
        });
        menFile.getItems().add(exit);       
        menu.getMenus().add(menFile);
        root.getChildren().add(menu);
        
        
    // different elements gp

        //Taille
        Label taille=new Label("Taille (m)");
        GridPane.setHalignment(taille, HPos.LEFT);
        gp.add(taille,0,0);
        TextField tfTaille=new TextField();
        tfTaille.setText(null);
        tfTaille.setPromptText("Taille en cm : 1.63");
        tfTaille.setPrefWidth(50);
        gp.add(tfTaille, 1,0);
        tfList.add(tfTaille);
        
        //Poids
        Label poid=new Label("Poids (Kg)");
        gp.add(poid,0,1);
        TextField tfPoid=new TextField();
        tfPoid.setPromptText("Poids en Killo : 55");
        gp.add(tfPoid, 1,1);
        tfList.add(tfPoid);
        
        //Age
        Label age=new Label("Age (années)");
        gp.add(age,0,2);
        TextField tfAge=new TextField();
        tfAge.setPromptText("Age en année : 18");
        gp.add(tfAge,1,2);
        tfList.add(tfAge);
        
        //Sexe
        Label sexe=new Label("Sexe");
        ToggleGroup group = new ToggleGroup();
        RadioButton homme=new RadioButton("Homme");
        RadioButton femme=new RadioButton("Femme");
        homme.setToggleGroup(group);
        femme.setToggleGroup(group);
        HBox sex=new HBox();
        sex.getChildren().addAll(homme,femme);
        sex.setSpacing(15);
        gp.add(sexe,0,3);
        gp.add(sex,1,3);
               
        //tyle de vie en faire une box
        Label vie=new Label("Style de Vie");
        gp.add(vie,0,4);
        ChoiceBox cbVie=new ChoiceBox();
        cbVie.setValue(StyleVie.Actif);
        for(StyleVie sv: StyleVie.values())
            cbVie.getItems().add(sv);
        gp.add(cbVie, 1,4);
        
        //Tratement tfList
        for(TextField ft:tfList)
            ft.addEventFilter(KeyEvent.KEY_TYPED,new EventHandler<KeyEvent>(){
                @Override
                public void handle(KeyEvent ke){
                    if(Character.isLetter(ke.getCharacter().charAt(0)))
                    ke.consume();
                }
            });
        
//différent elements gp2 

        
        //BMR
        Label bmr=new Label("Calories");
        gp2.add(bmr,0,0);
        TextField tfBmr=new TextField();
        tfBmr.addEventFilter(KeyEvent.KEY_TYPED,new EventHandler<KeyEvent>(){
            @Override
            public void handle(KeyEvent ke){
                ke.consume();
            }
        });
        tfBmr.setPromptText("Calories : 2100");
        gp2.add(tfBmr,1,0);
        
        //Calories
        Label imc=new Label("IMC");
        gp2.add(imc,0,1);
        TextField tfImc=new TextField();
        tfImc.addEventFilter(KeyEvent.KEY_TYPED,new EventHandler<KeyEvent>(){
            @Override
            public void handle(KeyEvent ke){
                ke.consume();
            }
        });
        tfImc.setPromptText("IMC :25");
        gp2.add(tfImc, 1,1);
        
        
        //Bouton calcu
        Button btnCalc=new Button("Calculer BMR");
        btnCalc.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent ev){
                //Boite de dialogue
                Alert alrt=new Alert(AlertType.ERROR,"Erreur");
                alrt.setTitle("Erreur d'encodage");
                alrt.setHeaderText("BlaBlaBla");
                alrt.setGraphic(new ImageView("file:warning2.png"));
                traitement("0",tfTaille,tfPoid,tfAge,cbVie,tfImc,alrt,tfBmr,group);
            }
        });
        //Boutton clear
        Button cl=new Button("Clear");
        cl.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent ev){
                tfTaille.clear();
                tfTaille.setText(null);
                tfPoid.clear();
                tfPoid.setText(null);
                tfAge.clear();
                tfAge.setText(null);
                tfBmr.clear();
                tfImc.clear();
                cbVie.setValue(StyleVie.Actif);
                if (femme.isSelected())
                    femme.setSelected(false);
                else
                    homme.setSelected(false);
            }
        });
        // Ajout compo
        hb.getChildren().addAll(gp,gp2);
        hbBis.getChildren().addAll(btnCalc,cl);
        root.getChildren().addAll(hb,hbBis);
        root.setAlignment(Pos.CENTER);
        stage.setScene(scn);
        stage.show();   
    }
    public double indiceVie(StyleVie sv,double ind) {
        try{
            switch (sv){
                case Sédentaire:ind=1.2;break;
                case PeuActif: ind=1.375;break;
                case Actif:ind=1.55;break;
                case FortActif:ind=1.725;break;
                case ExtrêmementActif:ind=1.9;break;
            }
        }catch(NullPointerException e){
            
        }
        return ind;
    }
    
    public String validParamBmr(TextField tfTaille,TextField tfPoid,TextField tfAge,
            ChoiceBox cbVie,TextField tfImc,ToggleGroup group){
        double i;
        String str=" ";
        try{
            if(((RadioButton)group.getSelectedToggle()).getText()=="Femme"){
                    str=(""+((9.6*Double.parseDouble(tfPoid.getText()))+
                        (1.8*Double.parseDouble(tfTaille.getText()))+
                        (4.7*Double.parseDouble(tfAge.getText()))+655)*
                        indiceVie((StyleVie)cbVie.getValue(),0)+"");
            }else{
                    str=(""+(13.7*Double.parseDouble(tfPoid.getText())
                        +5*Double.parseDouble(tfTaille.getText())+
                        6.8*Double.parseDouble(tfAge.getText())+66)*
                        indiceVie((StyleVie)cbVie.getValue(),0)+""); 
            }
        }catch(NumberFormatException e){
            str="Failled";
        }
        return str;
    }
    
    public String validParamImc(TextField tfTaille,TextField tfPoid,String str){  
        try{
            str=(""+Double.parseDouble(tfPoid.getText())
                /Math.pow(Double.parseDouble(tfTaille.getText()),2));
        }catch(NumberFormatException e){
            str="Failled";
        }
        return str;
    }
    
    public void traitement(String str,TextField tfTaille,TextField tfPoid,TextField tfAge,
            ChoiceBox cbVie,TextField tfImc,Alert alrt,TextField tfBmr,ToggleGroup group){
        
        try{
            if((tfTaille.getText()==null||Double.parseDouble(tfTaille.getText())<1||tfTaille.getText().charAt(0)==' ')
                ||(tfPoid.getText()==null||Double.parseDouble(tfPoid.getText())<1||tfPoid.getText().charAt(0)==' ')
                ||(tfAge.getText()==null||Integer.parseInt(tfAge.getText())<1||tfAge.getText().charAt(0)==' ')
                ||(!group.getSelectedToggle().isSelected()))
                alrt.showAndWait();    
            else
                tfBmr.setText(validParamBmr(tfTaille,tfPoid,tfAge,cbVie,tfImc,group));
                tfImc.setText(validParamImc(tfTaille,tfPoid," "));
                if(tfBmr.getText().equals("Failled"))
                    tfBmr.setStyle("-fx-text-inner-color:red;"); //pour changer la couleur
                else
                    tfBmr.setStyle("-fx-text-inner-color:black;");
                    if(tfImc.getText().equals("Failled"))
                        tfImc.setStyle("-fx-text-inner-color:red;"); //pour changer la couleur
                    else
                        tfImc.setStyle("-fx-text-inner-color:black;");
        }catch(NullPointerException e){
            alrt.showAndWait();
        }
    }
}