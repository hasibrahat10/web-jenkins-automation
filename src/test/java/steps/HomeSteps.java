package steps;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HomePage;

public class HomeSteps extends TestSetup{
    @Then("Enter a text input {string} in the search box")
    public void enter_a_text_input_in_the_search_box(String text) {
    new HomePage().srchText(text);
    }

    @Then("Click on search button")
    public void click_on_search_button() {
     new HomePage().clickSearch();
    }

    @Then("Search result will be listed as {string}")
    public void search_result_will_be_listed_as(String result) {
        Assert.assertEquals(result, new HomePage().searchResultDisplay());
    }

}
