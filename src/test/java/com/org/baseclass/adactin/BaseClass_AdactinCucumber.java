package com.org.baseclass.adactin;

import java.awt.AWTException;
import java.awt.Frame;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.AfterClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass_AdactinCucumber {
	public static WebDriver driver;
	public static Select slt;
	public static Actions act;
	public static Robot rbt;
	public static JavascriptExecutor js;
	public static TakesScreenshot ts;
	public static WebDriverWait wait;
//browser launch	
//	public static void browserLaunch() {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.get("https://adactinhotelapp.com/");
//		driver.manage().window().maximize();
//	}
	
	
  /*	public static void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(BaseClass.readFromProp("excelreadurl"));
		driver.manage().window().maximize();
	} */
	
	  public static void browserLaunch(String browserName,String url){
		
	   switch(browserName.toLowerCase()){
	    case "chrome" :
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\MSARUL\\eclipse-workspace\\AdactinCucumber\\Resource\\chromedriver.exe");
		 driver=new ChromeDriver();
		 break;
		 
		case "firefox" :
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\MSARUL\\eclipse-workspace\\AdactinCucumber\\Resource\\geckodriver.exe");
		 driver=new FirefoxDriver();
		 break;
		 
		case "opera" :
		 System.setProperty("webdriver.opera.driver","C:\\Users\\MSARUL\\eclipse-workspace\\AdactinCucumber\\Resource\\operadriver.exe");
		 driver=new OperaDriver();
		 break;
		 
	    case "edge":
	     System.setProperty("webdriver.edge.driver","C:\\Users\\MSARUL\\eclipse-workspace\\AdactinCucumber\\Resource\\msedgedriver.exe");
		 driver=new EdgeDriver();
		 break;
		 
	    default:
		 System.out.println("Enter the valid browser");
		 break;
		}
	   driver.manage().window().maximize();
	   
	   driver.get(url);
	   }
	  
//	 public static void windowMax(){
//	  driver.manage().window().maximize();
//	 }
	 
/*	 public static void getUrl(String url){
	   driver.get(url);
	 } */
	 
	 public static void sleepMethod(long sec) throws InterruptedException{
	  Thread.sleep(sec);
	  }
	  
	 public static void sendInput(WebElement element,String str){
	  element.sendKeys(str);
	  }
	  
	 public static void toClick(WebElement element){
	  element.click();
	 }
	 
	 public static void toClose(){
	  driver.close();
	  }
	 
	 public static void toquit(){
	  driver.quit();
	  }
	  
	 public static void toClear(WebElement element){
	  element.clear();
	  }
	  
	  public static void navigate(String navigateurl){
	  driver.navigate().to(navigateurl);
	  }
	  
	 public static void navigateBackward(){
	  driver.navigate().back();
	  }
	  
	 public static void navigateForward(){
	  driver.navigate().forward();
	  }
	  
	 public static void navigateRefresh(){
	  driver.navigate().refresh();
	  }
	 
	 public static WebElement getElement(String locatorType, String locatorValue) 
	    {
			String s=locatorType.toLowerCase();
	     if(s== "id") {
	              return driver.findElement(By.id(locatorValue));}
	     else if(s=="name") {
	               return driver.findElement(By.name(locatorValue));}
	     else if(s=="class") {
	               return driver.findElement(By.className(locatorValue));}
	     else if (s=="tag") {
	               return driver.findElement(By.tagName(locatorValue));}
	     else if(s=="css") {
	               return driver.findElement(By.cssSelector(locatorValue));}
	     else if(s=="xpath") {
	               return driver.findElement(By.xpath(locatorValue));}
	     else if(s=="linktext") {
	               return driver.findElement(By.linkText(locatorValue));}
	     else if(s=="partiallinktext") {
	               return driver.findElement(By.partialLinkText(locatorValue));}
	     else
	               System.out.println("Invalid locator type provided.");
	     return(null);
	              
	   }
	  
	 public static void getTxt(WebElement element){
	  String text=element.getText();
	  System.out.println(text);
	  }
	  
	 public static String getAttribute(WebElement element,String attName){
	  return element.getAttribute(attName);
	  }
	  
	 public static void toPrintTagName(List<WebElement> elements){
	   int size=elements.size();
	   System.out.println(size);
	   for(int i=0;i<elements.size();i++){
	    System.out.println(elements.get(i).getText());
	  }
	 }
	 
	 public static void isEnable(WebElement element){
	  boolean isenable=element.isEnabled();
	  System.out.println(isenable);
	 }
	 
	 public static void isDisplay(WebElement element){
	  boolean isdisplay=element.isDisplayed();
	  System.out.println(isdisplay);
	 }
	 
	 public static void isSlt(WebElement element){
	  boolean isslt=element.isSelected();
	  System.out.println(isslt);
	 }
	 
	 public static void altHandleMethod(String str){
	    Alert alt=driver.switchTo().alert();
		if(str.equals("accept")){
		alt.accept();
		}else{
		alt.dismiss();
		}
	 }
	 
	 public static void altSendInput(String str) {
		 Alert alt=driver.switchTo().alert();
		 alt.sendKeys(str);
	 }
	 
	 public static Select selectCls(WebElement element){
		    Select slt=new Select(element);
//		    boolean isMultiple=slt.isMultiple();
//		    System.out.println(isMultiple);
		    return slt;
		 }
		 
		  public static void sltByIndex(Select slt,int num){
		  slt.selectByIndex(num);
		  }
		  
		  public static void sltByValue(Select slt,String value){
		  slt.selectByValue(value);
		  }
		  
		  public static void sltByVisibleText(Select slt,String text){
		  slt.selectByVisibleText(text);
		  }
		  
		  public static void desltByIndex(Select slt,int num){
		  slt.deselectByIndex(num);
		 }
		 public static void desltByValue(Select slt,String value){
		  slt.selectByValue(value);
		  }
		 public static void desltByVisibleText(Select slt,String text){
		  slt.selectByVisibleText(text);
		  }
		  
		  public static void desltAll(Select slt){
		   slt.deselectAll();
		   }
		  
		  public static void getallSelectedopt(Select slt){
		   List<WebElement> lst=slt.getAllSelectedOptions();
		   for(WebElement ele:lst){
		    System.out.println(ele.getText());
			}
		   }
		   
		   public static void getFirstSltOpt(Select slt){
		    WebElement opt=slt.getFirstSelectedOption();
			System.out.println(opt);
			}
			
		   public static void getOpt(Select slt){
		  List<WebElement> options=slt.getOptions();
			for(WebElement opt:options){
			 System.out.println(opt.getText());
			 }
			}
		   
		   public static void clkUsingActionsCls(WebElement element){
			   act=new Actions(driver);
			   act.moveToElement(element).click().build().perform();
			  }
			  
			  public static void toHover(WebElement element){
			   act=new Actions(driver);
			   act.moveToElement(element).build().perform();
			  }
			  
			  public static void toRightClk(WebElement element){
			   act=new Actions(driver);
			   act.contextClick(element).build().perform();
			   }
			   
			   public static void doubleClick(WebElement element){
			    act=new Actions(driver);
			    act.doubleClick(element).build().perform();
			   }
			   
			   public static void dragAnddrop(WebElement drag,WebElement drop){
			   act=new Actions(driver);
			   act.dragAndDrop(drag,drop).build().perform();
			    }
			   
			   public static void toCut() throws AWTException{
				   rbt=new Robot();
				   rbt.keyPress(KeyEvent.VK_CONTROL);
				   rbt.keyPress(KeyEvent.VK_A);
				   rbt.keyRelease(KeyEvent.VK_CONTROL);
				   rbt.keyRelease(KeyEvent.VK_A);
				 		  
				   rbt.keyPress(KeyEvent.VK_CONTROL);
				   rbt.keyPress(KeyEvent.VK_X);
				   rbt.keyRelease(KeyEvent.VK_CONTROL);
				   rbt.keyRelease(KeyEvent.VK_X);
				   }
				   
				   public static void toPaste() throws AWTException{
				    rbt=new Robot();
				    rbt.keyPress(KeyEvent.VK_CONTROL);
				    rbt.keyPress(KeyEvent.VK_V);
				    rbt.keyRelease(KeyEvent.VK_CONTROL);
				    rbt.keyRelease(KeyEvent.VK_V);
				   }
				   
				   public static void toCopy() throws AWTException{
				    rbt=new Robot();
				   rbt.keyPress(KeyEvent.VK_CONTROL);
				   rbt.keyPress(KeyEvent.VK_A);
				   rbt.keyRelease(KeyEvent.VK_CONTROL);
				   rbt.keyRelease(KeyEvent.VK_A);
				 		  
				   rbt.keyPress(KeyEvent.VK_CONTROL);
				   rbt.keyPress(KeyEvent.VK_C);
				   rbt.keyRelease(KeyEvent.VK_CONTROL);
				   rbt.keyRelease(KeyEvent.VK_C);
				   }
				  
				  public static void toMoveDownward(int num) throws AWTException{
				   rbt=new Robot();
				   for(int i=1;i<=num;i++){
				    rbt.keyPress(KeyEvent.VK_DOWN);
				    rbt.keyRelease(KeyEvent.VK_DOWN);
				   }
				 }
				   
				   public static void toMoveUponElementForward(int num) throws AWTException{
				    rbt=new Robot();
				    for(int i=1;i<=num;i++) {
				 	 rbt.keyPress(KeyEvent.VK_TAB);
				 	 rbt.keyRelease(KeyEvent.VK_TAB);
				   }
				  }
				  
				  public static void toMoveUponElementBackward(int num) throws AWTException{
				    rbt=new Robot();
				    for(int i=1;i<=num;i++) {
				 	 rbt.keyPress(KeyEvent.VK_SHIFT);		  rbt.keyPress(KeyEvent.VK_TAB);			 			  rbt.keyRelease(KeyEvent.VK_SHIFT);
				 	 rbt.keyRelease(KeyEvent.VK_TAB);
				 			  
				   }
				 }
				  
				  public static void toPressEnter() throws AWTException{
				   rbt=new Robot();
				   rbt.keyPress(KeyEvent.VK_ENTER);
				   rbt.keyRelease(KeyEvent.VK_ENTER);
				   }
				  
				  public static void frameByIndexNumber(int num){
					  driver.switchTo().frame(num);
					 }
				 public static void frameByIdOrValue(String str){
					  driver.switchTo().frame(str);
					}
				 public static void frameByElement(WebElement element){
					  driver.switchTo().frame(element);
					}
				 public static void frameByFrame(int ifrm){
					  driver.switchTo().frame(ifrm);
					}
				 public static void prntFrame(Frame ifrm){
					  driver.switchTo().parentFrame();
					}
				 public static void dftContent(Frame ifrm){
					  driver.switchTo().defaultContent();
					}
				 public static void clkusingJs(WebElement element){
				  js=(JavascriptExecutor) driver;
				  js.executeScript("arguments[0].click ;",element);
				 }
				 public static void sendInputUsingJs(WebElement element,String input){
				  js=(JavascriptExecutor) driver; 
				  js.executeScript("arguments[0].setAttribute('value'," + "'" +input + "');",element);
				 }
				 public static void getTitle(){
				  js=(JavascriptExecutor) driver;
				  Object title=js.executeScript("return document.title").toString();
				  System.out.println(title);
				 }
				 public static void getUrl(){
				  js=(JavascriptExecutor) driver;
				  Object url=js.executeScript("return document.URL").toString();
				  System.out.println(url);
				 }
				 public static void toScrollDown(){
				  js=(JavascriptExecutor) driver;
				  js.executeScript("window.scroll(0,2000);");
				  }
				 public static void toScrollUp(){
				  js=(JavascriptExecutor) driver;
				  js.executeScript("window.scroll(0,-2000);");
				  }
				 public static void scrollToElement(WebElement element){
				  js=(JavascriptExecutor) driver;
				  js.executeScript("arguments[0].scrollIntoView();",element);
				  }
				  public static void getInnerText(WebElement element){
				   js=(JavascriptExecutor) driver;
				   String text=(String) js.executeScript("return arguments[0].innerText;",element);
				   System.out.println(text);
				  }
				   public static void style(String clr1str,String clr2str,WebElement element){
					   js=(JavascriptExecutor) driver;
					   js.executeScript("arguments[0].setAttribute('style','background:" + clr1str + ";border:" + clr2str + "');",element);
					   }
		/*		   public static void toTakeScrnshot(String fileName,int num) throws IOException{
					   ts=(TakesScreenshot)driver;
					   File source=ts.getScreenshotAs(OutputType.FILE);
					   File dest=new File("C:\\Users\\MSARUL\\eclipse_workspace_old\\Selenium\\ScreenShot\\"+fileName);
					   if(num==3){
					    FileHandler.copy(source,dest);
					   }else if(num==2){
					    FileUtils.copyFile(source,dest);
						}else{
						 System.out.println("Invalid version");
						}
					 }  */
				   
			
				   public static void webtableData(WebElement table) {
						List<WebElement> rows=table.findElements(By.tagName("tr"));
						for(WebElement row:rows) {
							 List<WebElement> cells=row.findElements(By.tagName("td"));
							 for(WebElement cell:cells) {
								 System.out.print(cell.getText() + " | ");
							 }
							 System.out.println();
							 
							 }
						}
				   
					public static void takeScreenshot() throws IOException {
						TakesScreenshot ts = (TakesScreenshot) driver;
						File source = ts.getScreenshotAs(OutputType.FILE);
						Date date = new Date();
						File destination = new File("C:\\Users\\MSARUL\\eclipse-workspace\\AdactinCucumber\\Resource\\Screenshot\\ss1.png");
						FileHandler.copy(source, destination);
						//driver.close();
					}
				   
				   public static void implicitWait(int time){
					   driver.manage().timeouts().implicitlyWait(time,TimeUnit.SECONDS);
					   }
				   
				   public static WebDriverWait explicitWait(int exptime){
					   return wait=new WebDriverWait(driver,exptime);
					   }

					  public static WebElement elemnttoclk(WebDriverWait wait,WebElement element){
					  return wait.until(ExpectedConditions.elementToBeClickable(element));
					   }
					  
				public static WebElement visibilityOfElement(WebDriverWait wait,String idvalue) {
					return wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(idvalue)));
				}
				
				public static WebElement presenceOfElement(WebDriverWait wait,String idvalue) {
					return wait.until(ExpectedConditions.presenceOfElementLocated(By.id(idvalue)));
				}
				
				public static void isAlertPresent() {
					wait.until(ExpectedConditions.alertIsPresent());
				}
				
				public static void title(String title) {
					 wait.until(ExpectedConditions.titleIs(title));
				}
				
		public static String readFromExcel(int row,int cell) {
					String value="null";
					File f=new File("C:\\Users\\MSARUL\\eclipse-workspace\\AdactinCucumber\\src\\test\\resources\\TestResource\\adactin_Testdata.xlsx");
					try {
						FileInputStream fis=new FileInputStream(f);
					
							Workbook wb=new XSSFWorkbook(fis);
							Sheet sheet=wb.getSheet("SheetName");
							Row rw=sheet.getRow(row);
							Cell cl=rw.getCell(cell);	
							int celltype=cl.getCellType();
							if(celltype==1) {
							value=cl.getStringCellValue()	;
							}else if(celltype==0) {
								if(DateUtil.isCellDateFormatted(cl)) {
									Date dt=cl.getDateCellValue();
									SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
									value=sdf.format(dt);						
								}else {
									double num=cl.getNumericCellValue();
									long crctformnum=(long) num;
									value=String.valueOf(crctformnum);
								}
							}
						
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				return value;
				 
				}
		public static void reusableExcelWrite(String sheeName,int row_No,int column_No,String message){
			
			try {
				File f=new File("C:\\Users\\MSARUL\\eclipse-workspace\\AdactinCucumber\\src\\test\\resources\\TestResource\\excelwrite.xlsx");
				FileInputStream fis=new FileInputStream(f);
				Workbook wb = new XSSFWorkbook(fis);
				Sheet st=wb.getSheet(sheeName);
				Row rw=st.createRow(row_No);
				Cell cl=rw.createCell(column_No);
				cl.setCellValue(message);
				FileOutputStream fos=new FileOutputStream(f);
				wb.write(fos);
		        wb.close();	
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		} 
		
  // to write bulk data in to new excel workbook
		
 public static void bulkDataWriteOnExcel(List<String[]>li,String filepath,String sheetName) {
	 File fl=new File(filepath);
	try {
		
		 FileInputStream fis = new FileInputStream(fl);
		 Workbook wb = new XSSFWorkbook(fis);
		
		 Sheet sh=wb.getSheet(sheetName);
		 int lastrow=sh.getLastRowNum();
		for(int i=0;i<li.size();i++) {
			Row rw=sh.createRow(lastrow+1+i);
			String[] data=li.get(i);
			
		 for(int j=0;j<data.length;j++) {
			 Cell cl=rw.createCell(j);
			 cl.setCellValue(data[j]);
		 }
			
		}
	     FileOutputStream fos=new FileOutputStream(fl);
	     wb.write(fos);
	     wb.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
			
 } 
 
 // to return properties object from property file
 
	 public static Properties getProp(String filepath) {
		 Properties prop=new Properties();
	  try {
			FileReader fr = new FileReader(filepath);
				
			prop.load(fr);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  
	return prop;
  }
	 
  // to get the value from property file
	 
	public static String getPropValue(Properties prop,String data) {
		return prop.getProperty(data);
		}
	
 // same read from property file script like above but it is from sir's script(another way)
	
	public static String readFromProp(String data) {
		String value=null;
		
		try {
			FileReader fr = new FileReader("C:\\Users\\MSARUL\\eclipse-workspace\\AdactinCucumber\\src\\test\\resources\\TestResource\\config.properties");
			Properties prop=new Properties();	
			prop.load(fr);
			value=prop.getProperty(data);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 return value;
	}
   
}
 

