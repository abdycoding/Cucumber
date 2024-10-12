package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;

public class _03_CitizenShipSteps {
    LeftNav lv = new LeftNav();
    DialogContent dc = new DialogContent();

    @And("Navigate to CitizenShip")
    public void navigateToCitizenShip() {
        lv.myClick(lv.setup);
        lv.myClick(lv.parameters);
        lv.myClick(lv.citizenship);
    }

    @When("Create a CitizenShip")
    public void createACitizenShip() {
        String citizenShipName= RandomStringUtils.randomAlphanumeric(8); // 8 tane karisik harf
        String citizenshipShortName=RandomStringUtils.randomNumeric(4); // 4 tane karisik kod

        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.nameInput, citizenShipName);
        dc.mySendKeys(dc.shortName, citizenshipShortName);
        dc.myClick(dc.saveButton);

    }


    @When("Create a citizenShip name as {string} code as {string}")
    public void createACitizenShipNameAsCodeAs(String vatandaslik, String vtkodu) {


        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.nameInput, vatandaslik);
        dc.mySendKeys(dc.shortName, vtkodu);
        dc.myClick(dc.saveButton);

    }



    @Then("Already exists message should be displayed")
    public void alreadyExistsMessageShouldBeDisplayed() {
        dc.verifyMessageContainsText("already");
    }

    @When("Search for a citizenship name as {string} and delete")
    public void searchForACitizenshipNameAsAndDelete(String value) {
      dc.deleteItem(value);

    }



}
