package fr.bnp.fruitmarket.datamodel;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.ArrayList;

public class TotalFruitPrice {
    private Basket basket;
    private double payment;
    @Given("^I bought (\\d+) apples, (\\d+) watermelons, (\\d+) oranges$")
    public void iBoughtApplesWatermelonsOranges(int arg0, int arg1, int arg2) {
        Fruit apple = new Apple(arg0);
        Fruit watermelon = new Watermelon(arg1);
        Fruit orange = new Orange(arg2);

        ArrayList<Fruit> arrayList = new ArrayList();

        arrayList.add(apple);
        arrayList.add(watermelon);
        arrayList.add(orange);

        basket = new Basket(arrayList);
    }

    @When("^I ask for the total price of the basket$")
    public void iAskForTheTotalPriceOfTheBasket(){
        payment = basket.calculateTotalPrice();
    }

    @Then("^I should pay (\\d+.\\d+) in total$")
    public void iShouldPayInTotal(double price){
        Assert.assertEquals(price,payment,0.0001);
    }
}
