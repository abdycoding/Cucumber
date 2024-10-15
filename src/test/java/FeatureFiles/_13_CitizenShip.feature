Feature: DataTable Functionality

  Background:
    Given Navigate to Campus
    When  Enter Username and password and click login button
    Then User should login successfully

  Scenario Outline:  Create Nationality and Delete

    And Click on the Element in LeftNav
      | setup       |
      | parameters  |
      | citizenship |

    And Click on the Element in DialogCOntent
      | addButton |

    And User sending the keys in DialogContent
      | nameInput | <name>      |
      | shortName | <shortName> |


    And Click on the Element in DialogCOntent
      | saveButton |

    Then Success message should be displayed

    And  User delete the element from dialog
      | <name>      |
      | <shortName> |

    Then Success message should be displayed

    Examples:
      | name      | shortName |
      | kokoloo12 | lolo1234  |
      | kokoloo13 | lolo1235  |
      | kokoloo14 | lolo1236  |
      | kokoloo15 | lolo1237  |
      | kokoloo16 | lolo1238  |
