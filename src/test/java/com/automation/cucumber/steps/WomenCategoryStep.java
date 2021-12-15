package com.automation.cucumber.steps;

import com.automation.pages.ProductPage;
import com.automation.pages.WomenCategoryPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class WomenCategoryStep {

    @And("^I select one \"([^\"]*)\"$")
    public void iSelectOne(String name) {
        new ProductPage().selectedProduct(name);

    }

    @And("^I enter quantity \"([^\"]*)\"$")
    public void iEnterQuantity(String qty) throws InterruptedException {
        new ProductPage().enterQuantity(qty);
    }

    @And("^I select size \"([^\"]*)\"$")
    public void iSelectSize(String size)  {
        new ProductPage().selectYourComfortSize(size);
    }

    @And("^I select color \"([^\"]*)\"$")
    public void iSelectColor(String clr)  {
        new ProductPage().selColour(clr);
    }

    @And("^I click on add to cart$")
    public void iClickOnAddToCart() {
        new ProductPage().clickOnAddToCartButton();
    }

    @Then("^I close popup$")
    public void iClosePopup() {
        new ProductPage().clickToClose();
    }



    @Then("^I can see women category page$")
    public void iCanSeeWomenCategoryPage() {
        Assert.assertEquals("not matched", new WomenCategoryPage().getWomenTitle(), "Women");
    }
}