Feature: Checking early black friday deals

  Background: Go to amazon and validate to all item in Select Menu
    Given Navigate to basqar
    When Verify amazon url

  @Nurhayat
  Scenario Outline:
    Given Send "<early black friday deals 2022>" to searchbox
    When Click on search button
    And Sort products according to customer reviews
    And Scroll through the products
    And Sort products high to low
    And Scroll through the products
    And Sort products according to customer reviews second time
    And Buy a Christmas sweatshirt
    And Select sweatshirt size and add to cart
    And Add to cart
    And The item should be added to the cart
    And Click go to cart
    And Click Save for later
    And Confirm that product saved for later
    Then Verify the cart is empty


    Examples:
      | early black friday deals 2022                      |
      | early black friday deals 2022 christmas sweatshirt |
