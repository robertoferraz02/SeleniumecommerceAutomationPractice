package tests;

import Pages.Cart.AddProductToCartPage;
import Pages.Cart.CartBoxFormPage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import support.setUpDriver;

public class AddToCartAndCheckoutTest {

    private WebDriver driver;

    @Before
    public void settingDriver() {

        driver = setUpDriver.createChrome();
    }

    @Test
    public void testAddProductAndContinueShopping() {
        new AddProductToCartPage(driver)
                .addProduct();

        new CartBoxFormPage(driver)
                .continueShopping();
    }

    @Test
    public void testAddProductAndProceedToCheckout() {
        new AddProductToCartPage(driver)
                .addProduct();

        new CartBoxFormPage(driver)
                .proceedCheckout()
                .deleteOrder();
    }

}
