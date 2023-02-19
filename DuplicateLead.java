package week3.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class DuplicateLead {
public static void main(String[] args) {
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
	driver.findElement(By.xpath("//span[text()='Email']")).click();
	driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("@gmail.com");
	driver.findElement(By.xpath("//a[text()='ishu']")).click();
	driver.findElement(By.linkText("Duplicate Lead")).click();
	String i =driver.getTitle();
	if(i.equals("Duplicate Lead | opentaps CRM")) {
		System.out.println("THE TITLE IS VERFIED ");
		
	}else {
		System.out.println(i);
	}
	driver.findElement(By.xpath("//input[@name='submitButton']")).click();
	driver.close();
}
}
