package newpkg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;

public  class myclass {

	public static void main(string [] args){
		try {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Music\\selenium\\chrome\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.manage().windows().maximize();
			driver.get("https://website.com/sign-in");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	
	
}
