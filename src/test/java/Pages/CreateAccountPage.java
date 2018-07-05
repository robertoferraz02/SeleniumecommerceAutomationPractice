package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountPage extends BasePage {

    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }

    public CreateAccountPage typeFirstName(String customer_firstname){
        driver.findElement(By.id("customer_firstname")).sendKeys(customer_firstname);
        return this;
    }

    public CreateAccountPage typeLastName(String customer_lastname){
        driver.findElement(By.id("customer_lastname")).sendKeys(customer_lastname);
        return this;
    }

    public CreateAccountPage typePass(String passwd){
        driver.findElement(By.id("passwd")).sendKeys(passwd);
        return this;
    }

    public CreateAccountPage selectSate(String state){
        WebElement findState = driver.findElement(By.id("id_state"));
        new Select(findState).selectByVisibleText(state);

        return this;
    }

}
