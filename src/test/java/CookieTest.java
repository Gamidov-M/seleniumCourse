import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookieTest {
    WebDriver driver = new ChromeDriver();

    driver.manage().window().maximize();
    driver.get("https://github.com/Yunique33/sql-academy-solutions");

        Cookie authCookie = new Cookie("user_session", "3tWgzZAD7LgoEYK1oxl5dmlBKKl0aQALOHe_4ikrPiHdwdKj");
        driver.manage().addCookie(authCookie);

//        or

        driver.get("https://github.com/Yunique33/sql-academy-solutions");
        driver.manage().addCookie(new Cookie("user_session", "3tWgzZAD7LgoEYK1oxl5dmlBKKl0aQALOHe_4ikrPiHdwdKj"));
        driver.navigate().refresh();
        driver.quit();

}
