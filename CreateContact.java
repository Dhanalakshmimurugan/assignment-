package week3.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {
	public static void main(String[] args) {
		EdgeDriver driver =new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.className("crmsfa")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("DHANALAKSHMI");
		driver.findElement(By.id("lastNameField")).sendKeys("MURUGAN");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("DHANA");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("MURUGAN");
		driver.findElement(By.xpath("//input[@id='createContactForm_departmentName']")).sendKeys("TESTING");
		driver.findElement(By.id("createContactForm_description")).sendKeys("abcxyzjfsddffds");
		driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("dhana1407@gmail.com");
		WebElement ele=driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select Selectstate=new Select(ele);
		Selectstate.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.className("subMenuButton")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("It is necessary to create a lead");
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println(driver.getTitle());
		
	}

}
