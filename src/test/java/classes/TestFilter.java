package classes;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestFilter {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://bamper.by");
        driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
        //choose marka and model
        driver.findElement(By.xpath("//*[@id=\"select2-marka-container\"]")).click();
        driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(new CharSequence[]{"Citroen\n"});
        driver.manage().timeouts().implicitlyWait(2L, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"select2-model-container\"]")).click();
        driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(new CharSequence[]{"C5\n"});
        driver.findElement(By.xpath("//*[@id=\"select2-god1-container\"]")).click();
        //choose year 
        driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(new CharSequence[]{"2000\n"});
        driver.findElement(By.xpath("//*[@id=\"select2-god2-container\"]")).click();
        driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(new CharSequence[]{"2020\n"});
        driver.findElement(By.xpath("//*[@id=\"select2-zapchast-container\"]")).click();
        //choose part
        driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(new CharSequence[]{"Клапан управления\n"});
        //choose number part
        driver.findElement(By.name("originalnum")).sendKeys(new CharSequence[]{"96"});
        driver.findElement(By.xpath("//*[@id=\"select2-seller-container\"]")).click();
        //choose supl
        driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(new CharSequence[]{"БигШРОТ\n"});
        //choose price
        driver.findElement(By.xpath("//*[@id=\"price-ot\"]")).sendKeys(new CharSequence[]{"5"});
        driver.findElement(By.xpath("//*[@id=\"price-do\"]")).sendKeys(new CharSequence[]{"100"});
       
       driver.findElement(By.id("js-filter-counter")).click();





}}
