package com.semeter_project_melanie_nunez.semester_project_melanie_nunez;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;

import java.io.IOException;
//Creating Class Name
public class Calculator extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //Creating First Label
        Label label1 = new Label ("Meal Total:");
        //Creating textfield
        TextField text1 = new TextField();
        //Creating button and second label
        Button but1 = new Button ("Calculate Tip Value");
        Label label2 = new Label (" Amount to Tip: \n");
        //Calling VBox Class
        VBox vBox1 = new VBox();
        //Setting up the vbox pane
        vBox1.setSpacing(10);

        //Setting nodes
        vBox1.setMargin(label1, new Insets(20,20,5,80));
        vBox1.setMargin(text1, new Insets(5,10,5,10));
        vBox1.setMargin(but1, new Insets(4,4,10,100));
        vBox1.setMargin(label2, new Insets(5,5,10,100));

        //retrieving the Vbox
        ObservableList list1 = vBox1.getChildren();

            //inserting nodes
            list1.addAll (label1,text1,but1,label2);

            Scene scene1 = new Scene (vBox1,300,250);


            //iterating the title page
            stage.setTitle("Calculator");

            //adding stage
            stage.setScene(scene1);

            //Displaying stage
            stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}