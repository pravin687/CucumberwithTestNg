Feature: Login

  Scenario: Login with correct credentails
    Given Navigate to W3schhol url
    When insert username and passwprd and click on loginButton
    Then user should land on home page

  Scenario: Login with Wrong credentials
    Given Navigate to W3schhol url
    When insert  wrong username and passwprd and click on loginButton
    Then We should get a wrong credentails message
    But user should see login page
