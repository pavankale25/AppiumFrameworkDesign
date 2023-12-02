package GeneralStore_main;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.android.AndroidDriver;

public class Product_page {
	public AndroidDriver driver;
	public Product_page(AndroidDriver driver){
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='ADD TO CART']")
	private WebElement Add_to_cart;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/appbar_btn_cart")
	private WebElement cart_gallery;
	
	public void AddToCart() {
		Add_to_cart.click();
	}
	
	public Cartpage gotocartPage() {
		cart_gallery.click();
		return new Cartpage(driver);
	}

}
