Feature: Country Functionality

  Scenario: Create a country

    Given Navigate to Campus
    When Enter Username and password and click login button
    Then User should login successfully
    And Navigate to Country

  Scenario Outline:  Create a Country
    When Create a country name as "<name>" code as "<shortName>"
    Then Success message should be displayed
    When Search for a country name as "<name>" code as "<shortName>"and delete
    Then  Success message should be displayed



    Examples:
      | name       | shortName |
      | dashoguz   | dz12      |
      | dashoguz1  | dz123     |
      | dashoguz12 | dz124     |
      | dashoguz13 | dz125     |
      | dashoguz14 | dz126     |
