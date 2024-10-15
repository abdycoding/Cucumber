Feature: DataTable Functionality

  Background:
    Given Navigate to Campus
    When  Enter Username and password and click login button
    Then User should login successfully

  Scenario: Create a City

    And Click on the Element in LeftNav
      | setup      |
      | parameters |
      | cities     |

    And Click on the Element in DialogCOntent
      | addButton |
      | country   |
      | nepal     |

    And  User sending the keys in DialogContent
      | nameInput | randomCouy1 |


    And Click on the Element in DialogCOntent
      | saveButton |

    Then Success message should be displayed

    And Click on the Element in DialogCOntent
      | addButton |
      | country   |
      | nepal     |

    And  User sending the keys in DialogContent
      | nameInput | randomCouy1 |


    And Click on the Element in DialogCOntent
      | saveButton |

    Then Already exists message should be displayed


    And User delete the element from dialog
      | randomCountry1 |

    Then  Success message should be displayed

