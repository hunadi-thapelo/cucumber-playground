Feature: Application login
  Scenario: Home page login
    Given User is on Risk Input home page
    When User logins in with valid username and password
    Then User is logged in successfully
    Then User domain name is displayed