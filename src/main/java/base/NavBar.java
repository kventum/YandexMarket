package base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavBar extends BasePage {

    @FindBy(className = "login")
    public WebElement signIn;

    @FindBy(xpath = "//a[@title='My Store']")
    public WebElement Logo;

}