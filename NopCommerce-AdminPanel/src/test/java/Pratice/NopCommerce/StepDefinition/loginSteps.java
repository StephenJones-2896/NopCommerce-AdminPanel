package Pratice.NopCommerce.StepDefinition;

import Pratice.NopCommerce.Hooks.baseclass;
import io.cucumber.java.en.*;

public class loginSteps extends baseclass{

	@Given("User open the browser & open the website using link {string}")
	public void user_open_the_link(String link) {
		Driver.get(link);
	}

	@Given("Entered username as {string}")
	public void entered_username_as(String username) {
	    lp.emailact(username);
	}

	@Given("Entered password as {string}")
	public void entered_password_as(String psword) {
	    lp.passwordact(psword);
	}

	@Then("click the Login button")
	public void click_the_login_button() {
	    lp.loginact();
	}

	
	
}
