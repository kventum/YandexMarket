package pages;

import base.BasePage;
import base.Configuration;
import base.NavBar;
import org.openqa.selenium.support.PageFactory;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Класс главной страницы
 */
public class MainPage extends BasePage {
    public MainPage() {
        driver.get(Configuration.site_url);
        PageFactory.initElements(driver, this);
    }

    public NavBar navBar = new NavBar();
    public AuthenticationPage authenticationPage = new AuthenticationPage();


    public AuthenticationPage clickSignIn() {
        navBar.signIn.click();
        return authenticationPage;
    }

    public MainPage checkLogo() {
        assertTrue(navBar.Logo.isDisplayed());
        return this;
    }
}
