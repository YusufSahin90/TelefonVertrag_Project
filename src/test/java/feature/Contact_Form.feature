Feature: User should be able to use contact form with required fields at PC mode


  Scenario: Contact form functionality

    Given user on homepage
    And user accept cookies
    And user navigates to Contact page
    When user fills the form as follow
      | name   | email                    | subject | news | errorNumber |
      |        | tutustest@tutusmedia.com | test    |      | 2           |
      | Techno |                          | test    | test | 1           |
      | Techno | tutustesttutusmedia.com  | test    | test | 1           |
      | Techno | tutustest@tutusmedia.com | test    | test | 0           |




