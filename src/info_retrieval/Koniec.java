package info_retrieval;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.HashMap;


public class Koniec {
    public static void Restart() throws InterruptedException{
        System.setProperty("webdriver.gecko.driver", "E:\\bot\\geckodriver\\geckodriver.exe");

        try {
            WebDriver firefox = new FirefoxDriver();
            firefox.get("http://192.168.1.1/");

            //Thread.sleep(4000);
            Thread.sleep(1000);
            firefox.findElement(By.cssSelector("#txt_Username")).sendKeys("admin");
            firefox.findElement(By.cssSelector("#txt_Password")).sendKeys("admin");
            Thread.sleep(1000);
            firefox.findElement(By.cssSelector("#login_btn")).click();
            //Thread.sleep(4000);
            Thread.sleep(1000);

            try {
                firefox.findElement(By.cssSelector("#Admin_0_7_0 > a:nth-child(1)")).click();
            }
            catch (Exception e) {
                firefox.findElement(By.cssSelector("#txt_Username")).sendKeys("admin");
                Thread.sleep(1000);
                firefox.findElement(By.cssSelector("#txt_Password")).sendKeys("admin");
                Thread.sleep(1000);
                firefox.findElement(By.cssSelector("#login_btn")).click();
                Thread.sleep(1000);
                //Thread.sleep(4000);
                firefox.findElement(By.cssSelector("#Admin_0_7_0 > a:nth-child(1)")).click();
            }
            //Thread.sleep(3000);
            Thread.sleep(1000);
            firefox.findElement(By.cssSelector("#btnReboot > span:nth-child(1) > span:nth-child(1) > span:nth-child(1)")).click();
            Thread.sleep(2000);
            try {
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_ENTER);
                robot.keyRelease(KeyEvent.VK_ENTER);
            } catch(AWTException e) {
                e.printStackTrace();
            }
            Thread.sleep(100000);
            Thread.sleep(10000);
            firefox.quit();
        } catch (Exception e) {

        }

}

    public static void RestartModem() throws AWTException, InterruptedException {
        Robot robot = new Robot();
        Thread.sleep(3000);
        Narzedzia.clickXYPrawy(1739,1069);
        Thread.sleep(2000);
        Narzedzia.clickXY(1801,945);
        Thread.sleep(10000);
        Narzedzia.clickXYPrawy(1739,1069);
        Thread.sleep(2000);
        Narzedzia.clickXY(1801,945);
        Thread.sleep(10000);
    }

    public static void RestarHujawei() throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "E:\\bot\\chromedriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();

        HashMap<String, Object> images = new HashMap<String, Object>();
        images.put("images", 2);
        HashMap<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values", images);
        options.setExperimentalOption("prefs", prefs);
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("http://192.168.8.1/html/reboot.html");

        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[text()='Ponowny rozruch']")).click();
        Thread.sleep(3000);
        Narzedzia.clickXY(1340,390);
        Thread.sleep(2000);
        Narzedzia.clickXY(1076,633);
        Thread.sleep(35000);
        Narzedzia.clickXY(1893,9);
        driver.quit();
    }

    public static void RestarHujaweiKopia() throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "E:\\bot\\chromedriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();

        HashMap<String, Object> images = new HashMap<String, Object>();
        images.put("images", 2);
        HashMap<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values", images);
        options.setExperimentalOption("prefs", prefs);
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("http://192.168.8.1/");

        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[text()='Ustawienia']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[text()='System']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[text()='Ponowny rozruch']")).click();
        Thread.sleep(3000);
        Narzedzia.clickXY(1340,390);
        Thread.sleep(2000);
        Narzedzia.clickXY(1076,633);
        Thread.sleep(35000);
        Narzedzia.clickXY(1893,9);
        driver.quit();
    }
}
