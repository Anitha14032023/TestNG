package com.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.time.Duration;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public abstract class Baseclass {

	    public static WebDriver driver;
		
	   protected static void launchingBrowser(String browserName) {
		   try {
			
			if(browserName.equalsIgnoreCase("Chrome")) {
			
			driver = new ChromeDriver();
			}
			else if(browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
				
			}
			else if(browserName.equalsIgnoreCase("firefox")) {
				driver = new FirefoxDriver();
			}	
		   }catch (Exception e) {
			 Assert.fail("ERROR: OCCUR DURING BROWSER  LAUNCH"); 
		   }
			
	       driver.manage().window().maximize();
	   }
		
		protected static void launchingURL(String url) {
			driver.get(url);
		}
		
		protected static void getTitle(String url) {
			driver.getTitle();
		}
		protected static void getCurrentUrl(String url) {
			driver.getCurrentUrl();
		}
		protected static void navigateMethods(String type) {
			
			if(type.equalsIgnoreCase("back")) {
				driver.navigate().back();

			}
			
			else if(type.equalsIgnoreCase("forward"))
			{
				driver.navigate().forward();
			}
	
			else if(type.equalsIgnoreCase("refresh")) {
				driver.navigate().refresh();
			}
         }
		protected static void navigateURL(String URL) {
			
			try {
			    driver.navigate().to(URL);
			    
			}
			catch (Exception e) {
				Assert.fail("ERROR: OCCUR DURING URL NAVIGATION");
			}
		}
		protected static void terminateBrowser() {
			
			try{
				driver.quit();
			}
			catch(Exception e) {
				
				Assert.fail("ERROR: OCCUR DURING BROWSER TERMINATION");
			}
			}
		protected static void browserClose() {
			
			try {
				driver.close();
			}
			catch(Exception e) {
				Assert.fail("ERROR: OCCUR DURING BROWSER CLOSE");
			}
			
			}
		
		protected static void selectDropDown(WebElement element,String type, String Value) {
			try {
				
			Select select = new Select(element);
			
			if(type.equalsIgnoreCase("text")) {
				
				select.selectByVisibleText(Value);				
			}
			else if(type.equalsIgnoreCase("value")) {
				
				select.selectByValue(Value);
					
			}
			else if(type.equalsIgnoreCase("Index")) {
				
				select.selectByIndex(Integer.parseInt(Value));
			}
			} catch(NumberFormatException e) {
				Assert.fail("ERROR  :  OCCUR DURING SELECT DROPDOWN");
			}
			
		}
			
		protected static void inputPassing(WebElement element, String value) {
				try { 
					
				element.sendKeys(value);
				
				} catch (Exception e) {
					Assert.fail("ERROR: OCCUR DURING INPUT PASSING TO THE ELEMENT");
					
				}
				
			}
			
            protected static void elementClick(WebElement element) {
            	try {
            		element.click();
            	} catch (Exception e) {
            		Assert.fail("ERROR : OCCUR DURING THE CLICK OF ELEMENT AVAILABLE IN BASECLASS");
            	}
            	
            }

            protected static void elementText(WebElement element) {
            	try {
            		
            	String text = element.getText();
            	
            	} catch (Exception e) {
            		Assert.fail("ERROR: OCCUR DURING GET TEXT");
            	}
            	
            }
            protected static void getattribute(WebElement element, String value) {
            	try {
            		
            	String text = element.getAttribute(value);
            	
            	} catch (Exception e) {
            		Assert.fail("ERROR: OCCUR DURING GET TEXT");
            	}
            	
            }
            
            protected static void implicitlyWait(String type, int time) {
            	if(type.equalsIgnoreCase("seconds")) {
            		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
            	}
            	else if (type.equalsIgnoreCase("minutes")) {
            		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(time));
            	}
            	else if (type.equalsIgnoreCase("hours")) {
            		driver.manage().timeouts().implicitlyWait(Duration.ofHours(time));
            	}
            }
            protected static void staticWait(int milliSeconds) {
            	try {
            		Thread.sleep(milliSeconds);
            	} 
            	catch (InterruptedException e) {
            		
            		Assert.fail("ERROR: OCCUR DURING STATIC WAIT");
            	}
            }
            protected static void alerting(String type, String Value) {
            	try {
            		Alert popup = driver.switchTo().alert();
            		
            		if(type.equalsIgnoreCase("Accept")) 
            		{
            			popup.accept();
            		}
            		else if(type.equalsIgnoreCase("Dismiss"))
            		{
            			popup.dismiss();
            		}
            	}
            	catch (Exception e) {
                        Assert.fail("ERROR: OCCUR DURING POPUP ALERT");
            	}
            }
            protected static void getOptions(WebElement element, String type){
            	try {
            		Select select = new Select(element);;
           
            		if(type.equalsIgnoreCase("Firstoption")) {
            			
            			select.getFirstSelectedOption();
            		}
            		else if(type.equalsIgnoreCase("Alloptions")) {
            			
            			select.getAllSelectedOptions();
            		}
            	}
            	catch (Exception e) {
            		Assert.fail("ERROR: OCCUR DURING GET OPTIONS");
            	}
            }
       protected static void SelectOptions(WebElement element, String type, String Value) {
            	
            	try {
            		Select select = new Select(element);
            		
            		if(type.equalsIgnoreCase("Text")) {
            			
            			select.selectByVisibleText(Value);
               		} 
            		else if(type.equalsIgnoreCase("Value")) {
            			
               			select.selectByValue(Value);    
            		} 
            		else if(type.equalsIgnoreCase("index")) {
            			
               			select.selectByIndex(Integer.parseInt(Value));
               		}
            	}
            	catch (Exception e) {
            		
            	  Assert.fail("ERROR: OCCUR DURING SELECT OPTIONS");
            	}
            }
            protected static void deSelectOptions(WebElement element, String type, String Value) {
            	
            	try {
            		Select deselect = new Select(element);
            		
            		if(type.equalsIgnoreCase("Text")) {
            			
            			deselect.deselectByVisibleText(Value);
               		} 
            		else if(type.equalsIgnoreCase("Value")) {
            			
               			deselect.deselectByValue(Value);
               		} 
            		else if(type.equalsIgnoreCase("index")) {
            			
               			deselect.deselectByIndex(Integer.parseInt(Value));
               		}
            	}
            	catch (Exception e) {
            		
            	  Assert.fail("ERROR: OCCUR DURING DE SELECT OPTIONS");
            	}
            }
           protected static void multiple(WebElement element) {
        	   
        	   try {
        		   Select select = new Select(element);
        		   select.isMultiple();
        		   }
        	   catch (Exception e) {

        	   }
           }
           protected static void switchFrames(String type, String value) {
        	 
        	   try {
        		   if(type.equalsIgnoreCase("Index")) {
        			   driver.switchTo().frame(Integer.parseInt(value));
        		   } else if (type.equalsIgnoreCase("Variable")) {
        			   driver.switchTo().frame(value);
        		   } else if (type.equalsIgnoreCase(value)) {
        			   driver.switchTo().frame(value);
        		   }
        	   }
        	   catch (Exception e) {
        		   Assert.fail("ERROR: OCCUR DURING FRAME SWITCH");
        	   }
           }
           protected static void fieldValidation(WebElement element, String type) {
        	   try {
        		   if(type.equalsIgnoreCase("Enable")) {
        			   
        			   element.isEnabled();        			   
        		   } else if(type.equalsIgnoreCase("Display")) {
        			   
        			   element.isDisplayed();
        		   } else if(type.equalsIgnoreCase("Select")) {
        			   
        			   element.isSelected();
        		   }
        	   }
        	   catch (Exception e) {
        		   
        		   Assert.fail("ERROR: OCCUR DURING FIELD VALIDATION");
        	   }
           }
          
        
        
        
        
        
        
        
        
          
}

           