#Author: testuser@your.domain.com
#Module : Calculator Data Driven
#Date : 16th July 2023

Feature: Calculator Functionality

  Scenario Outline: Test Case to verify Calculator functionality
  
  
    Given Open firefox and navigate to calculate page
    When Enter two numbers "<firstNumber>" and "<secondNumber>" with operator "<operator>"
    Then Validate output "<Result>"

    Examples: 
      | firstNumber | secondNumber | operator | Result |
      |           4 |            3 | +        |      7 |
      |           8 |            2 | -        |      7 |
      |           3 |            4 | *        |     12 |