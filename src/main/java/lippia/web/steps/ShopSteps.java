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
}
