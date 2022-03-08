package base;

import org.openqa.selenium.By;

public class NavBar {

    public By yaLogo = new By.ByXPath("//a[@href='https://yandex.ru']");

    public By marketLogo = new By.ByXPath("//a[@id='logoPartMarket']/span[text()='Маркет']");

    public By catalogButton = new By.ById("catalogPopupButton");

    public By searchBar = new By.ById("header-search");

    public By searchButton = new By.ByXPath("//button/span[contains(., 'Найти')]/..");

    public By yaPlus = new By.ByXPath("//div[@data-zone-name='yaPlusBadge']/div/div");

    public By orders = new By.ByXPath("");

    public By favourite = new By.ByXPath("");

    public By account = new By.ByXPath("");
}
//a[@id='logoPartMarket']/span[text()='Маркет']