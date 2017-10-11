package stepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step1 {

@Given("^open firefox and start application$")
public void open_firefox_and_start_application() throws Throwable {
  System.out.println("open firefox");
}

@When("^I enter valid \"([^\"]*)\" and valid \"([^\"]*)\"$")
public void I_enter_valid_and_valid(String username, String password) throws Throwable {
   System.out.println("username :" +username +"password:"+password);
}

@Then("^user should be able to login successfully$")
public void user_should_be_able_to_login_successfully() throws Throwable {
	System.out.println("user logged in succesfully");
}

}
