@tag
Feature: Test No of elements dispayed
  I want to use this template for my feature file

  @tag1
  Scenario: Test No of Elements if n=10
    Given User is on Chrome browser
    When User is on content.example.com
    Then User should able to see 10 entries

  @tag1
  Scenario: Test No of default elements present on the page
    Given User is on Chrome browser
    When User is on content.example.com
    Then User should able to see 20 entries