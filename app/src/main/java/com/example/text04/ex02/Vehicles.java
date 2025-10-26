package com.example.text04.ex02;

public class Vehicles
{
    private String carNumber;
    private int age;
    private int wheels;
    private String steeringType;
    private double pollutionPerMinute;

    public Vehicles(String carNumber, int age, int wheels, String steeringType, double pollutionPerMinute) {
        this.carNumber = carNumber;
        this.age = age;
        this.wheels = wheels;
        this.steeringType = steeringType;
        this.pollutionPerMinute = pollutionPerMinute;
    }

    public String getCarNumber()
    {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getWheels() {
        return wheels;
    }

    public void setSteeringType(String steeringType) {
        this.steeringType = steeringType;
    }

    public String getSteeringType() {
        return steeringType;
    }

    public void setPollutionPerMinute(double pollutionPerMinute)
    {
        this.pollutionPerMinute = pollutionPerMinute;
    }

    public double getPollutionPerMinute()
    {
        return pollutionPerMinute;
    }
    public double exhaust()
    {
        return pollutionPerMinute * 60;
    }

    public String toString()
    {
        return "Vehicle Info: " +
                "\nNumber: " + carNumber +
                "\nAge: " + age +
                "\nWheels: " + wheels +
                "\nSteering: " + steeringType +
                "\nPollution per minute: " + pollutionPerMinute;
    }
}
