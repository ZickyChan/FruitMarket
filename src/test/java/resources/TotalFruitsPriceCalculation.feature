Feature: Total fruits price calculation
  Scenario: I bought 5 apples, 8 watermelons, 4 oranges
    Given I bought 5 apples, 7 watermelons, 4 oranges
    When I ask for the total price of the basket
    Then I should pay 6.6 in total

  Scenario: I bought 1 apple, 1 watermelon, 1 orange
    Given I bought 1 apples, 1 watermelons, 1 oranges
    When I ask for the total price of the basket
    Then I should pay 1.5 in total