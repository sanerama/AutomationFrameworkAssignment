
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: User is on blog.example.com test Users page
    Given User is on blog.example.com on Chrome browser
    When User navigates on blog.example.com/users
    Then User can see id,name,Avtar
    And not able to see other user information
  

 @tag1
  Scenario: User is on blog.example.com test Users page
   Given User is on blog.example.com on Chrome browser
    When User navigates on blog.example.com/users
    Then Array of users should get displayed