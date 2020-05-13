package com.marksandspencer.hooks;

import com.marksandspencer.common.Browsers;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends Browsers {

    @Before
    public void setup(){
        launchBrowser("Chrome");
    }

    @After
    public void tearDown(){
        closeBrowser();
    }
}
