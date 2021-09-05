import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Susmita\\chromedriver_win32_update\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		//April14
		driver.findElement(By.xpath("//input[@name='travel_date']")).click();
		List<WebElement> dates=driver.findElements(By.className("day"));
		int count=dates.size();
		
		for(int i=0; i<count; i++)
		{
			String text=dates.get(i).getText();
			if (text.equals("23"))
			{
				dates.get(i).click();
				break;
			}
			
			
		}
		}
	}


