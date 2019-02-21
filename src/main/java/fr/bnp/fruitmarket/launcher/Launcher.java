package fr.bnp.fruitmarket.launcher;

import fr.bnp.fruitmarket.datamodel.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Launcher {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("How many apples do you want to buy? ");
        int appleQuantity = scan.nextInt();

        System.out.print("How many watermelons do you want to buy? ");
        int watermelonQuantity = scan.nextInt();

        System.out.print("How many oranges do you want to buy? ");
        int orangeQuantity = scan.nextInt();

        Apple apple = new Apple(appleQuantity);
        Watermelon watermelon = new Watermelon(watermelonQuantity);
        Orange orange = new Orange(orangeQuantity);

        ArrayList<Fruit> fruits = new ArrayList<Fruit>();
        fruits.add(apple);
        fruits.add(watermelon);
        fruits.add(orange);

        Basket basket = new Basket(fruits);

        System.out.println("Total payment: " + basket.calculateTotalPrice());

    }
}
