package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

public class _04_StatesSteps {
    LeftNav lv=new LeftNav();
    DialogContent dc=new DialogContent();

    @And("Navigate to States")
    public void navigateToStates() {
        lv.myClick(lv.setup);
        lv.myClick(lv.parameters);
        lv.myClick(lv.states);

    }


    @When("Create a state name as {string} code as {string}")
    public void createAStateNameAsCodeAs(String state, String shortName) {
        dc.myClick(dc.addButton);
        dc.myClick(dc.countrySelect);
        dc.myClick(dc.nePal);
//        dc.mySendKeys(dc.countrySelect, "N"+ Keys.ENTER);

//        Select country=new Select(dc.countrySelect);
//        country.selectByIndex(109);
        dc.mySendKeys(dc.nameInput,state);
        dc.mySendKeys(dc.shortName, shortName);
        dc.myClick(dc.saveButton);





    }

    @When("Search and Edit a state name as {string}")
    public void searchAndEditAStateNameAs(String state) {

      dc.mySendKeys(dc.searchInput, state);
      dc.myClick(dc.searchButton);
      dc.myClick(dc.edit);
        dc.mySendKeys(dc.nameInput,state);
        dc.myClick(dc.saveButton);


    }

    @Then("Successfully updated message should be displayed")
    public void successfullyUpdatedMessageShouldBeDisplayed() {
        dc.verifyMessageContainsText("update");
    }

    @When("Search for a state name as {string} and delete")
    public void searchForAStateNameAsAndDelete(String state) {


    }
}
