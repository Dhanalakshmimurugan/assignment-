package week3.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class EditLead {
	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement( By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.linkText("Mohamedibrahim")).click();
		String text=driver.getTitle();
		System.out.println(text);
		driver.findElement(By.xpath("//a[text()='Edit']")).click(); 
		driver.findElement(By.xpath("//input[@value='Testleaf']")).clear();
		driver.findElement(By.xpath("//input[@value='Testleaf']")).sendKeys("Testleaf@123");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		String info=driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		System.out.println(info);
		driver.close();
	}

}
