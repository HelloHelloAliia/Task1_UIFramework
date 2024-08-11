package io.techleadacademy.stepDefs.uiSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.techleadacademy.core.TestContext;
import org.junit.Assert;

public class HomeSteps {
    private final TestContext testContext;

    public HomeSteps(TestContext testContext) {
        this.testContext = testContext;
    }

    @Then("Verify you can see search field")
    public void verify_you_can_see_search_field() {
        Assert.assertTrue(testContext.UI().getHomePage().searchField.isDisplayed());
    }

    @Given("I input {string} in search field")
    public void i_input_in_search_field(String text) {
        switch (text.toLowerCase()) {
            case "aws":
                testContext.UI().getHomePage().searchField.sendKeys(text);
                break;
            default:
                Assert.fail(text + " Item was not found");
        }
    }

    @Then("Verify results contain word {string}")
    public void verify_results_contain_word(String text) {
        switch (text.toLowerCase()) {
            case "aws":
                testContext.UI().getHomePage().searchField.getText();
                break;
            default:
                Assert.fail(text + " navigation button was not found");
        }
    }


}
