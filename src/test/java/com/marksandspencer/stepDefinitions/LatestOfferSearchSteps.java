package com.marksandspencer.stepDefinitions;

import com.marksandspencer.pages.BasePage;
import com.marksandspencer.pages.HomePage;
import com.marksandspencer.pages.SearchResultsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class LatestOfferSearchSteps extends BasePage {

    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    SearchResultsPage searchResultsPage = PageFactory.initElements(driver, SearchResultsPage.class);



    @Given("i navigate to marksandspence homepage")
    public void i_navigate_to_marksandspence_homepage() {
        launchUrl();
    }

    @When("i move on Offer menu")
    public void i_move_on_Offer_menu() {

    }

    @When("i click on polo shirt Buy {int} Get {int} free under menswear header")
    public void i_click_on_polo_shirt_Buy_Get_free_under_menswear_header(Integer int1, Integer int2) {

    }

    @When("i click on Style menu")
    public void i_click_on_Style_menu() {

    }

    @When("i click the check box of polo shits")
    public void i_click_the_check_box_of_polo_shits() {

    }

    @When("i click on Done button")
    public void i_click_on_Done_button() {

    }

    @When("i click on Size menu")
    public void i_click_on_Size_menu() {

    }

    @When("i click the check box of large")
    public void i_click_the_check_box_of_large() {

    }

    @When("i click on Colour menu")
    public void i_click_on_Colour_menu() {

    }

    @When("i click the check box of White")
    public void i_click_the_check_box_of_White() {

    }

    @When("i click on the check box of Green")
    public void i_click_on_the_check_box_of_Green() {

    }

    @When("i click on Pattern menu")
    public void i_click_on_Pattern_menu() {

    }

    @When("i click the check box of plain")
    public void i_click_the_check_box_of_plain() {

    }

    @When("i click on Pure CottonPoloshirt link")
    public void i_click_on_Pure_CottonPoloshirt_link() {

    }

    @Then("detail pure cotton polo shirt is displayed")
    public void detail_pure_cotton_polo_shirt_is_displayed() {

    }



}
