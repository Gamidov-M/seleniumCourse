import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Set;

public class FirstTest {

    @Test
    public void testSearchGoogle() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//
//        driver.get("https://www.google.ru/");

//        driver.switchTo();

//        Set<String> oldWindow = driver.getWindowHandles();
//        System.out.println("oldWindow->" + oldWindow);
//
//        ((JavascriptExecutor)driver).executeScript("window.open()");
//        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
//
//        driver.switchTo().window(tabs.get(1));
//        driver.get("https://selenium.dev");
//
//        Set<String>newWindow = driver.getWindowHandles();
//        System.out.println("newWindow->" + newWindow);

//        WebElement searchBox = driver.findElement(By.name("q"));
//        searchBox.sendKeys("ChromeDriver");
//        searchBox.submit();

//        String currentURL = driver.getCurrentUrl();
//        System.out.println("currentURL->" + currentURL);
//        Assert.assertEquals(currentURL,"https://www.google.ru/search?q=ChromeDriver&newwindow");

//        String currentTitle = driver.getTitle();
//        System.out.println("currentTitle ->" + currentTitle);
//        Assert.assertEquals(currentTitle, "ChromeDriver - Поиск в Google");

//        String pageSource = driver.get();
//        System.out.println("pageSource ->" + pageSource);
//
//        driver.navigate().to("https://selenium.dev");
//        driver.navigate().back();
//        driver.navigate().forward();
//        driver.navigate().refresh();

//        driver.get("https://github.com/Yunique33/sql-academy-solutions");
//        Cookie authCookie = new Cookie("user_session", "3tWgzZAD7LgoEYK1oxl5dmlBKKl0aQALOHe_4ikrPiHdwdKj");
//        driver.manage().addCookie(authCookie);

//        or

        driver.get("https://github.com/Yunique33/sql-academy-solutions");
        driver.manage().addCookie(new Cookie("user_session", "3tWgzZAD7LgoEYK1oxl5dmlBKKl0aQALOHe_4ikrPiHdwdKj"));
        driver.navigate().refresh();
//        driver.quit();


    }
}

