Feature: Application login


  Scenario: Home page login
    Given User is on Risk Input home page
    When User logs in with valid "nala" and "passwOrd"
    Then User is logged in successfully
    Then User domain name displayed "true"

  Scenario: Home page login
    Given User is on Risk Input home page
    When User logs in with valid "penny" and "p@ssword"
    Then User is logged in successfully
    Then User domain name displayed "false"

  Scenario: Home page login
    Given User is on Risk Input home page
    When User signs up with valid details
    | sophy | marlboro | s.malboro@email.com | smP@word |
    Then User is logged in successfully
    Then User domain name displayed "true"

  Scenario Outline: Home page login
    Given User is on Risk Input home page
    When User logs into account with valid "<userName>" and "<passWord>"
    Then User is logged in successfully
    Then User domain name displayed "true"

    Examples:
    |userName|passWord|
    |user1    |p@sw0rd1 |
    |user2    |p@sw0rd2 |
    |user3    |p@sw0rd3 |
    |user4    |p@sw0rd4 |
    |user5    |p@sw0rd5 |
