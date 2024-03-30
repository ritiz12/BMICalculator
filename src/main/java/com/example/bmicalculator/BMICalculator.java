package com.example.bmicalculator;

public class BMICalculator implements BMICalculatorInterface{

    @Override
    public double calculateBMI(double height , double weight , String heightUnit , String weightUnit)
    {

       double heightInm = UnitConverter.convertHeightInMeter(height , heightUnit);

       double weightInKg = UnitConverter.convertWeightInKilogram(weight , weightUnit);

       return weightInKg/ (heightInm * heightInm) ;
    }

    @Override

    public  String bmiStatus(double bmiValue) {
        String bmiStatusValue = "" ;

        if(Double.isNaN(bmiValue))
        {
            bmiStatusValue = "Please Enter Valid Value";
        }
        else if(bmiValue < 18)
        {
            bmiStatusValue = "UnderWeight";

        }
        else if(bmiValue >= 18 && bmiValue < 25)
        {
            bmiStatusValue = "Normal";

        }
        else if(bmiValue >= 25 && bmiValue < 30)
        {
            bmiStatusValue = "Overweight";

        }
        else if(bmiValue >= 35 )
        {
            bmiStatusValue = "Over 30";

        }
        return bmiStatusValue ;
    }



}
