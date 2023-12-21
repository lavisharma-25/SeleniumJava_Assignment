import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Main {
    public static WebDriver driver;
    public static void main(String[] args) throws Exception {
        // Setting the base url
        try {
            String baseUrl = "https://demo.guru99.com/test/newtours/register.php";
            driver = DriverSetup.getWebDriver(baseUrl);

            // Fill the contact information.
            driver.findElement(By.xpath("//*[@name='firstName']")).sendKeys("Lavish");
            driver.findElement(By.xpath("//*[@name='lastName']")).sendKeys("Sharma");
            driver.findElement(By.xpath("//*[@name='phone']")).sendKeys("933456789");
            driver.findElement(By.xpath("//*[@name='userName']")).sendKeys("xyz@provider.com");

            // Fill the mailing information.
            driver.findElement(By.xpath("//*[@name='address1']")).sendKeys("2nd Ring, Saturn Planet");
            driver.findElement(By.xpath("//*[@name='city']")).sendKeys("47 Colony");
            driver.findElement(By.xpath("//*[@name='state']")).sendKeys("Titan");
            driver.findElement(By.xpath("//*[@name='postalCode']")).sendKeys("600097");
            
            // Handling the dropdown
            Select country = new Select(driver.findElement(By.xpath("//*[@name='country']")));
            country.selectByValue("INDIA");

            // Fill the user information
            driver.findElement(By.xpath("//*[@name='email']")).sendKeys("lavish123");
            driver.findElement(By.xpath("//*[@name='password']")).sendKeys("Xyz@7687");
            driver.findElement(By.xpath("//*[@name='confirmPassword']")).sendKeys("Xyz@7687");

            // Click the submit button
            driver.findElement(By.xpath("//*[@name='submit']")).click();
            Thread.sleep(2000);
            System.out.println("Successfully Registered");
            driver.quit();
        }

        catch (Exception e) {
            e.printStackTrace();
            driver.quit();
        }

    }
}