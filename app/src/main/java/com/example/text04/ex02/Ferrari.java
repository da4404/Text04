package com.example.text04.ex02;

public class Ferrari extends Regular
{
    private String color;
    public Ferrari(String carNumber, int age, int wheels, String steeringType, double pollutionPerMinute, int numOfPassengers,String color)
    {
        super(carNumber, age, wheels, steeringType, pollutionPerMinute,numOfPassengers);
        this.color = color;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }
    @Override
    public String toString()
    {
        return super.toString() + "\nhas a : " + color + "color";
    }
}
