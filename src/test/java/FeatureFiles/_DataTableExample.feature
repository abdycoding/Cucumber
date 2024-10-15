Feature: DataTable example

  Scenario: User write
    When Write username "Rashford"
    When Write username "Rashford" and password "1234"

    And Write username as DataTable
      | Marcus    |
      | Leo       |
      | Ronaldo   |
      | Fenomeno  |
      | Cristiano |

    And Write username and password as DataTable
      | Marcus    | 123 |
      | Leo       | 127 |
      | Ronaldo   | 126 |
      | Fenomeno  | 125 |
      | Cristiano | 124 |

    #  dataProvider (TestNG için), Senaryo Outline (cucumber)
 #  görevi verilen her değer için, tüm senaryo çalışır
 #
 #  DataTable ise , sadece bir step e, çoklu parametre vermek
 #  için kullanılır, sadece 1 kez tüm parametreleri stepin içine atar