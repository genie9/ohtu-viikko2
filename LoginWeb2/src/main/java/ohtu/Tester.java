package ohtu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Tester {
    public static void main(String[] args) {
        WebDriver driver = new HtmlUnitDriver();

        driver.get("http://localhost:8090");
        System.out.println( driver.getPageSource() );
        
        WebElement element = driver.findElement(By.linkText("login"));       
        element.click(); 
        
        System.out.println("==");
        
        System.out.println( driver.getPageSource() );
        element = driver.findElement(By.name("username"));
        /*testing wrong login name*/
        //element.sendKeys("jenni");
        element.sendKeys("pekka");
        element = driver.findElement(By.name("password"));
        element.sendKeys("akkep");
        /*testing wrong password*/
        //element.sendKeys("pekka");
        element = driver.findElement(By.name("login"));
        element.submit();
        
        System.out.println("==");
        System.out.println( driver.getPageSource() );
                
        /*testing new user login*/
//        WebElement element = driver.findElement(By.linkText("register new user"));       
//        element.click(); 
//        
//        System.out.println("==");
//        System.out.println( driver.getPageSource() );
//        element = driver.findElement(By.name("username"));
//        element.sendKeys("evgenia");
//        element = driver.findElement(By.name("password"));
//        element.sendKeys("jennintesti1");
//        element = driver.findElement(By.name("passwordConfirmation"));
//        element.sendKeys("jennintesti1");
//        element = driver.findElement(By.name("add"));
//        element.submit();
//        System.out.println("==");
//        System.out.println( driver.getPageSource() );
        
        /*testing logout after user creation*/
//        element = driver.findElement(By.linkText("continue to application mainpage"));
//        element.click(); 
//        element = driver.findElement(By.linkText("logout"));
//        element.click();
    }
}
