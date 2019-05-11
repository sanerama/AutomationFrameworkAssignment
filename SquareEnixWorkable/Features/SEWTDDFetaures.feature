

Feature: TDD based files
  I want to use this template for my feature file

#will add @tag only once development is completed
  Scenario: Adding 'boi' field to user public profile
    User is on blog.example.com test Users page
    Given User is on blog.example.com on Chrome browser
    When User navigates on blog.example.com/users
    Then User can see id,name,Avtar
    And User can see additional 'boi' field

 