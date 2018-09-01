package WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homePageElements {
    WebDriver driver;

    @FindBy(css = ".nav > li:nth-child(2) > a:nth-child(1)")
    WebElement loginlink;

    @FindBy(id = "user_email")
    WebElement emailusername;

    @FindBy(id = "user_password")
    WebElement password;

    @FindBy(css = "input.btn")
    WebElement loginbtn;


    public void homePageElements() {
        driver = this.driver;
    }


    public void loginlink() {
        loginlink.click();
    }


    public void emailusername(){
        emailusername.sendKeys("menwoye@gmail.com");
    }

    public void password() {
        password.sendKeys("gns10101");
    }

    public void loginbtn(){
        loginbtn.click();
    }


    public void login() throws InterruptedException {
       loginlink();
       Thread.sleep(Long.parseLong("3000"));
       emailusername();
       password();
       Thread.sleep(Long.parseLong("1000"));
       loginbtn();
   }

}
