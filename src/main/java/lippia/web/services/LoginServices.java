package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.LoginConstants;
import org.testng.Assert;

public class LoginServices {
    public static void goLoginPage() {
        WebActionManager.navigateTo("https://www.saucedemo.com/");
    }

    public static void inputEmail(String text) {
        WebActionManager.waitVisibility(LoginConstants.TEXTBOX_EMAIL);
        WebActionManager.setInput(LoginConstants.TEXTBOX_EMAIL,text);
    }

    public static void inputPassword(String text) {
        WebActionManager.waitVisibility(LoginConstants.TEXTBOX_PASSWORD);
        WebActionManager.setInput(LoginConstants.TEXTBOX_PASSWORD,text);
    }

    public static void clickLoginButton() {
        WebActionManager.waitVisibility(LoginConstants.BUTTON_LOGIN).click();
    }

    public static void verifyHomePage() {
        WebActionManager.waitVisibility(LoginConstants.TITTLE_HOME_PAGE);
        String ActualTitle = WebActionManager.getText(LoginConstants.TITTLE_HOME_PAGE);
        Assert.assertEquals(ActualTitle.trim(), "Products".trim());
    }

    public static void verifyErrorLoginMessage(String text) {
        WebActionManager.waitVisibility(LoginConstants.MESSAGE_LOGIN_ERROR);
        String ActualError = WebActionManager.getText(LoginConstants.MESSAGE_LOGIN_ERROR);
        Assert.assertEquals(ActualError.trim(), text.trim());
    }
}

