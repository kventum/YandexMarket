package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.MainPage;

public class BaseRouter {
    protected WebDriver driver;

    public MainPage mainPage = new MainPage();

    public BaseRouter() {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
}
