package week3.day3;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LearnExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        ChromeOptions opt= new ChromeOptions();
		        opt.addArguments("--disable-notifications");
		        ChromeDriver driver=new ChromeDriver(opt);
				driver.manage().window().maximize();
				driver.get(" https://login.salesforce.com/");
				driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");	
			    driver.findElement(By.id("password")).sendKeys("Leaf$1234");
			    driver.findElement(By.id("Login")).click();
			    
			    WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(15));
			    String text=driver.findElement(By.tagName("title")).getText();
			    wait.until(ExpectedConditions.titleIs(text));
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


