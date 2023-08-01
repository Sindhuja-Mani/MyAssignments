package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("demoSalesManager");
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
	    driver.findElement(By.className("decorativeSubmit")).click();
	   String title= driver.getTitle();
	   System.out.println(title);
	   driver.findElement(By.linkText("CRM/SFA")).click();
	   driver.findElement(By.linkText("Leads")).click();
	   driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
	   driver.findElement(By.xpath("//span[text()='Phone']")).click();
	   driver.findElement(By.name("phoneNumber")).sendKeys("987");
	   driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	   String Leadid=driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
	   System.out.println(Leadid);
	   driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//div[@class='frameSectionExtra']/a[@class='subMenuButtonDangerous']")).click();
	  
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
	   driver.findElement(By.name("id")).sendKeys(Leadid);
	   driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	   
	   
		
	 
	   
	   
	}

}
