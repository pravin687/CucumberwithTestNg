Feature: Landing page

  Scenario: Test land page
    Given user sucessfully loggedIn
    When get title
    Then verify landing page
