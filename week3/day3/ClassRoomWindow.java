package week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ClassRoomWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		ChromeDriver driver=new ChromeDriver(opt);
		System.out.println(driver);
		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		String windowHandle=driver.getWindowHandle();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
		Set<String> windowhandles=driver.getWindowHandles();
		List<String> winhan=new ArrayList<String>(windowhandles);
		driver.switchTo().window(winhan.get(2));
		System.out.println(driver.getTitle());
		driver.switchTo().window(winhan.get(1));
		driver.close();
		
		
	}

}
