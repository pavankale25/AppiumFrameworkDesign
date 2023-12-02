package GeneralStore_main;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class FormPage {
	
	public AndroidDriver driver;
	public FormPage(AndroidDriver driver) {  
		this.driver = driver;  //current class instance/variable -- this.driver
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@AndroidFindBy(id="com.androidsample.generalstore:id/spinnerCountry")
	private WebElement County_option;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/nameField")
	private WebElement name_field;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/radioMale")
	private WebElement radio_male_option;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/btnLetsShop")
	private WebElement lets_shop_btn;
	
	public void nameSend() {   //Action method
		name_field.sendKeys("name");
	}
	
	public void gender_selection() {
		radio_male_option.click();
	}
	
	public Product_page submitform() {
		lets_shop_btn.click();
		return new Product_page(driver);
		
	}

}
