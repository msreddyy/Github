package Steps;


import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {
   /* @Given("User should be logged in and should be present at its own wall")
    public void userShouldBeLoggedInAndShouldBePresentAtItsOwnWall() {
        System.out.println("User should be logged in and should be present at its own wall");
    }

    @When("I type the message in the text box")
    public void iTypeTheMessageInTheTextBox() {
        System.out.println("I type the message in the text box");
    }

    @And("Click on post button")
    public void clickOnPostButton() {
        System.out.println("Click on post button");
    }

    @Then("the message should get posted")
    public void theMessageShouldGetPosted() {
        System.out.println("the message should get posted");
    }
*/



    @Given("^User should be logged in and should be present at its own wall$")
    public void user_should_be_logged_in_and_should_be_present_at_its_own_wall() throws Throwable {
        System.out.println("User should be logged in and should be present at its own wall");
    }

    @When("^I type the message in the text box$")
    public void i_type_the_message_in_the_text_box() throws Throwable {
        System.out.println("I type the message in the text box");
    }

    @And("^Click on post button$")
    public void click_on_post_button() throws Throwable {
        System.out.println("Click on post button");
        System.out.println("This is the Modified Part of it");

    }

    @Then("^the message should get posted$")
    public void the_message_should_get_posted() throws Throwable {
        System.out.println("the message should get posted");
    }



}

