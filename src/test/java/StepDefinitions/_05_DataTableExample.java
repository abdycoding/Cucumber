package StepDefinitions;

import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import java.util.List;

public class _05_DataTableExample {
    LeftNav lv=new LeftNav();

    @When("Write username {string}")
    public void writeUsername(String username) {
        System.out.println(username);
    }

    @When("Write username {string} and password {string}")
    public void writeUsernameAndPassword(String username, String password) {
        System.out.println(username+ " " + password);

    }

    @And("Write username as DataTable")
    public void writeUsernameAsDataTable(DataTable dtUsers) {
        List<String> listUsers=dtUsers.asList();

        for (String user:listUsers)
            System.out.println(user);


    }

    @And("Write username and password as DataTable")
    public void writeUsernameAndPasswordAsDataTable(DataTable dtUsers) {
    List<List<String>> listUserPass=dtUsers.asLists();

        for (int i = 0; i < listUserPass.size(); i++) {
            System.out.println(listUserPass.get(i).get(0) + " " + listUserPass.get(i).get(1));

        }

    }


}
