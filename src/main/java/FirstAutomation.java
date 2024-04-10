import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FirstAutomation {

    protected static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        //Type URL
        driver.get("https://demo.nopcommerce.com/");
        // Click on register
        driver.findElement(By.className("ico-register")).click();
        //Type First name
        driver.findElement(By.id("FirstName")).sendKeys("Seema");
        //Type Lastname
        driver.findElement(By.name("LastName")).sendKeys("Parekh");
        //Type E-mail
        driver.findElement(By.id("Email")).sendKeys("sparekh02@gmail.com");
        //Type Password
        driver.findElement(By.id("Password")).sendKeys("Abcd@123");
        //Type Confirmed password
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Abcd@123");
        //Click on register Submit Button
        driver.findElement(By.id("register-button")).click();
        //Verify correct registration message displayed
        String actualMsg = driver.findElement(By.className("result")).getText();
        //initialization expected msg
        String expectedMsg;
        expectedMsg = actualMsg;
        if(actualMsg.equals(expectedMsg)){
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
        }
        //driver.close();



    }
}
