package week3.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-left ui-button-success']")).click();
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("User is prompted");
		alert.dismiss();
		String alertMessage=driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
		System.out.println(alertMessage);
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		alertMessage=driver.findElement(By.xpath("//span[@class='ui-confirm-dialog-message']")).getText();
		System.out.println(alertMessage);
		driver.findElement(By.xpath("//span[text()='No']")).click();
		
		
		
	}

}
