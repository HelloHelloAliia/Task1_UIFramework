@homeTests
Feature: Home page Tests


  @US100
  Scenario: Home page search field test
    Then Verify you can see search field


  @US100
  Scenario: Home page search field results test
    And I input "aws" in search field
    Then Verify results contain word "aws"
