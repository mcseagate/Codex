package Testcases;

import Base.BrowserFactory;
import WebPages.homePageElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class homePageTest {

    public WebDriver driver;
    homePageElements hpe;


    @Test
    public void loginTest() throws InterruptedException {
        BrowserFactory browserStart = new BrowserFactory();
        WebDriver driver = browserStart.startBrowser("Chrome", "https://letskodeit.teachable.com/");
        hpe = PageFactory.initElements(driver, homePageElements.class);
        hpe.login();
        Thread.sleep(3000);
        driver.close();
    }
}
