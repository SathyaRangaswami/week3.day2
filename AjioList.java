package week3.day2.assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AjioList {

	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 driver.get("https://www.ajio.com/");
		 String title = driver.getTitle();
		 System.out.println("Title :"+title);
		 driver.findElement(By.name("searchVal")).sendKeys("bags");
		 driver.findElement(By.className("ic-search")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//label[@for='Men']")).click();
		 driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		 Thread.sleep(2000);
		 String text = driver.findElement(By.className("length")).getText();
		 System.out.println("No. of items displayed:"+text);
		 List<WebElement> bagBrandList = driver.findElements(By.className("brand"));
			System.out.println(" Size :" + bagBrandList.size());

			for (WebElement webElement : bagBrandList) {
				String text1 = webElement.getText();
				System.out.println(text1);
			}
			// Get the list of names of the bags and print it
			List<WebElement> bagNameList = driver.findElements(By.className("name"));
			System.out.println(" Size :" + bagNameList.size());
			System.out.println(" Names of the Bags");
			for (WebElement webElement : bagNameList) {
				String text2 = webElement.getText();
				System.out.println(text2);
			}
		 
		 }
}
