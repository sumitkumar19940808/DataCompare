package com;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class DataComparePunjab_Auto {
	WebDriver driver;
	String date;
	String game;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest logger;
	int flag=3;
	
	 @BeforeSuite(alwaysRun = true)
	  public void beforeSuite() {
		 System.setProperty("webdriver.chrome.driver",
					"/home/software-179/workspace/plugins/plugins/chromedriver");
		  driver = new ChromeDriver();
		  driver.navigate().to("http://192.168.4.9/DataComparePunjab/index.php");
		  //driver.navigate().to("http://172.20.5.6/usersoumitra/DataCompare/index.php");
		  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		  driver.findElement(By.id("datepicker")).click();
		  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		  driver.findElement(By.xpath("/html/body/div[3]/div/a[1]/span")).click();//for previous month
//		  Select element =new Select(driver.findElement(By.xpath("/html/body/div[3]/div/div/select[1]")));
//		  element.selectByVisibleText("Jul");
//		  Select element1 =new Select(driver.findElement(By.xpath("/html/body/div[3]/div/div/select[2]")));
//		  element1.selectByVisibleText("2016");

	  }
	 @DataProvider
	  public static Object[][] dp() {
	    return new Object[][] {
	      new Object[] { "1", "punnumber" },
//		  new Object[] { "1", "ZIZO" },
//		  new Object[] { "1", "Fortune Four" },
		  new Object[] { "2", "punnumber" },
//		  new Object[] { "2", "ZIZO" },
//		  new Object[] { "2", "Fortune Four" },
		  new Object[] { "3", "punnumber" },
//		  new Object[] { "3", "ZIZO" },
//		  new Object[] { "3", "Fortune Four" },
		  new Object[] { "4", "punnumber" },
//		  new Object[] { "4", "ZIZO" },
//		  new Object[] { "4", "Fortune Four" },
		  new Object[] { "5", "punnumber" },
//		  new Object[] { "5", "ZIZO" },
//		  new Object[] { "5", "Fortune Four" },
		  new Object[] { "6", "punnumber" },
//		  new Object[] { "6", "ZIZO" },
//		  new Object[] { "6", "Fortune Four" },
		  new Object[] { "7", "punnumber" },
//		  new Object[] { "7", "ZIZO" },
//		  new Object[] { "7", "Fortune Four" },
		  new Object[] { "8", "punnumber" },
//		  new Object[] { "8", "ZIZO" },
//		  new Object[] { "8", "Fortune Four" },
		  new Object[] { "9", "punnumber" },
//		  new Object[] { "9", "ZIZO" },
//		  new Object[] { "9", "Fortune Four" },
		  new Object[] { "10", "punnumber" },
//		  new Object[] { "10", "ZIZO" },
//		  new Object[] { "10", "Fortune Four" },
		  new Object[] { "11", "punnumber" },
//		  new Object[] { "11", "ZIZO" },
//		  new Object[] { "11", "Fortune Four" },
		  new Object[] { "12", "punnumber" },
//		  new Object[] { "12", "ZIZO" },
//		  new Object[] { "12", "Fortune Four" },
		  new Object[] { "13", "punnumber" },
//		  new Object[] { "13", "ZIZO" },
//		  new Object[] { "13", "Fortune Four" },
		  new Object[] { "14", "punnumber" },
//		  new Object[] { "14", "ZIZO" },
//		  new Object[] { "14", "Fortune Four" },
		  new Object[] { "15", "punnumber" },
//		  new Object[] { "15", "ZIZO" },
//		  new Object[] { "15", "Fortune Four" },
		  new Object[] { "16", "punnumber" },
//		  new Object[] { "16", "ZIZO" },
//		  new Object[] { "16", "Fortune Four" },
		  new Object[] { "17", "punnumber" },
//		  new Object[] { "17", "ZIZO" },
//		  new Object[] { "17", "Fortune Four" },
		  new Object[] { "18", "punnumber" },
//		  new Object[] { "18", "ZIZO" },
//		  new Object[] { "18", "Fortune Four" },
		  new Object[] { "19", "punnumber" },
//		  new Object[] { "19", "ZIZO" },
//		  new Object[] { "19", "Fortune Four" },
		  new Object[] { "20", "punnumber" },
//		  new Object[] { "20", "ZIZO" },
//		  new Object[] { "20", "Fortune Four" },
		  new Object[] { "21", "punnumber" },
//		  new Object[] { "21", "ZIZO" },
//		  new Object[] { "21", "Fortune Four" },
		  new Object[] { "22", "punnumber" },
//		  new Object[] { "22", "ZIZO" },
//		  new Object[] { "22", "Fortune Four" },
	      new Object[] { "23", "punnumber" },
//		  new Object[] { "23", "ZIZO" },
//		  new Object[] { "23", "Fortune Four" },
	      new Object[] { "24", "punnumber" },
//	      new Object[] { "24", "ZIZO" },
//	      new Object[] { "24", "Fortune Four" },
	      new Object[] { "25", "punnumber" },
//	      new Object[] { "25", "ZIZO" },
//	      new Object[] { "25", "Fortune Four" },
	      new Object[] { "26", "punnumber" },
//	      new Object[] { "26", "ZIZO" },
//	      new Object[] { "26", "Fortune Four" },
	      new Object[] { "27", "punnumber" },
//	      new Object[] { "27", "ZIZO" },
//	      new Object[] { "27", "Fortune Four" },
	      new Object[] { "28", "punnumber" },
//	      new Object[] { "28", "ZIZO" },
//	      new Object[] { "29", "Online" },
//	      new Object[] { "29", "ZIZO" },
//	      new Object[] { "29", "Fortune Four" },
//	      new Object[] { "30", "Online" },
//	      new Object[] { "30", "ZIZO" },
//	      new Object[] { "30", "Fortune Four" },
	    };
	  }
	
	@BeforeTest
	public void startReport(){
		
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/ExtentReportPunjab.html");
		extent = new ExtentReports ();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Host Name", "http://192.168.4.9/DataComparePunjab/");
		extent.setSystemInfo("Environment", "Automation Test");
		extent.setSystemInfo("Tester Name", "Sumit Kumar");
		
		htmlReporter.config().setDocumentTitle("QA Complott RPOS");
		htmlReporter.config().setReportName("Data Compare of Punjab RPOS");
		htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
		htmlReporter.config().setTheme(Theme.STANDARD);
	}
	@Test(dataProvider = "dp")
	public void DateAndBrand(String date, String game) throws InterruptedException{
		driver.findElement(By.id("datepicker")).click();
		  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		  //driver.findElement(By.xpath("/html/body/div[3]/div/a[1]/span")).click();
		 
		  WebElement dateWidget = driver.findElement(By.id("ui-datepicker-div"));
		  List<WebElement>  rows=dateWidget.findElements(By.tagName("tr"));
		  List<WebElement>  columns=dateWidget.findElements(By.tagName("td"));
		  //String date="22";
		  for (WebElement cell: columns){
		   //Select 13th Date 
		   if (cell.getText().equals(date)){
		   cell.findElement(By.linkText(date)).click();
		   break;	
		   }
		  }
		  //String game[] = {"Online","Magic","ZIZO","Fortune Four","Magic Star"};
		  Thread.sleep(1000);
		  Select dropdown = new Select(driver.findElement(By.name("gamecode")));
		  dropdown.selectByVisibleText(game);
		  Thread.sleep(1000);
		  driver.findElement(By.id("submit")).click();
		  Reporter.log( "Date : "+date+"-FEB-2018", true );
		  Reporter.log( "Game : "+game+" Game", true );
		  logger = extent.createTest("Date : "+date+"-FEB-2018 ,Game :"+game);
//		  logger.createNode("Date : "+date+"-12-2017","Game :"+game).pass("Selected");
//		  Assert.assertTrue(true);
//		  logger.log(Status.PASS, MarkupHelper.createLabel("No Difference Found Enjoy !!!", ExtentColor.GREEN));
		  CheckDifference();
	}
	
	  public void CheckDifference() throws InterruptedException{
		  int row =4;
		  int col=7;
		  String check="C-G = 0\nC-R = 0";
		  List<WebElement> rows_table = driver.findElements(By.tagName("tr"));
		  int rows_count = rows_table.size();
		  rows_count=rows_count-4;
		  //System.out.println("messg of lsat"+rows_count);
		  String checkZero= driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[last()]/td[5]")).getText();
		  String checkZero1=driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[last()]/td[9]")).getText();
		  String checkZero2=driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[last()]/td[13]")).getText();
		  String checkZero3=driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[last()]/td[17]")).getText();
		  if(!checkZero.contentEquals("0") || !checkZero1.contentEquals("0") || !checkZero2.contentEquals("0") || !checkZero3.contentEquals("0")){
			  System.out.println("in if");
			  if(!checkZero.equals("0")){
				  System.out.println("In check Zero");
				  for(int i=row ;i<rows_count-1;i++){
					  	String text= driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr["+i+"]/td[7]")).getText();
					  	if(!text.equals(check)){
					  		String drawtime= driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr["+i+"]/td[2]")).getText();
					  		String brand= driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr["+i+"]/td[3]")).getText();
					  		
					  		logger.createNode("Draw Time : "+drawtime,"Brand :"+brand).fail("Difference Found");
							Assert.assertTrue(true);
							//logger.log(Status.FAIL, MarkupHelper.createLabel("Difference Found Check Brand and Draw Time !!!", ExtentColor.RED));

//					  		Reporter.log("Draw Time :   "+drawtime, true );
//					  		Reporter.log("Brand     :   "+brand, true );
//					  		Reporter.log("Difference found");
					  	}
				  }
				  
			  }else if(!checkZero1.equals("0")){
				  System.out.println(checkZero1);
				  System.out.println("In check1 Zero");
				  for(int i=row ;i<rows_count;i++){
//					  String item = "s";
//					  String text = item+Integer.toString(i);
//					  System.out.println(text);
					  //Thread.sleep(500);
					  String text= driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr["+i+"]/td[11]")).getText();
//					  System.out.println(text);
					  	if(!text.equals(check)){
					  		String drawtime= driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr["+i+"]/td[2]")).getText();
					  		String brand= driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr["+i+"]/td[3]")).getText();
					  		logger.createNode("Draw Time : "+drawtime,"Brand :"+brand).fail("Difference Found");
							Assert.assertTrue(true);
							//logger.log(Status.FAIL, MarkupHelper.createLabel("Difference Found Check Brand and Draw Time !!!", ExtentColor.RED));
//					  		Reporter.log("Draw Time :   "+drawtime, true );
//					  		Reporter.log("Brand     :   "+brand, true );
//					  		Reporter.log("Difference found");
					  	}
					  	text = "";
//					  	System.out.println("textis "+text);
					  	//System.out.println(i);
				  }
				  
			  }else if(!checkZero2.equals("0")){
				  System.out.println("In check2 Zero");
				  for(int i=row ;i<rows_count;i++){
					  String text= driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr["+i+"]/td[15]")).getText();
					  System.out.println(check);
					  	if(!text.equals(check)){
					  		String drawtime= driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr["+i+"]/td[2]")).getText();
					  		String brand= driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr["+i+"]/td[3]")).getText();
					  		logger.createNode("Draw Time : "+drawtime,"Brand :"+brand).fail("Difference Found");
							Assert.assertTrue(true);
//							logger.log(Status.FAIL, MarkupHelper.createLabel("Difference Found Check Brand and Draw Time !!!", ExtentColor.RED));
					  		Reporter.log("Difference found");
//					  		Assert.assertFalse(text.equals(check));
//					  		try{
//					  			Assert.fail("Draw Time :   "+drawtime+ "\nBrand     :   "+brand);
//					  		}catch(Exception e){
//					  			
//					  		}
//					  		Assert.fail("Brand     :   "+brand);
					  		Reporter.log("Draw Time :   "+drawtime, true );
					  		Reporter.log("Brand     :   "+brand, true );
					  	}
				  }
				  
			  }else{
				  System.out.println("In check3 Zero");
				  for(int i=row ;i<rows_count;row++){
					  String text= driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr["+i+"]/td[19]")).getText();
					  	if(!text.equals(check)){
					  		String drawtime= driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr["+i+"]/td[2]")).getText();
					  		String brand= driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr["+i+"]/td[3]")).getText();
					  		logger.createNode("Draw Time : "+drawtime,"Brand :"+brand).fail("Difference Found");
							Assert.assertTrue(true);
							//logger.log(Status.FAIL, MarkupHelper.createLabel("Difference Found Check Brand and Draw Time !!!", ExtentColor.RED));
					  		Reporter.log("Brand     :   "+brand, true );
					  		Reporter.log("Difference found");
					  	}
				  }
				  
			  }
			  
//			  Reporter.log("pass it is okay");
//			  Assert.assertEquals("Differece Occurred", "0", checkZero);
		  }else{
			  System.out.println("else");
//			  logger = extent.createTest("Draw Time ");
//			  Assert.assertTrue(true);
//			  logger.log(Status.PASS, MarkupHelper.createLabel("No Difference Found Enjoy !!!", ExtentColor.GREEN));
			  Assert.assertTrue(true);
			  logger.log(Status.PASS, MarkupHelper.createLabel("No Difference Found Enjoy !!!", ExtentColor.GREEN));
			  Reporter.log("No Difference Found Enjoy !!!", true );
			  
		  }
		  //System.out.println(checkZero);
		  
		  //Reporter.log( "Date : "+text, true );
		  //Reporter.log( "Game : "+text, true );
	  }
	
//	@Test
//	public void failTest(){
//		logger = extent.createTest("failTest");
//		Assert.assertTrue(true);
//		//logger.log(Status.FAIL, "Test Case (failTest) Status is passed");
//		logger.log(Status.FAIL, MarkupHelper.createLabel("Test Case (failTest) Status is passed", ExtentColor.RED));
//	}
	
//	@Test
//	public void skipTest(){
//		logger = extent.createTest("skipTest");
//		throw new SkipException("Skipping - This is not ready for testing ");
//	}
	
	@AfterMethod
	public void getResult(ITestResult result){
		if(result.getStatus() == ITestResult.FAILURE){
			//logger.log(Status.FAIL, "Test Case Failed is "+result.getName());
			//MarkupHelper is used to display the output in different colors
			logger.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " - Test Case Failed", ExtentColor.RED));
			logger.log(Status.FAIL, MarkupHelper.createLabel(result.getThrowable() + " - Test Case Failed", ExtentColor.RED));
		}else if(result.getStatus() == ITestResult.SKIP){
			//logger.log(Status.SKIP, "Test Case Skipped is "+result.getName());
			logger.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + " - Test Case Skipped", ExtentColor.ORANGE));	
		}
	}
	@AfterTest
	public void endReport(){
		extent.flush();
    }
	@AfterSuite
	public void afterSuite() {
		  driver.close();
	}
}
