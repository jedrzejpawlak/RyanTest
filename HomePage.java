package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
	final WebDriver driver;
	
	@FindBy(how = How.ID, using = "Trip_Round")
	public WebElement returnBtn;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/form/div[2]/div[1]/div/div/div[1]/input")
	public WebElement fromTxt;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/form/div[2]/div[2]/div/div/div[1]/input")
	public WebElement toTxt;
	
	@FindBy(how = How.ID, using = "Trip_DepartureDate")
	public WebElement flyOut;
	
	@FindBy(how = How.ID, using = "Trip_ReturnDate")
	public WebElement flyBack;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/form/div[4]/div/div[1]/div/div/i[2]")
	public WebElement adultsPlusBtn;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/form/div[4]/div/div[3]/div/div/i[2]")
	public WebElement chlidrenPlusBtn;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/form/div[5]/div[2]/button")
	public WebElement letsGoBtn;
	
	public void enterFrom(String city) {
		fromTxt.sendKeys(city);
		fromTxt.sendKeys(Keys.RETURN);
		System.out.println("Entering From: " + city);
	}
	
	public void enterTo(String city) {
		toTxt.click();
		toTxt.sendKeys(city);
		toTxt.sendKeys(Keys.RETURN);
		System.out.println("Entering To: " + city);
	}
	
	public void selectDates(int from, int to) {
		System.out.println("Random dates, TO BE DONE");
		flyOut.click();
		driver.findElement(By.xpath("/html/body/div[9]/div[1]/table/tbody/tr[5]/td[4]")).click();
		flyBack.click();
		driver.findElement(By.xpath("/html/body/div[9]/div[1]/table/tbody/tr[6]/td[5]")).click();
	}
	
	public void addAdult(int adult) {
		System.out.println("Add: " + adult + " adults");
		for(int i=0; i<adult; i++) {
			adultsPlusBtn.click();
		}
	}
	
	public void addChildren(int child) {
		System.out.println("Add: " + child + " children");
		for(int i=0; i<child; i++) {
			chlidrenPlusBtn.click();
		}
	}
	
	public void letsGo() {
		letsGoBtn.click();
	}
	
	public HomePage(WebDriver driver) {
 
		this.driver = driver;
		System.out.println("Entered home page");
 
		}

}
