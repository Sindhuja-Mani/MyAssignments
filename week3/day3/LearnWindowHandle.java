package week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		System.out.println(driver);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phones",Keys.ENTER);
		
		//to get the address of the opened browser window/tab(one single tab)
		//to get the address of current active window
		
		String windowHandle=driver.getWindowHandle();
		System.out.println(windowHandle);
		
		
		driver.findElement(By.xpath("//span[@class='a-price-whole']")).click();
		Set<String> windowhandles=driver.getWindowHandles();
		
		List<String> winhan=new ArrayList<String>(windowhandles);
		driver.switchTo().window(winhan.get(2));
		
		
		
		String samsungGalaxyz=driver.findElement(By.xpath("//span[@id='productTitle']")).getText();
		System.out.println(samsungGalaxyz);
		driver.close();
		driver.switchTo().window(winhan.get(1));
		
		System.out.println(driver.getTitle());
		
	}

}
