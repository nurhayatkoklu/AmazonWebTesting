Feature: Beauty and Personal Care

  Background: Go to amazon and validate to all item in Select Menu
    Given Navigate to basqar
    When Verify amazon url
    Then Validate All Menu

    @Muharrem
    Scenario: Checking high quality random products from the Beauty and Personal Care category
      Given Select Beauty and Personal Care from the drop-down menu
      When Click on the search button
      And Verify that you are on the Beauty and Personal Care page
      And Click Shave & Hair Removal
      And Sort from most expensive to least expensive
      And Choose shopping filters
      And Check how many items are left in the desired criteria
      And Randomly select one of the products that meet the desired criteria
      Then Critical information of the selected product should appear