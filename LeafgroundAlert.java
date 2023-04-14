package week4day4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundAlert {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
	      
	    driver.manage().window().maximize();
	      
	    driver.get("https://leafground.com/dashboard.xhtml");
	      
	//    driver.findElement(By.xpath("//*[@class='pi pi-align-left']")).click();
	    driver.findElement(By.xpath("//*[@class='pi pi-globe layout-menuitem-icon']")).click();
	    driver.findElement(By.xpath("//*[@class='pi pi-fw pi-clone layout-menuitem-icon']")).click();
	    driver.findElement(By.xpath("(//*[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-left ui-button-outlined'])[1]")).click();
	    Alert alert_t= driver.switchTo().alert();
	    alert_t.accept();
	    
	    driver.findElement(By.xpath("(//*[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-left ui-button-success'])[1]")).click();
	    Alert alert_q= driver.switchTo().alert();
	    alert_q.sendKeys("test");
	    alert_q.accept();
	    
	    
	    driver.findElement(By.xpath("(//*[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-left ui-button-warning'])[1]")).click();
	    Alert alert_r= driver.switchTo().alert();
	    alert_r.dismiss();
	    
	    driver.findElement(By.xpath("(//*[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-left'])[1]")).click();
	  //Alert alert_s= driver.switchTo().alert();
	    driver.findElement(By.xpath("//*[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-left ui-button-secondary']")).click();
	    
	    
	    driver.findElement(By.xpath("//*[@class='ui-button-icon-left ui-icon ui-c pi pi-trash']")).click();
	  // Alert alert_a= driver.switchTo().alert();
	    driver.findElement(By.xpath("//*[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-left ui-confirmdialog-yes']")).click();
	 
	   // driver.findElement(By.xpath("(//*[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-left ui-button-outlined'])[2]")).click();
	   // driver.findElement(By.xpath("(//*[@class='ui-dialog-titlebar-icon ui-dialog-titlebar-close ui-corner-all'])[3]")).click();
	    
	    driver.findElement(By.xpath("(//*[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-left ui-button-outlined'])[2]")).click();
	    driver.findElement(By.xpath("//*[@class='ui-icon ui-icon-minus']")).click();
	 //   driver.findElement(By.xpath("//*[@class='ui-icon ui-icon-extlink']")).click();
	 //   driver.findElement(By.xpath("(//*[@class='ui-icon ui-icon-closethick'])[3]")).click();

	 //   driver.findElement(By.xpath("//*[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-left ui-button-help']")).click();
	 //   driver.findElement(By.xpath("(//*[@class='ui-dialog-titlebar-icon ui-dialog-titlebar-close ui-corner-all'])[2]")).click();
	    
	    
	    
	    
	}

}
