package Final_mock_Sales;


import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Sales_product {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.vtiger.com/vtigercrm/");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("appnavigator")).click();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//span[text()=' SALES']"));
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()=' Products'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("Products_listView_basicAction_LBL_ADD_RECORD")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("Products_editView_fieldName_productname")).sendKeys("Phone");
		Thread.sleep(1000);
		driver.findElement(By.id("Products_editView_fieldName_productcode")).sendKeys("U000999");
		Thread.sleep(1000);
		driver.findElement(By.id("Products_editView_fieldName_sales_start_date")).sendKeys("09-01-2020");
		Thread.sleep(1000);
		WebElement ele1 = driver.findElement(By.xpath("//select[@name='manufacturer']"));
		Select s1= new Select(ele1);
		s1.selectByValue("MetBeat Corp");
		Thread.sleep(1000);
		WebElement ele2 = driver.findElement(By.xpath("//select[@name='productcategory']"));
		Select s2 = new Select(ele2);
		s2.selectByValue("Software");
		Thread.sleep(1000);
		driver.findElement(By.id("Products_editView_fieldName_start_date")).sendKeys("09-07-2021");
		//driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.id("Products_editView_fieldName_sales_end_date")).sendKeys("04-06-2023");
		Thread.sleep(1000);
		driver.findElement(By.id("Products_editView_fieldName_expiry_date")).sendKeys("27-05-2023");
		Thread.sleep(1000);
		driver.findElement(By.id("Products_editView_fieldName_vendor_id_create")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("Vendors_editView_fieldName_vendorname")).sendKeys("Realme1");
		Thread.sleep(1000);
		driver.findElement(By.id("Vendors_editView_fieldName_email")).sendKeys("adhawale78@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("Vendors_editView_fieldName_phone")).sendKeys("983798773");
		Thread.sleep(1000);
		WebElement ele3 = driver.findElement(By.xpath("(//select[@name='assigned_user_id'])[2]"));
		Select s3 = new Select(ele3);
		s3.selectByValue("3");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//strong[text()='Save']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("Products_editView_fieldName_website")).sendKeys("www.flipkart.com");
		Thread.sleep(1000);
		driver.findElement(By.id("Products_editView_fieldName_vendor_part_no")).sendKeys("2");
		Thread.sleep(1000);
		driver.findElement(By.id("Products_editView_fieldName_mfr_part_no")).sendKeys("4");
		Thread.sleep(1000);
		driver.findElement(By.id("Products_editView_fieldName_productsheet")).sendKeys("h1");
		Thread.sleep(1000);
		driver.findElement(By.id("Products_editView_fieldName_serial_no")).sendKeys("3");
		Thread.sleep(1000);
		WebElement ele4 = driver.findElement(By.xpath("//select[@name='glacct']"));
		Select s4 = new Select(ele4);
		s4.selectByValue("304-Sales-Software-Support");
		Thread.sleep(1000);
		driver.findElement(By.id("Products-editview-fieldname-unit_price")).sendKeys("30000");
		Thread.sleep(1000);
		driver.findElement(By.id("Products_editView_fieldName_commissionrate")).sendKeys("10");
		Thread.sleep(1000);
		JavascriptExecutor jse3= (JavascriptExecutor)driver;
		jse3.executeScript("window.scrollBy(0,150)");

		driver.findElement(By.id("tax1_check")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("tax2_check")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("tax3_check")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("Products_editView_fieldName_purchase_cost")).sendKeys("32000");
		Thread.sleep(1000);
		WebElement ele5 = driver.findElement(By.xpath("//select[@name='usageunit']"));
		Select s5= new Select(ele5);
		s5.selectByValue("Carton");
		Thread.sleep(1000);
		driver.findElement(By.id("Products_editView_fieldName_qty_per_unit")).sendKeys("30");
		Thread.sleep(1000);
		driver.findElement(By.id("Products_editView_fieldName_qtyinstock")).sendKeys("900");
		Thread.sleep(1000);
		driver.findElement(By.id("Products_editView_fieldName_reorderlevel")).sendKeys("007");
		Thread.sleep(1000);
		WebElement ele6 = driver.findElement(By.xpath("//select[@name='assigned_user_id']"));
		Select s6 = new Select(ele6);
		s6.selectByValue("3");
		Thread.sleep(1000);
		driver.findElement(By.id("Products_editView_fieldName_qtyindemand")).sendKeys("89");
		Thread.sleep(1000);
		JavascriptExecutor jse2= (JavascriptExecutor)driver;
		jse2.executeScript("window.scrollBy(0,200)");

		driver.findElement(By.xpath("//div[@class='fileUploadBtn btn btn-primary']")).click();
		Thread.sleep(1000);
		Runtime.getRuntime().exec("C:\\Users\\adhaw\\OneDrive\\Desktop\\DragDropFileUpload.exe");
		Thread.sleep(1000);
		driver.findElement(By.id("Products_editView_fieldName_description")).sendKeys("Done.");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@title='Atlas Jeniffer(admin)']")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Sign Out")).click();

	}

}
