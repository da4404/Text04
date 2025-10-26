package com.example.text04.ex02;

public class Regular extends Vehicles
{
    private int numOfPassengers;
    public Regular(String carNumber, int age, int wheels, String steeringType, double pollutionPerMinute, int numOfPassengers)
    {
        super(carNumber, age, wheels, steeringType, pollutionPerMinute);
        this.numOfPassengers = numOfPassengers;
    }

    public int getNumOfPassengers()
    {
        return numOfPassengers;
    }

    public void setNumOfPassengers(int numOfPassengers)
    {
        this.numOfPassengers = numOfPassengers;
    }
    @Override
    public double exhaust()
    {
        return super.exhaust() + (numOfPassengers * 5);
    }
    public void noise() {
        int noiseLevel = 50 + getAge() + (2 * numOfPassengers);
        System.out.println("Noise level of this car: " + noiseLevel + " db");
    }
    public void hitchhikers()
    {
        int possibleHitchhikers = numOfPassengers / 2;
        System.out.println("This car can take " + possibleHitchhikers + " hitchhikers.");
    }
    @Override
    public String toString()
    {
        return super.toString() + "\nHas a: " + this.numOfPassengers + "passengers";
    }
}
