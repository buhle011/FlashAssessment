package PageObjects;

import org.openqa.selenium.By;

public class LoginObject {


	public static final By Register =By.xpath("//*[contains(text(),'Register')]");
	public static final By Login  = By.xpath("//*[contains(text(),'Log in')]");
	public static final By Computer_tab = By.xpath("(//*[contains(text(),'Computers')])[1]");
	public static final By firstNametextfield =By.xpath("//input[@id='FirstName']");
	public static final By lastNametextfield  = By.xpath("//input[@id='LastName']");
	public static final By emailtextfield = By.xpath("//input[@id='Email']");
	public static final By passwordtextfield = By.xpath("//input[@id='Password']");
	public static final By confirmpassword = By.xpath("//input[@id='ConfirmPassword']");
	public static final By registerButton = By.xpath("//input[@id='register-button']");
	public static final By radioM = By.xpath("//input[@id='gender-male']");
	public static final By LoginButton = By.xpath("//a[@class='ico-login']");
	public static final By LoginButtonexist = By.xpath("//input[@class='button-1 login-button']");
	public static final By Desktops=By.xpath("(//*[contains(text(),'Desktops')])[3]");
	public static final By SortbyLabel =By.xpath("//select[@id='products-orderby']");
	public static final By Sortby = By.xpath("//select[@id='products-orderby']");
	public static final By AddtoCartButton = By.xpath("(//input[@type='button'])[2]");
	public static final By CheckoutButton = By.xpath("//button[@id='checkout']");
	public static final By EditCart = By.xpath("//*[contains(text(),'Edit')]");
	public static final By ShoppingCart = By.xpath("//span[contains(text(),'Shopping cart')]");
	public static final By expensiveComputer = By.xpath("//*[contains(text(),'Build your own expensive computer')]");
	public static final By termsOfServices = By.xpath("//input[@id='termsofservice']");
	public static final By checkOutButton =By.xpath("//button[@id='checkout']");
	public static final By SelectCountry = By.xpath("//select[@id='CountryId']");
	public static final By Selectstate = By.xpath("//select[@id='StateProvinceId']");
	public static final By postalCodetextField = By.xpath("//input[@id='ZipPostalCode']");
	public static final By UpdateComputer = By.xpath("(//input[@type='button'])[3]");
	public static final By simpleComputer = By.xpath("//a[contains(text(),'Simple Computer')]");
	public static final By updateCart = By.xpath("(//input[@type='button'])[3]");
	public static final By LoginLabel = By.xpath("//a[contains(text(),'Log in')]");
	public static final By userLoginButton = By.xpath("(//input[@type='submit'])[2]");
	public static final By guestUser = By.xpath("//input[@class='button-1 checkout-as-guest-button']");
	;
	
	
	
	
}
