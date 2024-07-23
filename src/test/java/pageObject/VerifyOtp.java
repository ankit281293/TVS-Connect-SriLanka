package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;
import utilities.Androidactions;

public class VerifyOtp extends Androidactions{

	public VerifyOtp(WebDriver driver) {
		super(driver);
		
	}
	@AndroidFindBy(id="com.tvsm.connect.srilanka:id/button_otp_continue")
	private WebElement otpContinuebtn;
	
	//Actions
	
	public void verifyOtp()
   	{
   		driver.findElement(By.id("com.tvsm.connect.srilanka:id/otp_one_email")).sendKeys("8");
   		driver.findElement(By.id("com.tvsm.connect.srilanka:id/otp_two_email")).sendKeys("4");
   		driver.findElement(By.id("com.tvsm.connect.srilanka:id/otp_three_email")).sendKeys("2");
   		driver.findElement(By.id("com.tvsm.connect.srilanka:id/otp_four_email")).sendKeys("6");
   		driver.findElement(By.id("com.tvsm.connect.srilanka:id/otp_five_email")).sendKeys("9");
   		driver.findElement(By.id("com.tvsm.connect.srilanka:id/otp_six_email")).sendKeys("1"); 
   		otpContinuebtn.click();
   	}

}


