package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    private By UsernameTextBox=By.id("Email");
    private By PasswordTextBox=By.id("Password");
    private By loginButton=By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/div[1]/div/form/div[3]/button");

    public LoginPage(WebDriver driver){
        this.driver=driver;
    }
    public void enterUsername(String username){
        driver.findElement(UsernameTextBox).clear();
        driver.findElement(UsernameTextBox).sendKeys(username);

    }

    public void enterPassword(String Password){
        driver.findElement(PasswordTextBox).clear();
        driver.findElement(PasswordTextBox).sendKeys(Password);
    }

    public void clickLogin(){

        driver.findElement(loginButton).click();


    }
}
