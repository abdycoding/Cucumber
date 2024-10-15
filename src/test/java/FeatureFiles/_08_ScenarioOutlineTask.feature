Feature: States Functionality

  Background:
    Given Navigate to Campus
    When Enter Username and password and click login button
    Then User should login successfully
    And Navigate to States

  Scenario Outline:  Create a State
    When Create a state name as "<name>" code as "<shortName>"
    Then Success message should be displayed
    When Search and Edit a state name as "<updatePart>"
    Then Successfully updated message should be displayed
    When Search for a state name as "<updatePart>" and delete
    Then  Success message should be displayed



    Examples:
      | name       | shortName | updatePart |
      | dashoguz   | dz12      | mary12     |
      | dashoguz1  | dz123     | mary123    |
      | dashoguz12 | dz124     | mary124    |
      | dashoguz13 | dz125     | mary125    |
      | dashoguz14 | dz126     | mary126    |
