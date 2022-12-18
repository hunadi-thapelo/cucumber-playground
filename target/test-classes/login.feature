Feature: Application login


  Scenario: Home page login
    Given User is on Risk Input home page
    When User logins in with valid "nala" and "passwOrd"
    Then User is logged in successfully
    Then User domain name displayed "true"

  Scenario: Home page login
    Given User is on Risk Input home page
    When User logins in with valid "penny" and "p@ssword"
    Then User is logged in successfully
    Then User domain name displayed "false"

  Scenario: Home page login
    Given User is on Risk Input home page
    When User signs up with valid details
    | sophy | marlboro | s.malboro@email.com | smP@word |
    Then User is logged in successfully
    Then User domain name displayed "true"