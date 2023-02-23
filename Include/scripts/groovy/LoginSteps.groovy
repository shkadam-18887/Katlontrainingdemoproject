import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



















public class LoginSteps {

	@Given("user is on login page Precondition")
	public void user_is_on_login_page_Precondition() {
		println "I am inside Given"
	}

	@When("user enters valid username and password Action")
	public void user_enters_valid_username_and_password_Action() {
		println "I am inside When"
	}

	@And("clicks on login button some more action")
	public void clicks_on_login_button_some_more_action() {
		println "I am inside And"
	}

	@Then("user is navigated to home page Expected")
	public void user_is_navigated_to_home_page_Expected() {
		println "I am inside Then"
	}
}
