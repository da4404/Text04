package com.example.text04.ex1;

public class ShoppingCart
{
    private Product[] products = new Product[10];
    public ShoppingCart(Product[] products)
    {
        this.products = products;
    }

    public Product[] getProducts()
    {
        return products;
    }

    public void setProducts(Product[] products)
    {
        this.products = products;
    }

    public double calculateTotal()
    {
        double sum = 0;
        for (Product product : this.products)
        {
            sum+=product.getPracie();
        }
        return sum;
    }



}
