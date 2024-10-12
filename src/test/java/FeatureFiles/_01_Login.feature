#Login fonksiyon Kontrolu
  # Once Siteye git(driver get)
  #Sonra Login bilgilerini gir (username password)
  # Sonra giris yaptigini kontrol et(verify, Assert)

  Feature: Login Functionality

    Scenario: Login with valid username and password

      Given Navigate to Campus
      When Enter Username and password and click login button
      Then User should login successfully

