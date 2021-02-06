package com.hynial.cucumbertest.pages.base;

import com.hynial.cucumbertest.support.World;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected World world;

    // Initiate the Page Factory and create as abstract class, so
    // you can use for all the other Page Objects
    public BasePage(World world) {
        this.world = world;
        PageFactory.initElements(world.driver, this);
    }
}
