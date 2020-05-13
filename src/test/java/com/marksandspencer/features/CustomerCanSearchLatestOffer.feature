Feature: latest available Offer
  as a customer
  i want the ability to search the latest offer
  so that i can review the detail of selected items

  Scenario: latest offer search
    Given  i navigate to marksandspence homepage
    When i move on Offer menu
    And i click on polo shirt Buy 1 Get 1 free under menswear header
    And i click on Style menu
    And i click the check box of polo shits
    And i click on Done button
    And i click on Size menu
    And i click the check box of large
    And i click on Done button
    And i click on Colour menu
    And i click the check box of White
    And i click on the check box of Green
    And i click on Done button
    And i click on Pattern menu
    And i click the check box of plain
    And i click on Done button
    And i click on Pure CottonPoloshirt link
    Then detail pure cotton polo shirt is displayed

