Feature: Automotive Title Functionality
  Scenario: Adding Motorcycle and Power Sports Products
    Given Navigate to basqar
    When Verify amazon url
    And Select Automotive from the All menu
    And Click on the search button
    And Click on the Motorcycle & Powersports title
    And Click on the Protective Gear title
    And Click on the Helmets title
    And Select random product attributes from the left
    And Click on the a random helmet
    And Select the size
    And Click add to cart
    And Verify that the product has been added to the cart
    And Delete the product from cart
    Then Verify that the product has been deleted



