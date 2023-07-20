package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Create {

	public static void main(String[] args) {
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
	   driver.findElement(By.linkText("Create Lead")).click();
	   driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CTS");
	   driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sindhuja");
	   driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Mani");
	   driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Sindhujamani11@gmail.com");
	   driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9787676767");
	   driver.findElement(By.name("submitButton")).click();
	   String title1= driver.getTitle();
	   System.out.println(title1);
	   
	  
	 
	   
	   
	   
		
	}

}
