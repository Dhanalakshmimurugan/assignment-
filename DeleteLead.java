package week3.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DeleteLead {
public static void main(String[] args) throws InterruptedException {
	EdgeDriver driver=new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.xpath("//a[text()='Leads']")).click();
	driver.findElement( By.xpath("//a[text()='Create Lead']")).click();
	driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
	driver.findElement(By.linkText("Phone")).click();
	driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).clear();
	driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).sendKeys("1");
	driver.findElement(By.id("ext-gen266")).sendKeys("91");
	driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9445623571");
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	String text=driver.findElement(By.className("linktext")).getText();
	System.out.println(text);
	//driver.findElement(( By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]"))).click();
	driver.findElement(By.xpath("//a[text()='DHANALAKSHMI']")).click();
	driver.findElement(By.xpath("//a[text()='Delete']")).click();
	driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
	driver.findElement(By.xpath("//span[text()='Name and ID']")).click();
	driver.findElement(By.id("ext-gen246")).sendKeys("13227");
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(5000);
	String info=driver.findElement(By.id("ext-gen437")).getText();
	System.out.println(info);
	Thread.sleep(5000);
	driver.close();
	
	
	
			
}
}
