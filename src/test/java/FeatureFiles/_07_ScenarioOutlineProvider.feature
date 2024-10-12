Feature: CitizenShip Functionality

  Background: #Before Senaryo
    Given Navigate to Campus
    When Enter Username and password and click login button
    Then User should login successfully
    And Navigate to CitizenShip

  Scenario Outline: Create a citizenShip
    When Create a citizenShip name as "<name>" code as "<shortName>"
    Then Success message should be displayed
    When Create a citizenShip name as "<name>" code as "<shortName>"
    Then Already exists message should be displayed
    When Search for a citizenship name as "<name>" and delete
    Then Success message should be displayed


    Examples:
      | name   | shortName |
      | Abdy12 | ra1234    |
      | Abdy13 | ra1233    |
      | Abdy14 | ra1232    |
      | Abdy15 | ra1235    |
      | Abdy16 | ra1236    |