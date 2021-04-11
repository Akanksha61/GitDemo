import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//selenium code to launch chrome,to open URL and get the Title
		//Set Property i,e KEY and VALUE from chromedriver
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http:\\facebook.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.get("http:\\google.com");
		driver.navigate().back();
		driver.navigate().forward();
		System.out.println(driver.getPageSource());
		//driver.close();
		driver.quit();
		
		
		

	}

}
