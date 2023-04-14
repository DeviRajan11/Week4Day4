package week4day4;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;


public class AmazonAssignment {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bags");
		driver.findElement(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']//span[contains(text(),'for boys')]")).click();
		String s = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText();
		System.out.println(s);
		driver.findElement(By.xpath("(//div[contains(@class,'a-checkbox a-checkbox-fancy')]/following-sibling::span)[3]")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'a-checkbox a-checkbox-fancy')]/following-sibling::span)[4]")).click();
	    driver.findElement(By.className("a-dropdown-prompt")).click();
		driver.findElement(By.xpath("//*[@id=\"s-result-sort-select_4\"]")).click();
		System.out.println(("Printing Bag1 details"));  
		System.out.println(("--------------------------"));
		String name = driver.findElement(By.xpath("//div[@class='a-row a-size-base a-color-secondary']//span[1]")).getText();
		System.out.println(name);
		
		String name2 = driver.findElement(By.xpath("(//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']//*[@class='a-size-base-plus a-color-base a-text-normal'])[1]")).getText();
		System.out.println(name2);
 	
		String name3 = driver.findElement(By.xpath("(//*[@class='a-price-whole'])[1]")).getText();
		System.out.println(name3);
		
	}

}
