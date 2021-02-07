package com.hynial.pageobjects.homepage;

import com.hynial.framework.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaiduHomepage extends BasePage {
    private Logger logger = LoggerFactory.getLogger(BaiduHomepage.class);

    public BaiduHomepage(WebDriver driver) {
        super(driver);
        logger.info("this is baidu  home page {}", Thread.currentThread().getId());
    }
}
