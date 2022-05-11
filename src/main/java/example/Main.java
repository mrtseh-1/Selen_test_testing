package example;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello World.");

        // Chrome
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_v101.exe");
        ChromeDriver driver = new ChromeDriver();

        // Maximizes window to show the full content (the "Try for free" button)
        driver.manage().window().maximize();

        driver.get("https://www.spotify.com/se/signup");
        System.out.println(driver.getTitle());

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));


        driver.findElement(By.id("email")).sendKeys("mrtseh-1@student.ltu.se");

        Thread.sleep(300);

        driver.findElement(By.id("confirm")).sendKeys("mrtseh-1@student.ltu.se");

        Thread.sleep(300);

        driver.findElement(By.id("password")).sendKeys("********");

        Thread.sleep(300);

        driver.findElement(By.id("displayname")).sendKeys("Virtual_Machine");

        Thread.sleep(300);

        driver.findElement(By.id("year")).sendKeys("1964");


    }
}