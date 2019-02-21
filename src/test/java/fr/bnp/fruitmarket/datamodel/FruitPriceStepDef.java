package fr.bnp.fruitmarket.datamodel;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class FruitPriceStepDef {
    private Fruit fruit;
    private double totalPrice;

    @Given("^I bought (\\d+) apples$")
    public void iBoughtApples(int quantity){
        // Write code here that turns the phrase above into concrete actions
        fruit = new Apple(quantity);
    }

    @Given("^I bought (\\d+) watermelons$")
    public void iBoughtWatermelons(int quantity){
        fruit = new Watermelon(quantity);
    }

    @Given("^I bought (\\d+) oranges$")
    public void iBoughtOranges(int quantity) {
        fruit = new Orange(quantity);
    }

    @When("^I ask for the total price$")
    public void iAskForTheTotalPrice() {
        // Write code here that turns the phrase above into concrete actions
        totalPrice = fruit.calculatePrice();
    }

    @Then("^I should pay (\\d+.\\d+)$")
    public void iShouldPay(double price) {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(price,totalPrice,0.0001);
    }
}
