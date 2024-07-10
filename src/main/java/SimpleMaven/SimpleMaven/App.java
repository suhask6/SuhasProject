package SimpleMaven.SimpleMaven;

import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class App 
{
    public static void main( String[] args )
    {
    	ChromeOptions op = new ChromeOptions();
    	op.addArguments("--incognito");
        
        WebDriver driver= new ChromeDriver(op);
        driver.manage().window().maximize();
       
        driver.get("https://app.meetsoci.com/admin/login");
        
        driver.findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("ayadav@meetsoci.com");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Ajay*141#");
        driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
        
        
        
        //driver.manage().window().minimize();
        
        //driver.quit();
        
        
    }
}
