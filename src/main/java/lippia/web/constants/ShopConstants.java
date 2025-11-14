package lippia.web.constants;

public class ShopConstants {

    public static final String BUTTON_ADD_PRODUCT = "xpath:(//div[normalize-space()='%s']/ancestor::div[@class='inventory_item_description']//button[normalize-space()='Add to cart']) | (//div[@data-test='inventory-item-name' and normalize-space()='%s']/ancestor::div[contains(@class, 'inventory_details')]//button[normalize-space()='Add to cart'])";
    public static final String BUTTON_REMOVE_PRODUCT = "xpath:(//div[normalize-space()='%s']/ancestor::div[@class='inventory_item_description']//button[normalize-space()='Remove']) | (//div[@data-test='inventory-item-name' and normalize-space()='%s']/ancestor::div[contains(@class, 'inventory_details')]//button[normalize-space()='Remove'])";
    public static final String BUTON_CART = "xpath://a[@data-test='shopping-cart-link']";
    public static final String CART_BADGE_NUMBER = "xpath://span[@class='shopping_cart_badge']";
}
