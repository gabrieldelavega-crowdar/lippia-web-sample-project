package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.ShopConstants;
import org.testng.Assert;

public class ShopServices {
    public static void login() {
        LoginServices.goLoginPage();
        LoginServices.inputEmail("standard_user");
        LoginServices.inputPassword("secret_sauce");
        LoginServices.clickLoginButton();
    }

    public static void addProductToCart(String product) {
        WebActionManager.waitVisibility(ShopConstants.BUTTON_ADD_PRODUCT, product, product).click();
    }

    public static void verifyCartQuantity(String cantidad) {
        String actualQuantity = WebActionManager.getText(ShopConstants.CART_BADGE_NUMBER);
        Assert.assertEquals(actualQuantity, cantidad);

    }

    public static void removeProductToCart(String product) {
        WebActionManager.waitVisibility(ShopConstants.BUTTON_REMOVE_PRODUCT, product, product).click();

    }
}
