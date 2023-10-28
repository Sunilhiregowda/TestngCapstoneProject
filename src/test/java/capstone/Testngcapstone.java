package capstone;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.Assert;
//import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testngcapstone  {
	private static WebDriver  driver=null;
	  @BeforeSuite
	  public void setup() {
		  WebDriverManager.operadriver().setup();
		  driver=new OperaDriver();
		driver.manage().window().maximize();
	  }
	  @AfterSuite
	  public void windup() {
		  driver.quit();
	  }
	  @Test(priority=1)
	  public void test1 () throws IOException {
		  driver.get("http://automationpractice.com/index.php");
		  	driver.manage().window().maximize();
		  	String expectedtitle = "My Store";
		  	String actualtitle= driver.getTitle();
		    TakesScreenshot scrshot = (TakesScreenshot) driver;
			   File scrshotfile= scrshot.getScreenshotAs(OutputType.FILE);
			    String destinationfilename ="mystore" + (new Date()).getTime() +".png";
			   File destinationfile = new File ("ScreenShot/" + destinationfilename  );
			   FileUtils.copyFile(scrshotfile, destinationfile);
			   
		  	Assert.assertEquals( expectedtitle, actualtitle,"automation page is not available");
		
	  }

		@Test(priority=2)
		   public void test2() {
		   	
		   	driver.get("http://automationpractice.com/index.php");
		   	driver.manage().timeouts().implicitlyWait(3,TimeUnit.MINUTES);
		   	
		   	driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/a")).click();
		   	
		   	String expectedtitle = "Dresses - My Store";
		   	String actualtitle= driver.getTitle();
		   	Assert.assertEquals( expectedtitle, actualtitle," Dresses  my store is not avilable");
		   	driver.navigate().back();
		   	}
		   @Test(priority=3)
		   public void test3() {
		   	
		   	driver.get("http://automationpractice.com/index.php");
		   	driver.manage().timeouts().implicitlyWait(3,TimeUnit.MINUTES);
		   	
		   	driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/a")).click();
		   	
		   	String expectedtitle = "T-shirts - My Store";
		   	String actualtitle= driver.getTitle();
		   	Assert.assertEquals( expectedtitle, actualtitle," t shirts my store is not avilable");
		   	driver.navigate().back();
		   }
		   @Test(priority=4)
		   public void test4() {
		   	
		   	driver.get("http://automationpractice.com/index.php");
		   	driver.manage().timeouts().implicitlyWait(3,TimeUnit.MINUTES);
		   	
		   	driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/a")).click();
		   	
		   	String expectedtitle = "Women - My Store";
		   	String actualtitle= driver.getTitle();
		   	Assert.assertEquals( expectedtitle, actualtitle,"women my store is not avilable");
		   	driver.navigate().back();
		   }
		   @Test(priority=5)
		   public void test5() {
		   	
		   	driver.get("http://automationpractice.com/index.php");
		   	driver.manage().timeouts().implicitlyWait(3,TimeUnit.MINUTES);
		   	
		   	driver.findElement(By.id("search_query_top")).sendKeys("partyware",Keys.ENTER);
		   	
		   	String expectedtitle = "Search - My Store";
		   	String actualtitle= driver.getTitle();
		   	Assert.assertEquals( expectedtitle, actualtitle,"Search my store is not avilable");
		   	driver.navigate().back();
		   }
		   
		  
		   
		  
		   @Test(priority=6)
		   public void test6() throws IOException {
		   	
		   	driver.get("http://automationpractice.com/index.php");
		  	driver.manage().timeouts().implicitlyWait(3,TimeUnit.MINUTES);
		   	
		   	driver.findElement(By.id("newsletter-input")).sendKeys("302khasimvali@gmail.com");
		   	driver.findElement(By.name("submitNewsletter")).click();
		   	String expectedtitle = "My Store";
		   	String actualtitle= driver.getTitle();
		    TakesScreenshot scrshot = (TakesScreenshot) driver;
			   File scrshotfile= scrshot.getScreenshotAs(OutputType.FILE);
			    String destinationfilename ="mystorelogin" + (new Date()).getTime() +".png";
			   File destinationfile = new File ("ScreenShot/" + destinationfilename  );
			   FileUtils.copyFile(scrshotfile, destinationfile);
			   
		   	Assert.assertEquals( expectedtitle, actualtitle," news letter my store is not avilable");
		   	
		   }
		   @Test(priority=7)
		   public void test7() {
		   	
		   	driver.get("http://automationpractice.com/index.php");
		   	driver.manage().timeouts().implicitlyWait(3,TimeUnit.MINUTES);
		   	
		   	driver.findElement(By.xpath("/html/body/div/div[3]/footer/div/section[3]/ul/li[3]/a")).click();

		   	String expectedtitle = "Best sales - My Store";
		   	String actualtitle= driver.getTitle();
		   	Assert.assertEquals( expectedtitle, actualtitle," best sales my store is not avilable");
		   	driver.navigate().back();
		   }
		   @Test(priority=8)
		   public void test8() {
		   	
		   	driver.get("http://automationpractice.com/index.php");
		   	driver.manage().timeouts().implicitlyWait(3,TimeUnit.MINUTES);
		   	
		   	driver.findElement(By.xpath("/html/body/div/div[3]/footer/div/section[3]/ul/li[4]/a")).click();

		   	String expectedtitle = "Stores - My Store";
		   	String actualtitle= driver.getTitle();
		   	Assert.assertEquals( expectedtitle, actualtitle," stores my store is not avilable");
		   	driver.navigate().back();
		   }
		   
		   // Test cases for 2nd page 
		   @Test(priority=9)
		   
			  public void test9() throws IOException {
			     	
			     	driver.get("http://automationpractice.com/index.php");
			     	driver.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);
			     	
			    	driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a")).click();
			     	driver.findElement(By.id("email_create")).sendKeys("",Keys.ENTER);
			     		   	
			     	String expectedtitle = "Invalid email address.";
			     	String actualtitle= driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[1]/form/div/div[1]/ol/li")).getText();
			     	 TakesScreenshot scrshot = (TakesScreenshot) driver;
					   File scrshotfile= scrshot.getScreenshotAs(OutputType.FILE);
					    String destinationfilename ="mystore" + (new Date()).getTime() +".png";
					   File destinationfile = new File ("ScreenShot/" + destinationfilename  );
					   FileUtils.copyFile(scrshotfile, destinationfile);
			     	Assert.assertEquals( expectedtitle, actualtitle," login my store is not avilable");
			     	
			     }	
		   @Test(priority=10)
		   public void test10() throws IOException {
		   	
		   	driver.get("http://automationpractice.com/index.php");
		   	driver.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);
		   	
		  	driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a")).click();
		   	driver.findElement(By.id("email")).sendKeys("302khasimvali@gmail.com",Keys.ENTER);
		   	driver.findElement(By.id("passwd")).sendKeys("",Keys.ENTER);
		   	driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button/span")).click();	   	
		   	String expectedtitle = "Password is required.";
		   	String actualtitle= driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div[1]/ol/li")).getText();
		   	
		    TakesScreenshot scrshot = (TakesScreenshot) driver;
			   File scrshotfile= scrshot.getScreenshotAs(OutputType.FILE);
			    String destinationfilename ="mystore" + (new Date()).getTime() +".png";
			   File destinationfile = new File ("ScreenShot/" + destinationfilename  );
			   FileUtils.copyFile(scrshotfile, destinationfile);
		   	Assert.assertEquals( expectedtitle, actualtitle," login my store is not avilable");
		   }
		   
		   @Test(priority=11)
		   public void test11() throws IOException {
		   	
		   	driver.get("http://automationpractice.com/index.php");
		  	driver.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);
		   	
		  	driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a")).click();
		   	driver.findElement(By.id("email")).sendKeys("302khasimvali@gmail.com",Keys.ENTER);
		   	driver.findElement(By.id("passwd")).sendKeys("XYZ",Keys.ENTER);
		   	driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button/span")).click();	   	
		   	String expectedtitle = "Invalid password.";
		   	String actualtitle= driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div[1]/ol/li")).getText();
		    TakesScreenshot scrshot = (TakesScreenshot) driver;
			   File scrshotfile= scrshot.getScreenshotAs(OutputType.FILE);
			    String destinationfilename ="mystore" + (new Date()).getTime() +".png";
			   File destinationfile = new File ("ScreenShot/" + destinationfilename  );
			   FileUtils.copyFile(scrshotfile, destinationfile);
		   	Assert.assertEquals( expectedtitle, actualtitle," login my store is not avilable");
		   }
		   
		   @Test(priority=12)
		   public void test12() throws IOException {
		   	
		   	driver.get("http://automationpractice.com/index.php");
		   	driver.manage().timeouts().implicitlyWait(3,TimeUnit.MINUTES);
		   	
		  	driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a")).click();
		   	driver.findElement(By.id("email")).sendKeys("");
		   	driver.findElement(By.id("passwd")).sendKeys("XYZ",Keys.ENTER);
		   	driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button/span")).click();	   	
		   	String expectedtitle = "An email address required.";
		   	String actualtitle= driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div[1]/ol/li")).getText();
		    TakesScreenshot scrshot = (TakesScreenshot) driver;
			   File scrshotfile= scrshot.getScreenshotAs(OutputType.FILE);
			    String destinationfilename ="mystore" + (new Date()).getTime() +".png";
			   File destinationfile = new File ("ScreenShot/" + destinationfilename  );
			   FileUtils.copyFile(scrshotfile, destinationfile);
		   	Assert.assertEquals( expectedtitle, actualtitle," login my store is not avilable");
		   	driver.navigate().back();
		   }
		   
		   @Test(priority=13)
		   public void test13() throws IOException {
		   	
		   	driver.get("http://automationpractice.com/index.php");
		   driver.manage().timeouts().implicitlyWait(3,TimeUnit.MINUTES);
		   	
		  	driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a")).click();
		   	driver.findElement(By.id("email")).sendKeys("302khasimvali@gmail.com");
		   	driver.findElement(By.id("passwd")).sendKeys("Khasimvali@9381",Keys.ENTER);
		   	driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/ul/li/a/span")).click();
		   	driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[2]/a")).click();
		   	String expectedtitle = "My Store";
		   	String actualtitle= driver.getTitle();
		    TakesScreenshot scrshot = (TakesScreenshot) driver;
			   File scrshotfile= scrshot.getScreenshotAs(OutputType.FILE);
			    String destinationfilename ="mystore" + (new Date()).getTime() +".png";
			   File destinationfile = new File ("ScreenShot/" + destinationfilename  );
			   FileUtils.copyFile(scrshotfile, destinationfile);
		   	Assert.assertEquals( expectedtitle, actualtitle,"  my store is not avilable");
		   	
		   }
  }