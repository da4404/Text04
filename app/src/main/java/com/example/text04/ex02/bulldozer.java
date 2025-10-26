package com.example.text04.ex02;

public class bulldozer extends Tractor
{
    private String colorBuuldozer;
     public bulldozer(String carNumber, int age, int wheels, String steeringType, double pollutionPerMinute, int trailers, String trailerTypes,String colorBuuldozer)
    {
        super(carNumber, age, wheels, steeringType, pollutionPerMinute, trailers,trailerTypes);
        this.colorBuuldozer = colorBuuldozer;
    }
    public String getColorBuuldozer()
    {
        return colorBuuldozer;
    }
    public void setColorBuuldozer(String colorBuuldozer)
    {
        this.colorBuuldozer = colorBuuldozer;
    }

    @Override
    public String toString()
    {
        return super.toString() + "\ncolor: " + colorBuuldozer;
    }
}

