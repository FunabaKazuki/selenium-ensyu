import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex03 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./exe/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.e-procurement.metro.tokyo.jp/");
		
		String Handle = driver.getWindowHandle();

		
		driver.findElement(By.xpath("//*[@id=\"category_menu\"]/ul/li[1]/a[1]/img")).click();
		
		

		String newHandle = null;
        for (String id : driver.getWindowHandles()) {
            if (!id.equals(Handle)) {
                newHandle = id;
            }
        }
       
        driver.switchTo().window(newHandle);
		
		driver.findElement(By.xpath("//*[@id=\"topMenuBtn03\"]/a")).click();
		
		
        WebElement a = driver.findElement(By.xpath("/html/body/div[3]/div/form/table[2]/tbody/tr[3]/td/table[1]/tbody/tr[13]/td/input[1]"));
        a.sendKeys("3");
        WebElement b = driver.findElement(By.xpath("/html/body/div[3]/div/form/table[2]/tbody/tr[3]/td/table[1]/tbody/tr[13]/td/input[2]"));
        b.sendKeys("05");
        WebElement c = driver.findElement(By.xpath("/html/body/div[3]/div/form/table[2]/tbody/tr[3]/td/table[1]/tbody/tr[13]/td/input[3]"));
        c.sendKeys("21");
        WebElement d = driver.findElement(By.xpath("/html/body/div[3]/div/form/table[2]/tbody/tr[3]/td/table[1]/tbody/tr[13]/td/input[4]"));
        d.sendKeys("3");
        WebElement e = driver.findElement(By.xpath("/html/body/div[3]/div/form/table[2]/tbody/tr[3]/td/table[1]/tbody/tr[13]/td/input[5]"));
        e.sendKeys("06");
        WebElement f = driver.findElement(By.xpath("/html/body/div[3]/div/form/table[2]/tbody/tr[3]/td/table[1]/tbody/tr[13]/td/input[6]"));
        f.sendKeys("30");
        
        WebElement sarch = driver.findElement(By.xpath("/html/body/div[3]/div/form/table[2]/tbody/tr[3]/td/table[2]/tbody/tr/td/a"));
        sarch.click();
        
        WebElement tlist = driver.findElement(By.xpath("/html/body/div[3]/div/form/table[5]"));
        List<WebElement> list = tlist.findElements(By.tagName("tr"));
        
        for(WebElement t : list) {
        	if(t.findElements(By.tagName("td"))!=null) {
        		List<WebElement> trlist = t.findElements(By.tagName("td"));
        		if(trlist.size()>=7) {
        			
        		
        			for(int i = 0 ; i<=2; i++) {
 
        				System.out.print(trlist.get(i).getText());
        				System.out.print("\t");
        				
        				
        			}
        			System.out.println();
        		}
        	}
        	
       
        	
        	
        	
        }

	}

}
