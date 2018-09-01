package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class BrowserFactory {

    public WebDriver driver;

    public WebDriver startBrowser(String browserName, String url) {

        if(browserName.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "/Users/mcseagate/IdeaProjects/Codex/src/main/Drivers/chromedriver");
            driver = new ChromeDriver();
        }

        else if(browserName.equalsIgnoreCase("Firefox")) {
            System.setProperty("webdriver.gecko.driver", "/Users/mcseagate/IdeaProjects/Codex/src/main/Drivers/geckodriver");
            driver = new FirefoxDriver();
        }

        else if(browserName.equalsIgnoreCase("Safari")) {
            driver = new SafariDriver();
        }

        else {
            System.out.println("Browser type not found");
        }

        driver.get(url);
        //driver.manage().window().maximize();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String title = driver.getTitle();
        System.out.println(title);
        return driver;

    }
}
