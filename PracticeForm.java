package automationFramework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PracticeForm {

	public static void main(String[] args) throws InterruptedException {
		//enter the path to chromedriver.exe
		System.setProperty("webdriver.chrome.driver","E:\\ToolsQA\\SQA_drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//enter web form URL
		driver.get("http://demoqa.com/automation-practice-form/");
		Thread.sleep(2000);
		
		WebElement element1 = driver.findElement(By.id("firstName"));
		element1.sendKeys("Parth"); //Enter firstname
		WebElement element2 = driver.findElement(By.id("lastName"));
		element2.sendKeys("Patel"); //Enter lastname
		Thread.sleep(1000);
		WebElement email = driver.findElement(By.id("userEmail"));
		email.sendKeys("abc123@gmail.com"); //enter email
		Thread.sleep(2000);
		
		//by Id()
		WebElement element = driver.findElement(By.id("gender-radio-1"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().build().perform();
		Thread.sleep(2000);
		
		//by name()
		List<WebElement> oRadioButton = driver.findElements(By.name("gender"));
		boolean bValue = false;
		bValue = ((WebElement) oRadioButton.get(0)).isSelected();
		if(bValue = true){
			Actions action2 = new Actions(driver);
			action2.moveToElement(oRadioButton.get(1)).click().build().perform();
		 }
		else{
			Actions action3 = new Actions(driver);
			action3.moveToElement(oRadioButton.get(0)).click().build().perform();
		 }
		Thread.sleep(2000);
		
		//by Value()
		List<WebElement> rb = driver.findElements(By.name("gender"));
		int iSize = rb.size();
		for(int i=0; i<iSize ; i++ ){
			 String sValue = ((WebElement) rb.get(i)).getAttribute("value");
			if (sValue.equalsIgnoreCase("Male")){
				Actions action4 = new Actions(driver);
				action4.moveToElement(rb.get(i)).click().build().perform();
				break;
				 }
			} 
		Thread.sleep(2000);
		
		WebElement num = driver.findElement(By.id("userNumber"));
		num.sendKeys("9476135840"); //enter contact no.
		Thread.sleep(2000);
		
		WebElement dob = driver.findElement(By.id("dateOfBirthInput"));
		dob.sendKeys("12 Jul 1997"); //enter date of birth
		
		//code to delete default date [clear() didn't worked]
		String text = dob.getText();
		int x = text.length();
		for (x=11;x >= 1;x--)
		{
			dob.sendKeys(Keys.HOME,Keys.DELETE);
		}
		dob.sendKeys(Keys.TAB);
		Thread.sleep(3000);
		
		WebElement subject = driver.findElement(By.id("subjectsInput"));
		subject.sendKeys("Computer Science");
		new Actions(driver).moveToElement(subject).perform();
		subject.sendKeys(Keys. ENTER);
		//subject.sendKeys(Keys. TAB);
		Thread.sleep(3000);
		
		WebElement CheckBox1 = driver.findElement(By.cssSelector("input[value='1']"));
		Actions action5 = new Actions(driver);
		action5.moveToElement(CheckBox1).click().build().perform();
		Thread.sleep(2000);
		
		WebElement CheckBox2 = driver.findElement(By.cssSelector("input[value='3']"));
		Actions action6 = new Actions(driver);
		action6.moveToElement(CheckBox2).click().build().perform();
		Thread.sleep(2000); 
		
		WebElement chooseFile = driver.findElement(By.id("uploadPicture"));
		chooseFile.sendKeys("E:\\certificate.jpg");
		Thread.sleep(2000);
		
		WebElement address = driver.findElement(By.id("currentAddress"));
		address.sendKeys("1st Floor, xyz Arcade, abc Cir, lmn Nagar, pqr Society, Ambawadi, Ahmedabad, Gujarat 380000");
		Thread.sleep(2000);
		
		WebElement state = driver.findElement(By.id("react-select-3-input"));
		state.sendKeys("Rajasthan");
		state.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		WebElement city = driver.findElement(By.id("react-select-4-input"));
		city.sendKeys("Jaipur");
		city.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		WebElement submit = driver.findElement(By.id("submit"));
		submit.click();
		
		Thread.sleep(5000);
		//driver.quit();
		driver.close();
	}
	
}
