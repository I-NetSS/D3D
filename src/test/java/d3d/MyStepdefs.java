package d3d;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by ravi on 06/04/2016.
 */
public class MyStepdefs {

    WebDriver driver;
    BusinessLibrary businessLibrary;

    @Before
    public void before() {

        driver = new FirefoxDriver();
        driver.get("http://d3dsecurity.co.uk/");
        businessLibrary = new BusinessLibrary(driver);
        driver.manage().window().maximize();
    }

   @After
    public void after() {
        driver.quit();
    }



    @Given("^customer in home page and navigated to contactus page$")
    public void customer_in_home_page_and_navigated_to_contactus_page() throws Throwable {
        driver.findElement(By.linkText("Contact Us")).click();

        Assert.assertTrue(driver.findElement(By.className("builder-heading")).isDisplayed());
    }

    @When("^customer in contactus page have to enter the required fields first name\"([^\"]*)\",last name\"([^\"]*)\",email\"([^\"]*)\",phone number\"([^\"]*)\",subject\"([^\"]*)\" and message\"([^\"]*)\" and click on submit button$")
    public void customer_in_contactus_page_have_to_enter_the_required_fields_first_name_last_name_email_phone_number_subject_and_message_and_click_on_submit_button(String Fname, String Lname, String email, String number, String subject, String msg) throws Throwable {
        businessLibrary.contactus(Fname, Lname, email, number, subject, msg);
    }

    @Then("^customer have to see the successful submission message$")
    public void customer_have_to_see_the_successful_submission_message() throws Throwable {
        Thread.sleep(1000);
        Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("Thanks."));

    }



    @When("^customer in contactus page i dont have to enter the required fields first name\"([^\"]*)\",last name\"([^\"]*)\",email\"([^\"]*)\",phone number\"([^\"]*)\",subject\"([^\"]*)\" and message\"([^\"]*)\" and click on submit button$")
    public void customer_in_contactus_page_i_dont_have_to_enter_the_required_fields_first_name_last_name_email_phone_number_subject_and_message_and_click_on_submit_button(String Fname, String Lname, String email, String number, String subject, String msg) throws Throwable {
        businessLibrary.contactus(Fname, Lname, email, number, subject, msg);
    }

    @Then("^customer have to see the unsuccessful submission message$")
    public void customer_have_to_see_the_unsuccessful_submission_message() throws Throwable {
        Thread.sleep(1000);
        Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("Validation errors occurred."));

    }


}
