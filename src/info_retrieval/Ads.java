package info_retrieval;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Random;

public class Ads extends Narzedzia {

    public static void Lidl(String mail) throws InterruptedException, AWTException {
        WebDriver driver = new FirefoxDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Random r = new Random();
        int randomImie = r.nextInt(152);
        boolean klik = false;
        int m = 0;
        Robot robot = new Robot();
        driver.manage().window().maximize();
        String imie = genImieZen();
        driver.get("http://neworklead.elk.pl/action/4947/uid/122/");

        Thread.sleep(15000);
        driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div[2]/div/button")).click();
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(1000);
        Kopiuj(imie);
        clickXY(1480,593);
        Thread.sleep(1000);
        Wklej();
        Kopiuj(mail);
        clickXY(1480,692);
        Thread.sleep(1000);
        Wklej();
        clickXY(1490,766);

        //driver.quit();

        //WP
        driver.get("http://poczta.wp.pl/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();
        Thread.sleep(9000);
        driver.findElement(By.xpath("//*[text()='Oferty']")).click();
        Thread.sleep(3000);
        while (!klik) {
            try {
                driver.findElement(By.xpath("//*[text()='Lidl Polska Newsletter']")).click();
                klik = true;
            }
            catch (Exception e) {
                robot.keyPress(KeyEvent.VK_F5);
                Thread.sleep(10000);
            }
            m++;
            if (m == 25) {
                driver.quit();
                break;
            }
        }

        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Potwierdź zamówienie newslettera* ›']")).click();
        Thread.sleep(2000);
        clickXY(868,400);
        Thread.sleep(7000);
        driver.quit();


    }

    public static void potwierdzLidl(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "E:\\bot\\chromedriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        HashMap<String, Object> images = new HashMap<String, Object>();
        images.put("images", 2);
        HashMap<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values", images);
        options.setExperimentalOption("prefs", prefs);
        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        boolean klik = false;
        int m = 0;
        Robot robot = new Robot();

        try {
            driver.get("http://poczta.wp.pl/");
            Thread.sleep(10000);
            driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();
            Thread.sleep(20000);
            driver.findElement(By.xpath("//*[text()='Oferty']")).click();
            Thread.sleep(10000);
            while(!klik) {
                try {
                    driver.findElement(By.xpath("//*[text()='Lidl Polska Newsletter']")).click();
                    klik = true;
                    Thread.sleep(7000);
                    js.executeScript("window.scrollBy(0,500)");
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("//*[text()='Potwierdź zamówienie newslettera* ›']")).click();
                    Thread.sleep(5000);
                    clickXY(868,400);
                    clickXY(868,425);
                    Thread.sleep(15000);
                    driver.quit();
                } catch (Exception e) {
                    clickXY(85, 52);
                    Thread.sleep(10000);
                }
                if (m == 10) {
                    driver.quit();
                    break;
                }
                m++;
            }

        } catch (Exception e) {
            driver.quit();
        }


    }

    public static void VeePee(String mail) throws InterruptedException, AWTException {
        int m = 0;
        boolean flaga = false;
        Robot robot = new Robot();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        try {

            driver.get("http://adsmaker.pl/logowanie/");
            Thread.sleep(5000);
            driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div[1]/div/div/form/div[1]/div/div/input")).sendKeys("arturvxx");
            driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div[1]/div/div/form/div[2]/div/div/input")).sendKeys("mrcbuch");
            Thread.sleep(1000);
            driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div[1]/div/div/form/div[3]/div[2]/input")).click();
            Thread.sleep(5000);
            driver.get("http://adsmaker.pl/akcje/grupa-12/");
            Thread.sleep(3000);
            driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div[1]/div/a[1]")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/form/p/input")).sendKeys(mail);
            Thread.sleep(1000);
            driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/form/button")).click();

            //WP
            driver.get("http://poczta.wp.pl/");
            Thread.sleep(3000);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
            //driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("szczyt2019");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();
            Thread.sleep(2000);
            while (!flaga) {
                try {
                    driver.findElement(By.xpath("//*[text()='VeePee']")).click();
                    flaga = true;
                    Thread.sleep(3000);
                    driver.findElement(By.xpath("/html/body/div[2]/nh-app-view/div/div/div/div[1]/div/div/nh-show-item/div/div/div/div/nh-html-compile/div/div/div/table[1]/tbody/tr/td/table[3]/tbody/tr[2]/td/a/img")).click();
                    Thread.sleep(12000);
                    for(String winHandle : driver.getWindowHandles()){
                        driver.switchTo().window(winHandle);
                    }
                    Thread.sleep(1000);
                    try {

                        driver.findElement(By.xpath("//*[@id=\"desktopRegisterWelcome\"]")).click();
                        Thread.sleep(2000);
                        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[4]/div/div/div/div[2]/div[2]/div/div[1]/div/a/span")).click();
                        Thread.sleep(2000);
                        driver.findElement(By.xpath("//*[@id=\"register-form-email\"]")).sendKeys(mail);
                        driver.findElement(By.xpath("//*[@id=\"register-password\"]")).sendKeys(mail + "V2");
                        Thread.sleep(1000);
                        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[4]/div/div/div/div[2]/div[2]/div/div[2]/form/div[3]/button/span")).click();
                        Thread.sleep(10000);
                        driver.quit();

                    } catch (Exception e) {

                        driver.findElement(By.xpath("//*[@id=\"register-form-email\"]")).sendKeys(mail);
                        driver.findElement(By.xpath("//*[@id=\"register-password\"]")).sendKeys(mail + "V2");
                        //driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div[2]/div/div[2]/div[2]/div/form/div[3]/label/span[2]/span")).click();
                        clickXY(79,650);
                        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div[2]/div/div[2]/div[2]/div/form/div[4]/label/span[2]/span")).click();
                        Thread.sleep(1000);
                        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div[2]/div/div[2]/div[2]/div/form/div[6]/button/span")).click();
                        Thread.sleep(10000);
                        driver.quit();

                    }

                } catch (Exception e) {
                    robot.keyPress(KeyEvent.VK_F5);
                    Thread.sleep(10000);
                }
                m++;
                if (m == 4) {
                    driver.quit();
                    break;
                }

            }
        } catch (Exception e) {
            driver.quit();
        }

    }


    public static void Enfamil(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "E:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//        try {
        driver.get("http://adsmaker.pl/action/2245/uid/26dd63a0ef72a51af97c0efa88357f15/ ");
        Thread.sleep(5000);
        Neworklead.Enfamil(driver,mail);
//        } catch (Exception e) {
//            driver.quit();
//        }

    }

    public static void BimagoAdp(String mail) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://adsmaker.pl/action/2358/uid/26dd63a0ef72a51af97c0efa88357f15/");
        Thread.sleep(2000);
        driver.get("https://profil.wp.pl/login.html?zaloguj=poczta");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[3]/button")).click();
        Thread.sleep(5000);
        try {
            driver.findElement(By.xpath("//*[@id=\"agreements\"]/div[6]/button")).click();
        } catch (Exception e) {

        }
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[text()='bimago']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[2]/nh-app-view/div/div/div/div[1]/div/div/nh-show-item/div/div/div/div/nh-html-compile/div/div/div/table/tbody/tr/td/div[8]/div/div/div/div/div/div/div/a/span")).click();
    }

    public static void EveryAdp(String mail, String odp) throws InterruptedException, AWTException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        try {
        driver.get("http://adsmaker.pl/action/2537/uid/26dd63a0ef72a51af97c0efa88357f15/ ");
        Thread.sleep(2000);
        driver.get("https://httpslink.com/ap7h");
        Thread.sleep(6000);
        Neworklead.Everyday(driver,mail,odp);

//        } catch (Exception e) {
//            driver.quit();
//        }
    }

    public static void EveryAdp2(String mail, String odp) throws InterruptedException, AWTException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        try {
        driver.get("http://adsmaker.pl/action/2538/uid/26dd63a0ef72a51af97c0efa88357f15/ ");
        Thread.sleep(2000);
        driver.get("https://httpslink.com/zocq");
        Thread.sleep(6000);
        Neworklead.Everyday(driver,mail,odp);

//        } catch (Exception e) {
//            driver.quit();
//        }
    }

    public static void EveryAf(String mail, String odp) throws InterruptedException, AWTException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        try {
        driver.get("http://adsmaker.pl/action/2544/uid/26dd63a0ef72a51af97c0efa88357f15/ ");
        Thread.sleep(6000);
        Neworklead.Everyday(driver,mail,odp);

//        } catch (Exception e) {
//            driver.quit();
//        }
    }

    public static void EveryBd2(String mail, String odp) throws InterruptedException, AWTException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        try {
        driver.get("http://adsmaker.pl/action/2557/uid/26dd63a0ef72a51af97c0efa88357f15/ ");
        Thread.sleep(6000);
        Neworklead.Everyday(driver,mail,odp);

//        } catch (Exception e) {
//            driver.quit();
//        }
    }

    public static void EveryBd(String mail, String odp) throws InterruptedException, AWTException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        try {
        driver.get("http://adsmaker.pl/action/2542/uid/26dd63a0ef72a51af97c0efa88357f15/ ");
        Thread.sleep(6000);
        Neworklead.Everyday(driver,mail,odp);

//        } catch (Exception e) {
//            driver.quit();
//        }
    }

    public static void EveryOlympicsAdp(String mail, String odp) throws InterruptedException, AWTException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        try {
        driver.get("http://adsmaker.pl/action/2574/uid/26dd63a0ef72a51af97c0efa88357f15/ ");
        Thread.sleep(2000);
        driver.get("https://httpslink.com/nv3x");
        Thread.sleep(6000);
        Neworklead.Everyday(driver,mail,odp);

//        } catch (Exception e) {
//            driver.quit();
//        }
    }

    public static void EveryOlympicsAf(String mail, String odp) throws InterruptedException, AWTException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        try {
        driver.get("http://adsmaker.pl/action/2576/uid/26dd63a0ef72a51af97c0efa88357f15/ ");
        Thread.sleep(6000);
        Neworklead.Everyday(driver,mail,odp);

//        } catch (Exception e) {
//            driver.quit();
//        }
    }

    public static void Pampers(String mail) throws InterruptedException, AWTException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        Random r = new Random();
        int plec = r.nextInt(2);
        boolean flaga = false;
        int m = 0;
        String imie = null;
        String nazwisko = null;
        imie = genImieZen();
        nazwisko = genNazwiskoZen();
        int dzien = r.nextInt(27) + 1;
        int mies = r.nextInt(11) + 1;
        String dzienn = dodajZero(dzien);
        String miess = dodajZero(mies);
        ChromeDriver driver = new ChromeDriver();
        Robot robot = new Robot();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, 60);

//        try {
        driver.get("http://adsmaker.pl/action/2545/uid/26dd63a0ef72a51af97c0efa88357f15/");
        Thread.sleep(10000);
        driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[2]/div/div[2]/div[2]/form/div[1]/div/div/div[1]/div/div[1]/input")).sendKeys(imie);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[2]/div/div[2]/div[2]/form/div[1]/div/div/div[2]/div/div[1]/input")).sendKeys(nazwisko);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[2]/div/div[2]/div[2]/form/div[1]/div/div/div[3]/div/input")).sendKeys(mail);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[2]/div/div[2]/div[2]/form/div[1]/div/div/div[4]/div/div[1]/input")).sendKeys(mail+"V2");
        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[2]/div/div[2]/div[2]/form/div[1]/div/div/div[5]/div/div[2]/label[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[2]/div/div[2]/div[2]/form/div[1]/div/div/div[6]/div/div[1]/div/input[1]")).sendKeys(dzienn);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[2]/div/div[2]/div[2]/form/div[1]/div/div/div[6]/div/div[1]/div/input[2]")).sendKeys(miess);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[2]/div/div[2]/div[2]/form/div[1]/div/div/div[6]/div/div[1]/div/input[3]")).sendKeys("2020");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[2]/div/div[2]/div[2]/form/div[2]/div/button/span")).click();
        Thread.sleep(10000);

        ///WP
        driver.get("http://poczta.wp.pl/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
        //driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("szczyt2019");
        Thread.sleep(1000);
        //driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[3]/button")).click();
        Thread.sleep(5000);
        try {
            driver.findElement(By.xpath("//*[@id=\"agreements\"]/div[6]/button")).click();
        } catch (Exception e) {

        }
        Thread.sleep(3000);
        while (!flaga) {
            try {
                driver.findElement(By.xpath("//*[text()='Pampers']")).click();
                flaga = true;
                Thread.sleep(4000);
                driver.findElement(By.xpath("/html/body/div[2]/nh-app-view/div/div/div/div[1]/div/div/nh-show-item/div/div/div/div/nh-html-compile/div/div/div/table[1]/tbody/tr/td/table/tbody/tr/td/table[5]/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/table[2]/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr/td/a")).click();
                Thread.sleep(5000);

            } catch (Exception e) {
                driver.navigate().refresh();
                Thread.sleep(10000);
            }
            m++;
            if (m > 15) {
                break;
            }

        }
        driver.quit();

//        } catch (Exception f) {
//            driver.quit();
//        }

    }
}
