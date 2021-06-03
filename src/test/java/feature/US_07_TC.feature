Feature: User should be able to reach blogs in the page

  @SmokeTest
  Scenario: Blog Page functionality

    Given user on homepage
    And Navigate to blogs page
    Then User searches in blog a word as in data
    And User should be able to add review for any blog
      | name            | email                | kommentar     | errorNumber |
      | TechnoStudyTest | technotest@gmail.com | TechnoComment | 0           |
      |                 | technotest@gmail.com | TechnoComment | 1           |
      |                 |                      | TechnoComment | 2           |

