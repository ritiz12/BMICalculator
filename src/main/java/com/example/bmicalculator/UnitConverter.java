package com.example.bmicalculator;

import java.util.Objects;

public class UnitConverter {
    public static  double convertHeightInMeter(double height , String heightUnit)
    {
if(Objects.equals(heightUnit, "Inches"))
{
    return height*2.54/100;
}
else
{
    return height/100;
}
    }

    public static  double convertWeightInKilogram(double weight , String weightUnit)
    {
if(Objects.equals(weightUnit, "Gram"))
{
    return weight/1000;
}
else
{
    return weight;
}
    }
}
