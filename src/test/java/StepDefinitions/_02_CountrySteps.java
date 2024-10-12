package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;

public class _02_CountrySteps {
    LeftNav lv = new LeftNav();
    DialogContent dc = new DialogContent();


    @And("Navigate to Country")
    public void navigateToCountry() {
        lv.myClick(lv.setup);
        lv.myClick(lv.parameters);
        lv.myClick(lv.countries);
    }

    @When("Create a country")
    public void createACountry() {
        String ulkeAdi= RandomStringUtils.randomAlphanumeric(8); // 8 tane karisik harf
        String ulkeKodu=RandomStringUtils.randomNumeric(4); // 4 tane karisik kod


        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.nameInput, ulkeAdi);
        dc.mySendKeys(dc.codeInput, ulkeKodu);
        dc.myClick(dc.saveButton);
        /*
        + butonuna bas
        isim ve kodu gonder
        kaydet butonuna bas
         */
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        // kaydoldu mesajini kontrol et
        dc.verifyMessageContainsText("success");
    }

    @When("Create a country name as {string} code as {string}")
    public void createACountryNameAsCodeAs(String ulkeAdi, String ulkeKodu) {
        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.nameInput, ulkeAdi);
        dc.mySendKeys(dc.codeInput, ulkeKodu);
        dc.myClick(dc.saveButton);


    }
}
