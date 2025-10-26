package com.example.text04.ex1;


public class Book extends Product
{
    private int pages;
    public Book(String name, int price, String dec,int pages)
    {
        super(name, price, dec);
        this.pages = pages;
    }
    @Override
    public String getDec()
    {
        return "the book is amazing book";
    }
    public int getPages()
    {
        return pages;
    }
    public void setPages(int pages)
    {
        this.pages = pages;
    }
}

