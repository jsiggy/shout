package training.bdd;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefs {
    @Given("^Lucy is (\\d+)m from Sean$")
    public void lucy_is_m_from_Sean(int arg1) throws Throwable {
        throw new PendingException();
    }

    @When("^Sean shouts \"([^\"]*)\"$")
    public void sean_shouts(String arg1) throws Throwable {
        throw new PendingException();
    }

    @Then("^Lucy hears Sean's message$")
    public void lucy_hears_Sean_s_message() throws Throwable {
        throw new PendingException();
    }
}
