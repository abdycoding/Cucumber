Feature: CitizenShip Functionality

  Background: #Before Senaryo
    Given Navigate to Campus
    When Enter Username and password and click login button
    Then User should login successfully
    And Navigate to CitizenShip

    Scenario: Create and Delete Citizenship from excel
      When Create citizenship with ApachePOI
      Then Delete citizenship with ApachePOI