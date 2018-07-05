package Pages.Cart;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage extends BasePage {
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public CheckoutPage deleteOrder(){
        driver.findElement(By.xpath("//*[@id=\"1_1_0_0\"]/i")).click();
        return this;
    }
}
