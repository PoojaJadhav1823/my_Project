package project;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register_account {

		public static void main(String[]args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "D:\\latest version chrome\\chromedriver-win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=account/register");
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("pooja");
			
			driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Jadhav");
			
			driver.findElement(By.xpath("//input[@type='email']")).sendKeys("poojajadhav3948@gmail.com");
				
			driver.findElement(By.xpath("//input[@name='telephone']")).sendKeys("7756965802");
			
			driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Pooja@1823");
			
			driver.findElement(By.xpath("//input[@placeholder='Password Confirm']")).sendKeys("Pooja@1823");
			
			//driver.findElement(By.xpath("//*[@id=\"input-confirm\"]")).sendKeys("Pooja@1823");
			
			driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/div[2]/label")).click();
			
			driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/div")).click();
			
			driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input")).click();
		}	
		
		
		
		
		
		
	}


