package task18;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.switchTo().frame(0);
		
		WebElement sle = driver.findElement(By.xpath("//div[@class='ui-widget-content ui-draggable ui-draggable-handle']"));
		WebElement des = driver.findElement(By.xpath("//div[@class='ui-widget-header ui-droppable']"));
		
		Actions mouse = new Actions(driver);
		
		mouse.dragAndDrop(sle, des).perform();
		
		String ele = driver.findElement(By.xpath("//div[@class='ui-widget-header ui-droppable ui-state-highlight']")).getText();
		
		System.out.println(ele);
		
		
		
	}

}
