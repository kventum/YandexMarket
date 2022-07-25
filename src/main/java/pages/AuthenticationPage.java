package pages;

import base.BasePage;
import base.NavBar;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AuthenticationPage extends BasePage {
    private NavBar navBar = new NavBar();

    @FindBy(className = "page-heading")
    private WebElement authenticationHeading;

    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "passwd")
    private WebElement password;

    @FindBy(xpath = "//a[contains(., 'Forgot your password')]")
    private WebElement forgotPwd;

    @FindBy(id = "SubmitLogin")
    private WebElement signInBtn;

    public AuthenticationPage signIn(String emailValue, String passwordValue) {
        email.sendKeys(emailValue);
        password.sendKeys(passwordValue);
        signInBtn.click();
        return this;
    }
}
