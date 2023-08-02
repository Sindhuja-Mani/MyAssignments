package week3.day3;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;
public class HandlingNotification {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	//if there is notification from browser we have to deal it with driver
		
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		ChromeDriver driver=new ChromeDriver(opt);
		System.out.println(driver);
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		//3 lines of code for taking screenshot
		File screenshotAs=driver.getScreenshotAs(OutputType.FILE);
		//take screenshot of current page
		File detn=new File("./snap/shot.png");//setting up path to save the file
		
		//commons-io is the library
	//connect snapshot and the file
		FileUtils.copyFile(screenshotAs,detn);
		
		//to view the file in the project-->After executiom-->refresh the project
		//right click on the img file and open with system editor
		
		
		
	}

}
