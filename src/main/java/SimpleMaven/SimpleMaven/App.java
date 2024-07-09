package SimpleMaven.SimpleMaven;

import java.awt.Point;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class App 
{
    public static void main( String[] args )
    {
    	ChromeOptions op = new ChromeOptions();
    	op.addArguments("--incognito");
        //System.out.println( "Hello World!" );
        
        //System.setProperty("Webdriver.chrome.driver","Driver\\chromedriver.exe");
        WebDriver driver= new ChromeDriver(op);
        
        driver.manage().window().maximize();
        
        driver.get("https://www.google.com");
        
        //Point p= new Point(0,3000);
        driver.manage().window().minimize();
        
        driver.quit();
        
        
    }
}
