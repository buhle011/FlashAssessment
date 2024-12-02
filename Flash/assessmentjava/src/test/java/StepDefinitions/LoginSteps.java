package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjects.LoginObject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.messages.types.Duration;

public class LoginSteps {
	WebDriver driver =null;
	WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofMillis(1000));
	
	@Given("user navigate to the website")
	public void user_navigate_to_the_website() {
		System.setProperty("webdriver.chrome.driver","C:/Flash/assessmentjava/Drivers/chromedriver.exe");
		driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");	
	}

	@Given("Register user")
	public void register_user() {
	    
		 driver.findElement(LoginObject.Register).click();
		 driver.findElement(LoginObject.radioM).click();
		 driver.findElement(LoginObject.firstNametextfield).sendKeys("lungani");
		 driver.findElement(LoginObject.lastNametextfield).sendKeys("Delihlazo");
		 driver.findElement(LoginObject.emailtextfield).sendKeys("banzi5380@gmail.com");
		 driver.findElement(LoginObject.passwordtextfield).sendKeys("073089");
		 driver.findElement(LoginObject.confirmpassword).sendKeys("073089");
		 driver.findElement(LoginObject.registerButton).click();
	}

	@Then("Login user")
	public void login_user() {
	   driver.findElement(LoginObject.LoginButton).click();
	   driver.findElement(LoginObject.emailtextfield).sendKeys("banzi5380@gmail.com");
	   driver.findElement(LoginObject.passwordtextfield).sendKeys("073089");
	   driver.findElement(LoginObject.LoginButtonexist).click();
	   
	}

	@Then("Cick on computers tab")
	public void cick_on_computers_tab() {
		driver.findElement(LoginObject.Computer_tab).click();
	}

	@Then("select desktops option")
	public void select_desktops_option() {
		driver.findElement(LoginObject.Desktops).click();
	}

	@Then("Sort desktops by all options.")
	public void sort_desktops_by_all_options() {
	WebElement  dropdown = driver.findElement(By.xpath("//select[@id='products-orderby']"));
	Select SelectObject = new Select (dropdown);
	SelectObject.selectByIndex(0);
	
		
	}

	@Then("Add all desktop items to cart and validate total price.")
	public void add_all_desktop_items_to_cart_and_validate_total_price() throws InterruptedException {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0, 1000)");
		 
		  wait = new WebDriverWait(driver, java.time.Duration.ofMillis(1000));
	      WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Simple Computer')]")));
	      element.click();
	      
		wait = new WebDriverWait(driver, java.time.Duration.ofMillis(1000));
		WebElement radioButtonP = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='radio'])[1]")));
		radioButtonP.click();
		
	    wait = new WebDriverWait(driver, java.time.Duration.ofMillis(1000));
		WebElement radioButtonRam = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='radio'])[4]")));
		radioButtonRam.click();
		
		
		wait = new WebDriverWait(driver, java.time.Duration.ofMillis(1000));
		WebElement radioButtonHDD = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='radio'])[6]")));
		radioButtonHDD.click();
		
		
		WebElement checkbox = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		checkbox.click();
		
		driver.findElement(LoginObject.AddtoCartButton).click();
		driver.findElement(LoginObject.ShoppingCart).click();
		
		driver.findElement(LoginObject.LoginLabel).click();
		
		
		// checkbox = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		//checkbox.click();
		
		driver.findElement(LoginObject.updateCart).click();
		
		  wait = new WebDriverWait(driver, java.time.Duration.ofMillis(1000));
	      element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Log in')]")));
	      element.click();
	      
	      driver.findElement(LoginObject.emailtextfield).sendKeys("banzi5380@gmail.com");
		  driver.findElement(LoginObject.passwordtextfield).sendKeys("073089");
		  driver.findElement(LoginObject.userLoginButton).click();
		  
		  driver.findElement(LoginObject.ShoppingCart).click();
		  
		    WebElement  dropdownC = driver.findElement(By.xpath("//select[@id='CountryId']"));
			Select SelectObjectC = new Select (dropdownC);
			SelectObjectC.selectByVisibleText("South Africa");
		  
		 
			WebElement  dropdownO = driver.findElement(By.xpath("//select[@id='StateProvinceId']"));
			Select SelectObject = new Select (dropdownO);
			SelectObject.selectByIndex(0);
			
			driver.findElement(LoginObject.postalCodetextField).sendKeys("7441");
			
			 checkbox = driver.findElement(By.xpath("//input[@id='termsofservice']"));
			checkbox.click();
			
			driver.findElement(LoginObject.CheckoutButton).click();
			
			
		}

		
		
		
	

	@Then("Remove {int} item from cart and validate total price.")
	public void remove_item_from_cart_and_validate_total_price(Integer int1) {
		

	}

	@Then("Checkout items from cart and validate checkout.")
	public void checkout_items_from_cart_and_validate_checkout() {
		System.out.println("I am not a ble complete task on automation it's not accepting username and password");
	}

	@Then("Fill in all required information for checkout and complete transaction.")
	public void fill_in_all_required_information_for_checkout_and_complete_transaction() {
		System.out.println("Fill in all required information for checkout and complete transaction");
	}

	@Then("Navigate to my account and validate order is created successful.")
	public void navigate_to_my_account_and_validate_order_is_created_successful() {
		System.out.println("Navigate to my account and validate order is created successful");
	}

}
