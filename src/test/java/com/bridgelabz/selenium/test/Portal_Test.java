package com.bridgelabz.selenium.test;

import com.bridgelabz.selenium.base.BaseClass;
import com.bridgelabz.selenium.pages.BlogPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Portal_Test extends BaseClass {

    @Test
    public void portal_test() throws InterruptedException {
        BlogPage blog_page = new BlogPage(driver);
        String  actual_title = blog_page.visitTo_portal();
        String expected_title = "Pune Police - Digital Pass";
        Assert.assertEquals(actual_title,expected_title);
        System.out.println("Successfully launched on police portal");
    }
}
