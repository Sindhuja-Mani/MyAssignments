package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
	    driver.findElement(By.className("decorativeSubmit")).click();
	    driver.findElement(By.linkText("CRM/SFA")).click();
	 	
	    driver.findElement(By.linkText("Accounts")).click();
	    driver.findElement(By.linkText("Find Accounts")).click();
	    String accName="Credit Limited Account";
	    driver.findElement(By.name("accountName")).sendKeys(accName);
	    driver.findElement(By.xpath("//div[@class='x-panel-footer x-panel-footer-noborder']//button")).click();
	    driver.findElement(By.xpath("  //div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click(); 
	    String accName1=driver.findElement(By.xpath("(//table[@class='fourColumnForm']//span[@class='tabletext'])[1]")).getText();
	    if(accName1.contains(accName))
	    {
	    	System.out.println("Account is verified");
	    }
	    
	    //// Get Description doubt
	    String title1= driver.getTitle();
	    if(title1.contains("View Lead"))
	     {
	    	System.out.println("We are on correct page");
	 
	}
	}
}
