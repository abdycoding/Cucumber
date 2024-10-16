Feature: CitizenShip Functionality

  Background: #Before Senaryo
    Given Navigate to Campus
    When Enter Username and password and click login button
    Then User should login successfully
    And Navigate to CitizenShip


  @RegressionTest @SmokeTest
  Scenario: Create a citizenShip
    When Create a citizenShip name as "mervli" code as "m157"
    Then Success message should be displayed
@RegressionTest
  Scenario: Create a citizenShip 2
    When Create a citizenShip name as "mervli" code as "m157"
    Then Already exists message should be displayed

  @RegressionTest
    Scenario: Delete a citizenShip

      When Search for a citizenship name as "mervli" and delete
      Then Success message should be displayed