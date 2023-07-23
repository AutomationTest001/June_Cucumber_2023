#Author: testuser@your.domain.com
#Module : Login
#Date : 15th July 2023
Feature: Login Functionality

@LoginValid
  Scenario: Test Case to verify Login functionality with valid username and password
    Given Browser should be open with login page
    When User should enter Username and Password and click on login button
    Then Home Page should get open and verify page title
