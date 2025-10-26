package com.example.text04.ex02;

public class Bicycle extends Light
{
    private boolean hasBasket;

    public Bicycle(String carNumber, int age, int wheels, String steeringType, double pollutionPerMinute, boolean hasEngine, boolean hasBasket)
    {
        super(carNumber, age, wheels, steeringType, pollutionPerMinute, hasEngine);
        this.hasBasket = hasBasket;
    }

    public void setHasBasket(boolean hasBasket)
    {
        this.hasBasket = hasBasket;
    }

    public boolean getHasBasket()
    {
        return hasBasket;
    }

    @Override
    public String toString()
    {
        String word = "yes";
        if(!hasBasket)
        {
            word = "no";
        }
        return super.toString() + "\nHas basket: " + word;
    }
}
