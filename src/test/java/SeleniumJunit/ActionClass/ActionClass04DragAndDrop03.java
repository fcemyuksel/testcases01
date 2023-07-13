package SeleniumJunit.ActionClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ActionClass04DragAndDrop03 {

    WebDriver driver;

    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            }
    @After
    public void tearDown(){driver.quit();}
    @Test
    public void test01(){

        driver.get("https://www.amazon.com.tr/");
        Actions actions=new Actions(driver);
        //WebElement
    }
}
