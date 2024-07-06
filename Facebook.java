package task18;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// TODO Auto-generated method stub
		
		driver.findElement(By.partialLinkText("Create new account")).click();
		
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[1]")).sendKeys("Diya");
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("ken");
		
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9566700270");
		
		driver.findElement(By.id("password_step_input")).sendKeys("You@987654");
		
		Select fil = new Select (driver.findElement(By.xpath("//select[@name='birthday_day']")));
		fil.selectByVisibleText("11");
		
		Select file = new Select (driver.findElement(By.xpath("//select[@name='birthday_month']")));
		file.selectByVisibleText("Jul");
		
		
		Select file1 = new Select (driver.findElement(By.xpath("//select[@name='birthday_year']")));
		file1.selectByVisibleText("1997");
		
		
		
		driver.findElement(By.xpath("//input[@value='1']")).click();
		
		
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
		//driver.findElement(By.xpath("//button[@name='confirm']")).click();( otp login confirm button)
		
		
		
		
		
		String ele = driver.findElement(By.xpath("//span[@class='x1lliihq x6ikm8r x10wlt62 x1n2onr6']")).getText();
		
		System.out.println(ele);





	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
				
				
				
				
				
				
				
		
		
		
		
		
		
	}

}
