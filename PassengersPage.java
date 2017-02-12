package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PassengersPage {
	final WebDriver driver;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[1]/div/form/div/div[2]/div[2]/div/div[2]/div/div/div/div[1]")
	public WebElement salutation1;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[1]/div/form/div/div[2]/div[3]/div[2]/div[2]/div/div/div/div[1]")
	public WebElement salutation2;
	
	@FindBy(how = How.ID, using = "adultFirstName0")
	public WebElement name1;
	
	@FindBy(how = How.ID, using = "adultFirstName1")
	public WebElement name2;
	
	@FindBy(how = How.ID, using = "chdFirstName2")
	public WebElement name3;
	
	@FindBy(how = How.ID, using = "adultLastName0")
	public WebElement lastname1;
	
	@FindBy(how = How.ID, using = "adultLastName1")
	public WebElement lastname2;
	
	@FindBy(how = How.ID, using = "chdLastName2")
	public WebElement lastname3;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[1]/div/form/div/div[3]/div/div/input")
	public WebElement continueBtn;
	
	public void fillNames(String n1, String ln1, String n2, String ln2, String n3, String ln3) {
		//Should be done with ArrrayList of Strings or CharSequences- not enough time
		System.out.println(String.format("Fill names form with %s %s %s %s %s and %s", n1,ln1,n2,ln2,n3,ln3));
		
		salutation1.click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/form/div/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div/div[1]")).click();
		salutation2.click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/form/div/div[2]/div[3]/div[2]/div[2]/div/div/div/div[2]/div/div[1]")).click();
		name1.sendKeys(n1);
		name1.sendKeys(Keys.RETURN);
		lastname1.sendKeys(ln1);
		lastname1.sendKeys(Keys.RETURN);
		name2.sendKeys(n2);
		name2.sendKeys(Keys.RETURN);
		lastname2.sendKeys(ln2);
		lastname2.sendKeys(Keys.RETURN);
		name3.sendKeys(n3);
		name3.sendKeys(Keys.RETURN);
		lastname3.sendKeys(ln3);
		lastname3.sendKeys(Keys.RETURN);	
	}
	
	public void proceed() {
		continueBtn.click();
	}
	
	public PassengersPage(WebDriver driver) {
		 
		this.driver = driver;
		System.out.println("Entered Passengers page");
	}

}
