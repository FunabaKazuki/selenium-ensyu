import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./exe/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rakuplus.jp/");
		
        WebElement id = driver.findElement(By.xpath("//*[@id=\"user_login\"]"));
        id.sendKeys("xxxxxxxxxxxx");
        
        WebElement pass = driver.findElement(By.xpath("//*[@id=\"user_pass\"]"));
        pass.sendKeys("xxxxxxxxxxxx");
        
        driver.findElement(By.xpath("//*[@id=\"wp-submit\"]")).click();
        
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        
        try {
			Files.copy(file.toPath(), new File("xxxxxxxxxxxx" + file.getName()).toPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println(file);

	}

}
