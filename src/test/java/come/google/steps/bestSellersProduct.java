package come.google.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.google.common.Base;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class bestSellersProduct  extends Base{
	

	@Given("i am on the amazon homepage")
	public void i_am_on_the_amazon_homepage() {
	    
	launchBrowser();
		
	}

	@When("i click on the all button")
	public void i_click_on_the_all_button() {
	    
	WebElement allbutton = driver.findElement( By.id("nav-hamburger-menu"))	;
	
	allbutton.click();
	
	}

	@When("i click onb the best seller button")
	public void i_click_onb_the_best_seller_button() {
		WebElement bestSellers = driver.findElement(By.xpath("(//a[@class='hmenu-item' and contains(text(), 'Best Sellers')])[1]"));
		
	   
		
	}

	@Then("i can see the list of best selling product successfully")
	public void i_can_see_the_list_of_best_selling_product_successfully() {
	   
		 
	}


}
