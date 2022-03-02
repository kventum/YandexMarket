package base;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait driverWait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        driverWait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    // метод ожидания обертки
    public void waitVisibility (By by) {
        driverWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
    }

    // метод клика
    public void click(By by) {
        waitVisibility(by);
        driver.findElement(by).click();
    }

    // отображение элемента
    public void elementIsDisplayed(By by) {
        waitVisibility(by);
        assertTrue(driver.findElement(by).isDisplayed());
    }
}
