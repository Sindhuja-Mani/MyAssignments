package week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Classroom {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		System.out.println(driver);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phones", Keys.ENTER);
		// to get the address of the opened browser window/tab (one single window)
		// get the address of current active window
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		driver.findElement(By.xpath("//span[@class='a-price-whole']")).click();
		// diver doesnot have any control over the newly opened tab
		Set<String> windowHandles = driver.getWindowHandles();// hold the address of all the windows(multiple windows
		// opened by the application)
		System.out.println(windowHandles.size());
		System.out.println(windowHandles);
		// convert the set to List
		List<String> winhan = new ArrayList<String>(windowHandles);
		// switchTOMethod
		// driver.switchTo().window(winhan.get(0)) ;// 0-->parent window -->current
		// active window
		driver.switchTo().window(winhan.get(1));// 1-->child window --> active window
		String samsungGalaxyZ = driver.findElement(By.xpath("//span[@id='productTitle']")).getText();
		System.out.println(samsungGalaxyZ);
		// Explain the scenario with multiple window-->where you need to close the
		// parent window except the child window
		/*
		 * driver.switchTo().window(winhan.get(0));
		 * System.out.println(driver.getTitle()); driver.close();
		 */
		// Explain the scenario with multiple window-->where you need to close all the
		// child window except parent window
		driver.switchTo().window(winhan.get(1));
		System.out.println(driver.getTitle());
		// driver.close();//closes the current active window
		driver.switchTo().window(winhan.get(0));
		System.out.println(driver.getTitle());
		driver.quit();// closes all the opened window by the browser
	}

}
