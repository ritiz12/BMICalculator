package com.example.bmicalculator;

public interface BMICalculatorInterface {
     double calculateBMI(double height , double weight , String heightUnit , String weightUnit);
     String bmiStatus(double bmiValue);
}
