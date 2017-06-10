package training.bdd;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Stepdefs {

    private Person sean;
    private Person lucy;
    private String messageShouted;

    @Given("^Lucy is (\\d+)m from Sean$")
    public void lucy_is_m_from_Sean(int distance) throws Throwable {

        sean = new Person();
        sean.setLocation(0);

        lucy = new Person();
        lucy.setLocation(distance);
    }

    @When("^Sean shouts \"([^\"]*)\"$")
    public void sean_shouts(String message) throws Throwable {
        sean.shouts(message);
        messageShouted = message;
    }

    @Then("^Lucy hears Sean's message$")
    public void lucy_hears_Sean_s_message() throws Throwable {
        assertEquals(Arrays.asList(messageShouted), lucy.getMessagesHeard());
    }
}
