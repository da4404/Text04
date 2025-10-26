package com.example.text04.ex1;

public class Clothing extends Product
{
    private int fabric;

    public Clothing(String name, int price, String dec,int fabric)
    {
        super(name, price, dec);
        this.fabric = fabric;

    }

    public int getFabric()
    {
        return fabric;
    }

    public void setFabric(int fabric)
    {
        this.fabric = fabric;
    }

    @Override
    public String getDec()
    {
        return "go to by its goos fabric" ;
    }
}
