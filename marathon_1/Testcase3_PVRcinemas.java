package marathon_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Testcase3_PVRcinemas {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.pvrcinemas.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		
		driver.findElement(By.xpath("//span[@class='icon-glow cursor_pointer']/div")).click();
		System.out.println("click icon");

		driver.findElement(By.xpath("//li/a[text()='Movie Library']")).click();
		System.out.println("click movie library");

		Select s = new Select(driver.findElement(By.name("city")));

		s.selectByVisibleText("Chennai");

		Select d = new Select(driver.findElement(By.name("genre")));

		d.selectByVisibleText("ANIMATION");

		Select f = new Select(driver.findElement(By.name("lang")));

		f.selectByVisibleText("ENGLISH");



		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		System.out.println("click apply");

		Thread.sleep(8000);
		driver.findElement(By.xpath("//div[@class='movie-list']/div[1]")).click();
		System.out.println("click on first movie");

		driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();



		Select cinema = new Select(driver.findElement(By.name("cinemaName")));

		cinema.selectByVisibleText("INOX The Marina Mall, OMR, Chennai");	


		Select time = new Select(driver.findElement(By.name("timings")));

		time.selectByVisibleText("09:00 AM - 12:00 PM");	

		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Anushya");
		driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("8489603528");
		driver.findElement(By.xpath("//input[@name='comment']")).sendKeys("NIL");
		System.out.println("entered nil");
		
		
		Thread.sleep(8000);
		driver.findElement(By.xpath("//div[@class='datepicker-container datepicker-default']")).click();
		System.out.println("clicked date field");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@class='control next-month ng-star-inserted']")).click();
		System.out.println("clicked calendar");
		
		Thread.sleep(6000);
		driver.findElement(By.xpath("//span[text()='7']")).click();
		System.out.println("clicked date");

		driver.findElement(By.xpath("//input[@name='noOfTickets']")).sendKeys("1");

		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("xyz@gmail.com");
		
		Select y = new Select(driver.findElement(By.name("food")));
		y.selectByVisibleText("Yes");
				
		
		Thread.sleep(8000);
		
		driver.findElement(By.xpath("//span[@class='custom-control-description display-block']")).click();
		//driver.findElement(By.xpath("//span[@class='custom-control-indicator']")).click();
		
		//driver.findElement(By.xpath("//input[@id='copySelf']")).click();
		System.out.println("checked");

		driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();
		System.out.println("sent OTP");
		
		
	/*	
	//Thread.sleep(20000);
		driver.switchTo().frame(0);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(500));
		
		WebElement o = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//bs-modal[@style='display: block; padding-left: 17px;']//button[text()='CANCEL']")));
		o.click();
		System.out.println("cancelled");
*/
		
		driver.switchTo().activeElement();

		Thread.sleep(3000);

		WebElement m = driver.findElement(By.xpath("(//button[text()='CANCEL'])[2]"));
	      // click with Javascript Executor
	      JavascriptExecutor js = (JavascriptExecutor) driver;
	      js.executeScript("arguments[0].click();", m);
		
		
		
		
		driver.findElement(By.xpath("//button[text()='×']")).click();
		System.out.println("Closed dialog box");
		
		System.out.println(driver.getTitle());
		
		
	}

}
