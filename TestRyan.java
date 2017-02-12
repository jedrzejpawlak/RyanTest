package automationFramework;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

public class TestRyan {
	
	/**
	 * Test scenario:
	 * 1. Load http://m.ryanair.com
	 * 2. Fill flight information form
	 * 3. Choose tickets
	 * 4. Confirm flight/ tickets
	 * 5. Fill passengers information form
	 * 6. Add new credit card (invalid number)
	 * 7. Verify error message
	 * 
	 * 
	 * @author Jêdrzej Pawlak
	 */
	
	static WebDriver driver;
	
	@BeforeClass
	public static void setUp() {
		String exePath = "C:\\Users\\Jêdrzej\\Downloads\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		//chromeOptions.addArguments("user-data-dir=C:\\Users\\Jêdrzej\\AppData\\Local\\Google\\Chrome\\User Data\\Default");
		driver = new ChromeDriver(chromeOptions);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://m.ryanair.com/");
	}
	

	@Test
	public void testRyan() {
		HomePage home = PageFactory.initElements(driver, HomePage.class);
		fillTripInfo(home);
		
		TicketPage tickets = PageFactory.initElements(driver, TicketPage.class);
		tickets.chooseTickets();
		
		SummaryPage summary = PageFactory.initElements(driver, SummaryPage.class);
		summary.proceed();
		
		PassengersPage passengers = PageFactory.initElements(driver, PassengersPage.class);
		passengers.fillNames("aa", "bb", "cc", "dd", "ee", "ff");
		
		PaymentPage payment = PageFactory.initElements(driver, PaymentPage.class);
		payment.dropdownNewCard();
		Assert.assertTrue(payment.verifyAccountNr("1234354"));

	}
	
	@AfterClass
	public static void tearDown() {
        driver.quit();
	}
	
	public void fillTripInfo(HomePage home) {
		home.enterFrom("Dublin");
		home.enterTo("Warsaw (Modlin)");
		home.selectDates(20, 25); 										//should be done better - no time
		home.addAdult(1);
		home.addChildren(1);
		home.letsGo();
	}

}
