
@ttag
Feature: Test user page
  I want to use this template for my feature file

  @tag1
  Scenario: Test user on blog.example.com 
    Given User is on blog.example.com on Chrome browser
    When User clicks on login button
    And User Enters valid username as'Johnny5'
    And User Enters valid password as 'qwerty'
    And User Submits details
    Then User can see id,name,Avtar
    And User can see Additional two Fields as Address and Email

 