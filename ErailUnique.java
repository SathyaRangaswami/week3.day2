package week3.day2.assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailUnique {
//	Store all the train names in a list	
//	Get the size of it	
//	Add the list into a new Set	
//	And print the size of it
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
		List<WebElement> trainname = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//td[2]"));
		List<String> trname=new ArrayList<String>();
		for (WebElement tna : trainname) {
			String train = tna.getText();
			trname.add(train);					
		}
		//trname.add("PUNJAB MAIL SPL");
		System.out.println("train name"+trname);
		int size = trname.size();
		System.out.println("No of trains,Size"+size);
		
		Set<String> trunique=new HashSet<String>();
		trunique.addAll(trname);		
		System.out.println("Unique train names"+trunique);
		System.out.println("Size of unique trains"+trunique.size());
		
		

}
}

