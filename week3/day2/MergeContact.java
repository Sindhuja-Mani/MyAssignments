package week3.day2;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("demoSalesManager");
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
	    driver.findElement(By.className("decorativeSubmit")).click();
	    driver.findElement(By.linkText("CRM/SFA")).click();
	    driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.xpath("(//div[@class='frameSectionBody']//a[text()='Merge Contacts'])")).click();
		String parentHandle = driver.getWindowHandle();
		driver.findElement(By.xpath("//table[@id='widget_ComboBox_partyIdFrom']/following-sibling::a")).click();
		for (String winHandle : driver.getWindowHandles())
		{
		    driver.switchTo().window(winHandle); 
		}
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).click();
		//driver.close(); // close newly opened window when done with it
		driver.switchTo().window(parentHandle);
		
		String parentHandle1 = driver.getWindowHandle();
		driver.findElement(By.xpath("//table[@id='widget_ComboBox_partyIdTo']/following-sibling::a")).click();
		for (String winHandle : driver.getWindowHandles())
		{
		    driver.switchTo().window(winHandle); 
		}
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[2]")).click();
		//driver.close(); // close newly opened window when done with it
		driver.switchTo().window(parentHandle1);
	    driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
	    Alert alert=driver.switchTo().alert();
	    alert.accept();
	    String title1= driver.getTitle();
	    System.out.println(title1);
	    if(title1.contains("View Contact"))
	    {
	    	System.out.println("We are into the right page");
	    }
	    else {
	    	System.out.println("We are facing some issue");
	    }
	    
	    
		
		
		
		
	}

}
