Feature: User should be able to subscribe himself in newslener


  Scenario: Newsletter functionality

    Given user on homepage
    And user accept cookies
    And user subscribes newsletter as "testuser@tutusmedia.com"
    Then user unsubscribes from newsletter




