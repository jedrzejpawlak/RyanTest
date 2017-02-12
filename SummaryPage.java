package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SummaryPage {
	
final WebDriver driver;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[1]/div[1]/div/div[3]/div/div[2]")
	public WebElement checkoutBtn;
	
	public void proceed() {
		checkoutBtn.click();
	}
	
	public SummaryPage(WebDriver driver) {
		 
		this.driver = driver;
		System.out.println("Entered Summary page");
		}

}
