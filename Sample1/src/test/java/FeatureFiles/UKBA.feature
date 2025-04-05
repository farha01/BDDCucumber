Feature: UKBA Automation

  @test1
  Scenario: Verify user needs UK visa
    Given I am on UKBA website
    And I choose country as "Ireland"
    And I click on continue button
    Then I should see the following message "You do not need a visa to come to the UK"


