Feature: Landing Page

  Scenario: To veify landing page
    Given user sucessfully loggedIn
    When get title
    Then verify landing page
