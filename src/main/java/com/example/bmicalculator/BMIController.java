package com.example.bmicalculator;
import java.net.URL;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.fxml.Initializable;

public class BMIController {

    @FXML
    private TextField heightText;

    @FXML
    private TextField weightText;

    @FXML
    private ChoiceBox<String> heightChoiceBox;
@FXML
private TextField outputStatusText;
    @FXML
    private ChoiceBox<String> weightChoiceBox;
    private BMICalculator bmiCalculator = new BMICalculator();
    @FXML
    private TextField outputText;
    public BMIController() {
    }

    public BMIController(BMICalculator bmiCalculator) {
        this.bmiCalculator = bmiCalculator;
    }


    @FXML
    public void onCalculateButtonClick() {
String heightValue = heightText.getText();
String weightValue = weightText.getText();
String heightUnit = heightChoiceBox.getValue();
String weightUnit = weightChoiceBox.getValue();

try
{
    double height = Double.parseDouble(heightValue);
    double weight = Double.parseDouble(weightValue);

    double bmiValue = bmiCalculator.calculateBMI(height , weight , heightUnit,weightUnit);
    outputText.setText(String.format("%.2f", bmiValue));

    if(bmiValue < 18)
    {
outputStatusText.setText("UnderWeight");
    }
    else if(bmiValue >= 18 && bmiValue < 25)
    {
        outputStatusText.setText("Normal");
    }
    else if(bmiValue >= 25 && bmiValue < 30)
    {
        outputStatusText.setText("Overweight");
    }
    else if(bmiValue >= 35 )
    {
        outputStatusText.setText("Over 30 ");
    }
}
catch (Exception ex)
{
    outputText.setText("Please Enter Valid Value for height and weight");
}
    }

}