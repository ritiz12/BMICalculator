package com.example.bmicalculator;
import java.net.URL;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

import javax.swing.JOptionPane;

public class BMIController {

    @FXML
    private TextField heightText;

    @FXML
    private TextField weightText;

    @FXML
    private ChoiceBox<String> heightChoiceBox;
     @FXML
     public TextField outputStatusText;
    @FXML
    private ChoiceBox<String> weightChoiceBox;
    BMICalculator bmiCalculator = new BMICalculator();
    @FXML
    private TextField outputText;
    public BMIController() {
    }

    public BMIController(BMICalculator bmiCalculator) {
        this.bmiCalculator = bmiCalculator;
    }

    @FXML
    public void onCalculateButtonClick() {
         String heightValue = "";
        String weightValue = "";
        String heightUnit = "";
        String weightUnit = "";
        try
        {
             heightValue = heightText.getText();
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        try
        {
            weightValue = weightText.getText();
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        try
        {
             heightUnit = heightChoiceBox.getValue();
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        try
        {
             weightUnit = weightChoiceBox.getValue();
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }


 if(heightValue.isEmpty())
 {
     JOptionPane.showMessageDialog(null, "Please enter value for Height", "Input Error", JOptionPane.ERROR_MESSAGE);
 }
        if(weightValue.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Please enter value for Weight", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
        if(heightUnit == null)
        {
            JOptionPane.showMessageDialog(null, "Please enter Unit for Height", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
        if(weightUnit == null
        )
        {
            JOptionPane.showMessageDialog(null, "Please enter Unit for Weight", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
try
{
    double height = Double.parseDouble(heightValue);
    double weight = Double.parseDouble(weightValue);

    double bmiValue = bmiCalculator.calculateBMI(height , weight , heightUnit,weightUnit);
    outputText.setText(String.format("%.2f", bmiValue));
   String bmiStatusValue =  bmiCalculator.bmiStatus(bmiValue);
    outputStatusText.setText(bmiStatusValue);

}
catch (Exception ex)
{
    outputText.setText("Please Enter Valid Value for height and weight");
}
    }


}