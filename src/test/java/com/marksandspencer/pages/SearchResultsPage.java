package com.marksandspencer.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SearchResultsPage extends BasePage {

    public SearchResultsPage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }





}
