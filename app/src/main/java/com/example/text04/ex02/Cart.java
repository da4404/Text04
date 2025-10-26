package com.example.text04.ex02;

public class Cart extends Light
{
    private double chargingTime;

    public Cart(String carNumber, int age, int wheels, String steeringType, double pollutionPerMinute, boolean hasEngine, double chargingTime)
    {
        super(carNumber, age, wheels, steeringType, pollutionPerMinute, hasEngine);
        this.chargingTime = chargingTime;
    }
    public void setChargingTime(double chargingTime)
    {
        this.chargingTime = chargingTime;
    }
    public double getChargingTime()
    {
        return chargingTime;
    }
    public double exhaust()
    {
        return (super.exhaust() / 2) + (chargingTime * 5);
    }
    public void hitchhikers()
    {
        int possibleHitchhikers = getWheels();
        System.out.println("This cart can take " + possibleHitchhikers + " hitchhikers.");
    }
    @Override
    public String toString()
    {
        return super.toString() + "\nCharging time: " + chargingTime;
    }
}

