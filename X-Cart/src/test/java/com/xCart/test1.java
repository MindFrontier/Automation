package com.xCart;

import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class test1 {
    @Test
    public void userCanSearch() {
        open("https://demostore.x-cart.com/");
        $(By.name("substring")).setValue("Sandals").pressEnter();
        $(By.linkText("Green Flat Slingback Sandals")).click();
        $(By.xpath("/html/body/div[1]/div[1]/div[1]/div[5]/div/div/div[2]/div/div/div[3]/div[3]/form[2]/div[2]/div/div[3]/button")).click();
        $(By.linkText("View cart")).click();
        $(By.linkText("Green Flat Slingback Sandals")).shouldHave(text("Green Flat Slingback Sandals"));

        $(By.linkText("Home")).click();
        $$(By.className("product-price")).contains("$");




    }
}
