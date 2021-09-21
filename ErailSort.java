package week3.day2.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailSort {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://erail.in/");
		String title=driver.getTitle();
		System.out.println("title:"+title);
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("Chennai Egmore");
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("Coimbatore Jn");
		driver.findElement(By.xpath("//td[@id='tdDateOnly']/label")).click();
		Thread.sleep(2000);
		List<WebElement> trainno = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//td[1]"));
				int size = trainno.size();
				System.out.println("trainno size: "+size);
				List <String> trnum=new ArrayList<String>();
				for (WebElement trainlist : trainno) 
				{
				String	tno = trainlist.getText();
				trnum.add(tno);					
				}	
				System.out.println("unsorted :"+trnum);
		Collections.sort(trnum);
		System.out.println("Sorted train nos"+trnum);
		
		
		

	}
}
