package lippia.web.steps;

import io.cucumber.java.en.*;
import io.cucumber.java.en.Given;
import lippia.web.services.ShopServices;

public class ShopSteps {
    @Given("the user is logged in")
    public void theUserIsLoggedIn() {
        ShopServices.login();
    }

    @When("the user clicks add (.*) product button$")
    public void theUserAddsProductToTheCart(String product) {
        ShopServices.addProductToCart(product);
    }

    @And("the user verify the cart has (.*) products$")
    public void theUserVerifyTheCartHasProducts(String cantidad) {
        ShopServices.verifyCartQuantity(cantidad);
    }

    @When("the user clicks remove (.*) product button$")
    public void theUserClicksRemoveSauceLabsBackpackProductButton(String product) {
        ShopServices.removeProductToCart(product);

    }

    @And("the user clicks the Cart button")
    public void theUserClicksTheCartButton() {
        ShopServices.clickCart();
    }

    @And("the user click the Checkout button")
    public void theUserClickTheCheckoutButton() {
        ShopServices.clickCheckout();

    }

    @And("the user fill the Checkout data")
    public void theUserFillTheCheckoutData() {
        ShopServices.fillChecoutData();
    }

    @And("the user clicks Continue button")
    public void theUserClicksContinueButton() {
        ShopServices.clickContinue();
    }

    @And("the user verify (.*) and (.*) names")
    public void theUserVerifyAndNames(String prod1, String prod2) {
        ShopServices.verifyProductsNames(prod1, prod2);
    }

    @And("the user verify products prices$")
    public void theUserVerifyAndPrices() {
        ShopServices.verifyProductsPrices();

    }

    @Then("the user clicks the Finish button")
    public void theUserClicksTheFinishButton() {
        ShopServices.clickFinish();
    }

    @And("the user see the meesage (.*)$")
    public void theUserSeeTheMeesage(String message) {
        ShopServices.verifyPurchaseMessage(message);
    }
}
