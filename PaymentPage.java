package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class PaymentPage {
	final WebDriver driver;

	@FindBy(how = How.XPATH, using = "//*[@id=\"payment-contact-form\"]/div[2]/div[6]/div/div[2]/label/span")
	public WebElement anotherCardBtn;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"AccountNumber\"]")
	public WebElement accountNrTxt;
	
	public void dropdownNewCard() {
		anotherCardBtn.click();
	}
	
	public boolean verifyAccountNr(String cardNr) {
		boolean status = false;
		System.out.println("Verify card number: " + cardNr);
		accountNrTxt.sendKeys(cardNr);
		accountNrTxt.sendKeys(Keys.RETURN);
		if(driver.findElement(By.xpath("//*[@id=\"payment-contact-form\"]/div[2]/div[6]/div/div[2]/div/div[1]/div[1]/div[1]/label[2]")).isDisplayed()) {
			status = true;
		}
		return status;
	}
	
	
	public PaymentPage(WebDriver driver) {
		 
		this.driver = driver;
		System.out.println("Entered Payment page");
 
		}
	
}
