package base;

import org.openqa.selenium.*;
import org.openqa.selenium.support.events.WebDriverEventListener;

import java.io.IOException;

import static base.CommonUtil.driver;
import static base.CommonUtil.takeScreenshot;

public class WebEventListener implements WebDriverEventListener {
    JavascriptExecutor javascriptExecutor=(JavascriptExecutor)driver;

    public void beforeNavigateTo(String url, WebDriver driver) {
        System.out.println("Before navigating to: '" + url + "'");
    }

    public void afterNavigateTo(String url, WebDriver driver) {
        System.out.println("Navigated to:'" + url + "'");
    }

    public void beforeChangeValueOf(WebElement element, WebDriver driver) {
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
        System.out.println("Value of the:" + element.toString() + " before any changes made");
    }

    public void afterChangeValueOf(WebElement element, WebDriver driver) {
        System.out.println("Element value changed to: " + element.toString());
    }

    public void beforeClickOn(WebElement element, WebDriver driver) {
//        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
        System.out.println("Trying to click on: " + element.toString());
    }

    public void afterClickOn(WebElement element, WebDriver driver) {
        System.out.println("Clicked on: " + element.toString());
    }

    public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {

    }

    public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {

    }

    public void beforeNavigateBack(WebDriver driver) {
        System.out.println("Navigating back to previous page");
    }

    public void afterNavigateBack(WebDriver driver) {
        System.out.println("Navigated back to previous page");
    }

    public void beforeNavigateForward(WebDriver driver) {
        System.out.println("Navigating forward to next page");
    }

    public void afterNavigateForward(WebDriver driver) {
        System.out.println("Navigated forward to next page");
    }

    public void onException() {
        System.out.println("Exception occured during execution");
        try {
            takeScreenshot();
        } finally {
            System.out.println("Taken screenshot while exception is caught");
        }
    }

    public void beforeFindBy(By by, WebElement element, WebDriver driver) {
//        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
        System.out.println("Trying to find Element By : " + by.toString());
    }

    public void afterFindBy(By by, WebElement element, WebDriver driver) {

        System.out.println("Found Element By : " + by.toString());
    }

    public void beforeAlertAccept(WebDriver driver) {

    }

    public void afterAlertAccept(WebDriver driver) {

    }

    public void afterAlertDismiss(WebDriver driver) {

    }

    public void beforeAlertDismiss(WebDriver driver) {

    }


    public void beforeNavigateRefresh(WebDriver driver) {

    }

    public void afterNavigateRefresh(WebDriver driver) {

    }

    public void beforeScript(String script, WebDriver driver) {

    }

    public void afterScript(String script, WebDriver driver) {

    }

    public void beforeSwitchToWindow(String windowName, WebDriver driver) {

    }

    public void afterSwitchToWindow(String windowName, WebDriver driver) {

    }

    public void onException(Throwable throwable, WebDriver driver) {

    }

    public <X> void beforeGetScreenshotAs(OutputType<X> target) {

    }

    public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {

    }

    public void beforeGetText(WebElement element, WebDriver driver) {

    }

    public void afterGetText(WebElement element, WebDriver driver, String text) {

    }
}
