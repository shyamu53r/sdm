package login;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) {
	
		//Add Chrome Driver
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\garim\\chromedriver.exe");
		
	    //Initialize the Chrome Driver
		WebDriver driver = new ChromeDriver();
		
		driver.get("D:\\registeration.html");
		
		int chk = 0;
		int unchk = 0;
		
		List<WebElement> els = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(WebElement el : els)
		{
			if(el.isSelected())
			{
				chk++;
			}
			else
			{
				unchk++;
			}
		}
		
		System.out.println("Total checked Items:" + chk);
		System.out.println("Total unchecked Items:" + unchk);
		
	}

}
