package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Santu");
		driver.findElement(By.name("lastname")).sendKeys("Santu");
		
		driver.findElement(By.name("reg_email__")).sendKeys("98765408");
		
		WebElement Birthdaydate=driver.findElement(By.name("birthday_day"));
		Select bdaydate=new Select(Birthdaydate);
		bdaydate.selectByValue("1");
		
		WebElement Birthdaymonth=driver.findElement(By.name("birthday_month"));
		Select bdaymonth=new Select(Birthdaymonth);
		bdaymonth.selectByIndex(1);
		
		WebElement Birthdayyear=driver.findElement(By.name("birthday_month"));
		Select bdayyear=new Select(Birthdayyear);
		bdayyear.selectByVisibleText("1992");
		driver.findElement(By.name("sex")).click();
		
		
		
		
	}

}
