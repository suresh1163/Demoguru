@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Title of your scenario
    Given customer on booking page
    When enter booking detials
    |suresh|D|suresh@gmail.com|chennai|8877546809|
    Then customer see ID
    
@tag2
  Scenario Outline: Title of your scenario outline
    Given customer on booking page
    When enter details"<firstname>","<lastname>","<email>","<address>","<mobile>"
    Then customer see ID
  
    Examples: 
      |firstname | lastname | email            |address       |mobile    |
      | udhay    | M        | udhay@gmail.com  |thiruvanamalai|9876543768|
      | dinesh   | kumar    | dinesh@gmail.com |pallavaram    | 764808648|
    