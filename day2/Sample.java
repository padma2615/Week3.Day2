package week3.day2;

import java.time.Duration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("phone",Keys.ENTER);
		List<WebElement> display = driver.findElements(By.className("a-price-whole"));
		int value=display.size();
		System.out.println(value);
		
		for(int i=0;i<display.size();i++)
		{
			System.out.println(display.get(i).getText());
		}
		
       

	}

}
