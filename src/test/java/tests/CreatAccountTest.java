package tests;

import Pages.SignInPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import support.setUpDriver;

public class CreatAccountTest {

    private WebDriver driver;

    @Before
    public void settingDriver(){
        driver = setUpDriver.createChrome();
    }

    @Test
    public void testCreateAccount(){
        new SignInPage(driver)
                .signIn()
                .typeEmail("teste7@hotmail.com")
                .typeFirstName("Roberto")
                .typeLastName("Ferraz")
                .typePass("123456")
                .selectSate("Texas");
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
