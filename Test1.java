package login;
//this is register
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//add comment browser support
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		
		//initialize chrome driver
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://vinayavish.com/");
//		driver.findElement(By.name("q")).sendKeys("prof vinay vishwakarma");
//		driver.findElement(By.name("btnK")).submit();
		
		
		List<WebElement> mylist = driver.findElements(By.xpath("//a"));
		System.out.println("no of links = "+mylist.size());
		
		List<WebElement> mylist1 = driver.findElements(By.xpath("//button"));
		System.out.println("no of button = "+mylist1.size());
		
		List<WebElement> mylist2 = driver.findElements(By.xpath("//input[@type='text']"));
		System.out.println("no of inputtypes = "+mylist2.size());
		
		

	}

}
