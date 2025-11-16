package com.example.text04.ex02;

public class main
{


    public static int totalDailyExhaust(Vehicles[] arr)
    {
        int sum = 0;

        for (Vehicles v : arr) {
            if (v != null) {
                sum += v.exhaust();
            }
        }

        return sum;
    }
    public static void printCarsNoise(Vehicles[] arr)
    {
        for (Vehicles v : arr)
        {
            if (v instanceof Regular)
            {
                ((Regular)v).noise();
            }
        }
    }


    public static int totalPassengersWithoutDriver(Vehicles[] arr)
    {
        int sum = 0;

        for (Vehicles v : arr) {
            if (v instanceof Regular)
            {
                Regular r = (Regular) v;
                int passengersWithoutDriver = r.getNumOfPassengers() - 1;
                sum += passengersWithoutDriver;
            }
            else if (v instanceof Bicycle)
            {
                sum += 0;
            }
        }

        return sum;
    }
    public static String cartMaxCharg(Vehicles[] arr)
    {
        double maxTime = 0;
        String vehicleNumber = "";

        for (Vehicles v : arr)
        {
            if (v instanceof Cart)
            {
                Cart c = (Cart) v;
                if (c.getChargingTime() > maxTime)
                {
                    maxTime = c.getChargingTime();
                    vehicleNumber = c.getCarNumber();
                }
            }
        }

        return vehicleNumber;
    }
}

