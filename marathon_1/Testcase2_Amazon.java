package marathon_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase2_Amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

ChromeDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.amazon.in");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags");

		driver.findElement(By.xpath("//div[@aria-label='bags for boys']")).click();
		System.out.println("selected bags");
		
		System.out.println(driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText());
		
	driver.findElement(By.xpath("//a/span[text()='Skybags']")).click();
	driver.findElement(By.xpath("//a/span[text()='American Tourister']")).click();
Thread.sleep(3000);

driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
driver.findElement(By.xpath("//li/a[text()='Newest Arrivals']")).click();

	System.out.println("Bag name: "+ driver.findElement(By.xpath("//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']/a/span")).getText());

	System.out.println("Discounted Price : "+ driver.findElement(By.xpath("//span[@class='a-price']")).getText());
	

	System.out.println(driver.getTitle());
	
	//driver.close();
		
		
		
	}

}
