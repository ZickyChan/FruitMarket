package fr.bnp.fruitmarket.datamodel;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private ArrayList<Fruit> fruits;

    public Basket(ArrayList<Fruit> arrayList){
        fruits = arrayList;
    }

    public void addToBasket(Fruit fruit){
        fruits.add(fruit);
    }

    public void removeFruitfromBasket(int index){
        if(index > fruits.size()){
            System.out.println("The index is bigger than basket size");
            return;
        }
        fruits.remove(index);
    }

    public double calculateTotalPrice(){
        double sum = 0.0;

        for(Fruit fruit: fruits){
            sum += fruit.calculatePrice();
        }

        return sum;
    }
}
