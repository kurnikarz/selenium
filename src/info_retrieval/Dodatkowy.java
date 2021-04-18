package info_retrieval;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.TreeMap;

public class Dodatkowy extends Narzedzia {
    public static void wpiszHaslo() throws InterruptedException, AWTException {
        Robot robot = new Robot();
        Kopiuj("av126");
        Thread.sleep(3000);
        Wklej();
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(7000);
    }

    public static void Lenovo(String mail, String temat, String opinia) throws InterruptedException, AWTException {
        Random r = new Random();
        int imieZenskie = r.nextInt(153);
        int imieMeskie = r.nextInt(229);
        int randomNazwisko = r.nextInt(199);
        int plec = r.nextInt(2);
        String imie;
        if (plec == 0)
            imie = Narzedzia.imieZenskie[imieZenskie];
        else
            imie = Narzedzia.imieMeskie[imieMeskie];
        WebDriver driver = new FirefoxDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
        Robot robot = new Robot();
        driver.get("http://dodatkowypieniadz.com/wykonaj.php?a=1511&u=153&k=59f3635dd821e60a50bd7");

        Thread.sleep(10000);
        Narzedzia.Zmniejsz(3);
        Thread.sleep(1000);
        Narzedzia.clickXY(1246, 923);

        Thread.sleep(6000);
        Narzedzia.clickXY(320, 703);
        Thread.sleep(2000);
        Narzedzia.Zmniejsz(4);
        Thread.sleep(1000);
        Narzedzia.Kopiuj(imie);
        Narzedzia.clickXY(789, 292);
        Narzedzia.Wklej();
        Narzedzia.Kopiuj(mail);
        Narzedzia.clickXY(789, 330);
        Narzedzia.Wklej();
        Narzedzia.Kopiuj(temat);
        Narzedzia.clickXY(789, 370);
        Narzedzia.Wklej();
        Narzedzia.Kopiuj(opinia);
        Narzedzia.clickXY(789, 450);
        Narzedzia.Wklej();
        Narzedzia.clickXY(375, 733);
        Thread.sleep(1000);
        Narzedzia.clickXY(789, 788);
        Thread.sleep(6000);

        driver.quit();
    }

    public static void Nivea(String mail) throws AWTException, InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "E:\\bot\\chromedriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        boolean flaga = true;
        boolean flaga2 = true;
        String imie = genImieZen();
        int m = 0;
        WebElement blad;
        Random r = new Random();
        int dzie = r.nextInt(29);
        int mies = r.nextInt(12 - 2 + 1) + 2;
        int ro = r.nextInt(1996 - 1985 + 1) + 1985;
        int odp1 = r.nextInt(5);
        int odp2 = r.nextInt(5);
        Robot robot = new Robot();
        //options.addArguments("user-data-dir=C:\\Users\\Artur\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 1");
        Writer niewykorzystane = new BufferedWriter(new FileWriter("C:\\Users\\Artur\\Desktop\\klikanie\\niewykorzystanaNivea.txt", true));
        options.addExtensions(new File("E:\\botPythonn\\captcha.crx"));
        HashMap<String, Object> images = new HashMap<String, Object>();
        images.put("images", 2);
        HashMap<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values", images);
        options.setExperimentalOption("prefs", prefs);


        WebDriver driver = new ChromeDriver(options);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();

        try {
            driver.get("http://dodatkowypieniadz.com/wykonaj.php?a=1599&u=153&k=59f3635dd821e60a50bd7");

            Thread.sleep(15000);
            clickXY(1322, 750);
            Thread.sleep(15000);

            for (String winHandle : driver.getWindowHandles()) {
                driver.switchTo().window(winHandle);
            }
            Thread.sleep(1000);
            String mainWin = driver.getWindowHandle();
            driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/button")).click();
            Thread.sleep(1000);//509,963

            //RECAPTCHA=============================================================================
            while (flaga) {
                driver.switchTo().frame(0);
                driver.findElement(By.xpath("//*[@id=\"rc-anchor-container\"]")).click();
                Thread.sleep(4000);
                Narzedzia.clickXY(509, 963);
                Thread.sleep(1000);
                clickXY(512, 1016);
                //driver.switchTo().window(mainWin);
                Thread.sleep(5000);
                Narzedzia.clickXY(512, 839);
                Thread.sleep(5000);
                try {
                    driver.findElement(By.xpath("//*[text()='You are verified']"));
                    flaga = false;
                } catch (Exception e) {
                    robot.keyPress(KeyEvent.VK_F5);
                    robot.keyRelease(KeyEvent.VK_F5);
                    Thread.sleep(4000);
                }
                if (m == 15) {
                    driver.get("http://www.dodatkowypieniadz.com/");
                    Thread.sleep(2000);
                    driver.findElement(By.xpath("/html/body/section/form/input[1]")).sendKeys("arturvx");
                    driver.findElement(By.xpath("/html/body/section/form/input[2]")).sendKeys("b2K22gbTbTg");
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("/html/body/section/form/input[4]")).click();
                    Thread.sleep(3000);
                    driver.findElement(By.xpath("/html/body/section[2]/section[1]/section/div[1]/div/a[2]")).click();
                    Thread.sleep(5000);
                    clickXY(1312, 490);
                    Thread.sleep(10000);
                    niewykorzystane.append(mail + ";");
                    niewykorzystane.close();
                    driver.quit();
                    return;
                }
                m++;
            }
            //===================================================================================
            Thread.sleep(1000);
            driver.switchTo().window(mainWin);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys(imie);
            driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(mail);
            driver.findElement(By.xpath("/html/body/main/section[1]/div/div/div[3]/form/div[1]/div[3]/div/label")).click();
            driver.findElement(By.xpath("/html/body/main/section[1]/div/div/div[3]/form/div[1]/div[4]/div/label")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"formularz\"]/form/div[3]/button")).click();
            //clickXY(950,894);
            Thread.sleep(7000);

            //WP
            driver.get("http://poczta.wp.pl/");
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
            driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
            //driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("szczyt2019");
            Thread.sleep(1000);
            clickXY(332, 597);
            Thread.sleep(4000);
            driver.findElement(By.xpath("//*[text()='Newslettery']")).click();
            Thread.sleep(5000);

            while (flaga2) {
                try {
                    driver.findElement(By.xpath("//*[text()='NIVEA']")).click();
                    flaga2 = false;
                    Thread.sleep(5000);
                    //clickXY(961,655);
                    driver.findElement(By.xpath("/html/body/div[2]/nh-app-view/div/div/div/div[1]/div/div/nh-show-item/div/div/div/div/nh-html-compile/div[1]/div/div/table[2]/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td/a/img")).click();
                    Thread.sleep(12000);

                    for (String winHandle : driver.getWindowHandles()) {
                        driver.switchTo().window(winHandle);
                    }
                    Thread.sleep(1000);
                    ScrollBy(driver, "700");
                    Thread.sleep(1000);
                    try {
                        driver.findElement(By.xpath("/html/body/main/section[1]/div/div/div/div/div[2]/div/form/div[1]/div[2]/div[1]/label")).click();
                        Thread.sleep(1000);
                        Select dzien = new Select(driver.findElement(By.xpath("//*[@id=\"questionnaire_birthday_day\"]")));
                        dzien.selectByIndex(dzie);
                        Select miesiac = new Select(driver.findElement(By.xpath("//*[@id=\"questionnaire_birthday_month\"]")));
                        miesiac.selectByIndex(mies);
                        Select rok = new Select(driver.findElement(By.xpath("//*[@id=\"questionnaire_birthday_year\"]")));
                        rok.selectByValue(String.valueOf(ro));
                        Thread.sleep(1000);
                        switch (odp1) {
                            case 0:
                                driver.findElement(By.xpath("/html/body/main/section[1]/div/div/div/div/div[2]/div/form/div[3]/div[2]/div[1]/label/span[1]")).click();
                                break;
                            case 1:
                                driver.findElement(By.xpath("/html/body/main/section[1]/div/div/div/div/div[2]/div/form/div[3]/div[2]/div[2]/label/span[1]")).click();
                                break;
                            case 2:
                                driver.findElement(By.xpath("/html/body/main/section[1]/div/div/div/div/div[2]/div/form/div[3]/div[2]/div[3]/label/span[1]")).click();
                                break;
                            case 3:
                                driver.findElement(By.xpath("/html/body/main/section[1]/div/div/div/div/div[2]/div/form/div[3]/div[2]/div[4]/label/span[1]")).click();
                                break;
                            case 4:
                                driver.findElement(By.xpath("/html/body/main/section[1]/div/div/div/div/div[2]/div/form/div[3]/div[2]/div[5]/label/span[1]")).click();
                                break;
                        }

                        Thread.sleep(1000);
                        switch (odp2) {
                            case 0:
                                driver.findElement(By.xpath("/html/body/main/section[1]/div/div/div/div/div[2]/div/form/div[4]/div[2]/div[1]/label/span[1]")).click();
                                break;
                            case 1:
                                driver.findElement(By.xpath("/html/body/main/section[1]/div/div/div/div/div[2]/div/form/div[4]/div[2]/div[2]/label/span[1]")).click();
                                break;
                            case 2:
                                driver.findElement(By.xpath("/html/body/main/section[1]/div/div/div/div/div[2]/div/form/div[4]/div[2]/div[3]/label/span[1]")).click();
                                break;
                            case 3:
                                driver.findElement(By.xpath("/html/body/main/section[1]/div/div/div/div/div[2]/div/form/div[4]/div[2]/div[4]/label/span[1]")).click();
                                break;
                            case 4:
                                driver.findElement(By.xpath("/html/body/main/section[1]/div/div/div/div/div[2]/div/form/div[4]/div[2]/div[5]/label/span[1]")).click();
                                break;
                        }
                        Thread.sleep(1000);
                        ScrollBy(driver, "700");
                        Thread.sleep(1000);
                        driver.findElement(By.xpath("/html/body/main/section[1]/div/div/div/div/div[2]/div/form/div[5]/button")).click();
                        Thread.sleep(10000);
                        driver.quit();
                    } catch (Exception e) {
                        driver.quit();
                    }


                } catch (Exception e) {
                    robot.keyPress(KeyEvent.VK_F5);
                    Thread.sleep(10000);
                }
                m++;
                if (m == 10) {
                    driver.quit();
                    break;
                }
            }

        } catch (Exception e) {
            driver.quit();
        }

    }

    public static int NiveaTest(String mail) throws AWTException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\bot\\chromedriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        boolean flaga = true;
        boolean flaga2 = true;
        String imie = genImieZen();
        int m = 0;
        WebElement blad;
        int bladCaptcha = 0;
        Random r = new Random();
        int dzie = r.nextInt(29);
        int mies = r.nextInt(12 - 2 + 1) + 2;
        int ro = r.nextInt(1996 - 1985 + 1) + 1985;
        int odp1 = r.nextInt(5);
        int odp2 = r.nextInt(5);
        Robot robot = new Robot();
        //options.addArguments("user-data-dir=C:\\Users\\Artur\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 1");
        options.addExtensions(new File("E:\\botPythonn\\captcha.crx"));
        WebDriver driver = new ChromeDriver(options);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();

        try {
            driver.get("http://dodatkowypieniadz.com/wykonaj.php?a=1635&u=2&k=a5687c0a676c6e8399f74");

            Thread.sleep(15000);
            clickXY(482, 773);
            Thread.sleep(10000);

            for (String winHandle : driver.getWindowHandles()) {
                driver.switchTo().window(winHandle);
            }
            Thread.sleep(1000);
            String mainWin = driver.getWindowHandle();
            driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/button")).click();
            Thread.sleep(1000);//509,963

            //RECAPTCHA=============================================================================
            while (flaga) {
                driver.switchTo().frame(0);
                driver.findElement(By.xpath("//*[@id=\"rc-anchor-container\"]")).click();
                Thread.sleep(2000);
                Narzedzia.clickXY(509, 963);
                //driver.switchTo().window(mainWin);
                Thread.sleep(8000);
                Narzedzia.clickXY(512, 839);
                Thread.sleep(5000);
                Narzedzia.clickXY(512, 839);
                Thread.sleep(5000);
                try {
                    driver.findElement(By.xpath("//*[text()='You are verified']"));
                    flaga = false;
                } catch (Exception e) {
                    robot.keyPress(KeyEvent.VK_F5);
                    robot.keyRelease(KeyEvent.VK_F5);
                    Thread.sleep(4000);
                }
                if (m == 10) {
                    bladCaptcha++;
                    driver.quit();
                    return bladCaptcha;
                }
                m++;
            }
            //===================================================================================
            Thread.sleep(1000);
            driver.switchTo().window(mainWin);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys(imie);
            driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(mail);
            driver.findElement(By.xpath("/html/body/main/section[1]/div/div/div[3]/form/div[1]/div[3]/div/label")).click();
            driver.findElement(By.xpath("/html/body/main/section[1]/div/div/div[3]/form/div[1]/div[4]/div/label")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"formularz\"]/form/div[3]/button")).click();
            //clickXY(950,894);
            Thread.sleep(7000);

            //WP
            driver.get("http://poczta.wp.pl/");
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
            driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
            //driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("szczyt2019");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[text()='Newslettery']")).click();
            Thread.sleep(5000);

            while (flaga2) {
                try {
                    driver.findElement(By.xpath("//*[text()='NIVEA']")).click();
                    flaga2 = false;
                    Thread.sleep(5000);
                    //clickXY(961,655);
                    driver.findElement(By.xpath("/html/body/div[2]/nh-app-view/div/div/div/div[1]/div/div/nh-show-item/div/div/div/div/nh-html-compile/div[1]/div/div/table[2]/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td/a/img")).click();
                    Thread.sleep(12000);

                    for (String winHandle : driver.getWindowHandles()) {
                        driver.switchTo().window(winHandle);
                    }
                    Thread.sleep(1000);
                    ScrollBy(driver, "700");
                    Thread.sleep(1000);
                    try {
                        driver.findElement(By.xpath("/html/body/main/section[1]/div/div/div/div/div[2]/div/form/div[1]/div[2]/div[1]/label")).click();
                        Thread.sleep(1000);
                        Select dzien = new Select(driver.findElement(By.xpath("//*[@id=\"questionnaire_birthday_day\"]")));
                        dzien.selectByIndex(dzie);
                        Select miesiac = new Select(driver.findElement(By.xpath("//*[@id=\"questionnaire_birthday_month\"]")));
                        miesiac.selectByIndex(mies);
                        Select rok = new Select(driver.findElement(By.xpath("//*[@id=\"questionnaire_birthday_year\"]")));
                        rok.selectByValue(String.valueOf(ro));
                        Thread.sleep(1000);
                        switch (odp1) {
                            case 0:
                                driver.findElement(By.xpath("/html/body/main/section[1]/div/div/div/div/div[2]/div/form/div[3]/div[2]/div[1]/label/span[1]")).click();
                                break;
                            case 1:
                                driver.findElement(By.xpath("/html/body/main/section[1]/div/div/div/div/div[2]/div/form/div[3]/div[2]/div[2]/label/span[1]")).click();
                                break;
                            case 2:
                                driver.findElement(By.xpath("/html/body/main/section[1]/div/div/div/div/div[2]/div/form/div[3]/div[2]/div[3]/label/span[1]")).click();
                                break;
                            case 3:
                                driver.findElement(By.xpath("/html/body/main/section[1]/div/div/div/div/div[2]/div/form/div[3]/div[2]/div[4]/label/span[1]")).click();
                                break;
                            case 4:
                                driver.findElement(By.xpath("/html/body/main/section[1]/div/div/div/div/div[2]/div/form/div[3]/div[2]/div[5]/label/span[1]")).click();
                                break;
                        }

                        Thread.sleep(1000);
                        switch (odp2) {
                            case 0:
                                driver.findElement(By.xpath("/html/body/main/section[1]/div/div/div/div/div[2]/div/form/div[4]/div[2]/div[1]/label/span[1]")).click();
                                break;
                            case 1:
                                driver.findElement(By.xpath("/html/body/main/section[1]/div/div/div/div/div[2]/div/form/div[4]/div[2]/div[2]/label/span[1]")).click();
                                break;
                            case 2:
                                driver.findElement(By.xpath("/html/body/main/section[1]/div/div/div/div/div[2]/div/form/div[4]/div[2]/div[3]/label/span[1]")).click();
                                break;
                            case 3:
                                driver.findElement(By.xpath("/html/body/main/section[1]/div/div/div/div/div[2]/div/form/div[4]/div[2]/div[4]/label/span[1]")).click();
                                break;
                            case 4:
                                driver.findElement(By.xpath("/html/body/main/section[1]/div/div/div/div/div[2]/div/form/div[4]/div[2]/div[5]/label/span[1]")).click();
                                break;
                        }
                        Thread.sleep(1000);
                        ScrollBy(driver, "700");
                        Thread.sleep(1000);
                        driver.findElement(By.xpath("/html/body/main/section[1]/div/div/div/div/div[2]/div/form/div[5]/button")).click();
                        Thread.sleep(10000);
                        driver.quit();
                        return bladCaptcha;
                    } catch (Exception e) {
                        driver.quit();
                        return bladCaptcha;
                    }


                } catch (Exception e) {
                    robot.keyPress(KeyEvent.VK_F5);
                    Thread.sleep(10000);
                }
                m++;
                if (m == 10) {
                    driver.quit();
                    return bladCaptcha;
                }
            }

        } catch (Exception e) {
            bladCaptcha++;
            driver.quit();
            return bladCaptcha;
        }
        return bladCaptcha;
    }

    public static void PotwierdzNivea(String mail, String haslo) throws AWTException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\bot\\chromedriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        HashMap<String, Object> images = new HashMap<String, Object>();
        images.put("images", 2);
        HashMap<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values", images);
        options.setExperimentalOption("prefs", prefs);
        boolean flaga = true;
        boolean flaga2 = true;
        int m = 0;
        Random r = new Random();
        int dzie = r.nextInt(29);
        int mies = r.nextInt(12 - 2 + 1) + 2;
        int ro = r.nextInt(1996 - 1985 + 1) + 1985;
        int odp1 = r.nextInt(5);
        int odp2 = r.nextInt(5);
        Robot robot = new Robot();
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        try {
            //WP
            driver.get("http://poczta.wp.pl/");
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
            driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(haslo);
            //driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("szczyt2019");
            Thread.sleep(1000);
            clickXY(332, 597);
            Thread.sleep(4000);
            driver.findElement(By.xpath("//*[text()='Newslettery']")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//*[text()='NIVEA']")).click();
            flaga2 = false;
            Thread.sleep(5000);
            //clickXY(961,655);
            driver.findElement(By.xpath("/html/body/div[2]/nh-app-view/div/div/div/div[1]/div/div/nh-show-item/div/div/div/div/nh-html-compile/div[1]/div/div/table[2]/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td/a/img")).click();
            Thread.sleep(12000);

            for (String winHandle : driver.getWindowHandles()) {
                driver.switchTo().window(winHandle);
            }
            Thread.sleep(1000);
            ScrollBy(driver, "700");
            Thread.sleep(1000);
            try {
                driver.findElement(By.xpath("/html/body/main/section[1]/div/div/div/div/div[2]/div/form/div[1]/div[2]/div[1]/label")).click();
                Thread.sleep(1000);
                Select dzien = new Select(driver.findElement(By.xpath("//*[@id=\"questionnaire_birthday_day\"]")));
                dzien.selectByIndex(dzie);
                Select miesiac = new Select(driver.findElement(By.xpath("//*[@id=\"questionnaire_birthday_month\"]")));
                miesiac.selectByIndex(mies);
                Select rok = new Select(driver.findElement(By.xpath("//*[@id=\"questionnaire_birthday_year\"]")));
                rok.selectByValue(String.valueOf(ro));
                Thread.sleep(1000);
                switch (odp1) {
                    case 0:
                        driver.findElement(By.xpath("/html/body/main/section[1]/div/div/div/div/div[2]/div/form/div[3]/div[2]/div[1]/label/span[1]")).click();
                        break;
                    case 1:
                        driver.findElement(By.xpath("/html/body/main/section[1]/div/div/div/div/div[2]/div/form/div[3]/div[2]/div[2]/label/span[1]")).click();
                        break;
                    case 2:
                        driver.findElement(By.xpath("/html/body/main/section[1]/div/div/div/div/div[2]/div/form/div[3]/div[2]/div[3]/label/span[1]")).click();
                        break;
                    case 3:
                        driver.findElement(By.xpath("/html/body/main/section[1]/div/div/div/div/div[2]/div/form/div[3]/div[2]/div[4]/label/span[1]")).click();
                        break;
                    case 4:
                        driver.findElement(By.xpath("/html/body/main/section[1]/div/div/div/div/div[2]/div/form/div[3]/div[2]/div[5]/label/span[1]")).click();
                        break;
                }

                Thread.sleep(1000);
                switch (odp2) {
                    case 0:
                        driver.findElement(By.xpath("/html/body/main/section[1]/div/div/div/div/div[2]/div/form/div[4]/div[2]/div[1]/label/span[1]")).click();
                        break;
                    case 1:
                        driver.findElement(By.xpath("/html/body/main/section[1]/div/div/div/div/div[2]/div/form/div[4]/div[2]/div[2]/label/span[1]")).click();
                        break;
                    case 2:
                        driver.findElement(By.xpath("/html/body/main/section[1]/div/div/div/div/div[2]/div/form/div[4]/div[2]/div[3]/label/span[1]")).click();
                        break;
                    case 3:
                        driver.findElement(By.xpath("/html/body/main/section[1]/div/div/div/div/div[2]/div/form/div[4]/div[2]/div[4]/label/span[1]")).click();
                        break;
                    case 4:
                        driver.findElement(By.xpath("/html/body/main/section[1]/div/div/div/div/div[2]/div/form/div[4]/div[2]/div[5]/label/span[1]")).click();
                        break;
                }
                Thread.sleep(1000);
                ScrollBy(driver, "700");
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/main/section[1]/div/div/div/div/div[2]/div/form/div[5]/button")).click();
                Thread.sleep(10000);
                driver.quit();
            } catch (Exception e) {
                driver.quit();
            }


        } catch (Exception e) {
            driver.quit();
        }
    }

    public static void Totalizator2(String mail, String numer) throws InterruptedException, AWTException, IOException {
        Random r = new Random();
        int plec = r.nextInt(2);
        Robot robot = new Robot();
        String imie;
        String nazwisko;
        if (plec == 0) {
            imie = genImieZen();
            nazwisko = genNazwiskoZen();
        } else {
            imie = genImieMes();
            nazwisko = genNazwisko();
        }
        FirefoxDriver driver = new FirefoxDriver();
        JavascriptExecutor js = driver;
        driver.manage().window().maximize();
        try {
            driver.get("http://dodatkowypieniadz.com/wykonaj.php?a=1536&u=153&k=59f3635dd821e60a50bd7");

            Thread.sleep(15000);
            Zmniejsz(5);
            Thread.sleep(1000);
            clickXY(1073, 1033);

            Thread.sleep(12000);
            clickXY(950, 1017);
            Thread.sleep(1000);
            clickXY(1440, 100);
            Thread.sleep(5000);

            clickXY(950, 1017);
            Kopiuj(imie);
            clickXY(1002, 385);
            Thread.sleep(1000);
            Wklej();
            Kopiuj(nazwisko);
            clickXY(1002, 443);
            Thread.sleep(1000);
            Wklej();
            Kopiuj(numer);
            clickXY(1002, 496);
            Thread.sleep(1000);
            Wklej();
            Kopiuj(mail);
            clickXY(1002, 548);
            Thread.sleep(1000);
            Wklej();
            Kopiuj(mail + "V2");
            clickXY(1002, 607);
            Thread.sleep(1000);
            Wklej();
            clickXY(1002, 664);
            Thread.sleep(1000);
            Wklej();
            clickXY(1002, 709);
            clickXY(1002, 745);
            clickXY(1002, 800);
            Thread.sleep(1000);
            clickXY(1329, 860);
            Thread.sleep(1000);
            clickXY(1002, 990);
            Thread.sleep(1000);
            clickXY(1910, 1022);
            Thread.sleep(1000);
            clickXY(1400, 706);

            //WP
            boolean flaga = true;
            int m = 0;
            int y = 392;
            driver.get("http://poczta.wp.pl/");
            Thread.sleep(3000);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_TAB);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
            //firefox.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("szczyt2019");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();
            Thread.sleep(2000);
            while (flaga) {
                try {
                    driver.findElement(By.xpath("//*[text()='Loteriada 2019']")).click();
                    Thread.sleep(3000);
                    flaga = false;
                    for (int i = 0; i < 15; i++) {
                        clickXY(906, y);
                        y += 10;
                    }
                    clickXY(1025, 375);
                    Thread.sleep(4000);
                    Kopiuj(mail);
                    clickXY(844, 387);
                    Thread.sleep(1000);
                    Wklej();
                    Kopiuj(mail + "V2");
                    clickXY(844, 445);
                    Thread.sleep(1000);
                    Wklej();
                    Thread.sleep(1000);
                    clickXY(844, 518);
                    Thread.sleep(15000);
                    clickXY(1120, 145);
                    Thread.sleep(14000);
                    driver.quit();
                } catch (Exception e) {
                    robot.keyPress(KeyEvent.VK_F5);
                    Thread.sleep(5000);
                }
                m++;
                if (m == 10) {
                    driver.quit();
                    break;
                }

            }
        } catch (Exception e) {
            driver.quit();
        }

    }

    public static void Totalizator3(String mail, String numer) throws InterruptedException, AWTException, IOException {
        Random r = new Random();
        int plec = r.nextInt(2);
        Robot robot = new Robot();
        String imie;
        String nazwisko;
        if (plec == 0) {
            imie = genImieZen();
            nazwisko = genNazwiskoZen();
        } else {
            imie = genImieMes();
            nazwisko = genNazwisko();
        }
        FirefoxDriver driver = new FirefoxDriver();
        JavascriptExecutor js = driver;
        driver.manage().window().maximize();
        try {
            driver.get("http://dodatkowypieniadz.com/wykonaj.php?a=1539&u=153&k=59f3635dd821e60a50bd7");

            Thread.sleep(15000);
            Zmniejsz(5);
            Thread.sleep(1000);
            clickXY(1910, 1012);
            Thread.sleep(10000);
            clickXY(1078, 745);

            Thread.sleep(12000);
            clickXY(950, 1017);
            Thread.sleep(1000);
            clickXY(1440, 100);
            Thread.sleep(5000);

            clickXY(950, 1017);
            Kopiuj(imie);
            clickXY(1002, 385);
            Thread.sleep(1000);
            Wklej();
            Kopiuj(nazwisko);
            clickXY(1002, 443);
            Thread.sleep(1000);
            Wklej();
            Kopiuj(numer);
            clickXY(1002, 496);
            Thread.sleep(1000);
            Wklej();
            Kopiuj(mail);
            clickXY(1002, 548);
            Thread.sleep(1000);
            Wklej();
            Kopiuj(mail + "V2");
            clickXY(1002, 607);
            Thread.sleep(1000);
            Wklej();
            clickXY(1002, 664);
            Thread.sleep(1000);
            Wklej();
            clickXY(1002, 709);
            clickXY(1002, 745);
            clickXY(1002, 800);
            Thread.sleep(1000);
            clickXY(1329, 860);
            Thread.sleep(1000);
            clickXY(1002, 990);
            Thread.sleep(1000);
            clickXY(1910, 1022);
            Thread.sleep(1000);
            clickXY(1400, 706);

            //WP
            boolean flaga = true;
            int m = 0;
            int y = 392;
            driver.get("http://poczta.wp.pl/");
            Thread.sleep(3000);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_TAB);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
            //firefox.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("szczyt2019");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();
            Thread.sleep(2000);
            while (flaga) {
                try {
                    driver.findElement(By.xpath("//*[text()='Loteriada 2019']")).click();
                    Thread.sleep(3000);
                    flaga = false;
                    for (int i = 0; i < 15; i++) {
                        clickXY(906, y);
                        y += 10;
                    }
                    clickXY(1025, 375);
                    Thread.sleep(4000);
                    Kopiuj(mail);
                    clickXY(844, 387);
                    Thread.sleep(1000);
                    Wklej();
                    Kopiuj(mail + "V2");
                    clickXY(844, 445);
                    Thread.sleep(1000);
                    Wklej();
                    Thread.sleep(1000);
                    clickXY(844, 518);
                    Thread.sleep(15000);
                    clickXY(1120, 145);
                    Thread.sleep(14000);
                    driver.quit();
                } catch (Exception e) {
                    robot.keyPress(KeyEvent.VK_F5);
                    Thread.sleep(5000);
                }
                m++;
                if (m == 10) {
                    driver.quit();
                    break;
                }

            }
        } catch (Exception e) {
            driver.quit();
        }

    }

    public static void Totalizator4(String mail, String numer) throws InterruptedException, AWTException, IOException {
        Random r = new Random();
        int plec = r.nextInt(2);
        Robot robot = new Robot();
        String imie;
        String nazwisko;
        if (plec == 0) {
            imie = genImieZen();
            nazwisko = genNazwiskoZen();
        } else {
            imie = genImieMes();
            nazwisko = genNazwisko();
        }
        FirefoxDriver driver = new FirefoxDriver();
        JavascriptExecutor js = driver;
        driver.manage().window().maximize();
        try {
            driver.get("http://dodatkowypieniadz.com/wykonaj.php?a=1539&u=153&k=59f3635dd821e60a50bd7");

            Thread.sleep(15000);
            Zmniejsz(5);
            Thread.sleep(1000);
            clickXY(1910, 1012);
            Thread.sleep(10000);
            clickXY(1078, 745);

            Thread.sleep(12000);
            clickXY(950, 1017);
            Thread.sleep(1000);
            clickXY(1440, 100);
            Thread.sleep(5000);

            clickXY(950, 1017);
            Kopiuj(imie);
            clickXY(1002, 385);
            Thread.sleep(1000);
            Wklej();
            Kopiuj(nazwisko);
            clickXY(1002, 443);
            Thread.sleep(1000);
            Wklej();
            Kopiuj(numer);
            clickXY(1002, 496);
            Thread.sleep(1000);
            Wklej();
            Kopiuj(mail);
            clickXY(1002, 548);
            Thread.sleep(1000);
            Wklej();
            Kopiuj(mail + "V2");
            clickXY(1002, 607);
            Thread.sleep(1000);
            Wklej();
            clickXY(1002, 664);
            Thread.sleep(1000);
            Wklej();
            clickXY(1002, 709);
            clickXY(1002, 745);
            clickXY(1002, 800);
            Thread.sleep(1000);
            clickXY(1329, 860);
            Thread.sleep(1000);
            clickXY(1002, 990);
            Thread.sleep(1000);
            clickXY(1910, 1022);
            Thread.sleep(1000);
            clickXY(1400, 706);

            //WP
            boolean flaga = true;
            int m = 0;
            int y = 392;
            driver.get("http://poczta.wp.pl/");
            Thread.sleep(3000);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_TAB);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
            //firefox.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("szczyt2019");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();
            Thread.sleep(2000);
            while (flaga) {
                try {
                    driver.findElement(By.xpath("//*[text()='Loteriada 2019']")).click();
                    Thread.sleep(3000);
                    flaga = false;
                    for (int i = 0; i < 15; i++) {
                        clickXY(906, y);
                        y += 10;
                    }
                    clickXY(1025, 375);
                    Thread.sleep(4000);
                    Kopiuj(mail);
                    clickXY(844, 387);
                    Thread.sleep(1000);
                    Wklej();
                    Kopiuj(mail + "V2");
                    clickXY(844, 445);
                    Thread.sleep(1000);
                    Wklej();
                    Thread.sleep(1000);
                    clickXY(844, 518);
                    Thread.sleep(15000);
                    clickXY(1120, 145);
                    Thread.sleep(14000);
                    driver.quit();
                } catch (Exception e) {
                    robot.keyPress(KeyEvent.VK_F5);
                    Thread.sleep(5000);
                }
                m++;
                if (m == 10) {
                    driver.quit();
                    break;
                }

            }
        } catch (Exception e) {
            driver.quit();
        }

    }

    public static void Totalizator(String mail, String numer) throws InterruptedException, AWTException, IOException {
        Random r = new Random();
        int plec = r.nextInt(2);
        Robot robot = new Robot();
        String imie;
        String nazwisko;
        if (plec == 0) {
            imie = genImieZen();
            nazwisko = genNazwiskoZen();
        } else {
            imie = genImieMes();
            nazwisko = genNazwisko();
        }
        FirefoxDriver driver = new FirefoxDriver();
        JavascriptExecutor js = driver;
        driver.manage().window().maximize();
        try {
            driver.get("http://dodatkowypieniadz.com/wykonaj.php?a=1532&u=153&k=59f3635dd821e60a50bd7");

            Thread.sleep(15000);
            Zmniejsz(5);
            Thread.sleep(1000);
            clickXY(1073, 870);

            Thread.sleep(12000);
            clickXY(950, 1017);
            Thread.sleep(1000);
            clickXY(1440, 100);
            Thread.sleep(5000);

            clickXY(950, 1017);
            Kopiuj(imie);
            clickXY(1002, 385);
            Thread.sleep(1000);
            Wklej();
            Kopiuj(nazwisko);
            clickXY(1002, 443);
            Thread.sleep(1000);
            Wklej();
            Kopiuj(numer);
            clickXY(1002, 496);
            Thread.sleep(1000);
            Wklej();
            Kopiuj(mail);
            clickXY(1002, 548);
            Thread.sleep(1000);
            Wklej();
            Kopiuj(mail + "V2");
            clickXY(1002, 607);
            Thread.sleep(1000);
            Wklej();
            clickXY(1002, 664);
            Thread.sleep(1000);
            Wklej();
            clickXY(1002, 709);
            clickXY(1002, 745);
            clickXY(1002, 800);
            Thread.sleep(1000);
            clickXY(1329, 860);
            Thread.sleep(1000);
            clickXY(1002, 990);
            Thread.sleep(1000);
            clickXY(1910, 1022);
            Thread.sleep(1000);
            clickXY(1400, 706);

            //WP
            boolean flaga = true;
            int m = 0;
            int y = 392;
            driver.get("http://poczta.wp.pl/");
            Thread.sleep(3000);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_TAB);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
            //firefox.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("szczyt2019");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();
            Thread.sleep(2000);
            while (flaga) {
                try {
                    driver.findElement(By.xpath("//*[text()='Loteriada 2019']")).click();
                    Thread.sleep(3000);
                    flaga = false;
                    for (int i = 0; i < 15; i++) {
                        clickXY(906, y);
                        y += 10;
                    }
                    clickXY(1025, 375);
                    Thread.sleep(4000);
                    Kopiuj(mail);
                    clickXY(844, 387);
                    Thread.sleep(1000);
                    Wklej();
                    Kopiuj(mail + "V2");
                    clickXY(844, 445);
                    Thread.sleep(1000);
                    Wklej();
                    Thread.sleep(1000);
                    clickXY(844, 518);
                    Thread.sleep(15000);
                    clickXY(1120, 145);
                    Thread.sleep(14000);
                    driver.quit();
                } catch (Exception e) {
                    robot.keyPress(KeyEvent.VK_F5);
                    Thread.sleep(5000);
                }
                m++;
                if (m == 10) {
                    driver.quit();
                    break;
                }

            }
        } catch (Exception e) {
            driver.quit();
        }

    }

    public static void wejdzTot(String mail) throws InterruptedException {
        FirefoxDriver driver = new FirefoxDriver();
        JavascriptExecutor js = driver;
        driver.manage().window().maximize();
        try {
            driver.get("https://www.loteriada.pl/");

            Thread.sleep(10000);
            driver.findElement(By.xpath("/html/body/div/header/div/div[2]/div[1]/a")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div/div[1]/div[1]/input")).sendKeys(mail);
            driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div/div[1]/div[2]/input")).sendKeys(mail + "V2");
            Thread.sleep(1000);
            driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div/div[1]/div[3]/div[2]/div")).click();

            Thread.sleep(3000);
            driver.findElement(By.xpath("/html/body/div/header/div/div[2]/div[3]/ul/li[5]/a")).click();
            Thread.sleep(10000);
            driver.quit();
        } catch (Exception e) {
            driver.quit();
        }

    }

    public static void Everyday(WebDriver driver, String mail, String kod, String ulica, String miasto, String odp) throws AWTException, IOException, InterruptedException {
        String imie = genImieZen();
        String nazwisko = genNazwiskoZen();
        Random r = new Random();
        int miesiac = r.nextInt(12 - 2 + 1) + 2;
        int rok = r.nextInt(1995 - 1986 + 1) + 1986;
        int dzien = r.nextInt(29) + 1;
        int odp1 = r.nextInt(3);
        int odp2 = r.nextInt(4);
        int odp3 = r.nextInt(2);
        int prod1 = r.nextInt(10);
        int prod2 = r.nextInt(10);
        int prod3 = r.nextInt(10);
        int probki1 = r.nextInt(3);
        int probki2 = r.nextInt(3);
        int zaloguj = r.nextInt(2);
        int kupon1 = r.nextInt(8);
        int kupon2 = r.nextInt(8);
        int x = 1750;
        Robot robot = new Robot();
        String roko = String.valueOf(rok);
        Writer niewykorzystane = new BufferedWriter(new FileWriter("C:\\Users\\Artur\\Desktop\\klikanie\\niewykorzystaneEvery.txt", true));


        Thread.sleep(1000);
        driver.get("https://www.everydayme.pl/wygraj-produkty-marki-electrolux-lub-fairy");

        Thread.sleep(5000);
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,400)", "");
        Thread.sleep(1000);
        clickXY(772, 626);
        Thread.sleep(1000);
        clickXY(943, 708);

        Thread.sleep(3000);
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)", "");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"Kobieta \"]")).click();
        driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys(imie);
        driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys(nazwisko);
        Select miesiacc = new Select(driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div[1]/div[3]/div/div/div[2]/form/div[5]/div/div/select[1]")));
        miesiacc.selectByIndex(miesiac);
        Select rokk = new Select(driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div[1]/div[3]/div/div/div[2]/form/div[5]/div/div/select[2]")));
        rokk.selectByValue(roko);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"addressPostalCode\"]")).sendKeys(kod);
        driver.findElement(By.xpath("//*[@id=\"emailAddress\"]")).sendKeys(mail);
        driver.findElement(By.xpath("//*[@id=\"newPassword\"]")).sendKeys(mail + "V2");
        Thread.sleep(1000);
        clickXY(x, 1012);
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,700)", "");
        driver.findElement(By.xpath("//*[@id=\" globalOpt_optStatus\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div[1]/div[3]/div/div/div[2]/form/div[11]/button")).click();

        Thread.sleep(20000);
        driver.findElement(By.xpath("//*[@id=\"grs_account[shipping_addresses][0][line1]\"]")).sendKeys(ulica);
        driver.findElement(By.xpath("//*[@id=\"grs_account[shipping_addresses][0][postalarea]\"]")).sendKeys(kod);
        driver.findElement(By.xpath("//*[@id=\"grs_account[shipping_addresses][0][city]\"]")).sendKeys(miasto);
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div[1]/div[6]/div/div/form/button")).click();
        Thread.sleep(8000);
        try {
            driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div[1]/div[7]/a[2]")).click();
        } catch (Exception e) {
            clickXY(950,824);
            clickXY(950,910);
        }
        Thread.sleep(3000);
        switch (odp1) {
            case 0:
                driver.findElement(By.xpath("//*[@id=\"spq-form\"]/div[2]/div[1]/div[2]/label[1]")).click();
                break;
            case 1:
                driver.findElement(By.xpath("//*[@id=\"spq-form\"]/div[2]/div[1]/div[2]/label[2]")).click();
                break;
        }
        Thread.sleep(2000);
        switch (odp2) {
            case 0:
                driver.findElement(By.xpath("//*[@id=\"spq-form\"]/div[2]/div[2]/div[2]/label[1]")).click();
                break;
            case 1:
                driver.findElement(By.xpath("//*[@id=\"spq-form\"]/div[2]/div[2]/div[2]/label[2]")).click();
                break;
        }
        Thread.sleep(2000);
        switch (odp3) {
            case 0:
                driver.findElement(By.xpath("//*[@id=\"spq-form\"]/div[2]/div[3]/div[2]/label[1]")).click();
                break;
            case 1:
                driver.findElement(By.xpath("//*[@id=\"spq-form\"]/div[2]/div[3]/div[2]/label[2]")).click();
                break;
            case 2:
                driver.findElement(By.xpath("//*[@id=\"spq-form\"]/div[2]/div[3]/div[2]/label[3]")).click();
                break;
        }
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"ANSID-{F0A0BCF4-AAF4-41C4-AF4D-C833BF1EB582}\"]")).sendKeys(odp);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"spq-form\"]/div[2]/div[4]/div[3]/button")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//*[@id=\"spq-form\"]/div[2]/div[5]/p[2]/b/a")).click();
        Thread.sleep(10000);
        Zmniejsz(5);
        Thread.sleep(1000);
        ScrollBy(driver,"700");
        Thread.sleep(1000);
        switch (kupon1) {
            case 0:
                clickXY(924,516);
                break;
            case 1:
                clickXY(1222,516);
                break;
            case 2:
                clickXY(924,673);
                break;
            case 3:
                clickXY(1222,673);
                break;
            case 4:
                clickXY(924,826);
                break;
            case 5:
                clickXY(1222,826);
                break;
            case 6:
                clickXY(924,980);
                break;
            case 7:
                clickXY(1222,980);
                break;

        }
        Thread.sleep(5000);
        switch (kupon2) {
            case 0:
                clickXY(924,516);
                break;
            case 1:
                clickXY(1222,516);
                break;
            case 2:
                clickXY(924,673);
                break;
            case 3:
                clickXY(1222,673);
                break;
            case 4:
                clickXY(924,826);
                break;
            case 5:
                clickXY(1222,826);
                break;
            case 6:
                clickXY(924,980);
                break;
            case 7:
                clickXY(1222,980);
                break;

        }
        Thread.sleep(10000);
        driver.quit();
        }

    public static void Nestle(WebDriver driver, String mail) throws InterruptedException, AWTException {
        String imie = genImieZen();
        String nazwisko = genNazwiskoZen();
        Random r = new Random();
        int dziecko = r.nextInt(2);
        int plec = r.nextInt(2);
        int dzienUro = r.nextInt(29) + 1;
        int miesUro = r.nextInt(10 - 4 + 1) + 4;
        int rokUro = 2019;
        int dzienSpo = r.nextInt(29) + 1;
        int miesSpo = r.nextInt(7 - 3 + 1) + 3;
        int rokSpo = 2020;
        int m = 0;
        boolean flaga = false;
        Robot robot = new Robot();
        String dzieckoUrodzone = String.valueOf(rokUro) + "-" + dodajZero(miesUro) + "-" + dodajZero(dzienUro);
        String dzieckoSpodziewane = String.valueOf(rokSpo) + "-" + dodajZero(miesSpo) + "-" + dodajZero(dzienSpo);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        Thread.sleep(2000);
        try {
            driver.findElement(By.xpath("//*[@id=\"dev-popin\"]/div/div[2]/div/div/div[2]/div/div/div")).click();
        } catch (Exception e) {
            clickXY(946, 743);
            Narzedzia.clickXY(500, 746);
            Narzedzia.clickXY(500, 746);
            clickXY(946, 743);
        }
        Thread.sleep(4000);
        js.executeScript("window.scrollBy(0,700)");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"gigya-textbox-86190741038286000\"]")).sendKeys(imie);
        driver.findElement(By.xpath("//*[@id=\"gigya-textbox-98147042545906400\"]")).sendKeys(nazwisko);
        driver.findElement(By.xpath("//*[@id=\"gigya-textbox-32672274042894692\"]")).sendKeys(mail);
        driver.findElement(By.xpath("//*[@id=\"gigya-password-40553674254645060\"]")).sendKeys(mail + "V2");
        driver.findElement(By.xpath("//*[@id=\"gigya-password-49311983690159380\"]")).sendKeys(mail + "V2");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[3]/div[11]/div[1]/div/div/div[2]/div/form/div[4]/div[15]/input")).click();
        Thread.sleep(6000);

        js.executeScript("window.scrollBy(0,-300)");
        Thread.sleep(1000);
        if (dziecko == 0) {
            if (plec == 0) {
                driver.findElement(By.xpath("//*[@id=\"gigya-multiChoice-1-61880958754256200_6\"]")).click();
                driver.findElement(By.xpath("//*[@id=\"gigya-textbox-121321499907850700_3\"]")).sendKeys(genImieZen());
            } else {
                driver.findElement(By.xpath("//*[@id=\"gigya-multiChoice-0-61880958754256200_5\"]")).click();
                driver.findElement(By.xpath("//*[@id=\"gigya-textbox-121321499907850700_3\"]")).sendKeys(genImieMes());
            }
            js.executeScript("document.getElementById(\"gigya-textbox-92124100465386450_7\").removeAttribute(\"readonly\")");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"gigya-textbox-92124100465386450_7\"]")).sendKeys(dzieckoUrodzone);
        } else {
            driver.findElement(By.xpath("//*[@id=\"gigya-multiChoice-1-99120253038303700_2\"]")).click();
            if (plec == 0)
                driver.findElement(By.xpath("//*[@id=\"gigya-multiChoice-1-61880958754256200_6\"]")).click();
            else
                driver.findElement(By.xpath("//*[@id=\"gigya-multiChoice-0-61880958754256200_5\"]")).click();
            js.executeScript("document.getElementById(\"gigya-textbox-3594631840390567_4\").removeAttribute(\"readonly\")");
            driver.findElement(By.xpath("//*[@id=\"gigya-textbox-3594631840390567_4\"]")).sendKeys(dzieckoSpodziewane);
        }
        Thread.sleep(1000);
        clickXY(1090, 521);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"gigya-multiChoice-0-109994828572319620\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[3]/div[11]/div[1]/div/div/div[2]/div/form/div[2]/div[1]/input")).click();
        Thread.sleep(6000);
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
                driver.findElement(By.xpath("//*[text()='Nestlé Baby&me']")).click();
                Thread.sleep(4000);
                driver.findElement(By.xpath("//*[text()='Zweryfikuj adres e-mail']")).click();
                Thread.sleep(10000);
                flaga = true;
            } catch (Exception e) {
                clickXY(85, 52);
                Thread.sleep(10000);
            }
            m++;
            if (m > 4) {
                break;
            }

        }


    }

    public static void Nestle3(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "E:\\bot\\chromedriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        HashMap<String, Object> images = new HashMap<String, Object>();
        images.put("images", 2);
        HashMap<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values", images);
        options.setExperimentalOption("prefs", prefs);
        WebDriver driver = new ChromeDriver(options);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();

        try {
            driver.get("http://www.dodatkowypieniadz.com/zadanie/d4beda8e5e8023a1edfa372024534ad9/d778a6900708b74f0ec4e7987b8fe4d9/201920950f63cee967982b759fde80b1");
            Thread.sleep(10000);
            clickXY(1296, 770);
            Thread.sleep(20000);

            for (String winHandle : driver.getWindowHandles()) {
                driver.switchTo().window(winHandle);
            }
            Thread.sleep(1000);
            Nestle(driver, mail);
            Thread.sleep(3000);
            driver.quit();

        } catch (Exception e) {
            driver.quit();
        }


    }

    public static void NestleTest3(String mail) throws InterruptedException, AWTException { //nestle3
        System.setProperty("webdriver.chrome.driver", "E:\\bot\\chromedriver\\chromedriver.exe");
        /*
        ChromeOptions options = new ChromeOptions();
        HashMap<String, Object> images = new HashMap<String, Object>();
        images.put("images", 2);
        HashMap<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values", images);
        options.setExperimentalOption("prefs", prefs);
        */
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();

        try {
            driver.get("http://tajemniczaaaakonstiiii.blogspot.com/");
            Thread.sleep(10000);
            Zmniejsz(6);
            Thread.sleep(1000);
            clickXY(1092, 1022);
            Thread.sleep(30000);

            for (String winHandle : driver.getWindowHandles()) {
                driver.switchTo().window(winHandle);
            }
            Thread.sleep(1000);
            Nestle(driver, mail);
            Thread.sleep(3000);
            driver.quit();

        } catch (Exception e) {
            driver.quit();
        }


    }

    public static void NestleTest4(String mail) throws InterruptedException, AWTException { //nestle3
        System.setProperty("webdriver.chrome.driver", "E:\\bot\\chromedriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        HashMap<String, Object> images = new HashMap<String, Object>();
        images.put("images", 2);
        HashMap<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values", images);
        options.setExperimentalOption("prefs", prefs);
        WebDriver driver = new ChromeDriver(options);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();

        try {
            driver.get("http://tajemniczaaaakonstiiii.blogspot.com/");
            Thread.sleep(10000);
            Zmniejsz(6);
            Thread.sleep(1000);
            clickXY(1092, 930);
            Thread.sleep(20000);

            for (String winHandle : driver.getWindowHandles()) {
                driver.switchTo().window(winHandle);
            }
            Thread.sleep(1000);
            Nestle(driver, mail);
            Thread.sleep(3000);
            driver.quit();

        } catch (Exception e) {
            driver.quit();
        }


    }

    public static void NestleTest5(String mail) throws InterruptedException, AWTException { //nestle4
        System.setProperty("webdriver.chrome.driver", "E:\\bot\\chromedriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        HashMap<String, Object> images = new HashMap<String, Object>();
        images.put("images", 2);
        HashMap<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values", images);
        options.setExperimentalOption("prefs", prefs);
        WebDriver driver = new ChromeDriver(options);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();

        try {
            driver.get("http://tajemniczaaaakonstiiii.blogspot.com/");
            Thread.sleep(10000);
            Zmniejsz(6);
            Thread.sleep(1000);
            clickXY(1092, 1036);
            Thread.sleep(20000);

            for (String winHandle : driver.getWindowHandles()) {
                driver.switchTo().window(winHandle);
            }
            Thread.sleep(1000);
            Nestle(driver, mail);
            Thread.sleep(3000);
            driver.quit();

        } catch (Exception e) {
            driver.quit();
        }


    }

    public static void Nestle4(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "E:\\bot\\chromedriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        HashMap<String, Object> images = new HashMap<String, Object>();
        images.put("images", 2);
        HashMap<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values", images);
        options.setExperimentalOption("prefs", prefs);
        WebDriver driver = new ChromeDriver(options);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();

        try {
            driver.get("http://www.dodatkowypieniadz.com/zadanie/6aae5e0be0dc30894275756efda242e5/4cc842c1e70f3f92712f05b1190eeca5/201920950f63cee967982b759fde80b1");
            Thread.sleep(1000000);
            clickXY(1296, 770);
            Thread.sleep(20000);

            for (String winHandle : driver.getWindowHandles()) {
                driver.switchTo().window(winHandle);
            }
            Thread.sleep(1000);
            Nestle(driver, mail);
            Thread.sleep(3000);
            driver.quit();

        } catch (Exception e) {
            driver.quit();
        }


    }

    public static void Pampers(WebDriver driver, String mail) throws InterruptedException, AWTException {

        String imie = genImieZen();
        String nazwisko = genNazwiskoZen();
        Random r = new Random();
        boolean flaga = false;
        int m = 0;
        int rodzic = 0;//r.nextInt(2);
        int dzien = r.nextInt(29) + 1;
        int mies = r.nextInt(11) + 1;
        int dzienSpodziewane = r.nextInt(29) + 1;
        int miesSpodziewane = r.nextInt(10 - 5 + 1) + 5;
        int rokSpodziewane = 2020;
        int rok = r.nextInt(2019 - 2017 + 1) + 2017;
        int dzienMatka = r.nextInt(29) + 1;
        int miesMatka = r.nextInt(11) + 1;
        int rokMatka = r.nextInt(1995 - 1985 + 1) + 1987;
        String dataUr;
        String dataUrSpodziewane;
        String dataUrMatka;

        if (dzien < 10 && mies < 10)
            dataUr = "0" + dzien + "/0" + mies + "/" + rok;
        else if (dzien < 10)
            dataUr = "0" + dzien + "/" + mies + "/" + rok;
        else if (mies < 10)
            dataUr = dzien + "/0" + mies + "/" + rok;
        else
            dataUr = dzien + "/" + mies + "/" + rok;

        if (dzienMatka < 10 && miesMatka < 10)
            dataUrMatka = "0" + dzienMatka + "/0" + miesMatka + "/" + rokMatka;
        else if (dzienMatka < 10)
            dataUrMatka = "0" + dzienMatka + "/" + miesMatka + "/" + rokMatka;
        else if (miesMatka < 10)
            dataUrMatka = dzienMatka + "/0" + miesMatka + "/" + rokMatka;
        else
            dataUrMatka = dzienMatka + "/" + miesMatka + "/" + rokMatka;

        if (dzienSpodziewane < 10 && miesSpodziewane < 10)
            dataUrSpodziewane = "0" + dzienSpodziewane + "/0" + miesSpodziewane + "/" + rokSpodziewane;
        else if (dzienSpodziewane < 10)
            dataUrSpodziewane = "0" + dzienSpodziewane + "/" + miesSpodziewane + "/" + rokSpodziewane;
        else if (miesSpodziewane < 10)
            dataUrSpodziewane = dzienSpodziewane + "/0" + miesSpodziewane + "/" + rokSpodziewane;
        else
            dataUrSpodziewane = dzienSpodziewane + "/" + miesSpodziewane + "/" + rokSpodziewane;
        JavascriptExecutor js = (JavascriptExecutor) driver;

        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        Thread.sleep(1000);
        //driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[4]/div[2]/div/button")).click();
        //clickXY(970, 580);
        //Thread.sleep(7000);

        zmienKarte(driver);

        driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys(imie);
        driver.findElement(By.xpath("//*[@id=\"emailAddress\"]")).sendKeys(mail);
        driver.findElement(By.xpath("//*[@id=\"newPassword\"]")).sendKeys(mail + "V2");
        if (rodzic == 0) {
            driver.findElement(By.xpath("//*[@id=\"fieldset-radio\"]/div[1]/label")).click();
            Thread.sleep(3000);
            js.executeScript("document.getElementById(\"dependentBirthday\").removeAttribute(\"readonly\")");
            Thread.sleep(1000);
            Kopiuj(dataUr);
            clickXY(936, 622);
            clickXY(936, 622);
            clickXY(936, 622);
            Wklej();
        } else {
            driver.findElement(By.xpath("//*[@id=\"fieldset-radio\"]/div[2]/label")).click();
            Thread.sleep(3000);
            js.executeScript("document.getElementById(\"dependentBirthday\").removeAttribute(\"readonly\")");
            Thread.sleep(1000);
            Kopiuj(dataUrSpodziewane);
            clickXY(936, 701);
            clickXY(936, 701);
            clickXY(936, 701);
            Wklej();
        }
        Thread.sleep(1000);
        ScrollBy(driver, "700");
        Thread.sleep(1000);
        clickXY(1726, 1007);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[text()='Utwórz konto']")).click();
        //driver.findElement(By.xpath("/html/body/form/div[5]/div/main/div/section/div[3]/div/div/div[3]/div/div/div[3]/div[6]/button")).click();

        Thread.sleep(8000);
        //driver.get("https://www.pampers.pl/edycja profilu");
        while (!flaga) {
            try {
                driver.findElement(By.xpath("//*[@id=\"phdesktopbody_0_phscenarioformbody_0_btnAction\"]")).click();
                flaga = true;
            } catch (Exception e) {
                clickXY(85, 52);
                Thread.sleep(10000);
                ScrollBy(driver,"-1000");
                Thread.sleep(1000);

                driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys(imie);
                driver.findElement(By.xpath("//*[@id=\"emailAddress\"]")).sendKeys(mail);
                driver.findElement(By.xpath("//*[@id=\"newPassword\"]")).sendKeys(mail + "V2");

                driver.findElement(By.xpath("//*[@id=\"fieldset-radio\"]/div[1]/label")).click();
                Thread.sleep(1000);
                js.executeScript("document.getElementById(\"dependentBirthday\").removeAttribute(\"readonly\")");
                Thread.sleep(1000);
                Kopiuj(dataUr);
                clickXY(936, 622);
                clickXY(936, 622);
                clickXY(936, 622);
                Wklej();
                Thread.sleep(1000);
                ScrollBy(driver, "700");
                Thread.sleep(1000);
                clickXY(1424, 414);
                Thread.sleep(3000);
                driver.findElement(By.xpath("//*[text()='Utwórz konto']")).click();
                Thread.sleep(15000);
                //driver.findElement(By.xpath("//*[@id=\"phdesktopbody_0_phscenarioformbody_0_btnAction\"]")).click();
            }
            m++;
            if (m > 4) {
                driver.quit();
                break;
            }
        }


        Thread.sleep(7000);
        //O MNIE ==========================================
        driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/section/div[2]/div/div/div[3]/div/div[3]/h2")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"fieldset-radio\"]/div[1]/label")).click();
        driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys(nazwisko);
        js.executeScript("document.getElementById(\"birthdate\").removeAttribute(\"readonly\")");
        Thread.sleep(1000);
        Kopiuj(dataUrMatka);
        clickXY(890, 737);
        clickXY(890, 737);
        Wklej();
        Thread.sleep(1000);

        ScrollBy(driver, "700");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/section/div[2]/div/div/div[3]/div/div[11]/div/div/div[2]/button")).click();
        Thread.sleep(10000);

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
        Thread.sleep(10000);
        driver.findElement(By.xpath("//*[text()='Oferty']")).click();
        //driver.findElement(By.xpath("/html/body/div[2]/nh-app-view/div/div/div/nh-sidebar/div/div/div[3]/div[1]/div[5]/div[2]")).click();
        Thread.sleep(4000);
        while (!flaga) {
            try {
                driver.findElement(By.xpath("//*[text()='Pampers']")).click();
                flaga = true;
                Thread.sleep(4000);
                clickXY(970, 830);
                Thread.sleep(10000);
            } catch (Exception e) {
                clickXY(85, 52);
                Thread.sleep(10000);
            }
            m++;
            if (m > 5) {
                break;
            }

        }



    }

    public static void PampersZbiorowe1(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "E:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            driver.get("http://www.dodatkowypieniadz.com/zadanie/26d9dce0df46bfd0cf89244905f347cf/c16093265f1d12f36451693481b7657a/201920950f63cee967982b759fde80b1");
            Thread.sleep(5000);
            driver.get("https://tajemniczaaaakonstiiii.blogspot.com/2017/01/utrwalacz-do-makijazu-kobo-professional.html");
            Thread.sleep(10000);
            clickXY(780, 825);
            Thread.sleep(23000);
            for (String winHandle : driver.getWindowHandles()) {
                driver.switchTo().window(winHandle);
            }
            Thread.sleep(1000);
            Pampers(driver, mail);
            driver.quit();

        } catch (Exception e) {
            driver.quit();
        }


    }

    public static void potwierdzEvInteria(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "E:\\bot\\chromedriver\\chromedriver.exe");
        boolean flaga = false;
        Random r = new Random();
        int zaloguj = r.nextInt(2);
        int probki1 = r.nextInt(3);
        int probki2 = r.nextInt(3);
        int m = 0;
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://poczta.interia.pl/");
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/button[3]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"formEmail\"]")).sendKeys(mail);
        driver.findElement(By.xpath("//*[@id=\"formPassword\"]")).sendKeys("mrcbuch2");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"formSubmit\"]/span")).click();
        Thread.sleep(7000);
        try {
            driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div[2]/div/div[1]")).click();
        } catch (Exception e) {
            System.out.println("==================NIEMA===================");
        }
        try {
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div/form/div[2]/input")).sendKeys("grapiu@wp.pl");
            Thread.sleep(1000);
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div/form/fieldset/button[1]")).click();
            Thread.sleep(2000);
        } catch (Exception f) {
            System.out.println("==================NIEMA===================");
        }

        Thread.sleep(1000);
        while (!flaga) {
            try {
                driver.findElement(By.xpath("//*[text()='EverydayMe']")).click();
                flaga = true;
                Thread.sleep(3000);
                clickXY(1271,657);
                Thread.sleep(10000);
                for (String winHandle : driver.getWindowHandles()) {
                    driver.switchTo().window(winHandle);
                }
                //zaloguj = 0;
                if (zaloguj == 0) {
                    driver.findElement(By.xpath("/html/body/header/div[1]/div/div[3]/div[1]/div[5]/div[1]/div[1]/a")).click();
                    Thread.sleep(3000);
                    driver.findElement(By.xpath("//*[@id=\"signInEmailAddress\"]")).sendKeys(mail);
                    driver.findElement(By.xpath("//*[@id=\"currentPassword\"]")).sendKeys(mail + "V2");
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("/html/body/div[7]/div/div/div[2]/div/div[1]/div/div[2]/form/div[5]/button")).click();
                    Thread.sleep(5000);
                    clickXY(1700,1000);
                    Thread.sleep(3000);
                    driver.findElement(By.xpath("/html/body/header/div[3]/div/div/div[1]/div/div[1]/ul/li[2]/a")).click();
                    Thread.sleep(7000);
                    Zmniejsz(5);
                    Thread.sleep(1000);

                    switch (probki1) {
                        case 0:
                            clickXY(925, 864);
                            break;
                        case 1:
                            clickXY(1226, 864);
                            break;
                        case 2:
                            clickXY(925, 1022);
                            break;
                        case 3:
                            clickXY(1226, 1022);
                            break;
                    }
                    Thread.sleep(1000);
                    switch (probki2) {
                        case 0:
                            clickXY(925, 864);
                            break;
                        case 1:
                            clickXY(1226, 864);
                            break;
                        case 2:
                            clickXY(925, 1022);
                            break;
                        case 3:
                            clickXY(1226, 1022);
                            break;
                    }
                    Thread.sleep(7000);
                    driver.quit();
                } else {
                    driver.quit();
                }

            } catch (Exception e) {
                clickXY(85, 52);
                Thread.sleep(10000);
            }
            m++;
            if (m > 4) {
                break;
            }
        }
    }

    public static void potwierdzEvWp(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "E:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//WP
        boolean flaga = false;
        int m = 0;
        Random r = new Random();
        int zaloguj = r.nextInt(2);
        int probki1 = r.nextInt(3);
        int probki2 = r.nextInt(3);
        driver.get("http://poczta.wp.pl/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
        //driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("szczyt2019");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();
        Thread.sleep(16000);
        driver.findElement(By.xpath("//*[text()='Oferty']")).click();
        Thread.sleep(4000);
        while (!flaga) {
            try {
                driver.findElement(By.xpath("//*[text()='EverydayMe']")).click();
                flaga = true;
                Thread.sleep(4000);
                ScrollBy(driver, "300");
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[text()='Do dzieła']")).click();
                Thread.sleep(10000);
                for(String winHandle : driver.getWindowHandles()){
                    driver.switchTo().window(winHandle);
                }
                if (zaloguj == 0) {
                    driver.findElement(By.xpath("/html/body/header/div[1]/div/div[3]/div[1]/div[5]/div[1]/div[1]/a")).click();
                    Thread.sleep(3000);
                    driver.findElement(By.xpath("//*[@id=\"signInEmailAddress\"]")).sendKeys(mail);
                    driver.findElement(By.xpath("//*[@id=\"currentPassword\"]")).sendKeys(mail+"V2");
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("/html/body/div[9]/div/div/div[2]/div/div[1]/div/div[2]/form/div[5]/button")).click();
                    Thread.sleep(5000);
                    driver.findElement(By.xpath("/html/body/header/div[3]/div/div/div[1]/div/div[1]/ul/li[2]/a")).click();
                    Thread.sleep(7000);
                    Zmniejsz(5);
                    Thread.sleep(1000);

                    switch (probki1) {
                        case 0:
                            clickXY(925,864);
                            break;
                        case 1:
                            clickXY(1226,864);
                            break;
                        case 2:
                            clickXY(925,1022);
                            break;
                        case 3:
                            clickXY(1226,1022);
                            break;
                    }
                    Thread.sleep(1000);
                    switch (probki2) {
                        case 0:
                            clickXY(925,864);
                            break;
                        case 1:
                            clickXY(1226,864);
                            break;
                        case 2:
                            clickXY(925,1022);
                            break;
                        case 3:
                            clickXY(1226,1022);
                            break;
                    }
                    Thread.sleep(7000);
                    driver.quit();
                } else {
                    driver.quit();
                }

            } catch (Exception e) {
                clickXY(85, 52);
                Thread.sleep(10000);
            }
            m++;
            if (m >4) {
                break;
            }
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
        WebDriverWait wait = new WebDriverWait(driver, 60);
        driver.manage().window().maximize();

        try {
            driver.get("http://www.dodatkowypieniadz.com/zadanie/3cd064c614323bca908d9c8b50b5a4a9/79d9519c1fb6ae9022ef25075a824180/201920950f63cee967982b759fde80b1");

            Thread.sleep(3000);
            wpiszHaslo();
            clickXY(780, 600);
            Thread.sleep(5000);
            for (String winHandle : driver.getWindowHandles()) {
                driver.switchTo().window(winHandle);
            }
            Thread.sleep(1000);
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"CybotCookiebotDialog\"]/div/div[1]/button"))));
            driver.findElement(By.xpath("//*[@id=\"CybotCookiebotDialog\"]/div/div[1]/button")).click();
            Thread.sleep(1000);
            ScrollBy(driver, "700");
            driver.switchTo().frame(0);
            Thread.sleep(1000);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/form/div[2]/div[2]/div[2]/div/div[1]/div[3]/input")));
            Thread.sleep(2000);
            driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div[2]/div/div[1]/div[3]/input")).sendKeys(imie);
            driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div[2]/div/div[1]/div[4]/input")).sendKeys(mail);
            Thread.sleep(1000);
            driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div[2]/div/div[1]/div[6]/button")).click();
            Thread.sleep(7000);

            //WP
            driver.get("http://poczta.wp.pl/");
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
            driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
            //driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("szczyt2019");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[3]/button")).click();
            Thread.sleep(5000);
            try {
                driver.findElement(By.xpath("//*[@id=\"agreements\"]/div[6]/button")).click();
            } catch (Exception e) {

            }
            Thread.sleep(3000);
            driver.get("https://poczta.wp.pl/k/#/mails/?label=154");
            Thread.sleep(2000);
            boolean flaga = false;
            int m = 0;
            while (!flaga) {
                try {
                    driver.findElement(By.xpath("//*[text()='Lidl Newsletter']")).click();
                    flaga = true;
                    Thread.sleep(4000);
                    driver.findElement(By.xpath("/html/body/div[2]/nh-app-view/div/div/div/div[1]/div/div/nh-show-item/div/div/div/div/nh-html-compile/div/div/div/center/table/tbody/tr/td/table/tbody/tr/td/table[3]/tbody/tr/td/table[1]/tbody/tr[3]/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/a/span")).click();
                    Thread.sleep(10000);
                } catch (Exception e) {
                    driver.navigate().refresh();
                    Thread.sleep(10000);
                }
                m++;
                if (m > 5) {
                    break;
                }

            }
            driver.quit();
        } catch (Exception e){
            driver.quit();
        }


///html/body/form/div[2]/div[2]/div[2]/div/div[1]/div[3]/input

    }

    public static void Every1(String mail, String kod, String ulica, String miasto, String odp) throws AWTException, InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "E:\\bot\\chromedriver\\chromedriver.exe");
        Writer niewykorzystane = new BufferedWriter(new FileWriter("C:\\Users\\Artur\\Desktop\\klikanie\\niewykorzystaneEvery.txt", true));
        ChromeOptions options = new ChromeOptions();
                options.addArguments("--allow-running-insecure-content");
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();

        driver.get("http://www.dodatkowypieniadz.com/zadanie/ac86f5ba1983d6a4860d0c22ee2a7679/12c2301aaa9042c9228b48640bccd5cf/201920950f63cee967982b759fde80b1");
        Thread.sleep(5000);
        driver.get("https://tajemniczaaaakonstiiii.blogspot.com/2018/06/uroczystosc-rodzinna.html");
        Thread.sleep(10000);
        clickXY(773,837);

        Thread.sleep(25000);
        Neworklead.Everyday(driver, mail, kod, ulica, miasto, odp);
        Thread.sleep(1000);

    }

    public static void Every2(String mail, String kod, String ulica, String miasto, String odp) throws AWTException, InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "E:\\bot\\chromedriver\\chromedriver.exe");
        Writer niewykorzystane = new BufferedWriter(new FileWriter("C:\\Users\\Artur\\Desktop\\klikanie\\niewykorzystaneEvery.txt", true));
        ChromeOptions options = new ChromeOptions();
                options.addArguments("--allow-running-insecure-content");
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();

        driver.get("http://www.dodatkowypieniadz.com/zadanie/ac86f5ba1983d6a4860d0c22ee2a7679/12c2301aaa9042c9228b48640bccd5cf/201920950f63cee967982b759fde80b1");
        Thread.sleep(5000);
        driver.get("https://tajemniczaaaakonstiiii.blogspot.com/2018/05/niespodzianka-od-trade-tracker.html");
        Thread.sleep(10000);
        clickXY(773,753);

        Thread.sleep(25000);
        Neworklead.Everyday(driver, mail, kod, ulica, miasto, odp);
        Thread.sleep(1000);

    }

    public static void Every3(String mail, String kod, String ulica, String miasto, String odp) throws AWTException, InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "E:\\bot\\chromedriver\\chromedriver.exe");
        Writer niewykorzystane = new BufferedWriter(new FileWriter("C:\\Users\\Artur\\Desktop\\klikanie\\niewykorzystaneEvery.txt", true));
        ChromeOptions options = new ChromeOptions();
                options.addArguments("--allow-running-insecure-content");
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();

        driver.get("http://www.dodatkowypieniadz.com/zadanie/ac86f5ba1983d6a4860d0c22ee2a7679/12c2301aaa9042c9228b48640bccd5cf/201920950f63cee967982b759fde80b1");
        Thread.sleep(5000);
        driver.get("https://tajemniczaaaakonstiiii.blogspot.com/2018/03/zima-zima-po-zimie-wiosna.html");
        Thread.sleep(10000);
        clickXY(773,688);

        Thread.sleep(25000);
        Neworklead.Everyday(driver, mail, kod, ulica, miasto, odp);
        Thread.sleep(1000);

    }

    public static void Every11(String mail, String kod, String ulica, String miasto, String odp) throws AWTException, InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "E:\\bot\\chromedriver\\chromedriver.exe");
        Writer niewykorzystane = new BufferedWriter(new FileWriter("C:\\Users\\Artur\\Desktop\\klikanie\\niewykorzystaneEvery.txt", true));
        ChromeOptions options = new ChromeOptions();
                options.addArguments("--allow-running-insecure-content");
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();

        driver.get("http://www.dodatkowypieniadz.com/zadanie/fbcfaf5ffcfd9dcf1c1276f9c9c95fb8/338e8abc23a44c7a31b3b9299ffe10cd/201920950f63cee967982b759fde80b1");
        Thread.sleep(5000);
        driver.get("https://tajemniczaaaakonstiiii.blogspot.com/2018/02/spacer.html");
        Thread.sleep(10000);
        clickXY(786,765);

        Thread.sleep(25000);
        Neworklead.Everyday(driver, mail, kod, ulica, miasto, odp);
        Thread.sleep(1000);

    }

    public static void Every22(String mail, String kod, String ulica, String miasto, String odp) throws AWTException, InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "E:\\bot\\chromedriver\\chromedriver.exe");
        Writer niewykorzystane = new BufferedWriter(new FileWriter("C:\\Users\\Artur\\Desktop\\klikanie\\niewykorzystaneEvery.txt", true));
        ChromeOptions options = new ChromeOptions();
                options.addArguments("--allow-running-insecure-content");
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();

        driver.get("http://www.dodatkowypieniadz.com/zadanie/ac86f5ba1983d6a4860d0c22ee2a7679/12c2301aaa9042c9228b48640bccd5cf/201920950f63cee967982b759fde80b1");
        Thread.sleep(5000);
        driver.get("https://tajemniczaaaakonstiiii.blogspot.com/2017/11/drozdze-piwowarskie.html");
        Thread.sleep(10000);
        clickXY(755,715);

        Thread.sleep(25000);
        Neworklead.Everyday(driver, mail, kod, ulica, miasto, odp);
        Thread.sleep(1000);

    }

    public static void Every33(String mail, String kod, String ulica, String miasto, String odp) throws AWTException, InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "E:\\bot\\chromedriver\\chromedriver.exe");
        Writer niewykorzystane = new BufferedWriter(new FileWriter("C:\\Users\\Artur\\Desktop\\klikanie\\niewykorzystaneEvery.txt", true));
        ChromeOptions options = new ChromeOptions();
                options.addArguments("--allow-running-insecure-content");
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();

        driver.get("http://www.dodatkowypieniadz.com/zadanie/ac86f5ba1983d6a4860d0c22ee2a7679/12c2301aaa9042c9228b48640bccd5cf/201920950f63cee967982b759fde80b1");
        Thread.sleep(5000);
        driver.get("https://tajemniczaaaakonstiiii.blogspot.com/2018/05/niespodzianka-od-trade-tracker.html");
        Thread.sleep(10000);
        clickXY(779,880);

        Thread.sleep(25000);
        Neworklead.Everyday(driver, mail, kod, ulica, miasto, odp);
        Thread.sleep(1000);

    }

    public static void Every77(String mail, String kod, String ulica, String miasto, String odp) throws AWTException, InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "E:\\bot\\chromedriver\\chromedriver.exe");
        Writer niewykorzystane = new BufferedWriter(new FileWriter("C:\\Users\\Artur\\Desktop\\klikanie\\niewykorzystaneEvery.txt", true));
        ChromeOptions options = new ChromeOptions();
                options.addArguments("--allow-running-insecure-content");
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();

        try {
            driver.get("http://www.dodatkowypieniadz.com/zadanie/be16a979c5c89372926ec880d8f701a6/8fe96f6cd0f73fb3ba773a63d7459475/201920950f63cee967982b759fde80b1");
            Thread.sleep(5000);
            driver.get("https://technologicznaprzyszlosc.blogspot.com/2019/11/iphone-11-sprzedaje-sie-jak-swieze.html");
            Thread.sleep(10000);
            clickXY(745,853);

            Thread.sleep(25000);
            Neworklead.Everyday(driver, mail, kod, ulica, miasto, odp);
            Thread.sleep(1000);
            
        } catch (Exception e){
            driver.quit();
        }

             


    }

    public static void EveryZbiorowe11(String mail, String kod, String ulica, String miasto, String odp) throws AWTException, InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "E:\\bot\\chromedriver\\chromedriver.exe");
        Writer niewykorzystane = new BufferedWriter(new FileWriter("C:\\Users\\Artur\\Desktop\\klikanie\\niewykorzystaneEvery.txt", true));
        ChromeOptions options = new ChromeOptions();
                options.addArguments("--allow-running-insecure-content");
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();

//        try {
            driver.get("http://www.dodatkowypieniadz.com/zadanie/bc16121d0782663f39df4b59ec4dcd52/f7f097be94f2b493aa2abd010afb9a98/201920950f63cee967982b759fde80b1");
            Thread.sleep(5000);
        sprawdzLinkEvery(driver);
        refreshEvery(driver);
            driver.findElement(By.xpath("//*[@id=\"note_header\"]")).click();
            driver.get("https://tajemniczakonsta.blogspot.com/2019/01/najwiekszy-przyjaciel-naszej-rodziny.html");
            Thread.sleep(10000);
            clickXY(778,773);
            Thread.sleep(25000);
            Neworklead.Everyday(driver, mail, kod, ulica, miasto, odp);
            Thread.sleep(1000);
            
//        } catch (Exception e){
//            driver.quit();
//        }

             
    }

    public static void EveryZbiorowe12(String mail, String kod, String ulica, String miasto, String odp) throws AWTException, InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "E:\\bot\\chromedriver\\chromedriver.exe");
        Writer niewykorzystane = new BufferedWriter(new FileWriter("C:\\Users\\Artur\\Desktop\\klikanie\\niewykorzystaneEvery.txt", true));
        ChromeOptions options = new ChromeOptions();
                options.addArguments("--allow-running-insecure-content");
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();

//        try {
            driver.get("http://www.dodatkowypieniadz.com/zadanie/bc16121d0782663f39df4b59ec4dcd52/f7f097be94f2b493aa2abd010afb9a98/201920950f63cee967982b759fde80b1");
            Thread.sleep(5000);
        sprawdzLinkEvery(driver);
        refreshEvery(driver);
            driver.findElement(By.xpath("//*[@id=\"note_header\"]")).click();
            driver.get("https://tajemniczakonsta.blogspot.com/2018/11/nowy-przyjaciel-zakuj.html");
            Thread.sleep(10000);
            clickXY(778,733);
            Thread.sleep(25000);
            Neworklead.Everyday(driver, mail, kod, ulica, miasto, odp);
            Thread.sleep(1000);
            
//        } catch (Exception e){
//            driver.quit();
//        }

             

    }

    public static void EveryZbiorowe13(String mail, String kod, String ulica, String miasto, String odp) throws AWTException, InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "E:\\bot\\chromedriver\\chromedriver.exe");
        Writer niewykorzystane = new BufferedWriter(new FileWriter("C:\\Users\\Artur\\Desktop\\klikanie\\niewykorzystaneEvery.txt", true));
        ChromeOptions options = new ChromeOptions();
                options.addArguments("--allow-running-insecure-content");
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();

        try {
            driver.get("http://www.dodatkowypieniadz.com/zadanie/bc16121d0782663f39df4b59ec4dcd52/f7f097be94f2b493aa2abd010afb9a98/201920950f63cee967982b759fde80b1");
            Thread.sleep(5000);
        sprawdzLinkEvery(driver);
        refreshEvery(driver);
            driver.findElement(By.xpath("//*[@id=\"note_header\"]")).click();
            driver.get("https://tajemniczaaaakonstiiii.blogspot.com/2018/06/wawel-z-miosci-do-radosci.html");
            Thread.sleep(10000);
            clickXY(778,700);

            Thread.sleep(25000);
            Neworklead.Everyday(driver, mail, kod, ulica, miasto, odp);
            Thread.sleep(1000);
            
        } catch (Exception e){
            driver.quit();
        }

             


    }

    public static void EveryZbiorowe14(String mail, String kod, String ulica, String miasto, String odp) throws AWTException, InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "E:\\bot\\chromedriver\\chromedriver.exe");
        Writer niewykorzystane = new BufferedWriter(new FileWriter("C:\\Users\\Artur\\Desktop\\klikanie\\niewykorzystaneEvery.txt", true));
        ChromeOptions options = new ChromeOptions();
                options.addArguments("--allow-running-insecure-content");
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();

        try {
            driver.get("http://www.dodatkowypieniadz.com/zadanie/bc16121d0782663f39df4b59ec4dcd52/f7f097be94f2b493aa2abd010afb9a98/201920950f63cee967982b759fde80b1");
            Thread.sleep(5000);
        sprawdzLinkEvery(driver);
        refreshEvery(driver);
            driver.findElement(By.xpath("//*[@id=\"note_header\"]")).click();
            driver.get("https://tajemniczaaaakonstiiii.blogspot.com/2018/06/uroczystosc-rodzinna.html");
            Thread.sleep(10000);
            clickXY(778,700);

            Thread.sleep(25000);
            Neworklead.Everyday(driver, mail, kod, ulica, miasto, odp);
            Thread.sleep(1000);
            
        } catch (Exception e){
            driver.quit();
        }

             


    }

    public static void EveryZbiorowe21(String mail) throws AWTException, InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "E:\\bot\\chromedriver\\chromedriver.exe");
        Writer niewykorzystane = new BufferedWriter(new FileWriter("C:\\Users\\Artur\\Desktop\\klikanie\\niewykorzystaneEvery.txt", true));
        ChromeOptions options = new ChromeOptions();
                options.addArguments("--allow-running-insecure-content");
        options.addArguments("--disable-notifications");
        options.addExtensions(new File("E:\\bot\\captcha.crx"));
        options.addExtensions(new File("E:\\bot\\buster.crx"));
        WebDriver driver = new ChromeDriver(options);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();



//        try {
            driver.get("http://www.dodatkowypieniadz.com/zadanie/084008e5e344972deb3b7d8c31549cba/201730aa6f4df9fd410154c6ce97390a/201920950f63cee967982b759fde80b1");
            Thread.sleep(6000);
            sprawdzLinkEvery(driver);
            refreshEvery(driver);
            try {
                driver.findElement(By.xpath("/html/div/div/div/div/div/div/div[2]/div")).click();
            } catch (Exception e) {

            }
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"note_header\"]")).click();
            driver.get("https://tajemniczakonsta.blogspot.com/2018/06/uroczystosc-rodzinna.html");
            Thread.sleep(10000);
            clickXY(778,700);
            Thread.sleep(1000);
            clickXY(778,730);
            Thread.sleep(25000);
            Neworklead.Everyday2(driver, mail);
            Thread.sleep(1000);

//        } catch (Exception e){
//            driver.quit();
//        }



    }

    public static void EveryZbiorowe22(String mail) throws AWTException, InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "E:\\bot\\chromedriver\\chromedriver.exe");
        Writer niewykorzystane = new BufferedWriter(new FileWriter("C:\\Users\\Artur\\Desktop\\klikanie\\niewykorzystaneEvery.txt", true));
        ChromeOptions options = new ChromeOptions();
                options.addArguments("--allow-running-insecure-content");
        options.addArguments("--disable-notifications");
        options.addExtensions(new File("E:\\bot\\captcha.crx"));
        options.addExtensions(new File("E:\\bot\\buster.crx"));
        WebDriver driver = new ChromeDriver(options);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();

//        try {
            driver.get("http://www.dodatkowypieniadz.com/zadanie/084008e5e344972deb3b7d8c31549cba/201730aa6f4df9fd410154c6ce97390a/201920950f63cee967982b759fde80b1");
            Thread.sleep(4000);
            sprawdzLinkEvery(driver);
            refreshEvery(driver);
            try {
                driver.findElement(By.xpath("/html/div/div/div/div/div/div/div[2]/div")).click();
            } catch (Exception e) {

            }
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"note_header\"]")).click();
            driver.get("https://tajemniczakonsta.blogspot.com/2018/05/niespodzianka-od-trade-tracker.html");
            Thread.sleep(10000);
            clickXY(778,700);
            Thread.sleep(1000);
            clickXY(778,730);

            Thread.sleep(25000);
            Neworklead.Everyday2(driver, mail);
            Thread.sleep(1000);
            
//        } catch (Exception e){
//            driver.quit();
//        }

             


    }

    public static void EveryZbiorowe23(String mail, String kod, String ulica, String miasto, String odp) throws AWTException, InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "E:\\bot\\chromedriver\\chromedriver.exe");
        Writer niewykorzystane = new BufferedWriter(new FileWriter("C:\\Users\\Artur\\Desktop\\klikanie\\niewykorzystaneEvery.txt", true));
        ChromeOptions options = new ChromeOptions();
                options.addArguments("--allow-running-insecure-content");
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();

//        try {
            driver.get("http://www.dodatkowypieniadz.com/zadanie/084008e5e344972deb3b7d8c31549cba/201730aa6f4df9fd410154c6ce97390a/201920950f63cee967982b759fde80b1");
            Thread.sleep(5000);
            sprawdzLinkEvery(driver);
            refreshEvery(driver);
            driver.findElement(By.xpath("//*[@id=\"note_header\"]")).click();
            driver.get("https://tajemniczakonsta.blogspot.com/2018/03/zima-zima-po-zimie-wiosna.html");
            Thread.sleep(10000);
            clickXY(778,685);

            Thread.sleep(25000);
            Neworklead.Everyday(driver, mail, kod, ulica, miasto, odp);
            Thread.sleep(1000);
            
//        } catch (Exception e){
//            driver.quit();
//        }

             


    }

    public static void EveryZbiorowe24(String mail, String kod, String ulica, String miasto, String odp) throws AWTException, InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "E:\\bot\\chromedriver\\chromedriver.exe");
        Writer niewykorzystane = new BufferedWriter(new FileWriter("C:\\Users\\Artur\\Desktop\\klikanie\\niewykorzystaneEvery.txt", true));
        ChromeOptions options = new ChromeOptions();
                options.addArguments("--allow-running-insecure-content");
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();

        try {
            driver.get("http://www.dodatkowypieniadz.com/zadanie/084008e5e344972deb3b7d8c31549cba/201730aa6f4df9fd410154c6ce97390a/201920950f63cee967982b759fde80b1");
            Thread.sleep(5000);
            sprawdzLinkEvery(driver);
            refreshEvery(driver);
            driver.findElement(By.xpath("//*[@id=\"note_header\"]")).click();
            driver.get("http://tajemniczakonsta.blogspot.com/2017/02/bronzer-rio-look-beauty-holiday-glow.html");
            Thread.sleep(10000);
            clickXY(778,685);

            Thread.sleep(25000);
            Neworklead.Everyday(driver, mail, kod, ulica, miasto, odp);
            Thread.sleep(1000);

        } catch (Exception e){
            driver.quit();
        }




    }

    public static void EveryAA(String mail, String kod, String ulica, String miasto, String odp) throws AWTException, InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "E:\\bot\\chromedriver\\chromedriver.exe");
        Writer niewykorzystane = new BufferedWriter(new FileWriter("C:\\Users\\Artur\\Desktop\\klikanie\\niewykorzystaneEvery.txt", true));
        ChromeOptions options = new ChromeOptions();
                options.addArguments("--allow-running-insecure-content");
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();

//        try {
            driver.get("http://www.dodatkowypieniadz.com/zadanie/f98a6574fd41ac2f2456b8c86aeea7d5/cdaa9e143ae200f9b8a7309bebf392e3/201920950f63cee967982b759fde80b1");
            wpiszHaslo();
//            Thread.sleep(50000000);
            sprawdzLinkEvery(driver);
            refreshEvery(driver);
            Thread.sleep(10000);
            clickXY(778,685);

            Thread.sleep(20000);
            Neworklead.Everyday3(driver, mail, kod, ulica, miasto, odp);
            Thread.sleep(1000);

//        } catch (Exception e){
//            driver.quit();
//        }




    }

    public static void Every7(String mail, String kod, String ulica, String miasto, String odp) throws AWTException, InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "E:\\bot\\chromedriver\\chromedriver.exe");
        Writer niewykorzystane = new BufferedWriter(new FileWriter("C:\\Users\\Artur\\Desktop\\klikanie\\niewykorzystaneEvery.txt", true));
        ChromeOptions options = new ChromeOptions();
                options.addArguments("--allow-running-insecure-content");
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();

//        try {
            driver.get("http://www.dodatkowypieniadz.com/zadanie/73fdd27dfcba78df8a7725b07a2afe4b/9c04de2da2d236d9836cfc9aeba3c276/201920950f63cee967982b759fde80b1");
            wpiszHaslo();
//            Thread.sleep(50000000);
            sprawdzLinkEvery(driver);
            refreshEvery(driver);
            Thread.sleep(1000);
            clickXY(778,768);

            Thread.sleep(20000);
            Neworklead.Everyday(driver, mail, kod, ulica, miasto, odp);
            Thread.sleep(1000);

//        } catch (Exception e){
//            driver.quit();
//        }




    }

    public static void EveryZbiorowe31(String mail, String kod, String ulica, String miasto, String odp) throws AWTException, InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "E:\\bot\\chromedriver\\chromedriver.exe");
        Writer niewykorzystane = new BufferedWriter(new FileWriter("C:\\Users\\Artur\\Desktop\\klikanie\\niewykorzystaneEvery.txt", true));
        ChromeOptions options = new ChromeOptions();
                options.addArguments("--allow-running-insecure-content");
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();

        try {
            driver.get("http://www.dodatkowypieniadz.com/zadanie/60cf6d19ec87b67d6d923523c3508bcb/4350f7b078fbc3f4fc36b0ec88babf25/201920950f63cee967982b759fde80b1");
            Thread.sleep(5000);
            sprawdzLinkEvery(driver);
            refreshEvery(driver);
            driver.findElement(By.xpath("//*[@id=\"note_header\"]")).click();
            driver.get("https://tajemniczakonsta.blogspot.com/2016/10/paznokcie-hybrydowe-zestaw-neonail.html");
            Thread.sleep(10000);
            clickXY(778,685);

            Thread.sleep(25000);
            Neworklead.Everyday(driver, mail, kod, ulica, miasto, odp);
            Thread.sleep(1000);

        } catch (Exception e){
            driver.quit();
        }




    }

    public static void EveryZbiorowe32(String mail, String kod, String ulica, String miasto, String odp) throws AWTException, InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "E:\\bot\\chromedriver\\chromedriver.exe");
        Writer niewykorzystane = new BufferedWriter(new FileWriter("C:\\Users\\Artur\\Desktop\\klikanie\\niewykorzystaneEvery.txt", true));
        ChromeOptions options = new ChromeOptions();
                options.addArguments("--allow-running-insecure-content");
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();

        try {
            driver.get("http://www.dodatkowypieniadz.com/zadanie/60cf6d19ec87b67d6d923523c3508bcb/4350f7b078fbc3f4fc36b0ec88babf25/201920950f63cee967982b759fde80b1");
            Thread.sleep(5000);
            sprawdzLinkEvery(driver);
            refreshEvery(driver);
            driver.findElement(By.xpath("//*[@id=\"note_header\"]")).click();
            driver.get("https://tajemniczakonsta.blogspot.com/2016/10/tusz-do-rzes-max-factor-2000-calorie.html");
            Thread.sleep(10000);
            clickXY(778,685);

            Thread.sleep(25000);
            Neworklead.Everyday(driver, mail, kod, ulica, miasto, odp);
            Thread.sleep(1000);

        } catch (Exception e){
            driver.quit();
        }




    }

    public static void EveryZbiorowe33(String mail, String kod, String ulica, String miasto, String odp) throws AWTException, InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "E:\\bot\\chromedriver\\chromedriver.exe");
        Writer niewykorzystane = new BufferedWriter(new FileWriter("C:\\Users\\Artur\\Desktop\\klikanie\\niewykorzystaneEvery.txt", true));
        ChromeOptions options = new ChromeOptions();
                options.addArguments("--allow-running-insecure-content");
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();

        try {
            driver.get("http://www.dodatkowypieniadz.com/zadanie/60cf6d19ec87b67d6d923523c3508bcb/4350f7b078fbc3f4fc36b0ec88babf25/201920950f63cee967982b759fde80b1");
            Thread.sleep(5000);
            sprawdzLinkEvery(driver);
            refreshEvery(driver);
            driver.findElement(By.xpath("//*[@id=\"note_header\"]")).click();
            driver.get("https://tajemniczakonsta.blogspot.com/2016/10/podkad-max-factor-skin-luminizer.html");
            Thread.sleep(10000);
            clickXY(778,685);

            Thread.sleep(25000);
            Neworklead.Everyday(driver, mail, kod, ulica, miasto, odp);
            Thread.sleep(1000);

        } catch (Exception e){
            driver.quit();
        }




    }

    public static void EveryMale(String mail, String kod, String ulica, String miasto, String odp) throws AWTException, InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "E:\\bot\\chromedriver\\chromedriver.exe");
        Writer niewykorzystane = new BufferedWriter(new FileWriter("C:\\Users\\Artur\\Desktop\\klikanie\\niewykorzystaneEvery.txt", true));
        ChromeOptions options = new ChromeOptions();
                options.addArguments("--allow-running-insecure-content");
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();

        try {
            driver.get("http://www.dodatkowypieniadz.com/zadanie/e9c10c8793814b348a72cfd7c3e4c479/757b5d930b3e6954519d038ea733982d/201920950f63cee967982b759fde80b1");
            Thread.sleep(10000);
            sprawdzLinkEvery(driver);
            refreshEvery(driver);
            Zmniejsz(4);
            clickXY(1082,940);

            Thread.sleep(25000);
            Neworklead.Everyday(driver, mail, kod, ulica, miasto, odp);
            Thread.sleep(1000);

        } catch (Exception e){
            driver.quit();
        }




    }

    public static void Every8(String mail, String kod, String ulica, String miasto, String odp) throws AWTException, InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "E:\\bot\\chromedriver\\chromedriver.exe");
        Writer niewykorzystane = new BufferedWriter(new FileWriter("C:\\Users\\Artur\\Desktop\\klikanie\\niewykorzystaneEvery.txt", true));
        ChromeOptions options = new ChromeOptions();
                options.addArguments("--allow-running-insecure-content");
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();

        try {
            driver.get("http://www.dodatkowypieniadz.com/zadanie/85b76e1895e8b05fb5e1952ee54cf9fc/f6d9925b6fbf3e0a0ca68c619b09c225/201920950f63cee967982b759fde80b1");
            Thread.sleep(10000);
            clickXY(450,490);

            Thread.sleep(20000);
            Neworklead.Everyday(driver, mail, kod, ulica, miasto, odp);
            Thread.sleep(1000);
        } catch (Exception e) {
            driver.quit();
        }


    }

    public static void EveryTest8(String mail, String kod, String ulica, String miasto, String odp) throws AWTException, InterruptedException, IOException {
        //System.setProperty("webdriver.opera.driver", "E:\\bot\\operadriver\\operadriver.exe");
        Writer niewykorzystane = new BufferedWriter(new FileWriter("C:\\Users\\Artur\\Desktop\\klikanie\\niewykorzystaneEvery.txt", true));
        OperaOptions options = new OperaOptions();
        options.setBinary("E:\\Programy\\Opera\\69.0.3686.77\\opera.exe");
        System.setProperty("webdriver.opera.driver","E:\\bot\\operadriver\\operadriver.exe");
        WebDriver driver = new OperaDriver(options);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();

        driver.get("https://tajemniczaaaakonstiiii.blogspot.com/2018/05/niespodzianka-od-trade-tracker.html");
        clickXY(792,614);
        Thread.sleep(20000);
        Neworklead.Everyday(driver, mail, kod, ulica, miasto, odp);
        Thread.sleep(1000);

    }

    public static void Samsung(String mail) throws InterruptedException, AWTException, IOException {
        System.setProperty("webdriver.chrome.driver", "E:\\bot\\chromedriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        Random r = new Random();
        options.addExtensions(new File("E:\\bot\\captcha.crx"));
        options.addExtensions(new File("E:\\bot\\buster.crx"));
        ChromeDriver driver = new ChromeDriver(options);
        Robot robot = new Robot();
        driver.manage().window().maximize();


//        try {
        driver.get("http://www.dodatkowypieniadz.com/zadanie/6d19e61cbbbb447f51a66fce1402780b/027d20a2df90ea039a75b5743f43294f/201920950f63cee967982b759fde80b1");
        Thread.sleep(5000);
        driver.get("https://technologicznaaprzyszloscc.blogspot.com/2019/11/irobot-odkurzacze-ida-do-lamusa.html");
        wpiszHaslo();
        clickXY(760,980);
        Thread.sleep(10000);
        zmienKarte(driver);
        Neworklead.Samsung(driver, mail);

//        } catch (Exception f){
//            driver.quit();
//        }

    }

    public static void Samsung2(String mail) throws InterruptedException, AWTException, IOException {
        System.setProperty("webdriver.chrome.driver", "E:\\bot\\chromedriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        Random r = new Random();
        options.addExtensions(new File("E:\\bot\\captcha.crx"));
        options.addExtensions(new File("E:\\bot\\buster.crx"));
        ChromeDriver driver = new ChromeDriver(options);
        Robot robot = new Robot();
        driver.manage().window().maximize();


//        try {
        driver.get("http://www.dodatkowypieniadz.com/zadanie/6d19e61cbbbb447f51a66fce1402780b/027d20a2df90ea039a75b5743f43294f/201920950f63cee967982b759fde80b1");
        Thread.sleep(5000);
        driver.get("https://tajemniczaakkonstaa.blogspot.com/2017/10/zmiany-i-jeszcze-raz-zmiany.html");
        wpiszHaslo();
        clickXY(760,755);
        Thread.sleep(10000);
        zmienKarte(driver);
        Neworklead.Samsung(driver, mail);

//        } catch (Exception f){
//            driver.quit();
//        }

    }

    public static void Cola(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "E:\\bot\\chromedriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        Random r = new Random();
        int plec = r.nextInt(2);
        int dzien = r.nextInt(29)+1;
        int miesiac = r.nextInt(11)+1;
        int rok = r.nextInt(1994 - 1980 + 1) + 1980;
        int kupon = r.nextInt(2);
        boolean flaga = false;
        boolean flaga2 = false;
        boolean flaga3 = false;
        int m = 0;
        int n = 0;
        int k = 0;
        String imie = null;
        String nazwisko = null;
        if (plec == 0){
            imie = genImieZen();
            nazwisko = genNazwiskoZen();
        } else {
            imie = genImieMes();
            nazwisko = genNazwisko();
        }
        options.addExtensions(new File("E:\\bot\\captcha.crx"));
        options.addExtensions(new File("E:\\bot\\buster.crx"));
        ChromeDriver driver = new ChromeDriver(options);

        try {
            driver.manage().window().maximize();
            driver.get("http://www.dodatkowypieniadz.com/zadanie/8c620fe20f83883f756882d79cc36000/492abc71bebe029fab117c00cbc695f0/201920950f63cee967982b759fde80b1");
            //driver.get("https://www.coca-cola.pl/coca-cola-od-nas");

            Thread.sleep(10000);
            Zmniejsz(3);
            Thread.sleep(1000);
            clickXY(793,960);

            Thread.sleep(20000);
            zmienKarte(driver);
            Thread.sleep(1000);

            while (!flaga2) {
                try {
                    driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[4]/div[2]/div/button")).click();
                    flaga2 = true;
                } catch (Exception e) {
                    Thread.sleep(5000);
                }
                if (n == 4){
                    break;
                }
                n++;
            }
            Thread.sleep(2000);
            driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[6]/div/div[1]/span/a/button/span")).click();
            Thread.sleep(7000);
            driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div[9]/div/div/div[1]/p/a/u")).click();
            Thread.sleep(7000);
            while (!flaga3) {
                try {
                    driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys(imie);
                    driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys(nazwisko);
                    driver.findElement(By.xpath("//*[@id=\"emailAddress\"]")).sendKeys(mail);
                    driver.findElement(By.xpath("//*[@id=\"birthdate_day\"]")).sendKeys(String.valueOf(dzien));
                    driver.findElement(By.xpath("//*[@id=\"birthdate_month\"]")).sendKeys(String.valueOf(miesiac));
                    driver.findElement(By.xpath("//*[@id=\"birthdate_year\"]")).sendKeys(String.valueOf(rok));
                    driver.findElement(By.xpath("//*[@id=\"newPassword\"]")).sendKeys(mail+"V2");
                    driver.findElement(By.xpath("//*[@id=\"newPasswordConfirm\"]")).sendKeys(mail+"V2");
                    driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div[2]/span/div/div[1]/form/div[8]/label/span")).click();
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div[2]/span/div/div[1]/form/div[9]/label/span")).click();
                    driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div[2]/span/div/div[1]/form/div[10]/label/span")).click();
                    Thread.sleep(1000);
                    driver.switchTo().frame(0);
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor-label\"]")).click();
                    Thread.sleep(5000);
                    for (int i=0;i<5;i++){
                        clickXY(965,1028);
                        Thread.sleep(3000);
                    }
                    driver.switchTo().defaultContent();
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div[2]/span/div/div[1]/form/button")).click();
                    Thread.sleep(10000);
                    flaga3 = true;
                } catch (Exception e){
                    driver.navigate().refresh();
                    Thread.sleep(6000);
                }
                if (k == 10){
                    break;
                }
                k++;
            }


            //WP
            driver.get("http://poczta.wp.pl/");
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
            driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("szczyt2020");
            //driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
            //driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("szczyt2019");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();
            Thread.sleep(10000);
            while (!flaga) {
                try {
                    driver.findElement(By.xpath("//*[text()='Coca-Cola']")).click();
                    Thread.sleep(3000);
                    driver.findElement(By.xpath("/html/body/div/nh-app-view/div/div/div/div[1]/div/div/nh-show-item/div/div/div/div/nh-html-compile/div/div/div/table/tbody/tr/td/center/div[2]/table[2]/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td/a")).click();
                    Thread.sleep(10000);
                    zmienKarte(driver);
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("//*[@id=\"signInEmailAddress\"]")).sendKeys(mail);
                    driver.findElement(By.xpath("//*[@id=\"currentPassword\"]")).sendKeys(mail+"V2");
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div[7]/span/div/div[1]/form/button")).click();
                    Thread.sleep(10000);
                    if (kupon == 0){
                        driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[8]/div/div[1]/form/button")).click();
                        Thread.sleep(5000);
                    }
                    flaga = true;
                } catch (Exception e) {
                    driver.navigate().refresh();
                    Thread.sleep(10000);
                }
                if (m == 5) {
                    break;
                }
                m++;
            }
            driver.quit();
        } catch (Exception e){
            driver.quit();
        }

    }

    public static void Heineken(String mail, String miasto, String numer, String zyczenie) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "E:\\bot\\chromedriver\\chromedriver.exe");
        Robot robot = new Robot();
        Random r = new Random();
        String dzien = String.valueOf(r.nextInt(29) + 1);
        String mies = String.valueOf(r.nextInt(10) + 1);
        String rok = String.valueOf(r.nextInt(1995 - 1980 + 1) + 1980);
        int im = r.nextInt(2);
        String imie;
        String nazwisko;
        if (im == 0) {
            imie = genImieZen();
            nazwisko = genNazwiskoZen();
        } else {
            imie = genImieMes();
            nazwisko = genNazwisko();
        }

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        try {
        driver.get("http://www.dodatkowypieniadz.com/zadanie/7f00231311039b7ae57717ebc30438c6/d6c3a40c4da84772f440a0c5afdb63f0/201920950f63cee967982b759fde80b1");
        Kopiuj("av126");
        Thread.sleep(3000);
        Wklej();
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(8000);
        clickXY(775,752);
        Thread.sleep(5000);
        zmienKarte(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"cookies\"]/div/span/span")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"wiek\"]/div/div[2]/div[1]/div/form/div[1]/input[1]")).sendKeys(dzien);
        driver.findElement(By.xpath("//*[@id=\"wiek\"]/div/div[2]/div[1]/div/form/div[1]/input[2]")).sendKeys(mies);
        driver.findElement(By.xpath("//*[@id=\"wiek\"]/div/div[2]/div[1]/div/form/div[1]/input[3]")).sendKeys(rok);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"wiek\"]/div/div[2]/div[1]/div/form/div[2]/button")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"start\"]/div/div[2]/div[4]/div/a/span")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"overlay\"]/form/div[1]/div[1]/textarea")).sendKeys(zyczenie);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"overlay\"]/form/div[1]/div[2]/a/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"overlay\"]/form/div[2]/div[1]/input")).sendKeys(imie);
        driver.findElement(By.xpath("//*[@id=\"overlay\"]/form/div[2]/div[2]/input")).sendKeys(nazwisko);
        driver.findElement(By.xpath("//*[@id=\"overlay\"]/form/div[2]/div[3]/input")).sendKeys(miasto);
        driver.findElement(By.xpath("//*[@id=\"overlay\"]/form/div[2]/div[4]/input")).sendKeys(mail);
        driver.findElement(By.xpath("//*[@id=\"overlay\"]/form/div[2]/div[5]/input")).sendKeys(numer);
        driver.findElement(By.xpath("//*[@id=\"overlay\"]/form/div[2]/div[6]/a[2]/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/form/div[3]/div[1]/label")).click();
        driver.findElement(By.xpath("/html/body/div[1]/form/div[3]/div[2]/label")).click();
        driver.findElement(By.xpath("/html/body/div[1]/form/div[3]/div[3]/label")).click();
        driver.findElement(By.xpath("/html/body/div[1]/form/div[3]/div[4]/label")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"overlay\"]/form/div[3]/div[5]/button")).click();
        Thread.sleep(7000);
        driver.quit();
//        } catch (Exception e) {
//            driver.quit();
//        }

    }

    public static void Crunchips(String mail, String paragon, String data) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "E:\\bot\\chromedriver\\chromedriver.exe");
        Random r = new Random();
        int plec = r.nextInt(2);
        String imie;
        if (plec == 0)
            imie = genImieMes();
        else
            imie = genImieZen();
        ChromeDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 60);
        driver.manage().window().maximize();

        driver.get("http://www.dodatkowypieniadz.com/zadanie/0f1039b390cb29a4a0ebbf75b2ac74ad/91003e56088694b423e60e3218f783a5/201920950f63cee967982b759fde80b1");
        Thread.sleep(3000);
        wpiszHaslo();
        clickXY(750,826);

        zmienKarte(driver);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"home\"]/div/div/a/img"))));
        driver.findElement(By.xpath("//*[@id=\"home\"]/div/div/a/img")).click();
    }

    public static void Insiders(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "E:\\bot\\chromedriver\\chromedriver.exe");
        Random r = new Random();
        int plec = r.nextInt(2);
        String imie;
        if (plec == 0)
            imie = genImieMes();
        else
            imie = genImieZen();
        ChromeDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 60);
        driver.manage().window().maximize();

        driver.get("http://www.dodatkowypieniadz.com/zadanie/4055fdb888e1d7a731518d5ddde843d6/77165896373ed7fa197334d821e51345/201920950f63cee967982b759fde80b1");
        Thread.sleep(5000);
        driver.get("https://tajemniczaakkonstaa.blogspot.com/2018/11/nowy-przyjaciel-zakuj.html");
        Thread.sleep(3000);
        wpiszHaslo();
        clickXY(776,690);

        zmienKarte(driver);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"navigation-bar\"]/div/div[3]/ul/li[1]/a"))));
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"navigation-bar\"]/div/div[3]/ul/li[1]/a")).click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"loginformulier\"]/div[1]/div/div/p[2]/a"))));
        driver.findElement(By.xpath("//*[@id=\"loginformulier\"]/div[1]/div/div/p[2]/a")).click();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"register\"]/div/div/div[2]/div[3]/div/a[2]"))));
        driver.findElement(By.xpath("//*[@id=\"register\"]/div/div/div[2]/div[3]/div/a[2]")).click();

        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"register\"]/div/div/div[2]/div[3]/div/a[2]"))));
        driver.findElement(By.xpath("//*[@id=\"register\"]/div/div/div[2]/div[3]/div/a[2]")).click();

    }

    public static void Enfamil(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        try {
        driver.get("http://dodatkowypieniadz.com/zadanie/ed54b2380679aa985707ec00972aa2cc/6da91cc77baeb22524542e712ad5c4e1/201920950f63cee967982b759fde80b1");
        wpiszHaslo();
        Thread.sleep(10000);
        clickXY(770,770);
        Thread.sleep(6000);
        Neworklead.Enfamil(driver,mail);
        } catch (Exception e) {
            driver.quit();
        }
    }

    public static void Enfamil3(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        try {
        driver.get("http://dodatkowypieniadz.com/zadanie/620cd91795b3b3b565a097fee93629ff/36912cd2d148bfeb230daadfbdc3f325/201920950f63cee967982b759fde80b1");
        wpiszHaslo();
            Thread.sleep(10000);
        clickXY(780,800);
        Thread.sleep(6000);
        Neworklead.Enfamil(driver,mail);
        } catch (Exception e) {
            driver.quit();
        }
    }

    public static void Enfamil2(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        try {
        driver.get("http://dodatkowypieniadz.com/zadanie/be710bf0586df6e0c91424c65406e5c5/d3c1b23c13b2504a69a0e31548d26d53/201920950f63cee967982b759fde80b1");
        wpiszHaslo();
        Thread.sleep(10000);
        clickXY(780,740);
        Thread.sleep(6000);
        Neworklead.Enfamil(driver,mail);
        } catch (Exception e) {
            driver.quit();
        }
    }

    public static void Enfamil4(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        try {
        driver.get("http://dodatkowypieniadz.com/zadanie/92706a329408291328093b208bcf652e/643b3640ea8bfa2aa3b661a9b7665b7f/201920950f63cee967982b759fde80b1");
        wpiszHaslo();
        Thread.sleep(10000);
        clickXY(780,618);
        Thread.sleep(6000);
        Neworklead.Enfamil(driver,mail);
        } catch (Exception e) {
            driver.quit();
        }
    }

    public static void Przepis(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "E:\\bot\\chromedriver\\chromedriver.exe");
        Random r = new Random();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        WebDriverWait wait = new WebDriverWait(driver, 60);
        driver.manage().window().maximize();
        try {
            driver.get("http://www.dodatkowypieniadz.com/zadanie/4eb1ab9d57522dc171c49ca80cce92dd/c58a8de14c5333e6b53197eeeb4899ec/201920950f63cee967982b759fde80b1");
            Thread.sleep(3000);
            wpiszHaslo();
            clickXY(784,600);
            Thread.sleep(3000);
            zmienKarte(driver);
            Thread.sleep(1000);

            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]"))));
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
            Thread.sleep(2000);
            try {
                driver.findElement(By.xpath("//*[@id=\"modalDownloadEbook\"]/div/div/div/div/div[2]/div[1]/div[1]/input")).click();
                driver.findElement(By.xpath("//*[@id=\"modalDownloadEbook\"]/div/div/div/div/div[2]/div[2]/div[1]/input")).click();
                driver.findElement(By.xpath("//*[@id=\"modalDownloadEbook\"]/div/div/div/div/div[2]/div[4]/input[1]")).sendKeys(genImieZen());
                driver.findElement(By.xpath("//*[@id=\"modalDownloadEbook\"]/div/div/div/div/div[2]/div[4]/input[2]")).sendKeys(mail);
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"modalDownloadEbook\"]/div/div/div/div/div[2]/div[4]/a")).click();
                Thread.sleep(6000);
            } catch (Exception e) {
                driver.navigate().refresh();
                Thread.sleep(5000);

                driver.findElement(By.xpath("//*[@id=\"modalDownloadEbook\"]/div/div/div/div/div[2]/div[1]/div[1]/input")).click();
                driver.findElement(By.xpath("//*[@id=\"modalDownloadEbook\"]/div/div/div/div/div[2]/div[2]/div[1]/input")).click();
                driver.findElement(By.xpath("//*[@id=\"modalDownloadEbook\"]/div/div/div/div/div[2]/div[4]/input[1]")).sendKeys(genImieZen());
                driver.findElement(By.xpath("//*[@id=\"modalDownloadEbook\"]/div/div/div/div/div[2]/div[4]/input[2]")).sendKeys(mail);
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"modalDownloadEbook\"]/div/div/div/div/div[2]/div[4]/a")).click();
                Thread.sleep(6000);
            }
//        driver.get("https://www.przepisy.pl/ebook/a11a744b-b4f3-477e-a89a-fed7f21b5d02/zimowa-kuchnia-roslinna-9-smacznych-przepisow-na-rozgrzewajace-dania-z-warzyw");
//        Thread.sleep(5000);
            driver.quit();


//        //WP
//        driver.get("http://poczta.wp.pl/");
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
//        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
//        boolean flaga = false;
//        int m = 0;
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[3]/button")).click();
//        Thread.sleep(5000);
//        try {
//            driver.findElement(By.xpath("//*[@id=\"agreements\"]/div[6]/button")).click();
//        } catch (Exception e) {
//
//        }
//        Thread.sleep(3000);
//        driver.get("https://poczta.wp.pl/k/#/mails/?label=154");
//        Thread.sleep(3000);
//        while (!flaga) {
//            try {
//                driver.findElement(By.xpath("//*[text()='Przepisy.pl']")).click();
//                flaga = true;
//                Thread.sleep(4000);
//                driver.findElement(By.xpath("/html/body/div[2]/nh-app-view/div/div/div/div[1]/div/div/nh-show-item/div/div/div/div/nh-html-compile/div/div/div/table/tbody/tr[4]/td[2]/div[1]/a")).click();
//                Thread.sleep(10000);
//            } catch (Exception e) {
//                driver.navigate().refresh();
//                Thread.sleep(10000);
//            }
//            m++;
//            if (m > 5) {
//                break;
//            }
//
//        }
//
//        driver.quit();

        } catch (Exception e) {
            driver.quit();
        }

    }

    public static void Bimago(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "E:\\bot\\chromedriver\\chromedriver.exe");
        Random r = new Random();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        WebDriverWait wait = new WebDriverWait(driver, 60);
        driver.manage().window().maximize();
//        try {
            driver.get("http://www.dodatkowypieniadz.com/zadanie/b3d865837fd4f842b079f82c1ed41013/86cc368252368e6ccf5fbce2db9263ca/201920950f63cee967982b759fde80b1");
            Thread.sleep(3000);
            wpiszHaslo();
            Thread.sleep(5000);
            clickXY(776,602);
            Thread.sleep(3000);
            zmienKarte(driver);
            Thread.sleep(1000);
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"notice-cookie-block\"]/div/div/button")))).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"newsletter-cms\"]")).sendKeys(mail);
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@id=\"newsletter-cms-form-submit-button\"]")).click();
            wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"confirm-newsletter\"]/div[2]/h3"))));
            Thread.sleep(1000);


            //WP
            driver.get("http://poczta.wp.pl/");
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
            driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
            boolean flaga = false;
            int m = 0;
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[3]/button")).click();
            Thread.sleep(5000);
            try {
                driver.findElement(By.xpath("//*[@id=\"agreements\"]/div[6]/button")).click();
            } catch (Exception e) {

            }
            Thread.sleep(3000);
            while (!flaga) {
                try {
                    driver.findElement(By.xpath("//*[text()='bimago. witaj']")).click();
                    flaga = true;
                    Thread.sleep(4000);
                    driver.findElement(By.xpath("/html/body/div[2]/nh-app-view/div/div/div/div[1]/div/div/nh-show-item/div/div/div/div/nh-html-compile/div/div/div/table/tbody/tr/td/div[2]/div/div/div/div/div/div/div/div/a/span")).click();
                    Thread.sleep(5000);
                } catch (Exception e) {
                    driver.navigate().refresh();
                    Thread.sleep(10000);
                }
                m++;
                if (m > 8) {
                    driver.quit();
                    break;
                }

            }

            driver.quit();

//        } catch (Exception e) {
//            driver.quit();
//        }

    }

    public static void Dekoral(String mail) throws AWTException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        try {
            driver.get("http://www.dodatkowypieniadz.com/zadanie/0699acb26feddf9de6d7cf093567d25a/9d8800799cadddb291f1728e72368c23/201920950f63cee967982b759fde80b1");
            wpiszHaslo();
            Thread.sleep(10000);
            clickXY(780,800);
            Thread.sleep(6000);
            zmienKarte(driver);
            Neworklead.Dekoral(driver,mail);
//        } catch (Exception e) {
//            driver.quit();
//        }
    }
}