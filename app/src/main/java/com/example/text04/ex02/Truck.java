package com.example.text04.ex02;

public class Truck extends Heavy {
    private double maxLoad;

    public Truck(String carNumber, int age, int wheels, String steeringType, double pollutionPerMinute, int trailers, double maxLoad)
    {
        super(carNumber, age, wheels, steeringType, pollutionPerMinute, trailers);
        this.maxLoad = maxLoad;
    }
    public double getMaxLoad()
    {
        return maxLoad;
    }
    public void setMaxLoad(double maxLoad)
    {
        this.maxLoad = maxLoad;
    }
    @Override
    public double exhaust()
    {
        double heavyPollution = super.exhaust();
        return heavyPollution * 1.5;
    }

    @Override
    public String toString()
    {
        return super.toString() +  "\nMax load: " + maxLoad;
    }
}
