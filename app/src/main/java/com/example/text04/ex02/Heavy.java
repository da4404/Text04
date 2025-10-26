package com.example.text04.ex02;

public class Heavy extends Vehicles
{
    private int trailers;

    public Heavy(String carNumber, int age, int wheels, String steeringType, double pollutionPerMinute, int trailers) {
        super(carNumber, age, wheels, steeringType, pollutionPerMinute);
        this.trailers = trailers;
    }
    public void setTrailers(int trailers)
    {
        this.trailers = trailers;
    }

    public int getTrailers()
    {
        return trailers;
    }
    @Override
    public double exhaust()
    {
        double normalInfection = super.exhaust();
        return normalInfection + 500 * this.trailers;
    }

    @Override
    public String toString()
    {
        return super.toString() + "\nTrailers: " + trailers;
    }
}