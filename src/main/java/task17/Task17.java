package task17;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task17 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Launch the Chrome browser
		WebDriver driver = new ChromeDriver();

		// Load the URL using get method
		driver.get("https://demoblaze.com/index.html#");

		// Implicit wait for the element of the page to click them
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Maximise the browser view
		driver.manage().window().maximize();

		// Click the element laptop and Sony vaio using link text
		driver.findElement(By.linkText("Laptops")).click();
		// Thread sleep 2 seconds to load the elements
		Thread.sleep(2000);

		driver.findElement(By.linkText("Sony vaio i5")).click();

		// Click add to cart button
		driver.findElement(By.linkText("Add to cart")).click();
		Thread.sleep(2000);

		// Switch to alert box
		Alert alert = driver.switchTo().alert();

		// Get the text displayed in the alert
		String alertText = alert.getText();
		System.out.print("Alert says: " + alertText);

		// Click ok button to dismiss the Alert
		alert.accept();

	}

}
