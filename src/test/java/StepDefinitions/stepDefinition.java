package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinition {
    @Given("User is on Risk Input home page")
    public void User_is_on_risk_input_home_page() {
        System.out.println("User is on the login page");
    }
    @When("User logins in with valid username and password")
    public void user_logins_in_with_valid_username_and_password() {
        System.out.println("User enters valid login details");
    }
    @Then("User is logged in successfully")
    public void user_is_logged_in_successfully() {
        System.out.println("User is logged in");
    }
    @Then("User domain name is displayed")
    public void user_domain_name_is_displayed() {
        System.out.println("User domain name is visible!");
    }
}

