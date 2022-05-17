Feature:Women Category Page Test
  As a user I want to perform below actions on automationPractice website

  @Sanity, @Regression
  Scenario: verify User Should Navigate To Women Category Page Successfully
    Given I am on homepage
    And  I click on Women link
    Then Verify message 'WOMEN'

  @Smoke, @Regression
  Scenario Outline: verify User Should Add Product To The Cart Successfully
    Given I am on homepage
    And I click on Women link
    And I Click on the product "<product>"
    And I Change quantity "<qty>"
    And I Select size "<size>"
    And I  Select colour "<colour>"
    And I Click on Add To Cart Button
    And Verify the message 'Product successfully added to your shopping cart'
    Then  Click on X button and close the popup

    Examples:
      | product               | qty | size | colour |
      | Blouse                | 2   | M    | White  |
      | Printed Dress         | 3   | L    | Orange |
      | Printed Chiffon Dress | 4   | S    | Green  |
      | Printed Summer Dress  | 2   | M    | Blue   |