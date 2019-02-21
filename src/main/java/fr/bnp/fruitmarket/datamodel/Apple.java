package fr.bnp.fruitmarket.datamodel;

public class Apple extends Fruit{

    public Apple(int quantity){
        this.setPrice(0.20);
        this.setQuantity(quantity);
    }
    public double calculatePrice() {
        return this.getPrice()*Math.round(this.getQuantity()/2.0);
    }
}
