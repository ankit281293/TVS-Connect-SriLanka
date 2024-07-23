package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;
import utilities.Androidactions;

public class AddVehicle extends Androidactions {

	public AddVehicle(WebDriver driver) {
		super(driver);
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Standard Edition']/..[@resource-id='com.tvsm.connect.srilanka:id/rel']/following-sibling::android.widget.ImageView[@resource-id='com.tvsm.connect.srilanka:id/up_down_arrows']")
	private WebElement addSEVehicle;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Standard Edition']/..[@resource-id='com.tvsm.connect.srilanka:id/rel']/following-sibling::android.widget.ImageView[@resource-id='com.tvsm.connect.srilanka:id/up_down_arrows']")
	private WebElement clkdownArrow;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Racing Edition']/..[@resource-id='com.tvsm.connect.srilanka:id/rel']/following-sibling::android.widget.ImageView[@resource-id='com.tvsm.connect.srilanka:id/up_down_arrows']")
	private WebElement addREVehicle;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Racing Edition']/..[@resource-id='com.tvsm.connect.srilanka:id/rel']/following-sibling::android.widget.ImageView[@resource-id='com.tvsm.connect.srilanka:id/up_down_arrows']")
	private WebElement clkdownarrow;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='TVS iQUBE']/..[@resource-id='com.tvsm.connect.srilanka:id/rel']/following-sibling::android.widget.ImageView[@resource-id='com.tvsm.connect.srilanka:id/up_down_arrows']")
	private WebElement addiQube;
	
	
	//Actions
	public void addStandardEdition() throws InterruptedException
	{
		
		addSEVehicle.click();
	    addVehicle();
	}
	
	public void allowDevicePermissions()
	{
	    allowAppPermission();
	}
	
	public void addRacingEdition(String Text)
	{
		addnewbike();
		addREVehicle.click();
		addVehicle();
		clkdownarrow.click();
		
	}
	public void addiQUBE(String Text)
	{
		ScrollToText(Text);
		addnewbike();
		addiQube.click();
		addVehicle();
		
		
	}
}
	
	


