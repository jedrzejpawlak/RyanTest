package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class TicketPage {
	
	final WebDriver driver;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[1]/form/div[1]/div[1]/div[3]/div/div[2]/div/label/div[1]/span/span[1]")
	public WebElement priceTo;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[1]/form/div[1]/div[2]/div[3]/div/div[2]/div/label/div[1]/span/span[1]")
	public WebElement priceBack;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[1]/form/div[2]/div")
	public WebElement continueBtn;
	
	public void chooseTickets() {
		System.out.println("Choosing ticket options");
		priceTo.click();
		priceBack.click();
		continueBtn.click();
	}
	
	public TicketPage(WebDriver driver) {
		 
		this.driver = driver;
		System.out.println("Entered Tickets page");
 
		}

}
