package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumClassRoom1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");	
	    driver.findElement(By.id("password")).sendKeys("Leaf@1234");
	    driver.findElement(By.id("Login")).click();
	    Thread.sleep(7000);
	    String title= driver.getTitle();
		System.out.println(title);
		if(title.contains("Home | Salesforce"))
		{
			System.out.println("we are successfully logged in");
		}
		else {
			System.out.println("we are not logged in");
		}
		
	}

}
