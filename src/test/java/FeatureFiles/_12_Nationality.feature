Feature: DataTable Functionality

  Background:
    Given Navigate to Campus
    When  Enter Username and password and click login button
    Then User should login successfully

  Scenario Outline:  Create Nationality and Delete

    And Click on the Element in LeftNav
      | setup         |
      | parameters    |
      | nationalities |

    And Click on the Element in DialogCOntent
      | addButton |

    And Click on the Element in DialogCOntent
      | nameInput | <name> |

    And User sending the keys in DialogContent
      | saveButton |

    Then Success message should be displayed

    And  User delete the element from dialog
      | <name> |

    Then Success message should be displayed

    Examples:
      | name      |
      | kokoloo12 |
      | kokoloo13 |
      | kokoloo14 |
      | kokoloo15 |
      | kokoloo16 |
