package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static com.codeborne.selenide.Selenide.*;
import static utils.Locators.*;

public class NewsletterSteps {
    @Then("user unsubscribes from newsletter")
    public void userUnsubscribesFromNewsletter() {


    }

    @And("user subscribes newsletter as {string}")
    public void userSubscribesNewsletterAs(String mail) {
        $(newsletterEmailRegistrationInput).scrollTo().setValue(mail);
        $(newsletterEmailRegistrationButton).click();


    }
}
