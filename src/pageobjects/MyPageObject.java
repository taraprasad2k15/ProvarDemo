package pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="MyPageObject"                                
     , summary=""
     , relativeUrl=""
     , connection="SnapDeal"
     )             
public class MyPageObject {

	WebDriver driver;

	public MyPageObject(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public String getUrl()
	{
		String Url = driver.getCurrentUrl();
		return Url;
	}

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)=concat('Men',\"'\",'s Fashion')]")
	public WebElement menSFashion;
	@LinkType()
	@FindBy(xpath = "//span[normalize-space(.)='Cart']")
	public WebElement Cart;
	@TextType()
	@FindBy(xpath = "//div[normalize-space(.)='Sports Footwear']")
	public WebElement SportsFootware;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='New']")
	public WebElement New;
			
}
