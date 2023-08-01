package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("demoSalesManager");
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
	    driver.findElement(By.className("decorativeSubmit")).click();
	    driver.findElement(By.linkText("CRM/SFA")).click();
	    driver.findElement(By.linkText("Accounts")).click();
	    driver.findElement(By.linkText("Create Account")).click();
	    
	    driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account");
	    driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Debit account creation");
	    driver.findElement(By.xpath("//input[@name='groupNameLocal']")).sendKeys("DBT ACC");
	    
	    driver.findElement(By.xpath("//input[@name='officeSiteName']")).sendKeys("Chennai");
	    driver.findElement(By.xpath(" (//input[contains(@class,'inputBox')])[5]")).sendKeys("4567878");
	   
		WebElement industry=driver.findElement(By.name("industryEnumId"));
		Select inddd=new Select(industry);
		inddd.selectByIndex(3);
		
		
		WebElement ownership=driver.findElement(By.name("ownershipEnumId"));
		Select owshipdd=new Select(ownership);
		owshipdd.selectByVisibleText("S-Corporation");
		
		WebElement source=driver.findElement(By.id("dataSourceId"));
		Select srcdd=new Select(source);
		srcdd.selectByValue("LEAD_EMPLOYEE");
		
		
		WebElement mrktcmp=driver.findElement(By.id("marketingCampaignId"));
		Select mktdd=new Select(mrktcmp);
		mktdd.selectByIndex(5);
		
		WebElement province=driver.findElement(By.id("generalStateProvinceGeoId"));
		Select provdd=new Select(province);
		provdd.selectByValue("TX");
		
	    driver.findElement(By.xpath("//input[@onclick='submitFormWithSingleClick(this)']")).click();

	    String errorMessage=driver.findElement(By.xpath("//table[@class='fourColumnForm']//span[@class='errorMessage']")).getText();
	  
	    String error="Duplicates found:" ;
	    if(error.equalsIgnoreCase(errorMessage)) {
		   driver.findElement(By.className("buttonDangerous")).click();
		   driver.switchTo().alert().accept();
	    }
	    driver.close();
	  
	
	    
	    
	    
	}

}
