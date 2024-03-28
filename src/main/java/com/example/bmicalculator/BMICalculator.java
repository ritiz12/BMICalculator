package com.example.bmicalculator;

public class BMICalculator implements BMICalculatorInterface{

    @Override
    public double calculateBMI(double height , double weight , String heightUnit , String weightUnit)
    {
       double heightInm = UnitConverter.convertHeightInMeter(height , heightUnit);

               double weightInKg = UnitConverter.convertWeightInKilogram(weight , weightUnit);

        return weightInKg/ (heightInm * heightInm) ;
    }
}
