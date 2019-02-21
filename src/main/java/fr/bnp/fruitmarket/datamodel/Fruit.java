package fr.bnp.fruitmarket.datamodel;

public abstract class Fruit {

    private double price;
    private int quantity;

    public double getPrice() {
        return price;
    }

    protected void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public abstract double calculatePrice();
}
