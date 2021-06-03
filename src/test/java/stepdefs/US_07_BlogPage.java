package stepdefs;

import com.codeborne.selenide.Condition;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.messages.Messages;
import org.openqa.selenium.By;
import utils.Locators;


import java.util.List;
import java.util.Map;

import static com.codeborne.selenide.Selenide.*;

public class US_07_BlogPage extends Locators {

    @And("Navigate to blogs page")
    public void navigateToBlogsPage() {

        sleep(2000);
        $(By.xpath("(//a[@title='Blog'])[2]")).click();
        $(By.xpath("(//*[contains(text(), 'BLOG')])[1]")).shouldBe(Condition.appear);
        System.out.println("BLOG Screiben wird gesehen");


    }

    @Then("User searches in blog a word as in data")
    public void userSearchesInBlogAWordAsInData() {

        sleep(2000);
//        $(By.xpath("//span[text()='Mehr erfahren...']")).click();
        $(".search-box input").shouldBe(Condition.visible).setValue("Heute");
        $(".search-box ul li",0).shouldBe(Condition.exist).scrollTo().click();

    }

    @And("User should be able to add review for any blog")
    public void Usershouldbeabletoaddreviewforanyblog(DataTable datatable) {

        List<Map<String, String>> maps = datatable.asMaps(String.class, String.class);

        for (Map<String, String> map : maps) {

            $(vorUndNachnamescroll).scrollTo();
            refresh();
            $(vorUndNachname).setValue(map.get("name"));
            $(emailAdresse).setValue(map.get("email"));
            $(kommentar).setValue("kommentar");
            $(ratingstars4).click();
            $(bewertungSendenButton).scrollTo().click();
            $$(errorNotifications).shouldHaveSize(Integer.parseInt(map.get("errorNumber")));

            // 1. Yöntem

            if (map.get("errorNumber").equals("0")) {

                $(alertSuccess)
                        .scrollTo()
                        .shouldBe(Condition.visible)
                        .shouldHave(Condition.attributeMatching("class", ".*success.*"));//basinda sonunda birden fazla char olabilir demek.

            } else if (map.get("errorNumber").equals("1")) {

                $(errorNotifications).scrollTo().shouldBe(Condition.visible)
                        .shouldHave(Condition.attributeMatching("class", ".*validation.*"));

            } else if (map.get("errorNumber").equals("2")) {

                $(errorNotifications).scrollTo().shouldBe(Condition.visible)
                        .shouldHave(Condition.attributeMatching("class", ".*validation.*"));
            }

        }

    }


}



            // 2. Yöntem

//            switch (map.get("errorNumber")) {
//
//                case "0":
//                    $(alertSuccess)
//                            .shouldBe(Condition.visible)
//                            .shouldHave(Condition.attributeMatching("class", ".*success.*"));
//                    break;
//
//                case "1":
//                    $(errorNotifications).shouldBe(Condition.visible)
//                            .shouldHave(Condition.attributeMatching("class", ".*validation.*"));
//
//                case "2":
//                    $(errorNotifications).shouldBe(Condition.visible)
//                            .shouldHave(Condition.attributeMatching("class", ".*validation.*"));
//            }




            // 3. Yöntem

//        $(vorUndNachnamescroll).scrollTo();
//        $(vorUndNachname).sendKeys("TechnoStudyTest");
//        $(emailAdresse).sendKeys("technotest@gmail.com");
//        $(kommentar).sendKeys("TechnoComment");
//        $(ratingstars4).click();
//        $(bewertungSendenButton).scrollTo().click();
//        $(succesfullyMessage).scrollTo().shouldBe(Condition.visible);
//        System.out.println("Kommentar message wird gesehen");

//        refresh();
//        $(vorUndNachname).sendKeys("");
//        $(emailAdresse).sendKeys("technotest@gmail.com");
//        $(kommentar).sendKeys("TechnoComment");
//        $(ratingstars3).click();
//        $(bewertungSendenButton).scrollTo().click();
//        $(ErrorMessage).scrollTo().shouldBe(Condition.visible);
//        System.out.println("Error message des Names wird gesehen");

//        refresh();
//        $(vorUndNachname).sendKeys("TechnoStudyTest");
//        $(emailAdresse).sendKeys("technotestgmail.com");
//        $(kommentar).sendKeys("TechnoComment");
//        $(ratingstars2).click();
//        $(bewertungSendenButton).scrollTo().click();
//        $(ErrorMessage).scrollTo().shouldBe(Condition.visible);
//        System.out.println("Error message des E-Mails wird gesehen");








