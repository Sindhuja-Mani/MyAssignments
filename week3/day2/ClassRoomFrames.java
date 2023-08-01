package week3.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassRoomFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
	    frame1.click();
        WebDriver frame = driver.switchTo().frame(frame1);
        driver.findElement(By.xpath("//button[text()='Try it']")).click();
        Alert alert=driver.switchTo().alert();
        alert.accept();
        String Message= driver.findElement(By.xpath("//p[@id='demo']")).getText();
        System.out.println(Message);
    if(Message.contains("Ok"))
    {
    	System.out.println("We are prompted with correct Message");
    }
       
     driver.switchTo().defaultContent();   
        
        
		
	}

}
