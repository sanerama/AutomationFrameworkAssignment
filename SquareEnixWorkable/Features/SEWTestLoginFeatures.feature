@tag
Feature: Testing Login Page
  I want to use this template for my feature file

  @tag1
  Scenario: Test Login functionality of blog.example.com
    Given User is on blog.example.com on Chrome browser
    When User clicks on login button
    And User Enters valid username as'Johnny5'
    And User Enters valid password as 'qwerty'
    And User Submits details
    Then User navigates to user's homepage 

  @tag1
   Scenario: Test login functionality on blog.example.com/login with no data
    Given User is on blog.example.com on Chrome browser
    When User clicks on login button
    And User Enters no username as''
    And User Enters no password as ''
    And User Submits details
    Then User is represented with error msg 
  
   @tag1
  Scenario: Test login functionality on blog.example.com/login with valid user ID ,Invalid password
    Given User is on blog.example.com on Chrome browser
    When User clicks on login button
    And User Enters valid username as'Johnny5'
    And User Enters invalid password
    And User Submits details
    Then User is represented with error msg
  
   @tag1
 Scenario: Test login functionality on blog.example.com/login with Invalid user ID ,valid password
    Given User is on blog.example.com on Chrome browser
    When User clicks on login button
    And User Enters Invalid username 
    And User Enters valid password as 'qwerty'
    And User Submits details
    Then User navigates to user's homepage 
    
    Then User is represented with error msg
  