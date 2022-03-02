package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {
    public MainPage(WebDriver driver) {
        super(driver);
    }

    public MainPage checkLogo() {
        elementIsDisplayed(By.xpath("//a[@id='logoPartMarket']/span[text()='Маркет']"));
        return this;
    }
}
