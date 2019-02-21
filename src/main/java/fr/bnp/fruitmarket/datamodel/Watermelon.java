package fr.bnp.fruitmarket.datamodel;

public class Watermelon extends Fruit {

    public Watermelon(int quantity){
        this.setPrice(0.8);
        this.setQuantity(quantity);
    }

    public double calculatePrice() {
        return this.getPrice()*(this.getQuantity() - this.getQuantity()/3);
    }
}
