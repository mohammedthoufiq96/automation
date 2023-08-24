package base;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.WebElementState;
import org.openqa.selenium.JavascriptExecutor;

public class BasePage extends PageObject {

	/******* Common Functionality 
	 * @throws IOException ************/

	// Find Element
	public String readdata(String key) throws IOException {
		// String path = new File("src\\test\\resources\\config\\config.properties").getAbsolutePath();
		String path1=System.getProperty("user.dir");
		// System.out.println(path1);
		String path=path1+File.separator+"src/test/resources/config/config.properties";
		System.out.println(path);
		FileReader data=new FileReader(path);
		Properties p=new Properties();
		p.load(data);
		String value=p.getProperty(key);
		return value;
	}
	public void updatedata(String key,String value) throws IOException {
		String path1=System.getProperty("user.dir");
		// System.out.println(path1);
		String path=path1+File.separator+"src/test/resources/config/config.properties";
//		System.out.println(path);
//		FileReader data=new FileReader(path);
		Properties props = new Properties();
		try (FileInputStream in = new FileInputStream(path)) {
		    
		    props.load(in);
		}
		        
		try (FileOutputStream out = new FileOutputStream(path)){
		    props.setProperty(key,value);
		    props.store(out, null);
		}
	}
	
	public WebElementFacade getElement(String locator) {

    try {

      return find(getBy(locator));

    } catch (NoSuchElementException e) {

      e.getMessage();
    }

    return null;
  }

  public boolean isDisplayed(String locator) {

    return find(locator).isVisible();
  }

  public WebElementState isNotDisplayed(String locator) {

    return find(locator).shouldNotBeVisible();
  }

  public boolean isEnabled(String locator) {

    return find(locator).isEnabled();
  }

  public WebElementState isNotEnabled(String locator) {

    return find(locator).shouldNotBeEnabled();
  }

  // Finding Multiple Elements
  public List<WebElementFacade> getElements(String locator) {

    try {

      return findAll(getBy(locator));

    } catch (NoSuchElementException e) {

      e.getMessage();
    }

    return null;
  }

  private By getBy(String locator) {

    By by = null;

    try {

      if (locator.startsWith("id=")) {

        locator = locator.substring(3);
        by = By.id(locator);
      } else if (locator.startsWith("xpath=")) {

        locator = locator.substring(6);
        by = By.xpath(locator);
      } else if (locator.startsWith("css=")) {

        locator = locator.substring(4);
        by = By.cssSelector(locator);
      } else if (locator.startsWith("name=")) {

        locator = locator.substring(5);
        by = By.name(locator);
      } else if (locator.startsWith("link=")) {

        locator = locator.substring(5);
        by = By.linkText(locator);
      }
      return by;

    } catch (Throwable t) {

      t.getMessage();
    }

    return null;
  }

  public void click(String locator) {

    waitFor(getElement(locator)).click();
  }

  public void type(String locator, String value) {

    waitFor(getElement(locator)).sendKeys(value);
  }

  public String getText(String locator) {

    return waitFor(getElement(locator)).getText();
  }

  public void moveMouseTo(String locator) {

    WebElement moveTo = waitFor(getElement(locator));
    withAction().moveToElement(moveTo).perform();
  }

  public String verifyTitle(String Actual, String Expected) {

    return verifyTitle(Actual, Expected);
    // write get title method

  }

  public String verifytext(String Actual, String Expected) {

    if (Actual.equals(Expected)) {

      System.out.println("The text matches");
    } else {

      System.out.println("The text do not match");
    }
    return Expected;
  }

  public void scroll() {

    // scroll down by 500 pixels with Javascript Executor
    JavascriptExecutor j = (JavascriptExecutor) getDriver();
    j.executeScript("window.scrollBy(0,500)");
  }
  public void scroll_down() throws InterruptedException {

	    JavascriptExecutor j = (JavascriptExecutor) getDriver();
	    Object last_height =  j.executeScript("return document.body.scrollHeight");

	    while(true) {
	       
	        j.executeScript("window.scrollTo(0, document.body.scrollHeight);");
	        Thread.sleep(2);
	        Object new_height =  j.executeScript("return document.body.scrollHeight");
//	        System.out.println(new_height);
//	        System.out.println(last_height);
	        if(new_height.equals(last_height)) {
	        	 break;

	 	        
	        	
	        }
	        last_height = new_height;
	    	
	    }        
  }

  public void scrolltoEnd() {
    JavascriptExecutor j = (JavascriptExecutor) getDriver();
    ((JavascriptExecutor) getDriver())
        .executeScript("window.scrollTo(0, document.body.scrollHeight)");
  }

//  public void windowhandle(String title) {
//
//    // Get handles of the windows
//    String mainWindowHandle = getDriver().getWindowHandle();
//    Set<String> allWindowHandles = getDriver().getWindowHandles();
//    Iterator<String> iterator = allWindowHandles.iterator();
//    if (Actual.equals(Expected)) {
//
//      System.out.println("The text matches");
//    } else {
//
//      System.out.println("The text do not match");
//    }
////    return Expected;
//  }

//  public void scroll() {
//
//    // scroll down by 500 pixels with Javascript Executor
//    JavascriptExecutor j = (JavascriptExecutor) getDriver();
//    j.executeScript("window.scrollBy(0,500)");
//  }

//  public void scrolltoEnd() {
//    JavascriptExecutor j = (JavascriptExecutor) getDriver();
//    ((JavascriptExecutor) getDriver())
//        .executeScript("window.scrollTo(0, document.body.scrollHeight)");
//  }

//  public void windowhandle(String title) {
//
//    // Get handles of the windows
//    String mainWindowHandle = getDriver().getWindowHandle();
//    Set<String> allWindowHandles = getDriver().getWindowHandles();
//    Iterator<String> iterator = allWindowHandles.iterator();
//
//    // Here we will check if child window has other child windows and will fetch the heading of the
//    // child window
//    while (iterator.hasNext()) {
//      String ChildWindow = iterator.next();
//      if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
//
//        String actualTitle = getDriver().switchTo().window(ChildWindow).getTitle();
//        String expectedTitle = title;
//
//        if (expectedTitle.equalsIgnoreCase(actualTitle)) {
//
//          System.out.println("The child window title matches");
//        } else {
//
//          System.out.println("The child window title do not match");
//        }
//      }
//      
//    }
//  }
	
	
	
	
	
	public void pageload () {
		
		getDriver().manage().timeouts().pageLoadTimeout(150, TimeUnit.SECONDS);
	}
	
	
public void currentURL (String expectedurl) {
		
	String currenturl = 	getDriver().getCurrentUrl();
	
	System.out.println(currenturl);
	
	}
public String getcurrentURL () {
	
	String currenturl = 	getDriver().getCurrentUrl();
	
//	System.out.println(currenturl);
	return currenturl;
	
	}
	
public void alert () {
	getDriver().switchTo().alert().accept();
}

public void load_url (String url) {
	getDriver().get(url);
}
public void new_tab() {
	getDriver().switchTo().newWindow(WindowType.TAB);
}
public void swictch_iframe(String locator) {
	getDriver().switchTo().frame(locator);
}
public void switchtabslfttorgt() {
	Actions action= new Actions(getDriver());
	action.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).build().perform();
}
public void switchtabsrgttolft() {
	Actions action= new Actions(getDriver());
	action.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).sendKeys(Keys.TAB).build().perform();
}
public void close_current_tab() {
	getDriver().close();
}
public void clear(String locator) {
	getDriver().findElement(By.xpath(locator)).clear();
}

public void back() {
	 getDriver().navigate().back();
}

public void execu_script(String elem) {

    WebElement java = getDriver().findElement(
        By.xpath(elem));
	JavascriptExecutor js = (JavascriptExecutor) getDriver();
	js.executeScript("arguments[0].style.display = 'block';",java);
}
public void selectdropdown(String element,String text) {
	Select dropdown = new Select(getDriver().findElement(By.id(element)));
	dropdown.selectByVisibleText(text);


}
public void halfscroll () {
	
	// scroll down by 500 pixels with Javascript Executor
      JavascriptExecutor j = (JavascriptExecutor) getDriver();
      j.executeScript("window.scrollBy(0,150)");
}

public void selectvalues() {
	Actions act = new Actions(getDriver());//driver variable is chrome web driver ref

	WebElement selectInput=getDriver().findElement(By.className("select__input"));//Thread.sleep(5000);

	act.click(selectInput).build().perform();//Thread.sleep(5000);

	//list of all option
	List<WebElement> selectValues=getDriver().findElements(By.className("select__menu"));//Thread.sleep(5000);

	//first option:
	WebElement firstWebElement=selectValues.get(0);//Thread.sleep(5000);

	act.click(firstWebElement).build().perform();//Thread.sleep(5000);
}

public void cropimage(String element) {
	Actions crop = new Actions(getDriver());
	WebElement cropTracker=getDriver().findElement(By.className(element));
	crop.clickAndHold(cropTracker).moveByOffset(30, 50).release().build().perform();
}

public String getinputvalue(String element) {
	String text=getDriver().findElement(By.id(element)).getAttribute("value");
	return text;
}
public void switchtabsnew() {
//	((JavascriptExecutor)getDriver()).executeScript("window.open('about:blank', '_blank');");

    Set<String> tab_handles = getDriver().getWindowHandles();
    int number_of_tabs = tab_handles.size();
    int new_tab_index = number_of_tabs-1;
    getDriver().switchTo().window(tab_handles.toArray()[new_tab_index].toString());
}

}
  




	


