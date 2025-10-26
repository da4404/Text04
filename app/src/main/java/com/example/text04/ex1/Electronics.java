package com.example.text04.ex1;

public class Electronics extends Product
{
    private int valt;

    public Electronics(String name, int price, String dec,int valt)
    {
        super(name, price, dec);
        this.valt = valt;
    }

    public int getValt()
    {
        return valt;
    }

    public void setValt(int valt)
    {
        this.valt = valt;
    }

    @Override
    public String getDec()
    {
        return "its a good good prodact by it " + this.valt;
    }
}
