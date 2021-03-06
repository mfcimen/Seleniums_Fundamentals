package Utilities;

import PagesElements.FaceBookElements;
import PagesElements.GoogleElements;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver;


    @BeforeMethod()   // controls how the @Test method will be executed.
    public void setup01(){
        // this before method is to setup browsers.
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to( ConfigReader.getProperties("GGWebSite"));

    }

    @BeforeMethod
    public void setup02(){
        // this before method is to run each weblemnt page' constructor. (PageFactory).
        new FaceBookElements();
        new GoogleElements();

    }

    @AfterMethod
    public void end(){
        driver.quit();
        driver = null;
    }





}
