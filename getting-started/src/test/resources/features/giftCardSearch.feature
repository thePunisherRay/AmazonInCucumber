Feature: Test for Gift Card

  Scenario: Searching for gift cards
    Given User is on Amazon web page
    When User selects Gift Cards from search drop down
    And Clicks search button
    Then Navigation contains Gift Cards

    When User clicks on eGift card Type
    Then Gift card store is displayed on Webpage

    When User Selects Parents as reciepient
    Then Monthers day should appear under occasion

    And User selects Filter as "Low to High"
    Then User selects the first product

    When User clicks on 500
    And Clicks on Add to cart
    Then Amount added should be displayed
