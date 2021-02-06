package com.hynial.test.homepage;

import com.hynial.framework.core.BaseTest;
import com.hynial.pageobjects.homepage.BaiduHomepage;
import org.testng.annotations.Test;

public class BaiduHomepageTests extends BaseTest {

    @Test
    public void homepageTests() {
        BaiduHomepage googleHomepage = new BaiduHomepage(getDriver());
    }
}
