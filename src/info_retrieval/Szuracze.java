package info_retrieval;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Random;

public class Szuracze extends Narzedzia{

    public static void Lidl7(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "E:\\bot\\chromedriver\\chromedriver.exe");
        Random r = new Random();
        int plec = r.nextInt(2);
        String imie;
        if (plec == 0)
            imie = genImieMes();
        else
            imie = genImieZen();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            driver.get("http://www.szuracze.pl/action/1470/uid/f5654c6a537aa357f56724568a57f357/");
            Thread.sleep(10000);
            clickXY(1390,1030);

            Thread.sleep(10000);
            for(String winHandle : driver.getWindowHandles()){
                driver.switchTo().window(winHandle);
            }
            Thread.sleep(1000);
            ScrollBy(driver,"700");
            Thread.sleep(7000);
            driver.switchTo().frame(0);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"s_prename\"]")).sendKeys(imie);
            driver.findElement(By.xpath("//*[@id=\"s_email\"]")).sendKeys(mail);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
            Thread.sleep(7000);
            driver.quit();

        } catch (Exception e) {
            driver.quit();
        }

    }

    public static void Lidl(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "E:\\bot\\chromedriver\\chromedriver.exe");
        Random r = new Random();
        int plec = r.nextInt(2);
        String imie;
        if (plec == 0)
            imie = genImieMes();
        else
            imie = genImieZen();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            driver.get("http://www.szuracze.pl/action/1463/uid/f5654c6a537aa357f56724568a57f357/");
            Thread.sleep(10000);
            clickXY(1350,1026);
            Thread.sleep(10000);
            for(String winHandle : driver.getWindowHandles()){
                driver.switchTo().window(winHandle);
            }
            Thread.sleep(1000);
            ScrollBy(driver,"700");
            Thread.sleep(7000);
            driver.switchTo().frame(0);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"s_prename\"]")).sendKeys(imie);
            driver.findElement(By.xpath("//*[@id=\"s_email\"]")).sendKeys(mail);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
            Thread.sleep(7000);
            driver.quit();
        } catch (Exception e) {
            driver.quit();
        }

    }

    public static void Sky() throws InterruptedException, AWTException {
        System.setProperty("webdriver.gecko.driver", "E:\\bot\\geckodriver\\geckodriver.exe");
        String[] panstwa = {"Irlandia","Wielka Brytania","Norwegia","Szwecja","Finlandia","Portugalia","Hiszpania","Andora","Francja","Holandia","Belgia","Luxemburg","Niemcy","Dania","Szwajcaria","Lichtenstein","Włochy","Monako","San Marino","Czechy","Słowacja","Austria","Węgry","Słowenia","Chorwacja","Albania","Macedonia","Bułgaria","Grecja","Estonia","Łotwa","Litwa","Białoruś","Ukraina","Rosja","Islandia"};
        Random r = new Random();
        int i = r.nextInt(panstwa.length-1);
        int dzien = r.nextInt(28);
        Robot robot = new Robot();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();

        driver.get("http://www.szuracze.pl/action/1447/uid/f5654c6a537aa357f56724568a57f357/");
        Thread.sleep(5000);
        clickXY(1280,480);

        Thread.sleep(5000);
        zmienKarte(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"cookie-banner-root\"]/div[1]/div/div[3]/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"skhot\"]/span")).click();
        Thread.sleep(7000);
        driver.findElement(By.xpath("//*[@id=\"destination-autosuggest\"]")).sendKeys(panstwa[i]);
        Thread.sleep(3000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(1000);
        switch (dzien) {
            case 0:
                clickXY(890,834);
                break;
            case 1:
                clickXY(930,834);
                break;
            case 2:
                clickXY(973,834);
                break;
            case 3:
                clickXY(1017,834);
                break;
            case 4:
                clickXY(1060,834);
                break;
            case 5:
                clickXY(1100,834);
                break;
            case 6:
                clickXY(1143,834);
                break;
            //===============================
            case 7:
                clickXY(890,878);
                break;
            case 8:
                clickXY(930,878);
                break;
            case 9:
                clickXY(973,878);
                break;
            case 10:
                clickXY(1017,878);
                break;
            case 11:
                clickXY(1060,878);
                break;
            case 12:
                clickXY(1100,878);
                break;
            case 13:
                clickXY(1143,878);
                break;
            //=================================
            case 14:
                clickXY(890,920);
                break;
            case 15:
                clickXY(930,920);
                break;
            case 16:
                clickXY(973,920);
                break;
            case 17:
                clickXY(1017,920);
                break;
            case 18:
                clickXY(1060,920);
                break;
            case 19:
                clickXY(1100,920);
                break;
            case 20:
                clickXY(1143,920);
                break;
            //====================================
            case 21:
                clickXY(890,962);
                break;
            case 22:
                clickXY(930,962);
                break;
            case 24:
                clickXY(973,962);
                break;
            case 25:
                clickXY(1017,962);
                break;
            case 26:
                clickXY(1060,962);
                break;
            case 27:
                clickXY(1100,962);
                break;
            case 28:
                clickXY(1143,962);
                break;
        }
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"search-controls\"]/div[2]/button")).click();

    }

    public static void Momondo1() throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "E:\\bot\\chromedriver\\chromedriver.exe");   //LIMIT 100
        Random r = new Random();
        int momondo = r.nextInt(2);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            driver.get("http://www.szuracze.pl/action/1418/uid/f5654c6a537aa357f56724568a57f357/");
            Thread.sleep(5000);
            clickXY(854,538);
            if (momondo == 0)
                Neworklead.MomondoHotel(driver);
            else
                Neworklead.MomondoSamochod(driver);

        } catch (Exception e){
            driver.quit();
        }





    }

    public static void Momondo2() throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "E:\\bot\\chromedriver\\chromedriver.exe");   //LIMIT 100
        Random r = new Random();
        int momondo = r.nextInt(2);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            driver.get("http://www.szuracze.pl/action/1454/uid/f5654c6a537aa357f56724568a57f357/");
            Thread.sleep(5000);
            clickXY(1240,630);
            if (momondo == 0)
                Neworklead.MomondoHotel(driver);
            else
                Neworklead.MomondoSamochod(driver);

        } catch (Exception e){
            driver.quit();
        }



    }

    public static void Momondo3() throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "E:\\bot\\chromedriver\\chromedriver.exe");   //LIMIT 100
        Random r = new Random();
        int momondo = r.nextInt(2);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            driver.get("http://www.szuracze.pl/action/1451/uid/f5654c6a537aa357f56724568a57f357/");
            Thread.sleep(5000);
            Zmniejsz(3);
            Thread.sleep(1000);
            clickXY(1170,933);
            if (momondo == 0)
                Neworklead.MomondoHotel(driver);
            else
                Neworklead.MomondoSamochod(driver);

        } catch (Exception e){
            driver.quit();
        }



    }
}
