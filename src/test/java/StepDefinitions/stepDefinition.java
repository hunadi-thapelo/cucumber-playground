package StepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class stepDefinition {
    @Given("User is on Risk Input home page")
    public void User_is_on_risk_input_home_page() {
        System.out.println("User is on the login page");
    }
    @When("User logins in with valid {string} and {string}")
    public void user_logins_in_with_valid_and(String string, String string2) {
        System.out.println(string);
        System.out.println(string2);
    }
    @Then("User is logged in successfully")
    public void user_is_logged_in_successfully() {
        System.out.println("User is logged in");
    }
    @Then("User domain name displayed {string}")
    public void user_domain_name_displayed(String string) {
        System.out.println("Domain name is displayed is "+string);
    }
    @When("User signs up with valid details")
    public void user_signs_up_with_valid_details(DataTable dataTable)//DataTable type parameter for multiple data we're working with
    {
        List<List<String>> credList = dataTable.asLists();
        System.out.println(credList.get(0).get(0));//1st get represents row (in example we're working with one row), 2nd get is column number
        System.out.println(credList.get(0).get(1));
        System.out.println(credList.get(0).get(2));
        System.out.println(credList.get(0).get(3));
    }
}

