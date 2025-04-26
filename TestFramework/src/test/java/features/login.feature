Feature: Login Functionality
  @smoke
  Scenario: Successful Login
    Given User is on the login page
    When User enters valid credentials
    Then User should be redirected to the dashboard
    Then User should close the browser

  @regression
  Scenario: Successful Login3
    Given User is on the login page
    When User enters valid credentials
    Then User should be redirected to the dashboard
    Then User should close the browser

  @regression
    Scenario: Verify Homepage Practice Tab
      Given User is on the login page
      When User enters valid credentials
      Then User should be redirected to the dashboard
      Then User should click on Practice Tab
      Then User should close the browser

