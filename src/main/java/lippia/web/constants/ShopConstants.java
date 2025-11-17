package lippia.web.constants;

public class ShopConstants {

    public static final String BUTTON_ADD_PRODUCT = "xpath:(//div[normalize-space()='%s']/ancestor::div[@class='inventory_item_description']//button[normalize-space()='Add to cart']) | (//div[@data-test='inventory-item-name' and normalize-space()='%s']/ancestor::div[contains(@class, 'inventory_details')]//button[normalize-space()='Add to cart'])";
    public static final String PRICE_BY_PRODUCT_NAME = "xpath:(//div[@data-test='inventory-item-name' and normalize-space()='%s']/ancestor::div[@class='inventory_item_description']//div[@data-test='inventory-item-price']) | (//div[@data-test='inventory-item-name' and normalize-space()='%s']/ancestor::div[contains(@class, 'inventory_details')]//div[@data-test='inventory-item-price'])";
    public static final String BUTTON_REMOVE_PRODUCT = "xpath:(//div[normalize-space()='%s']/ancestor::div[@class='inventory_item_description']//button[normalize-space()='Remove']) | (//div[@data-test='inventory-item-name' and normalize-space()='%s']/ancestor::div[contains(@class, 'inventory_details')]//button[normalize-space()='Remove'])";
    public static final String BUTON_CART = "xpath://a[@data-test='shopping-cart-link']";
    public static final String CART_BADGE_NUMBER = "xpath://span[@class='shopping_cart_badge']";
    public static final String BUTTON_CHECKOUT = "xpath://button[@data-test='checkout']";
    public static final String INPUT_FIRST_NAME_CHECKOUT = "xpath: //input[@data-test='firstName']";
    public static final String INPUT_LAST_NAME_CHECKOUT = "xpath://input[@data-test='lastName']";
    public static final String INPUT_POSTAL_CODE_CHECKOUT = "xpath://input[@data-test='postalCode']";
    public static final String BUTTON_CONTINUE_CHECKOUT = "xpath://input[@data-test='continue']";
    public static final String OVERVIEW_PRODUCT_1 = "xpath:(//div[@class='cart_item'])[1]//div[@data-test='inventory-item-name']";
    public static final String OVERVIEW_PRODUCT_2 = "xpath:(//div[@class='cart_item'])[2]//div[@data-test='inventory-item-name']";
    public static final String OVERVIEW_PRICE_1 = "xpath:(//div[@class='cart_item'])[1]//div[@data-test='inventory-item-price']";
    public static final String OVERVIEW_PRICE_2 = "xpath:(//div[@class='cart_item'])[2]//div[@data-test='inventory-item-price']";
    public static final String BUTTON_FINISH_CHECKOUT = "xpath://button[@data-test='finish']";
    public static final String MESSAGE_PURCHASE = "xpath://h2[@data-test='complete-header']";
}
