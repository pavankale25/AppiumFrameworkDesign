package Generalstore_test;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import FrameworkDesign.BaseTest;
import GeneralStore_main.FormPage;
import GeneralStore_main.Product_page;
import GeneralStore_main.Cartpage;
public class Formpage_test extends BaseTest  {
	public Product_page productpage;
	
	@Test
	public void form() throws InterruptedException {
		//ExtentTest test = extent.createTest("Initial Demo");
		formp.nameSend();
		formp.gender_selection();
		Product_page product_page = formp.submitform();
		//Product_page productpage = new Product_page(driver);
		product_page.AddToCart();
		Cartpage cartpage = product_page.gotocartPage();
		
	//	Cartpage cart = new Cartpage(driver);
	//	cart.form_complete();
		
		//Cartpage cartpage1 = cart.form_complete();
		
			

		
	}

		
		
		
	

}
