package com.example.text04.ex1;

class Product
{
    private String name;
    private int pracie;
    private String dec;
    public Product(String name, int pracie,String dec)
    {
        this.name = name;
        this.dec = dec;
        this.pracie = pracie;

    }
    public int getPracie()
    {
        return pracie;
    }

    public String getDec()
    {
        return dec;
    }

    public String getName()
    {
        return name;
    }

    public void setDec(String dec)
    {
        this.dec = dec;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setPracie(int pracie)
    {
        this.pracie = pracie;
    }
}
