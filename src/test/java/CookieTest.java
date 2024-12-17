import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class CookieTest {
    @Test
    public void testCookieFirst() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://github.com/Yunique33/sql-academy-solutions");
        Cookie authCookie = new Cookie("user_session", "3tWgzZAD7LgoEYK1oxl5dmlBKKl0aQALOHe_4ikrPiHdwdKj");
        driver.manage().addCookie(authCookie);
        driver.navigate().refresh();
        driver.quit();
    }

    @Test

    public void testCookieFirstOther() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://github.com/Yunique33/sql-academy-solutions");
        driver.manage().addCookie(new Cookie("user_session", "3tWgzZAD7LgoEYK1oxl5dmlBKKl0aQALOHe_4ikrPiHdwdKj"));
        driver.navigate().refresh();
        driver.quit();
    }

    @Test
    public void testCookieSecond() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://github.com/Yunique33/sql-academy-solutions");
        Set<Cookie> cookies = driver.manage().getCookies();
        System.out.println("cookies->" + cookies);
    }

    @Test
    public void testCookieThree() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://github.com/Yunique33/sql-academy-solutions");
        Cookie tz = driver.manage().getCookieNamed("tz");
        System.out.println("tz->" + tz);
    }

    @Test
    public void testCookieFour() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://github.com/Yunique33/sql-academy-solutions");
        driver.manage().deleteCookieNamed("tz");
        System.out.println("all Cookies ->" + driver.manage().getCookies());
    }

    @Test
    public void testCookieFive() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://github.com/Yunique33/sql-academy-solutions");
        driver.manage().deleteAllCookies();
        System.out.println("all Cookies ->" + driver.manage().getCookies());
    }
}

