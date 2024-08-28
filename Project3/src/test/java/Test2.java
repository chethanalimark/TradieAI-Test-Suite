import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Test2 {
    public static void main(String[] args) {

        tradieAIlogin();
}
    public static void tradieAIlogin(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();

        driver.get("https://crm.dev.limarktech.com/signin");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        WebElement basicEmailElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("basic_email")));

        driver.findElement(By.id("basic_email")).sendKeys("TestUser");
        driver.findElement(By.id("basic_password")).sendKeys("Limark123");

        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]/input[1]")).click();

    }
}
