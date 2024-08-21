package package6;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Class61 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/js/js_popup.asp");
	//	driver.manage().window().maximize();
		
		WebElement logo= driver.findElement(By.xpath("(//i[contains(@class,'fa fa-logo ws-text-green')])[1]"));
		boolean result=logo.isDisplayed();
		if(result==true)
		{
			System.out.println("logo is displyed");
		}
		else
		{
			System.out.println("lo is not displyed");
		}
		
		
	
		WebElement try1= driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));
		try1.click();
		
		
		WebElement try2= driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[2]"));
		try2.click();
		
		
		WebElement try3= driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[3]"));
		try3.click();
		
		
		WebElement try4= driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[4]"));
		try4.click();
		
		
		ArrayList<String> add= new ArrayList<String>(driver.getWindowHandles());
		
		System.out.println(add.get(0));
		System.out.println(add.get(1));
		System.out.println(add.get(2));
		System.out.println(add.get(3));
		System.out.println(add.get(4));
		
		driver.switchTo().window(add.get(0));
		System.out.println(driver.getCurrentUrl());
		

		driver.switchTo().window(add.get(1));
		System.out.println(driver.getCurrentUrl());
		WebElement i1= driver.findElement(By.xpath("(//iframe[@frameborder='0'])[2]"));

		driver.switchTo().frame(i1);
		
		WebElement button1= driver.findElement(By.xpath("//button[text()='Try it']"));
		button1.click();
	
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		
		driver.switchTo().window(add.get(0));
		driver.switchTo().window(add.get(2));
		System.out.println(driver.getCurrentUrl());
		WebElement i2= driver.findElement(By.xpath("(//iframe[@frameborder='0'])[2]"));
		
		driver.switchTo().frame(i2);
		
		WebElement button2= driver.findElement(By.xpath("//button[text()='Try it']"));
		button2.click();
	
		Alert alt2=driver.switchTo().alert();
		System.out.println(alt2.getText());
		alt2.accept();
		
		driver.switchTo().window(add.get(0));
		
		driver.switchTo().window(add.get(3));
		System.out.println(driver.getCurrentUrl());
		WebElement i3= driver.findElement(By.xpath("(//iframe[@frameborder='0'])[2]"));
	
		driver.switchTo().frame(i3);
		
		WebElement button3= driver.findElement(By.xpath("//button[text()='Try it']"));
		button3.click();
		
		Alert alt3=driver.switchTo().alert();
		System.out.println(alt3.getText());
		alt3.accept();
		
		
		driver.switchTo().window(add.get(0));
		
		driver.switchTo().window(add.get(4));
		System.out.println(driver.getCurrentUrl());
		WebElement i4= driver.findElement(By.xpath("(//iframe[@frameborder='0'])[2]"));
	
		driver.switchTo().frame(i4);
		
		WebElement button4= driver.findElement(By.xpath("//button[text()='Try it']"));
		button4.click();
		
		Alert alt4=driver.switchTo().alert();
		System.out.println(alt4.getText());
		alt4.accept();
		
		
		driver.switchTo().window(add.get(0));
		
	
		
		driver.quit();
	}


}
