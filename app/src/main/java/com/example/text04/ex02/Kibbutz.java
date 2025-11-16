package com.example.text04.ex02;

public class Kibbutz {
    private Vehicles[] vehicles;
    private int count;

    public Kibbutz()
    {
        vehicles = new Vehicles[500];
        count = 0;
    }

    public void addVehicle(Vehicles v)
    {
        if (count < vehicles.length && v != null)
        {
            vehicles[count] = v;
            count++;
        }
        else
        {
            System.out.println("full");
        }
    }

    public Vehicles[] vehiclesOlderThan15WithSteering()
    {
        Vehicles[] temp = new Vehicles[count];
        int j = 0;
        int i=0;
        for (i = 0; i < count; i++)
        {
            Vehicles v = vehicles[i];
            if (v.getAge() > 15 && v.getSteeringType().equals("wheel") )
            {
                temp[j] = v;
                j++;
            }
        }

        Vehicles[] result = new Vehicles[j];
        for (i = 0; i < j; i++)
        {
            result[i] = temp[i];
        }
        return result;
    }

    public int countCarsAndLightWithSteeringWheel()
    {
        int sum = 0;
        int i = 0;
        for (i = 0; i < count; i++)
        {
            Vehicles v = vehicles[i];
            if (v.getSteeringType().equals("wheel"))
            {
                if (v instanceof Regular || v instanceof Light)
                {
                    sum++;
                }
            }
        }
        return sum;
    }
}