package com.example.bmicalculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;


import java.io.IOException;

public class BMICalculatorMain extends Application {


    @Override
    public void start(Stage stage) throws IOException {

       FXMLLoader fxmlLoader = new FXMLLoader(BMICalculatorMain.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("BMI-Calculator");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {launch(args);
    }
}