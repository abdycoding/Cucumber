package StepDefinitions;

import Pages.DialogContent;
import Utilities.ExcelUtility;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;

public class _06_ApachePOISteps {
    DialogContent dc=new DialogContent();
    @When("Create citizenship with ApachePOI")
    public void createCitizenshipWithApachePOI() {
        ArrayList<ArrayList<String>> table= ExcelUtility.getData(
                "src/test/java/ApachePOI/resource/ApacheExcel2.xlsx",
                "testCitizen",
                2);

        for (ArrayList<String> row:table){
            dc.myClick(dc.addButton);
            dc.mySendKeys(dc.nameInput, row.get(0));
            dc.mySendKeys(dc.shortName, row.get(1));
            dc.myClick(dc.saveButton);
            dc.verifyMessageContainsText("success");
        }

    }

    @Then("Delete citizenship with ApachePOI")
    public void deleteCitizenshipWithApachePOI() {

        ArrayList<ArrayList<String>> table= ExcelUtility.getData(
                "src/test/java/ApachePOI/resource/ApacheExcel2.xlsx",
                "testCitizen",
                1);

        for (ArrayList<String> row:table){
            dc.deleteItem(row.get(0));
            dc.verifyMessageContainsText("success");
        }

    }
}
