package classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestFilter {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://bamper.by");
        driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"select2-marka-container\"]")).click();
        driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(new CharSequence[]{"Citroen\n"});
        driver.manage().timeouts().implicitlyWait(2L, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"select2-model-container\"]")).click();
        driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(new CharSequence[]{"C5\n"});
        driver.findElement(By.xpath("//*[@id=\"select2-god1-container\"]")).click();
        driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(new CharSequence[]{"2000\n"});
        driver.findElement(By.xpath("//*[@id=\"select2-god2-container\"]")).click();
        driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(new CharSequence[]{"2020\n"});
        driver.findElement(By.xpath("//*[@id=\"select2-zapchast-container\"]")).click();
        driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(new CharSequence[]{"Клапан управления\n"});
        driver.findElement(By.name("originalnum")).sendKeys(new CharSequence[]{"96"});
        driver.findElement(By.xpath("//*[@id=\"select2-seller-container\"]")).click();
        driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(new CharSequence[]{"БигШРОТ\n"});
        driver.findElement(By.xpath("//*[@id=\"price-ot\"]")).sendKeys(new CharSequence[]{"5"});
        driver.findElement(By.xpath("//*[@id=\"price-do\"]")).sendKeys(new CharSequence[]{"100"});
        driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[1]/aside/aside[1]/form/div/div[31]/div[1]/button")).click();
        driver.findElement(By.id("js-filter-loader")).click();

    }
}
