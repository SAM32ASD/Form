package com.devmate.form;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Label nom = new Label("nom");
        TextField t = new TextField();
        Label Date = new Label("Date_de_naissance");
        DatePicker P = new DatePicker();
        Label G = new Label("Genre");
        ToggleGroup T = new ToggleGroup();
        RadioButton m = new RadioButton("Homme");
        m.setToggleGroup(T);
        RadioButton f = new RadioButton("Femme");
        f.setToggleGroup(T);

        Label t1 = new Label("Langages");

        CheckBox j = new CheckBox("Java");
        j.setIndeterminate(false);
        CheckBox p = new CheckBox("Python");
        p.setIndeterminate(false);
        CheckBox js = new CheckBox("Js");
        js.setIndeterminate(false);

        Label etude = new Label("Education");

        // Déclaration de la liste d'éléments
        ListView list = new ListView();
        ObservableList li = FXCollections.observableArrayList();
        li.addAll("Licence", "Master", "PHD", "Doctorat");
        list.setItems(li);
        list.setPrefSize(100,100);

        Label addr = new Label("Adresse");

        ChoiceBox c = new ChoiceBox();
        c.getItems().addAll("Yaoundé","Bertoua","Garoua","Maroua","Ngaoundéré","Bafoussam","Ebolowa","Douala");

        Button b = new Button("Enregistrer");
        b.setStyle("-fx-background-color:darkslateblue;-fx-text-fill: white;");

        GridPane gp = new GridPane();

        gp.setMinSize(500,300);

        gp.setPadding(new Insets(10, 10,10,10));

        gp.setVgap(5);

        gp.setHgap(5);

        gp.setAlignment(Pos.CENTER);

        gp.add(nom, 0,0);
        gp.add(t, 1,0);

        gp.add(Date, 0,1);
        gp.add(P, 1,1);

        gp.add(G, 0,2);
        gp.add(m, 1,2);
        gp.add(f, 2,2);

        gp.add(t1, 0,3);
        gp.add(j, 1,3);
        gp.add(p, 2,3);
        gp.add(js, 3,3);

        gp.add(etude, 0,4);
        gp.add(list, 1,4);

        gp.add(addr, 0,5);
        gp.add(c, 1,5);

        gp.add(b, 3,7);


        gp.setStyle(" -fx-background-color:  linear-gradient(lightgray, aqua);\n" +
                " -fx-border-color: white;\n" +
                " -fx-border-radius: 20;\n" +
                " -fx-padding: 10 10 10 10;\n" +
                " -fx-background-radius: 20;");

        nom.setStyle("-fx-font: normal bold 15px 'sans-comic'");
        Date.setStyle("-fx-font: normal bold 15px 'sans-comic'");
        G.setStyle("-fx-font: normal bold 15px 'sans-comic'");
        t1.setStyle("-fx-font: normal bold 15px 'sans-comic'");
        etude.setStyle("-fx-font: normal bold 15px 'sans-comic'");

        //objet de scène
        Scene s = new Scene(gp);

        stage.setTitle("Formulaire");

        stage.setScene(s);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}