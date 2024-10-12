#Senaryo
#CitizenShip sayfasına gidiniz.
#Create işlemini parameter yöntemi ile 2 farklı senaryo ile kayıt yapınız.

Feature: CitizenShip Functionality

  Background: #Before Senaryo
    Given Navigate to Campus
    When Enter Username and password and click login button
    Then User should login successfully
    And Navigate to CitizenShip

  Scenario: Create a citizenShip
    When Create a citizenShip name as "Nigerian" code as "I57"
    Then Success message should be displayed

  Scenario: Create a citizenShip 2
    When Create a citizenShip name as "Malaysian" code as "M23"
    Then Success message should be displayed


