package com.example.text04.ex02;

public class Light extends Vehicles
{
    private boolean hasEngine;
    public Light(String carNumber, int age, int wheels, String steeringType, double pollutionPerMinute, boolean hasEngine)
    {
        super(carNumber, age, wheels, steeringType, pollutionPerMinute);
        this.hasEngine = hasEngine;
    }

    public void setHasEngine(boolean hasEngine)
    {
        this.hasEngine = hasEngine;
    }

    public boolean getHasEngine()
    {
        return hasEngine;
    }

    @Override
    public String toString()
    {
        String word = "yes";
        if(!hasEngine)
        {
            word = "no";
        }
        return super.toString() + "\nHas engine: " + word;
    }
}
