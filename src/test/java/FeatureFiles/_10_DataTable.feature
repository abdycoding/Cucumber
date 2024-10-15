Feature: DataTable Functionality

  Background:
    Given Navigate to Campus
    When  Enter Username and password and click login button
    Then User should login successfully

    Scenario: Create a Country

      And Click on the Element in LeftNav
        | setup      |
        | parameters |
        | countries  |

      And Click on the Element in DialogCOntent
      |addButton|

      And  User sending the keys in DialogContent
        | nameInput | randomCountry1 |
        | codeInput | r1234          |

      And Click on the Element in DialogCOntent
      |saveButton|

      Then Success message should be displayed

      And User delete the element from dialog
        | randomCountry1 |

      Then  Success message should be displayed



  Scenario: Create a Fee

    And Click on the Element in LeftNav
      | setup      |
      | parameters |
      | fees       |

    And Click on the Element in DialogCOntent
      |addButton|

    And  User sending the keys in DialogContent
      | nameInput       | randomCountry1 |
      | codeInput       | r1234          |
      | integrationCode | 111            |
      | priority        | 158            |

    And Click on the Element in DialogCOntent
      | toggleBar |
      | saveClose |

    Then Success message should be displayed

    And User delete the element from dialog
      | randomCountry1 |

    Then  Success message should be displayed

