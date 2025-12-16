package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.ShopConstants;
import org.testng.Assert;

public class ShopServices {
    public static String PrevValue1="0";
    public static String PrevValue2="0";

    public static void login() {
        LoginServices.goLoginPage();
        LoginServices.inputEmail("standard_user");
        LoginServices.inputPassword("secret_sauce");
        LoginServices.clickLoginButton();
    }

    public static void addProductToCart(String product) {
        WebActionManager.waitVisibility(ShopConstants.BUTTON_ADD_PRODUCT, product, product).click();
        if (PrevValue1.equals("0")){
            PrevValue1 = WebActionManager.getText(ShopConstants.PRICE_BY_PRODUCT_NAME, product, product);
        }
        else {
            PrevValue2 = WebActionManager.getText(ShopConstants.PRICE_BY_PRODUCT_NAME, product, product);

        }

    }

    public static void verifyCartQuantity(String cantidad) {
        if (cantidad.equals("0")) {

            WebActionManager.waitInvisibility(ShopConstants.CART_BADGE_NUMBER);
        } else {

            WebActionManager.waitVisibility(ShopConstants.CART_BADGE_NUMBER);
            String actualQuantity = WebActionManager.getText(ShopConstants.CART_BADGE_NUMBER);
            Assert.assertEquals(actualQuantity, cantidad);
        }
    }

    public static void removeProductToCart(String product) {
        WebActionManager.waitVisibility(ShopConstants.BUTTON_REMOVE_PRODUCT, product, product).click();

    }

    public static void clickCart() {
        WebActionManager.waitVisibility(ShopConstants.BUTON_CART).click();
    }

    public static void clickCheckout() {
        WebActionManager.waitVisibility(ShopConstants.BUTTON_CHECKOUT).click();

    }

    public static void fillChecoutData(String name, String lastname, String zipcode) {
        WebActionManager.setInput(ShopConstants.INPUT_FIRST_NAME_CHECKOUT, name);
        WebActionManager.setInput(ShopConstants.INPUT_LAST_NAME_CHECKOUT, lastname);
        WebActionManager.setInput(ShopConstants.INPUT_POSTAL_CODE_CHECKOUT, zipcode);

    }

    public static void clickContinue() {
        WebActionManager.waitVisibility(ShopConstants.BUTTON_CONTINUE_CHECKOUT).click();

    }

    public static void verifyProductsNames(String prod1, String prod2) {

        WebActionManager.waitVisibility(ShopConstants.OVERVIEW_PRODUCT_1);
        String actualName1 = WebActionManager.getText(ShopConstants.OVERVIEW_PRODUCT_1);
        Assert.assertEquals(actualName1, prod1);

        WebActionManager.waitVisibility(ShopConstants.OVERVIEW_PRODUCT_2);
        String actualName2 = WebActionManager.getText(ShopConstants.OVERVIEW_PRODUCT_2);
        Assert.assertEquals(actualName2, prod2);

    }

    public static void verifyProductsPrices() {
        WebActionManager.waitVisibility(ShopConstants.OVERVIEW_PRICE_1);
        String actualPrice1 = WebActionManager.getText(ShopConstants.OVERVIEW_PRICE_1);
        Assert.assertEquals(actualPrice1, PrevValue1);

        WebActionManager.waitVisibility(ShopConstants.OVERVIEW_PRICE_2);
        String actualPrice2 = WebActionManager.getText(ShopConstants.OVERVIEW_PRICE_2);
        Assert.assertEquals(actualPrice2, PrevValue2);
    }

    public static void clickFinish() {
        WebActionManager.waitVisibility(ShopConstants.BUTTON_FINISH_CHECKOUT).click();

    }

    public static void verifyPurchaseMessage(String message) {
        WebActionManager.waitVisibility(ShopConstants.MESSAGE_PURCHASE);
        String actualMessage = WebActionManager.getText(ShopConstants.MESSAGE_PURCHASE);
        Assert.assertEquals(actualMessage, message);
    }
}
