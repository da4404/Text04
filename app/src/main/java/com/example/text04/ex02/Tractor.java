package com.example.text04.ex02;

public class Tractor extends Heavy
{
    private String trailerTypes;
    public Tractor(String carNumber, int age, int wheels, String steeringType, double pollutionPerMinute, int trailers, String trailerTypes)
    {
        super(carNumber, age, wheels, steeringType, pollutionPerMinute, trailers);
        this.trailerTypes = trailerTypes;
    }

    public String getTrailerTypes()
    {
        return trailerTypes;
    }

    public void setTrailerTypes(String trailerTypes)
    {
        this.trailerTypes = trailerTypes;
    }
    public String toString()
    {
        return super.toString() +  "\nTrailer types: " + trailerTypes;
    }
}
