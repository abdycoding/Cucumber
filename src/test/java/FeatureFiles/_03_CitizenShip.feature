#Senaryo
#Citizenships sayfasına gidiniz.
#1 adet Citizenships kaydı yapılabildiğini doğrulayınız.

Feature: CitizenShip Functionality

  Scenario: Create a citizenShip

    Given Navigate to Campus
    When Enter Username and password and click login button
    Then User should login successfully
    And Navigate to CitizenShip
    When Create a CitizenShip
    Then Success message should be displayed