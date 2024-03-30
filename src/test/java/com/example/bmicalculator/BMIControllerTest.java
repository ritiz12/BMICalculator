package com.example.bmicalculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BMIControllerTest {

    @Test
    public void testBMIControllerForNormalBMI() {

        BMICalculator valueCounter = new BMICalculator();


        double heightValue = 170;
        double weightValue = 70;
        String heightUnit = "Centimeters";
        String weightUnit = "Kilogram";
        double calculateBMIValue = valueCounter.calculateBMI(heightValue, weightValue, heightUnit, weightUnit);
        String actualcalculateBMIValue = String.format("%.2f", calculateBMIValue);
        assertEquals("24.22", actualcalculateBMIValue);
        String actualBMIStatus = valueCounter.bmiStatus(calculateBMIValue);
        assertEquals("Normal", actualBMIStatus);
    }

    @Test
    public void testBMIControllerForUnderWeightBMI() {

        BMICalculator valueCounter = new BMICalculator();

        double heightValue = 180;
        double weightValue = 40;
        String heightUnit = "Centimeters";
        String weightUnit = "Kilogram";
        double calculateBMIValue = valueCounter.calculateBMI(heightValue, weightValue, heightUnit, weightUnit);
        String actualcalculateBMIValue = String.format("%.2f", calculateBMIValue);
        assertEquals("12.35", actualcalculateBMIValue);
        String actualBMIStatus = valueCounter.bmiStatus(calculateBMIValue);
        assertEquals("UnderWeight", actualBMIStatus);
    }

    @Test
    public void testBMIControllerForOverWeightBMI() {

        BMICalculator valueCounter = new BMICalculator();


        double heightValue = 170;
        double weightValue = 85;
        String heightUnit = "Centimeters";
        String weightUnit = "Kilogram";
        double calculateBMIValue = valueCounter.calculateBMI(heightValue, weightValue, heightUnit, weightUnit);
        String actualcalculateBMIValue = String.format("%.2f", calculateBMIValue);
        assertEquals("29.41", actualcalculateBMIValue);
        String actualBMIStatus = valueCounter.bmiStatus(calculateBMIValue);
        assertEquals("Overweight", actualBMIStatus);
    }

    @Test
    public void testBMIControllerForOver30() {

        BMICalculator valueCounter = new BMICalculator();


        double heightValue = 170;
        double weightValue = 120;
        String heightUnit = "Centimeters";
        String weightUnit = "Kilogram";
        double calculateBMIValue = valueCounter.calculateBMI(heightValue, weightValue, heightUnit, weightUnit);
        String actualcalculateBMIValue = String.format("%.2f", calculateBMIValue);
        assertEquals("41.52", actualcalculateBMIValue);
        String actualBMIStatus = valueCounter.bmiStatus(calculateBMIValue);
        assertEquals("Over 30", actualBMIStatus);
    }
    @Test
    public void testBMIControllerForMinValue() {

        BMICalculator valueCounter = new BMICalculator();


        double heightValue = 0;
        double weightValue = 0;
        String heightUnit = "Centimeters";
        String weightUnit = "Kilogram";
        double calculateBMIValue = valueCounter.calculateBMI(heightValue, weightValue, heightUnit, weightUnit);
        String actualcalculateBMIValue = String.format("%.2f", calculateBMIValue);
        assertEquals("NaN", actualcalculateBMIValue);
        String actualBMIStatus = valueCounter.bmiStatus(calculateBMIValue);
        assertEquals("Please Enter Valid Value", actualBMIStatus);
    }

}
