package keyWords;
//satya
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.project.testdata.ExcelReader;
import com.project.testdata.TestData;

import org.openqa.selenium.JavascriptExecutor;
import java.util.List;

import objectRepository.ObjectRepository;

public class KeyWords {
	public WebDriver driver;
	JavascriptExecutor js;
	TestData tdtata ;
	KeyWords key ;
	String dir = System.getProperty("user.dir");
	String path= dir+"\\TestData.xlsx";
	//public String path="F:\\Project Newzeland\\TestData\\TestData.xlsx";
	public ObjectRepository objr= new ObjectRepository();
	//Executer
	public KeyWords(WebDriver browser )
	{
	   driver=browser;
	   js=(JavascriptExecutor)driver;
	   
	}
	 public void getUrl(String url)
		{
		        driver.get(url); 
		}
	 
	 
	 // Message Box validation for User Information
	 public void testCase1() throws Throwable
		{
		 
		 
		 driver.get("http://www.westpac.co.nz/kiwisaver/calculators/kiwisaver-calculator/");
		  driver.manage().timeouts().implicitlyWait(12,TimeUnit.SECONDS);
			List<WebElement> frame = driver.findElements(By.tagName("iframe"));
			System.out.println(frame.size());
			for(int i =0;i<frame.size();i++)
			{
				System.out.println(frame.get(i).getText().toString());
			}
			System.out.println("SatyaTest");
			
			//Outer Frame is zero
			driver.switchTo().frame(0);
			driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
			//Verifying first User message for current age
			 WebElement ele1=driver.findElement(objr.current_AgeIcon);
			 ele1.click();
			 driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
			 WebElement ele11=ele1.findElement(objr.current_AgeIcon_popup);
			 driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
			 String ele111= ele11.getText();
			 driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
			 Assert.assertEquals("This calculator has an age limit of 64 years old as you need to be under the age of 65 to join KiwiSaver.",ele111);
			
	         
			
			
			////Verifying seconed User message 
			 
			 WebElement ele2=driver.findElement(objr.empStatus_Icon);
			 ele2.click();
			 driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
			 WebElement ele22=driver.findElement(objr.empStatus_Icon_pop_up);
			 driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
			 String ele222= ele22.getText();
			 
			 Assert.assertEquals("If you are earning a salary or wage, select �Employed�. Your employer contributions will be automatically calculated at a rate of 3% of your before-tax salary or wages. You can also select �Self-employed� or �Not employed� and then enter below (in the Voluntary contributions field), the amount and frequency of any contributions that you wish to make.",ele222);
			 driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
			
			 
			 
			 ////Verifying Third User message 
			 
			 WebElement ele3=driver.findElement(objr.pir);
			 ele3.click();
			 driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
			 WebElement ele33=driver.findElement(objr.pir_Pop_up);
			 driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
			 String ele333= ele33.getText();
						 
		     Assert.assertEquals("This is your prescribed investor rate (PIR) for tax purposes. If you don't know what your PIR is, click on the �Find My Rate� button.",ele333);
			 driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
			 
			 
          ////Verifying fourth User message 
			 
			 WebElement ele4=driver.findElement(objr.Kiwi_Saver_Balance);
			 ele4.click();
			 driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
			 WebElement ele44=driver.findElement(objr.Kiwi_Saver_Balance_Pop_up);
			 driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
			 String ele444= ele44.getText();
						 
		     Assert.assertEquals("If you do not have a KiwiSaver account, then leave this field blank.",ele444);
			 driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
			 
			 
          ////Verifying sixth User message 
			 
			 WebElement ele5=driver.findElement(objr.Voluntary_cont);
			 ele5.click();
			 driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
			 WebElement ele55=driver.findElement(objr.Voluntary_cont_Pop_up);
			 driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
			 String ele555= ele55.getText();
						 
		     Assert.assertEquals("If you are 'Self-Employed' or 'Not employed', you can make direct contributions to your KiwiSaver account. If you are 'Employed', you can make voluntary contributions in addition to your regular employee contributions.",ele555);
			 driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
						 	 
			 
          ////Verifying sixth User message for Risk Profile
			 
			 WebElement ele6=driver.findElement(objr.Risk_Profile);
			 ele6.click();
			 driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
			 WebElement ele66=driver.findElement(objr.Risk_Profile_Pop_up);
			 driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
			 String ele666= ele66.getText();
			 System.out.println(ele66.getText());	 
		     Assert.assertEquals("Medium risk investments are spread more evenly between income assets and growth assets. Generally, these types of investments can be expected to provide moderate levels of returns with moderate levels of investment risk. Returns will vary and may be low or negative in some years.",ele666);
			 driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
			 
			 

          ////Verifying seventh User message for saving goal requirements
			 
			 WebElement ele7=driver.findElement(objr.saving_goal_requirements);
			 ele7.click();
			 driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
			 WebElement ele77=driver.findElement(objr.saving_goal_requirements_pop_up);
			 driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
			 String ele777= ele77.getText();
			 
		    // Assert.assertEquals("Sorted Retirement Planner",ele777);
		     driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
			 
			 					 	 
		}	
	 
	 
	 //Page Element validation for Input TestData for case1
	 public void testCase2() throws Throwable
		{
		 driver.get("http://www.westpac.co.nz/kiwisaver/calculators/kiwisaver-calculator/");
			Thread.sleep(10000);
			
			//
			 List<TestData> list = ExcelReader.readExcelData(path);
				
				//to get the first row 
				TestData tdtata = list.get(0);
				//sendKeys(String.valueOf(tdtata.get_pir()) 
				//""+tdtata.get_salary()
		
			
			
				List<WebElement> frame = driver.findElements(By.tagName("iframe"));
				System.out.println(frame.size());
				driver.switchTo().frame(0);
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				
				driver.findElement(objr.currentAge_textbox).sendKeys(""+tdtata.get_currentAge());//clicking on the current age
				driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
				
				driver.findElement(objr.empStatus).click();
				driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
				
				driver.findElement(objr.empStatusOption).click();//selecting the employed status
				driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
				
				driver.findElement(objr.salary_employed).sendKeys(""+tdtata.get_salary());//salary
				driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
				
				driver.findElement(objr.kiwi_Saver_member_contri).click();
				driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
				
				driver.findElement(objr.pIR_Textbox).click();
				driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
				
				driver.findElement(objr.pIR_option).click();
				driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
				
				driver.findElement(objr.high_risk_profile).click();//high risk profile
				driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
				
				
				driver.findElement(objr.kiwi_Saver_Retirement_projection).click();
				
				driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
				//400,615
				
				 //To Verify that the risk calculater is showing  projected balance
				 String str=driver.findElement(objr.kiwi_Saver_Estimation).getText();
				 driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
				
				 String str1=str.substring(1).trim();
	             Assert.assertEquals("400,615",str1);
				
		}
	
	 public void testCase3() throws Throwable
		{
		 
		 
			//
			 List<TestData> list = ExcelReader.readExcelData(path);
				
				//to get the second row 
				TestData tdtata = list.get(1);
				Thread.sleep(10000);
				
				List<WebElement> frame = driver.findElements(By.tagName("iframe"));
				System.out.println(frame.size());
				driver.switchTo().frame(0);
				driver.manage().timeouts().implicitlyWait(12,TimeUnit.SECONDS);
				driver.findElement(objr.currentAge_textbox).sendKeys(""+tdtata.get_currentAge());//clicking on the current age
				driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
				driver.findElement(objr.empStatus).click();
				driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
			    driver.findElement(objr.empStatusOption_selfempl).click();
			    driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
				
			        // do something in else perhaps
			    
			    driver.findElement(objr.empStatus).click();
				driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
				driver.findElement(objr.empStatusOption_selfempl).click();
				driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
				driver.findElement(By.xpath("//*[@class='ng-binding ng-scope']")).click();//PIR
				driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
				List<WebElement> pir = driver.findElements(By.xpath("//*[@class='ng-binding ng-scope']"));
				for(int j=0;j<pir.size();j++)
				{
					System.out.println(pir.get(j).getText().toString());
					if(pir.get(j).getText().contains("10.5%")) 
					{
						System.out.println(pir.get(j).getText().toString());
						pir.get(j).click(); // pir 10.5%
					}
					
				}
				
				driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
				driver.findElement(objr.Current_KiwiSaver_balance).sendKeys("100000");
				driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
			    driver.findElement(objr.volunarty_cont).sendKeys(""+tdtata.get_voluntryContribution());
				driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
				WebElement ele1=driver.findElement(objr.frequency);
				ele1.click();
				
				WebElement ele2=driver.findElement(objr.Fortnightly);
			    ele2.click();
			    driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
				driver.findElement(objr.mediumRisk_Profile).click();//high risk profile
				driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
				
				
				driver.findElement(objr.saving_goal_retirement_Textbox).sendKeys("290000");
				driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
		    
				driver.findElement(objr.kiwi_Saver_Retirement_projection).click();
				driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
			
				
				
				String strt=driver.findElement(objr.kiwi_Saver_Estimation).getText();
				driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
				 
				
				 String str1=strt.substring(1).trim();
	             Assert.assertEquals("199,472",str1);
					    	 		 
	
		}
	
	 public void testCase4() throws Throwable
		{
		 
			//
			 List<TestData> list = ExcelReader.readExcelData(path);
				
				//to get the second row 
				TestData tdtata = list.get(2);
				Thread.sleep(10000);
				
				List<WebElement> frame = driver.findElements(By.tagName("iframe"));
				System.out.println(frame.size());
				driver.switchTo().frame(0);
				driver.manage().timeouts().implicitlyWait(12,TimeUnit.SECONDS);
				driver.findElement(objr.currentAge_textbox).sendKeys(""+tdtata.get_currentAge());//clicking on the current age
				driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
                driver.findElement(objr.empStatus).click();
                driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
				List<WebElement> empStatusOption_notEmployed = driver.findElements(By.xpath("//*[@class='label']"));
				for(int j=0;j<empStatusOption_notEmployed.size();j++)
				{
					System.out.println(empStatusOption_notEmployed.get(j).getText().toString());
					if(empStatusOption_notEmployed.get(j).getText().contains("Not employed")) 
					{
						System.out.println(empStatusOption_notEmployed.get(j).getText().toString());
						empStatusOption_notEmployed.get(j).click(); // pir 10.5%
					}
					
				}
				driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
				driver.findElement(By.xpath("//*[@class='ng-binding ng-scope']")).click();//PIR
				List<WebElement> pir = driver.findElements(By.xpath("//*[@class='ng-binding ng-scope']"));
				for(int j=0;j<pir.size();j++)
				{
					System.out.println(pir.get(j).getText().toString());
					if(pir.get(j).getText().contains("10.5%")) 
					{
						System.out.println(pir.get(j).getText().toString());
						pir.get(j).click(); // pir 10.5%
					}
					
				}
				driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
				driver.findElement(objr.Current_KiwiSaver_balance).sendKeys("140000");
				System.out.println(""+tdtata.get_currentKiwiSaverBalance());
				driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
				driver.findElement(objr.volunarty_cont).sendKeys("10");
				driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
				
			//	-----------------------
			 
				WebElement ele1=driver.findElement(objr.frequency);
				ele1.click();
				driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
				
				//WebElement ele2=driver.findElement(objr.annually_div);
				List<WebElement> anuualy_freq = driver.findElements(objr.annually_div);
				for(int j=0;j<anuualy_freq.size();j++)
				{
					System.out.println(anuualy_freq.get(j).getText().toString());
					if(anuualy_freq.get(j).getText().contains("Annually")) 
					{
						System.out.println("Satya_Annualy");
						System.out.println(anuualy_freq.get(j).getText().toString());
						anuualy_freq.get(j).click(); //Anually frequency
					}
					
				}
				driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
				driver.findElement(objr.mediumRisk_Profile).click();//high risk profile
				driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
				
				
				driver.findElement(objr.saving_goal_retirement_Textbox).sendKeys("200000");
				driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
		    
				driver.findElement(objr.kiwi_Saver_Retirement_projection).click();
				driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
			
				String strt=driver.findElement(objr.kiwi_Saver_Estimation).getText();
				driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
				 
				
				 String str1=strt.substring(1).trim();
				 System.out.println(str1);
	             Assert.assertEquals("197,942",str1);
				
					    	 		 
	
		}
	
	 
	 
	 public void TestData()
		{
		    
	    List<TestData> list = ExcelReader.readExcelData("F:\\Project Newzeland\\TestData\\TestData.xlsx");
			
			//to get the second row 
			TestData tdtata = list.get(1);
			System.out.println("PIR :" + tdtata.get_pir());
			System.out.println("Current Age :" + tdtata.get_currentAge());
			System.out.println(" \n");
			
		}
	 
	 public void sendKeys(By element,String message)
		{
		    
		   WebElement ele = driver.findElement(element);
		   System.out.println(ele.getText());
		        ele.sendKeys("message"); 
		}
	  
	 
	
	  // Explicit Wait-Perfect
	 public WebElement expectWaitforElement( By element)
		{
		    
		      WebDriverWait wait= new WebDriverWait( driver,20 );
		      WebElement waitForElement=(WebElement) wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy((By)element));
		      return waitForElement;
		}
	 
	   // Click on Button- Perfect
	   public void tapButton( By element)
		{
		    
		        WebElement button = driver.findElement(element);
		        button.click(); 
		        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		}
	   
	   public void radioButton( By element)
		{
		    
		        WebElement Rbutton = driver.findElement(element);
		        if(Rbutton.isSelected())
		        {
		              return;
		        } 	
		        else
		        {
		        	Rbutton.click(); 
		        }
		        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		}
	   
	   //Mouse Hover
	   public void mouseHover(By element) throws Throwable
		{
		        
		        Actions actions = new Actions(driver);
		        WebElement hoverElement = driver.findElement(element);
		        actions.moveToElement(hoverElement);
		        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		       // actions.moveToElement(hoverElement).build().perform();
		            
		}
	   
	   //Mouse Hover and Click Perfect
	   public void mouseHoverAndClick(By element1,By element2 ) throws Throwable
		{
		   Actions actions = new Actions(driver);
		   WebElement mainMenu = driver.findElement((By)element1);
		   actions.moveToElement(mainMenu);

		   WebElement subMenu = driver.findElement(element2);
		   actions.moveToElement(subMenu);
		   actions.click().build().perform();
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		}
	   
	   public void scroleDown() throws Throwable
	   { 
		   JavascriptExecutor jse = (JavascriptExecutor)driver;
	       jse.executeScript("scroll(0, 250);");
	       driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	       
	       
	   }
	   
	   //jse.executeScript("scroll(0, -250);");
	   
	   public void scroleUp() throws Throwable
	   { 
		   JavascriptExecutor jse = (JavascriptExecutor)driver;
	       jse.executeScript("scroll(0, -250);");
	       Thread.sleep(5000);
	       
	   }
	   
	   
	   // select the second dropdown using "select by visible text"
	   
	   public void selectDropdownByVisibleText(By element , String Text)
		{
		   Select selectByVisibleText = new Select (driver.findElement(element));

	       selectByVisibleText.selectByVisibleText("Text");
		}
	   
	   
  // select the second dropdown using "select by Value"
	   
	   public void selectDropdownByValue(By element , String Value)
		{
		   Select selectByValue = new Select (driver.findElement(element));
		   selectByValue.selectByValue("Value");
		}
       
	// select the second dropdown using "select by Value"
	   
		   public void selectDropdownByIndex(By element , int i)
			{
			   Select selectByIndex = new Select(driver.findElement(element));
			                 selectByIndex.selectByIndex(i);
			}
	
	
	
}
