package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.xpath("//p[@class='top']/input"));
		username.sendKeys("demoSalesManager");
	    driver.findElement(By.xpath("//p/input[@id='password']")).sendKeys("crmsfa");
	    driver.findElement(By.xpath("//p/input[@class='decorativeSubmit']")).click();
	    String title= driver.getTitle();
	    System.out.println(title);
	    
	    
	    driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CTS");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sindhuja");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Mani");
		
		//Select value as Employee in Source Using SelectbyVisible text
		
		WebElement source=driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select srcdd=new Select(source);
		srcdd.selectByVisibleText("Employee");
		
		//Select value as Pay Per Click Advertising in MarketingCampaignId Using SelectbyValue
	
		WebElement mrktcmp=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select mktdd=new Select(mrktcmp);
		mktdd.selectByValue("9001");
		
		// Select value as Telecommunications from the bottom (size-2) in Industry using SelectByIndex
	
		WebElement industry=driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select inddd=new Select(industry);
		inddd.selectByIndex(15);
		
	    // Select value as Corporation in OwnerShip field Using SelectbyIndex
		WebElement ownership=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select owshipdd=new Select(ownership);
		owshipdd.selectByIndex(5);
		
		//Select value as India in Country Field Using SelectbyVisibletext
		WebElement country=driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select cnty=new Select(country);
		cnty.selectByVisibleText("India");
		
		driver.findElement(By.name("submitButton")).click();
		
	}

}
