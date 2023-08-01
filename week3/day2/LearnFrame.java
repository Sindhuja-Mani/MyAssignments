package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.buythevalue.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.switchTo().frame(0);//frameindex starts with 0
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='dummy-chat-button-iframe']"));
	    frame1.click();
        WebDriver frame = driver.switchTo().frame(frame1);
		//driver.findElement(By.xpath("//button[contains(@class,'chat-toggle')]")).click();
	
	}

}
