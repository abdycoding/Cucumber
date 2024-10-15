package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _05_DataTableSteps {

    LeftNav lv=new LeftNav();
    DialogContent dc=new DialogContent();
    @And("Click on the Element in LeftNav")
    public void clickOnTheElementInLeftNav(DataTable dtUsers) {


        List<String> links=dtUsers.asList();

        for (int i = 0; i < links.size() ; i++) {
            lv.myClick(lv.getWebElement(links.get(i)));

        }
    }

    @And("Click on the Element in DialogCOntent")
    public void clickOnTheElementInDialogCOntent(DataTable dtButtons) {

        List<String> buttons=dtButtons.asList();

        for (int i = 0; i <buttons.size() ; i++) {
            lv.myClick(dc.getWebElement(buttons.get(i)));

        }

    }

    @And("User sending the keys in DialogContent")
    public void userSendingTheKeysInDialogContent(DataTable dtBoxandWritings) {

        List<List<String>> boxandWriting=dtBoxandWritings.asLists();
        for (int i = 0; i < boxandWriting.size(); i++) {
            WebElement box=dc.getWebElement(boxandWriting.get(i).get(0));
            dc.mySendKeys(box, boxandWriting.get(i).get(1));

        }

    }

    @And("User delete the element from dialog")
    public void userDeleteTheElementFromDialog(DataTable dtDeletedData) {
        List<String>deleted=dtDeletedData.asList();
        for (int i = 0; i < deleted.size(); i++) {
            dc.deleteItem(deleted.get(i));
    }
}}
