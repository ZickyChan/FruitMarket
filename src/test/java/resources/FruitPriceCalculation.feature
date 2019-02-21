Feature: Fruit price calculation
  Scenario: I bought 5 apples with the price 0.20
    Given I bought 5 apples
    When I ask for the total price
    Then I should pay 0.6

  Scenario: I bought 7 watermelons with the price 0.80
    Given I bought 7 watermelons
    When I ask for the total price
    Then I should pay 4.0

  Scenario: I bought 5 oranges with the price 0.50
    Given I bought 5 oranges
    When I ask for the total price
    Then I should pay 2.5