package d3d;

import d3d.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by ravi on 06/04/2016.
 */
public class BusinessLibrary extends Baseclass {
    public BusinessLibrary(WebDriver driver1)
    {
        driver = driver1;
    }
    public void contactus(String Fname, String Lname, String email, String number, String subject, String msg){
        driver.findElement(By.name("first-name")).click();
        driver.findElement(By.name("first-name")).clear();
        driver.findElement(By.name("first-name")).sendKeys(Fname);
        driver.findElement(By.name("last-name")).click();
        driver.findElement(By.name("last-name")).clear();
        driver.findElement(By.name("last-name")).sendKeys(Lname);
        driver.findElement(By.name("your-email")).click();
        driver.findElement(By.name("your-email")).clear();
        driver.findElement(By.name("your-email")).sendKeys(email);
        driver.findElement(By.name("tel-879")).click();
        driver.findElement(By.name("tel-879")).clear();
        driver.findElement(By.name("tel-879")).sendKeys(number);
        driver.findElement(By.name("your-subject")).click();
        driver.findElement(By.name("your-subject")).clear();
        driver.findElement(By.name("your-subject")).sendKeys(subject);
        driver.findElement(By.name("your-message")).click();
        driver.findElement(By.name("your-message")).clear();
        driver.findElement(By.name("your-message")).sendKeys(msg);
        driver.findElement(By.xpath(".//*[@id='wpcf7-f391-p31-o1']/form/p[3]/input")).click();

    }


}
