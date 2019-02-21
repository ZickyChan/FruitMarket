package fr.bnp.fruitmarket.datamodel;

public class Orange extends Fruit{
    public Orange(int quantity){
        this.setPrice(0.5);
        this.setQuantity(quantity);
    }

    public double calculatePrice() {
        return this.getPrice()*this.getQuantity();
    }
}
