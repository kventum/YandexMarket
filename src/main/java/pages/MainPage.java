package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class MainPage extends BasePage {
    public MainPage() {
        super();
    }

    public MainPage checkLogo() {
        elementIsDisplayed(By.xpath("//a[@id='logoPartMarket']/span[text()='Маркет']"));
        return this;
    }
}
