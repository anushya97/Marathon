package marathon_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testcase1_AbhiBus {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.abhibus.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		
		driver.findElement(By.linkText("Bus")).click();
		System.out.println("clicked on bus.");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='source']")).sendKeys("Chennai");
		System.out.println("chennai");
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		System.out.println("selected chennai");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='destination']")).sendKeys("Bangalore");
		System.out.println("banglore");
		driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
		System.out.println("selected banglore");
		driver.findElement(By.xpath("//input[@id='datepicker1']")).click();
		System.out.println("clicked on date");
		
		Thread.sleep(5000);
	    driver.findElement(By.linkText("31")).click();
		
		driver.findElement(By.linkText("Search")).click();
		System.out.println("clicked search");	
		System.out.println(driver.findElement(By.xpath("//div[@class='search-column1']/h2[@class='TravelAgntNm ng-binding'][1]")).getText());
		driver.findElement(By.xpath("//input[@title='SLEEPER']")).click();
		System.out.println("clicked on sleeper");
		System.out.println(driver.findElement(By.xpath("//p[contains(text(),' Seats Available')]")).getText());
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='btn-seatselect book1']/span[text()='Select Seat'][1]")).click();
		System.out.println("clicked seat");
		
		driver.findElement(By.xpath("//li/a[@class='tooltip tooltipstered'][1]")).click();
		System.out.println("clicked on firstseat");
		
		System.out.println(driver.findElement(By.xpath("//span[@id='seatnos']")).getText());
		
		System.out.println(driver.findElement(By.xpath("//span[@id='ticketfare']")).getText());
		
		Select b = new Select(driver.findElement(By.name("boardingpoint_id")));
		b.selectByIndex(1);
		
		Select d = new Select(driver.findElement(By.name("droppingpoint_id")));
		d.selectByIndex(2);
		
		System.out.println(driver.getTitle());
		driver.close();
		
	}

}
