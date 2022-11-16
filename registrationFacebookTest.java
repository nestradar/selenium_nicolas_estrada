package Clase10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class registrationFacebookTest {

    @Test
    public void fullRegistrationTest () throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");

        driver.findElement(By.linkText("Crear cuenta nueva")).click();

        Thread.sleep(2000);

        driver.findElement(By.name("firstname")).sendKeys("John");
        driver.findElement(By.name("lastname")).sendKeys("Smith");
        driver.findElement(By.name("reg_email__")).sendKeys("5555555");
        //driver.findElement(By.name("reg_email_confirmation__")).sendKeys("5555555");
        driver.findElement(By.id("password_step_input")).sendKeys("123456789");

        WebElement elementoDias = driver.findElement(By.id("day"));
        WebElement elementoMeses = driver.findElement(By.id("month"));
        WebElement elementoAnios = driver.findElement(By.id("year"));

        Select dias = new Select(elementoDias);
        Select meses = new Select(elementoMeses);
        Select anios = new Select(elementoAnios);

        dias.selectByValue("26");
        meses.selectByVisibleText("jun");
        anios.selectByValue("1980");

        List<WebElement> listaGenero = driver.findElements(By.name("sex"));
        WebElement genero=listaGenero.get(1);
        genero.click();
    }
}
