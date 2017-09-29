import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumScript {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumSoftwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.pagepersonnel.com.sg/");
		driver.manage().window().maximize();
	}

}
