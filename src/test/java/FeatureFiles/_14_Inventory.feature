#Senaryo :
#  Inventory Bölümündeki
#  Item Categories Çalışmasını test ediniz
#  girişi yapıp , sonrasında silmesini yapınız

Feature: DataTable Functionality

  Background:
    Given Navigate to Campus
    When  Enter Username and password and click login button
    Then User should login successfully

  Scenario Outline:  Create Item Category and Delete

    And Click on the Element in LeftNav
      | inventory       |
      | setup2          |
      | item_categories |

    And Click on the Element in DialogCOntent
      | addButton |

    And User sending the keys in DialogContent
      | nameInput | <name> |

     And Click on the Element in DialogCOntent
       | userType   |
       | <type>     |
       | saveButton |

    Then Success message should be displayed

    And  User delete the element from dialog
      | <name> |

    Then Success message should be displayed

    Examples:
      | name      | type          |
      | kokoloo12 | Teacher       |
      | kokoloo13 | Student       |
      | kokoloo14 | Administrator |
      | kokoloo15 | Student       |
      | kokoloo16 | Teacher       |
