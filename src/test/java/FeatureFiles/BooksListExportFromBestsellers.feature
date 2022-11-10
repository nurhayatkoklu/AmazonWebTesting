Feature: Exporting bestsellers from book list to excel

  Background: Go to amazon and validate to all item in Select Menu
    Given Navigate to basqar
    When Verify amazon url
    Then Validate All Menu

  Scenario: Select books and list to bestsellers
    Given Select item from select all menu
    When Click on the search button
    And Verify seen to Best Sellers
    Then Export books list to excel file










