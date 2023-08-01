package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Edit {

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
	    
	    driver.findElement(By.xpath("//div[@id='label']/a")).click();
	    
	    driver.findElement(By.xpath("//ul[@class='sectionTabBar']//a[@href='/crmsfa/control/leadsMain']")).click();
	   
	    driver.findElement(By.xpath("//ul[@class='shortcuts']//a[@href='/crmsfa/control/createLeadForm']")).click();
	    
	    driver.findElement(By.xpath("//span[@class='requiredField']/following::input[@id='createLeadForm_companyName']")).sendKeys("CTS");
	    
	    driver.findElement(By.xpath("//span[@class='requiredField']/following::input[@id='createLeadForm_firstName']")).sendKeys("Sindhuja");
	    
	    driver.findElement(By.xpath("//div[@class='fieldgroup-body']//input[@id='createLeadForm_lastName']")).sendKeys("Mani");
	    
	    driver.findElement(By.xpath("//span[@class='tableheadtext']/following::input[@id='createLeadForm_primaryEmail']")).sendKeys("Sindhujamani11@gmail.com");
	    
	    driver.findElement(By.xpath("//div[@class='fieldgroup-body']//input[@id='createLeadForm_primaryPhoneNumber']")).sendKeys("9787676767");
	    
	    driver.findElement(By.xpath("//td[@class='label']/following::input[@type='submit']")).click();
	    
	    String title1= driver.getTitle();
	    System.out.println(title1);
	    
	    driver.findElement(By.xpath("//div[@class='frameSectionExtra']//a[text()='Edit']")).click();
	    
		driver.findElement(By.xpath("//span[text()='Company Name']/following::input[@id='updateLeadForm_companyName']")).clear();
		
		driver.findElement(By.id("//span[text()='Company Name']/following::input[@id='updateLeadForm_companyName']")).sendKeys("TestLeaf");
		
		driver.findElement(By.name("//span[text()='Company Name']/following::input[@class='smallSubmit'][1]")).click();
	}

}
