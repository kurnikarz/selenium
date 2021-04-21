package info_retrieval;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
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

public class MyPay extends Narzedzia{
    public static void Pracuj (String mail, String zawod, String miasto) throws AWTException, InterruptedException {
        WebDriver driver = new FirefoxDriver();
        Robot robot = new Robot();
        Random r = new Random();
        int odMies = r.nextInt(11) + 1;
        int odRok = r.nextInt(2016 - 2012 + 1) + 2012;
        int doMies = r.nextInt(11) + 1;
        int doRok = r.nextInt(2019 - 2017 + 1) + 2017;
        int m = 0;
        String dataOd = Main.test2(odMies,odRok);
        String dataDo = Main.test2(doMies,doRok);
        boolean flaga = true;

        try {
            driver.manage().window().maximize();
            driver.get("https://www.mypay.pl/webapp/extern.php?k=6255&u=230491");
            Thread.sleep(20000);
            driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[2]/div/div/div/a[2]")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/form/div[1]/div/div[1]/input")).sendKeys(mail);
            driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/form/div[2]/div/div[1]/input")).sendKeys(mail+"G2");
            driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/form/label/span[1]")).click();
            driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/form/div[3]/label[1]/span[1]")).click();
            driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/form/div[3]/label[2]/span[1]")).click();
            driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/form/div[3]/label[3]/span[1]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/form/button")).click();

            Thread.sleep(5000);
            driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/form/div[1]/div/div[1]/input")).sendKeys(zawod);
            Thread.sleep(2000);
            robot.keyPress(KeyEvent.VK_DOWN);
            robot.keyRelease(KeyEvent.VK_DOWN);
            Thread.sleep(1000);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            Thread.sleep(1000);
            driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/form/div[3]/div[2]/div[1]/div/input")).sendKeys(dataOd);
            driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/form/div[3]/div[2]/div[2]/div/input")).sendKeys(dataDo);
            driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/form/div[4]/div[2]/div/div[1]/input")).sendKeys(miasto);
            Thread.sleep(2000);
            robot.keyPress(KeyEvent.VK_DOWN);
            robot.keyRelease(KeyEvent.VK_DOWN);
            Thread.sleep(1000);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            Thread.sleep(7000);

            //WP
            driver.get("http://poczta.wp.pl/");
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
            //firefox.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("szczyt2019");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();
            Thread.sleep(3000);
            while (flaga) {
                try {
                    driver.findElement(By.xpath("//*[text()='Pracuj.pl']")).click();
                    flaga = false;
                    Thread.sleep(4000);
                    driver.findElement(By.xpath("//*[text()='Potwierdzam']")).click();
                    Thread.sleep(10000);
                    driver.quit();
                }
                catch (Exception e) {
                    Thread.sleep(5000);
                    robot.keyPress(KeyEvent.VK_F5);
                }
                m++;
                if (m == 5) {
                    driver.quit();
                    break;
                }
            }

        } catch (Exception e) {
            driver.quit();
        }

    }

    public static void Travelist(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "E:\\bot\\chromedriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        HashMap<String, Object> images = new HashMap<String, Object>();
        boolean flaga = false;
        int m = 0;
        Robot robot = new Robot();
        images.put("images", 2);
        HashMap<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values", images);
        options.setExperimentalOption("prefs", prefs);
        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        try {
            driver.get("https://www.mypay.pl/webapp/extern.php?k=5972&u=230491");
            Thread.sleep(15000);
            driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(mail);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
            Thread.sleep(5000);

            driver.get("http://poczta.wp.pl/");
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
            driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
            //driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("szczyt2019");
            Thread.sleep(1000);
            //driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();
            clickXY(333,580);
            clickXY(333,580);
            Thread.sleep(10000);
            while (!flaga) {
                try {
                    driver.findElement(By.xpath("//*[text()='LAST MINUTE z Rainbow']")).click();
                    Thread.sleep(4000);
                    clickXY(982,722);
                    Thread.sleep(7000);
                    for(String winHandle : driver.getWindowHandles()){
                        driver.switchTo().window(winHandle);
                    }
                    Thread.sleep(1000);
                    ScrollBy(driver,"1500");
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("//*[@id=\"newsletter\"]/div/div/form/input")).sendKeys(mail);
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("//*[@id=\"newsletter\"]/div/div/form/button")).click();
                    Thread.sleep(7000);
                    driver.get("http://poczta.wp.pl/");
                    Thread.sleep(6000);
                    driver.findElement(By.xpath("//*[text()='Oferty']")).click();
                    Thread.sleep(3000);
                    driver.findElement(By.xpath("//*[text()='Biuro Podróży Rainbow']")).click();
                    Thread.sleep(3000);
                    driver.findElement(By.xpath("//*[text()='AKTYWUJ >>']")).click();
                    Thread.sleep(7000);
                    flaga = true;
                    driver.quit();
                } catch (Exception e) {
                    robot.keyPress(KeyEvent.VK_F5);
                    Thread.sleep(10000);
                }
                m++;
                if (m > 4) {
                    driver.quit();
                    break;
                }

            }

        } catch(Exception e) {
            driver.quit();
        }

    }

    public static void En(String mail) throws AWTException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\bot\\chromedriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        Random r = new Random();
        int dzien = r.nextInt(28) + 1;
        int mies = r.nextInt(4) + 4;
        String rok = "2020";
        HashMap<String, Object> images = new HashMap<String, Object>();
        boolean flaga = false;
        int m = 0;
        Robot robot = new Robot();
        images.put("images", 2);
        HashMap<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values", images);
        options.setExperimentalOption("prefs", prefs);
        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        try {
            driver.get("https://www.mypay.pl/webapp/extern.php?k=6607&u=230491");
            Thread.sleep(20000);
            driver.findElement(By.xpath("//*[@id=\"_evidon-accept-button\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"field_enroll_first_name\"]")).sendKeys(genImieZen());
            driver.findElement(By.xpath("//*[@id=\"field_enroll_last_name\"]")).sendKeys(genNazwiskoZen());
            driver.findElement(By.xpath("//*[@id=\"field_enroll_email_address\"]")).sendKeys(mail);
            Thread.sleep(1000);
            Select dzie = new Select(driver.findElement(By.xpath("//*[@id=\"field_enroll_date_of_birth_day\"]")));
            dzie.selectByIndex(dzien);
            Select mie = new Select(driver.findElement(By.xpath("//*[@id=\"field_enroll_date_of_birth_month\"]")));
            mie.selectByIndex(mies);
            Select ro = new Select(driver.findElement(By.xpath("//*[@id=\"field_enroll_date_of_birth_year\"]")));
            ro.selectByValue(rok);
            Thread.sleep(1000);
            ScrollBy(driver, "600");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"field_enroll_agree_terms_optin\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"field_enroll_privacy_policy_read\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"field_enroll_direct_mail_optin\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"field_enroll_direct_mail_optin_2\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"field_enroll_direct_mail_optin_3\"]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"edit-submit\"]")).click();
            Thread.sleep(7000);
            driver.quit();

        } catch (Exception e) {
            driver.quit();
        }

    }

    public static void Li(String mail) throws AWTException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\bot\\chromedriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        Random r = new Random();
        HashMap<String, Object> images = new HashMap<String, Object>();
        boolean flaga = false;
        int m = 0;
        Robot robot = new Robot();
        images.put("images", 2);
        HashMap<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values", images);
        options.setExperimentalOption("prefs", prefs);
        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        try {
            driver.get("https://www.mypay.pl/webapp/extern.php?k=6504&u=230491");
            Thread.sleep(20000);
            //driver.findElement(By.xpath("/html/body/div[1]/header/div[3]/button")).click();
            clickXY(1815,1010);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"register_form_email\"]")).sendKeys(mail);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"reg\"]")).click();
            Thread.sleep(7000);

            driver.get("http://poczta.wp.pl/");
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
            driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
            //driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("szczyt2019");
            Thread.sleep(1000);
            //driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();
            clickXY(333,580);
            clickXY(333,580);
            Thread.sleep(10000);
            while (!flaga) {
                try {
                    driver.findElement(By.xpath("//*[text()='Sklep limango.pl']")).click();
                    Thread.sleep(4000);
                    driver.findElement(By.xpath("//*[text()='Potwierdzam rejestrację i chcę otrzymywać newsletter']")).click();
                    Thread.sleep(7000);
                    for(String winHandle : driver.getWindowHandles()){
                        driver.switchTo().window(winHandle);
                    }
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("//*[@id=\"change_password_form_password_first\"]")).sendKeys(mail+"V2");
                    driver.findElement(By.xpath("//*[@id=\"change_password_form_password_second\"]")).sendKeys(mail+"V2");
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("//*[@id=\"change_password_form_save\"]")).click();
                    Thread.sleep(4000);
                    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[3]/div/a")).click();
                    Thread.sleep(10000);
                    flaga = true;
                    driver.quit();
                } catch (Exception e) {
                    robot.keyPress(KeyEvent.VK_F5);
                    Thread.sleep(10000);
                }
                m++;
                if (m > 4) {
                    driver.quit();
                    break;
                }

            }

        } catch (Exception e) {
            driver.quit();
        }



    }

    public static void cu(String numer) throws AWTException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\bot\\chromedriver\\chromedriver.exe");
        //System.setProperty("webdriver.gecko.driver", "E:\\bot\\geckodriver\\geckodriver.exe");
        Random r = new Random();
        int marka = r.nextInt(15);
        String miesRej = dodajZero(r.nextInt(10) + 1);
        String dzienRej = dodajZero(r.nextInt(28) + 1);
        String rokNabycia = String.valueOf(r.nextInt(2018) - 2015 + 1) + 2015;
        String miesPolisy = dodajZero(r.nextInt(9 - 4 + 1) + 4);
        String dzienPolisy = dodajZero(r.nextInt(28) + 1);
        String przebieg = "185000";

        ChromeOptions options = new ChromeOptions();
        HashMap<String, Object> images = new HashMap<String, Object>();
        images.put("images", 2);
        HashMap<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values", images);
        options.setExperimentalOption("prefs", prefs);
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.mypay.pl/webapp/extern.php?k=6035&u=230491");
        //driver.get("https://cuk.pl/samochod/kalkulator_oc_i_ac");

        Thread.sleep(40000);
        clickXY(1800,1030);
        clickXY(1782,1030);
        Thread.sleep(1000);
        //clickXY(866,760);
        //driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[4]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[2]/div[1]/div[2]/span/span/span[1]")).click();

        switch (marka) {
            case 0:
                przebieg = "209124";
                driver.findElement(By.xpath("/html/body/div[3]/div/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[2]/div[1]/div[2]/span/span/span[1]")).click();   //MARKA
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/div[7]/div/div[2]/ul/li[6]")).click();
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/div[3]/div/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[3]/div[1]/div[2]/span/span/span[1]")).click();   //ROK PRODUKCJI
                Thread.sleep(1000);
                try {
                    driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/ul/li[12]")).click();
                } catch (Exception e) {
                    driver.findElement(By.xpath("/html/body/div[14]/div/div[2]/ul/li[12]")).click();
                }
                Thread.sleep(1000);
                Kopiuj("1999"+miesRej+dzienRej);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[4]/div[1]/div[2]/div[2]/span/input[1]")).click();    //DATA PIERWSZEJ REJESTRACJI
                Thread.sleep(1000);
                Wklej();
                clickXY(1185,628);
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[5]/div[1]/div[2]/span/span/span[1]")).click();   //ROK NABYCIA
                Thread.sleep(1000);
                try {
                    driver.findElement(By.xpath("/html/body/div[10]/div/div[2]/ul/li[8]")).click();
                } catch (Exception e) {
                    driver.findElement(By.xpath("/html/body/div[16]/div/div[2]/ul/li[8]")).click();
                }
                clickXY(1185,628);
                Thread.sleep(1000);
                ScrollBy(driver,"700");
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[6]/div[1]/div[2]/span/span/span[1]")).click();   //MODEL
                Thread.sleep(1000);
                try {
                    driver.findElement(By.xpath("/html/body/div[11]/div/div[2]/ul/li[4]")).click();
                } catch (Exception e) {
                    driver.findElement(By.xpath("/html/body/div[17]/div/div[2]/ul/li[4]")).click();
                }
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[7]/div/div[1]/div[2]/span[1]/label/label")).click(); //PALIWO
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[8]/div/div[1]/div[2]/span[1]/label/label")).click(); //POJEMNOŚĆ
                break;
            case 1:
                przebieg = "147000";
                driver.findElement(By.xpath("/html/body/div[3]/div/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[2]/div[1]/div[2]/span/span/span[1]")).click();   //MARKA
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/div[7]/div/div[2]/ul/li[8]")).click();
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/div[3]/div/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[3]/div[1]/div[2]/span/span/span[1]")).click();   //ROK PRODUKCJI
                Thread.sleep(1000);
                try {
                    driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/ul/li[13]")).click();
                } catch (Exception e) {
                    driver.findElement(By.xpath("/html/body/div[14]/div/div[2]/ul/li[13]")).click();
                }
                Thread.sleep(1000);
                Kopiuj("1999"+miesRej+dzienRej);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[4]/div[1]/div[2]/div[2]/span/input[1]")).click();    //DATA PIERWSZEJ REJESTRACJI
                Thread.sleep(1000);
                Wklej();
                clickXY(1185,628);
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[5]/div[1]/div[2]/span/span/span[1]")).click();   //ROK NABYCIA
                Thread.sleep(1000);
                try {
                    driver.findElement(By.xpath("/html/body/div[10]/div/div[2]/ul/li[8]")).click();
                } catch (Exception e) {
                    driver.findElement(By.xpath("/html/body/div[16]/div/div[2]/ul/li[8]")).click();
                }
                clickXY(1185,628);
                Thread.sleep(1000);
                ScrollBy(driver,"700");
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[6]/div[1]/div[2]/span/span/span[1]")).click();   //MODEL
                Thread.sleep(1000);
                try {
                    driver.findElement(By.xpath("/html/body/div[11]/div/div[2]/ul/li[2]")).click();
                } catch (Exception e) {
                    driver.findElement(By.xpath("/html/body/div[17]/div/div[2]/ul/li[2]")).click();
                }
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[7]/div/div[1]/div[2]/span[1]/label/label")).click(); //PALIWO
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[9]/div/div[1]/div[2]/span[2]/label/label")).click(); //MOC
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[12]/div[1]/div[2]/span/span/span[1]")).click();  //TYP
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/div[18]/div/div[2]/ul/li[2]")).click();
                break;

            case 2:
                przebieg = "330000";
                driver.findElement(By.xpath("/html/body/div[3]/div/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[2]/div[1]/div[2]/span/span/span[1]")).click();   //MARKA
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/div[7]/div/div[2]/ul/li[2]")).click();
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/div[3]/div/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[3]/div[1]/div[2]/span/span/span[1]")).click();   //ROK PRODUKCJI
                Thread.sleep(1000);
                try {
                    driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/ul/li[12]")).click();
                } catch (Exception e) {
                    driver.findElement(By.xpath("/html/body/div[14]/div/div[2]/ul/li[12]")).click();
                }
                Thread.sleep(1000);
                Kopiuj("1999"+miesRej+dzienRej);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[4]/div[1]/div[2]/div[2]/span/input[1]")).click();    //DATA PIERWSZEJ REJESTRACJI
                Thread.sleep(1000);
                Wklej();
                clickXY(1185,628);
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[5]/div[1]/div[2]/span/span/span[1]")).click();   //ROK NABYCIA
                Thread.sleep(1000);
                try {
                    driver.findElement(By.xpath("/html/body/div[10]/div/div[2]/ul/li[8]")).click();
                } catch (Exception e) {
                    driver.findElement(By.xpath("/html/body/div[16]/div/div[2]/ul/li[8]")).click();
                }
                clickXY(1185,628);
                Thread.sleep(1000);
                ScrollBy(driver,"700");
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[6]/div[1]/div[2]/span/span/span[1]")).click();   //MODEL
                Thread.sleep(1000);
                try {
                    driver.findElement(By.xpath("/html/body/div[11]/div/div[2]/ul/li[2]")).click();
                } catch (Exception e) {
                    driver.findElement(By.xpath("/html/body/div[17]/div/div[2]/ul/li[2]")).click();
                }
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[7]/div/div[1]/div[2]/span[1]/label/label")).click(); //PALIWO
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[8]/div/div[1]/div[2]/span[1]/label/label")).click(); //POJEMNOść
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[12]/div[1]/div[2]/span/span/span[1]")).click();  //TYP
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/div[12]/div/div[2]/ul/li[2]")).click();
                break;

            case 3:
                przebieg = "275000";
                driver.findElement(By.xpath("/html/body/div[3]/div/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[2]/div[1]/div[2]/span/span/span[1]")).click();   //MARKA
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/div[7]/div/div[2]/ul/li[2]")).click();
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/div[3]/div/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[3]/div[1]/div[2]/span/span/span[1]")).click();   //ROK PRODUKCJI
                Thread.sleep(1000);
                try {
                    driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/ul/li[12]")).click();
                } catch (Exception e) {
                    driver.findElement(By.xpath("/html/body/div[14]/div/div[2]/ul/li[12]")).click();
                }
                Thread.sleep(1000);
                Kopiuj("1999"+miesRej+dzienRej);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[4]/div[1]/div[2]/div[2]/span/input[1]")).click();    //DATA PIERWSZEJ REJESTRACJI
                Thread.sleep(1000);
                Wklej();
                clickXY(1185,628);
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[5]/div[1]/div[2]/span/span/span[1]")).click();   //ROK NABYCIA
                Thread.sleep(1000);
                try {
                    driver.findElement(By.xpath("/html/body/div[10]/div/div[2]/ul/li[8]")).click();
                } catch (Exception e) {
                    driver.findElement(By.xpath("/html/body/div[16]/div/div[2]/ul/li[8]")).click();
                }
                clickXY(1185,628);
                Thread.sleep(1000);
                ScrollBy(driver,"700");
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[6]/div[1]/div[2]/span/span/span[1]")).click();   //MODEL
                Thread.sleep(1000);
                try {
                    driver.findElement(By.xpath("/html/body/div[11]/div/div[2]/ul/li[2]")).click();
                } catch (Exception e) {
                    driver.findElement(By.xpath("/html/body/div[17]/div/div[2]/ul/li[2]")).click();
                }
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[7]/div/div[1]/div[2]/span[1]/label/label")).click(); //PALIWO
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[8]/div/div[1]/div[2]/span[1]/label/label")).click(); //POJEMNOść
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[12]/div[1]/div[2]/span/span/span[1]")).click();  //TYP
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/div[12]/div/div[2]/ul/li[3]")).click();
                break;

            case 4:
                przebieg = "111000";
                driver.findElement(By.xpath("/html/body/div[3]/div/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[2]/div[1]/div[2]/span/span/span[1]")).click();   //MARKA
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/div[7]/div/div[2]/ul/li[2]")).click();
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/div[3]/div/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[3]/div[1]/div[2]/span/span/span[1]")).click();   //ROK PRODUKCJI
                Thread.sleep(1000);
                try {
                    driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/ul/li[12]")).click();
                } catch (Exception e) {
                    driver.findElement(By.xpath("/html/body/div[14]/div/div[2]/ul/li[12]")).click();
                }
                Thread.sleep(1000);
                Kopiuj("1999"+miesRej+dzienRej);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[4]/div[1]/div[2]/div[2]/span/input[1]")).click();    //DATA PIERWSZEJ REJESTRACJI
                Thread.sleep(1000);
                Wklej();
                clickXY(1185,628);
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[5]/div[1]/div[2]/span/span/span[1]")).click();   //ROK NABYCIA
                Thread.sleep(1000);
                try {
                    driver.findElement(By.xpath("/html/body/div[10]/div/div[2]/ul/li[8]")).click();
                } catch (Exception e) {
                    driver.findElement(By.xpath("/html/body/div[16]/div/div[2]/ul/li[8]")).click();
                }
                clickXY(1185,628);
                Thread.sleep(1000);
                ScrollBy(driver,"700");
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[6]/div[1]/div[2]/span/span/span[1]")).click();   //MODEL
                Thread.sleep(1000);
                try {
                    driver.findElement(By.xpath("/html/body/div[11]/div/div[2]/ul/li[2]")).click();
                } catch (Exception e) {
                    driver.findElement(By.xpath("/html/body/div[17]/div/div[2]/ul/li[2]")).click();
                }
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[7]/div/div[1]/div[2]/span[1]/label/label")).click(); //PALIWO
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[8]/div/div[1]/div[2]/span[1]/label/label")).click(); //POJEMNOść
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[12]/div[1]/div[2]/span/span/span[1]")).click();  //TYP
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/div[12]/div/div[2]/ul/li[4]")).click();
                break;

            case 5:
                przebieg = "179000";
                driver.findElement(By.xpath("/html/body/div[3]/div/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[2]/div[1]/div[2]/span/span/span[1]")).click();   //MARKA
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/div[7]/div/div[2]/ul/li[3]")).click();
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/div[3]/div/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[3]/div[1]/div[2]/span/span/span[1]")).click();   //ROK PRODUKCJI
                Thread.sleep(1000);
                try {
                    driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/ul/li[10]")).click();
                } catch (Exception e) {
                    driver.findElement(By.xpath("/html/body/div[14]/div/div[2]/ul/li[10]")).click();
                }
                Thread.sleep(1000);
                Kopiuj("1999"+miesRej+dzienRej);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[4]/div[1]/div[2]/div[2]/span/input[1]")).click();    //DATA PIERWSZEJ REJESTRACJI
                Thread.sleep(1000);
                Wklej();
                clickXY(1185,628);
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[5]/div[1]/div[2]/span/span/span[1]")).click();   //ROK NABYCIA
                Thread.sleep(1000);
                try {
                    driver.findElement(By.xpath("/html/body/div[10]/div/div[2]/ul/li[8]")).click();
                } catch (Exception e) {
                    driver.findElement(By.xpath("/html/body/div[16]/div/div[2]/ul/li[8]")).click();
                }
                clickXY(1185,628);
                Thread.sleep(1000);
                ScrollBy(driver,"700");
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[6]/div[1]/div[2]/span/span/span[1]")).click();   //MODEL
                Thread.sleep(1000);
                try {
                    driver.findElement(By.xpath("/html/body/div[11]/div/div[2]/ul/li[9]")).click();
                } catch (Exception e) {
                    driver.findElement(By.xpath("/html/body/div[17]/div/div[2]/ul/li[9]")).click();
                }
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[7]/div/div[1]/div[2]/span[1]/label/label")).click(); //PALIWO
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[8]/div/div[1]/div[2]/span[2]/label/label")).click(); //POJEMNOść
                break;

            case 6:
                przebieg = "245000";
                driver.findElement(By.xpath("/html/body/div[3]/div/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[2]/div[1]/div[2]/span/span/span[1]")).click();   //MARKA
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/div[7]/div/div[2]/ul/li[3]")).click();
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/div[3]/div/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[3]/div[1]/div[2]/span/span/span[1]")).click();   //ROK PRODUKCJI
                Thread.sleep(1000);
                try {
                    driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/ul/li[10]")).click();
                } catch (Exception e) {
                    driver.findElement(By.xpath("/html/body/div[14]/div/div[2]/ul/li[10]")).click();
                }
                Thread.sleep(1000);
                Kopiuj("1999"+miesRej+dzienRej);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[4]/div[1]/div[2]/div[2]/span/input[1]")).click();    //DATA PIERWSZEJ REJESTRACJI
                Thread.sleep(1000);
                Wklej();
                clickXY(1185,628);
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[5]/div[1]/div[2]/span/span/span[1]")).click();   //ROK NABYCIA
                Thread.sleep(1000);
                try {
                    driver.findElement(By.xpath("/html/body/div[10]/div/div[2]/ul/li[8]")).click();
                } catch (Exception e) {
                    driver.findElement(By.xpath("/html/body/div[16]/div/div[2]/ul/li[8]")).click();
                }
                clickXY(1185,628);
                Thread.sleep(1000);
                ScrollBy(driver,"700");
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[6]/div[1]/div[2]/span/span/span[1]")).click();   //MODEL
                Thread.sleep(1000);
                try {
                    driver.findElement(By.xpath("/html/body/div[11]/div/div[2]/ul/li[7]")).click();
                } catch (Exception e) {
                    driver.findElement(By.xpath("/html/body/div[17]/div/div[2]/ul/li[7]")).click();
                }
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[7]/div/div[1]/div[2]/span[1]/label/label")).click(); //PALIWO
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[8]/div/div[1]/div[2]/span[2]/label/label")).click(); //POJEMNOść
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[9]/div/div[1]/div[2]/span[1]/label/label")).click(); //MOC
                break;

            case 7:
                przebieg = "190000";
                driver.findElement(By.xpath("/html/body/div[3]/div/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[2]/div[1]/div[2]/span/span/span[1]")).click();   //MARKA
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/div[7]/div/div[2]/ul/li[4]")).click();
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/div[3]/div/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[3]/div[1]/div[2]/span/span/span[1]")).click();   //ROK PRODUKCJI
                Thread.sleep(1000);
                try {
                    driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/ul/li[12]")).click();
                } catch (Exception e) {
                    driver.findElement(By.xpath("/html/body/div[14]/div/div[2]/ul/li[12]")).click();
                }
                Thread.sleep(1000);
                Kopiuj("1999"+miesRej+dzienRej);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[4]/div[1]/div[2]/div[2]/span/input[1]")).click();    //DATA PIERWSZEJ REJESTRACJI
                Thread.sleep(1000);
                Wklej();
                clickXY(1185,628);
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[5]/div[1]/div[2]/span/span/span[1]")).click();   //ROK NABYCIA
                Thread.sleep(1000);
                try {
                    driver.findElement(By.xpath("/html/body/div[10]/div/div[2]/ul/li[7]")).click();
                } catch (Exception e) {
                    driver.findElement(By.xpath("/html/body/div[16]/div/div[2]/ul/li[7]")).click();
                }
                clickXY(1185,628);
                Thread.sleep(1000);
                ScrollBy(driver,"700");
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[6]/div[1]/div[2]/span/span/span[1]")).click();   //MODEL
                Thread.sleep(1000);
                try {
                    driver.findElement(By.xpath("/html/body/div[11]/div/div[2]/ul/li[6]")).click();
                } catch (Exception e) {
                    driver.findElement(By.xpath("/html/body/div[17]/div/div[2]/ul/li[6]")).click();
                }
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[7]/div/div[1]/div[2]/span[1]/label/label")).click(); //PALIWO
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[12]/div[1]/div[2]/span/span/span[1]")).click();  //TYP
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/div[12]/div/div[2]/ul/li[2]")).click();
                break;

            case 8:
                przebieg = "154000";
                driver.findElement(By.xpath("/html/body/div[3]/div/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[2]/div[1]/div[2]/span/span/span[1]")).click();   //MARKA
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/div[7]/div/div[2]/ul/li[4]")).click();
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/div[3]/div/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[3]/div[1]/div[2]/span/span/span[1]")).click();   //ROK PRODUKCJI
                Thread.sleep(1000);
                try {
                    driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/ul/li[12]")).click();
                } catch (Exception e) {
                    driver.findElement(By.xpath("/html/body/div[14]/div/div[2]/ul/li[12]")).click();
                }
                Thread.sleep(1000);
                Kopiuj("1999"+miesRej+dzienRej);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[4]/div[1]/div[2]/div[2]/span/input[1]")).click();    //DATA PIERWSZEJ REJESTRACJI
                Thread.sleep(1000);
                Wklej();
                clickXY(1185,628);
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[5]/div[1]/div[2]/span/span/span[1]")).click();   //ROK NABYCIA
                Thread.sleep(1000);
                try {
                    driver.findElement(By.xpath("/html/body/div[10]/div/div[2]/ul/li[7]")).click();
                } catch (Exception e) {
                    driver.findElement(By.xpath("/html/body/div[16]/div/div[2]/ul/li[7]")).click();
                }
                clickXY(1185,628);
                Thread.sleep(1000);
                ScrollBy(driver,"700");
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[6]/div[1]/div[2]/span/span/span[1]")).click();   //MODEL
                Thread.sleep(1000);
                try {
                    driver.findElement(By.xpath("/html/body/div[11]/div/div[2]/ul/li[6]")).click();
                } catch (Exception e) {
                    driver.findElement(By.xpath("/html/body/div[17]/div/div[2]/ul/li[6]")).click();
                }
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[7]/div/div[1]/div[2]/span[1]/label/label")).click(); //PALIWO
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[12]/div[1]/div[2]/span/span/span[1]")).click();  //TYP
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/div[12]/div/div[2]/ul/li[3]")).click();
                break;

            case 9:
                przebieg = "176000";
                driver.findElement(By.xpath("/html/body/div[3]/div/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[2]/div[1]/div[2]/span/span/span[1]")).click();   //MARKA
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/div[7]/div/div[2]/ul/li[4]")).click();
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/div[3]/div/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[3]/div[1]/div[2]/span/span/span[1]")).click();   //ROK PRODUKCJI
                Thread.sleep(1000);
                try {
                    driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/ul/li[12]")).click();
                } catch (Exception e) {
                    driver.findElement(By.xpath("/html/body/div[14]/div/div[2]/ul/li[12]")).click();
                }
                Thread.sleep(1000);
                Kopiuj("1999"+miesRej+dzienRej);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[4]/div[1]/div[2]/div[2]/span/input[1]")).click();    //DATA PIERWSZEJ REJESTRACJI
                Thread.sleep(1000);
                Wklej();
                clickXY(1185,628);
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[5]/div[1]/div[2]/span/span/span[1]")).click();   //ROK NABYCIA
                Thread.sleep(1000);
                try {
                    driver.findElement(By.xpath("/html/body/div[10]/div/div[2]/ul/li[7]")).click();
                } catch (Exception e) {
                    driver.findElement(By.xpath("/html/body/div[16]/div/div[2]/ul/li[7]")).click();
                }
                clickXY(1185,628);
                Thread.sleep(1000);
                ScrollBy(driver,"700");
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[6]/div[1]/div[2]/span/span/span[1]")).click();   //MODEL
                Thread.sleep(1000);
                try {
                    driver.findElement(By.xpath("/html/body/div[11]/div/div[2]/ul/li[6]")).click();
                } catch (Exception e) {
                    driver.findElement(By.xpath("/html/body/div[17]/div/div[2]/ul/li[6]")).click();
                }
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[7]/div/div[1]/div[2]/span[1]/label/label")).click(); //PALIWO
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[12]/div[1]/div[2]/span/span/span[1]")).click();  //TYP
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/div[12]/div/div[2]/ul/li[4]")).click();
                break;

            case 10:
                przebieg = "120000";
                driver.findElement(By.xpath("/html/body/div[3]/div/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[2]/div[1]/div[2]/span/span/span[1]")).click();   //MARKA
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/div[11]/div/div[2]/ul/li[5]")).click();
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/div[3]/div/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[3]/div[1]/div[2]/span/span/span[1]")).click();   //ROK PRODUKCJI
                Thread.sleep(1000);
                try {
                    driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/ul/li[10]")).click();
                } catch (Exception e) {
                    driver.findElement(By.xpath("/html/body/div[12]/div/div[2]/ul/li[10]")).click();
                }
                Thread.sleep(1000);
                Kopiuj("1999"+miesRej+dzienRej);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[4]/div[1]/div[2]/div[2]/span/input[1]")).click();    //DATA PIERWSZEJ REJESTRACJI
                Thread.sleep(1000);
                Wklej();
                clickXY(1185,628);
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[5]/div[1]/div[2]/span/span/span[1]")).click();   //ROK NABYCIA
                Thread.sleep(1000);
                try {
                    driver.findElement(By.xpath("/html/body/div[10]/div/div[2]/ul/li[9]")).click();
                } catch (Exception e) {
                    driver.findElement(By.xpath("/html/body/div[14]/div/div[2]/ul/li[9]")).click();
                }
                clickXY(1185,628);
                Thread.sleep(1000);
                ScrollBy(driver,"700");
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[6]/div[1]/div[2]/span/span/span[1]")).click();   //MODEL
                Thread.sleep(1000);
                try {
                    driver.findElement(By.xpath("/html/body/div[11]/div/div[2]/ul/li[8]")).click();
                } catch (Exception e) {
                    driver.findElement(By.xpath("/html/body/div[15]/div/div[2]/ul/li[8]")).click();
                }
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[7]/div/div[1]/div[2]/span[1]/label/label")).click(); //PALIWO
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[8]/div/div[1]/div[2]/span[2]/label/label")).click();  //POJEMNOSC
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[10]/div/div[1]/div[2]/span[1]/label/label")).click();    //SKRZYNIA
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[12]/div[1]/div[2]/span/span/span[1]")).click();  //TYP
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/div[16]/div/div[2]/ul/li[2]")).click();
                break;

            case 11:
                przebieg = "160000";
                driver.findElement(By.xpath("/html/body/div[3]/div/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[2]/div[1]/div[2]/span/span/span[1]")).click();   //MARKA
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/div[11]/div/div[2]/ul/li[5]")).click();
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/div[3]/div/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[3]/div[1]/div[2]/span/span/span[1]")).click();   //ROK PRODUKCJI
                Thread.sleep(1000);
                try {
                    driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/ul/li[10]")).click();
                } catch (Exception e) {
                    driver.findElement(By.xpath("/html/body/div[12]/div/div[2]/ul/li[10]")).click();
                }
                Thread.sleep(1000);
                Kopiuj("1999"+miesRej+dzienRej);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[4]/div[1]/div[2]/div[2]/span/input[1]")).click();    //DATA PIERWSZEJ REJESTRACJI
                Thread.sleep(1000);
                Wklej();
                clickXY(1185,628);
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[5]/div[1]/div[2]/span/span/span[1]")).click();   //ROK NABYCIA
                Thread.sleep(1000);
                try {
                    driver.findElement(By.xpath("/html/body/div[10]/div/div[2]/ul/li[9]")).click();
                } catch (Exception e) {
                    driver.findElement(By.xpath("/html/body/div[14]/div/div[2]/ul/li[9]")).click();
                }
                clickXY(1185,628);
                Thread.sleep(1000);
                ScrollBy(driver,"700");
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[6]/div[1]/div[2]/span/span/span[1]")).click();   //MODEL
                Thread.sleep(1000);
                try {
                    driver.findElement(By.xpath("/html/body/div[11]/div/div[2]/ul/li[8]")).click();
                } catch (Exception e) {
                    driver.findElement(By.xpath("/html/body/div[15]/div/div[2]/ul/li[8]")).click();
                }
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[7]/div/div[1]/div[2]/span[1]/label/label")).click(); //PALIWO
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[8]/div/div[1]/div[2]/span[2]/label/label")).click();  //POJEMNOSC
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[10]/div/div[1]/div[2]/span[1]/label/label")).click();    //SKRZYNIA
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[12]/div[1]/div[2]/span/span/span[1]")).click();  //TYP
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/div[16]/div/div[2]/ul/li[3]")).click();
                break;

            case 12:
                przebieg = "95000";
                driver.findElement(By.xpath("/html/body/div[3]/div/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[2]/div[1]/div[2]/span/span/span[1]")).click();   //MARKA
                Thread.sleep(1000);
                try {
                    driver.findElement(By.xpath("/html/body/div[11]/div/div[2]/ul/li[5]")).click();
                }catch (Exception e){
                    driver.findElement(By.xpath("/html/body/div[7]/div/div[2]/ul/li[5]")).click();
                }
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/div[3]/div/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[3]/div[1]/div[2]/span/span/span[1]")).click();   //ROK PRODUKCJI
                Thread.sleep(1000);
                try {
                    driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/ul/li[10]")).click();
                } catch (Exception e) {
                    driver.findElement(By.xpath("/html/body/div[12]/div/div[2]/ul/li[10]")).click();
                }
                Thread.sleep(1000);
                Kopiuj("1999"+miesRej+dzienRej);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[4]/div[1]/div[2]/div[2]/span/input[1]")).click();    //DATA PIERWSZEJ REJESTRACJI
                Thread.sleep(1000);
                Wklej();
                clickXY(1185,628);
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[5]/div[1]/div[2]/span/span/span[1]")).click();   //ROK NABYCIA
                Thread.sleep(1000);
                try {
                    driver.findElement(By.xpath("/html/body/div[10]/div/div[2]/ul/li[9]")).click();
                } catch (Exception e) {
                    driver.findElement(By.xpath("/html/body/div[14]/div/div[2]/ul/li[9]")).click();
                }
                clickXY(1185,628);
                Thread.sleep(1000);
                ScrollBy(driver,"700");
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[6]/div[1]/div[2]/span/span/span[1]")).click();   //MODEL
                Thread.sleep(1000);
                try {
                    driver.findElement(By.xpath("/html/body/div[11]/div/div[2]/ul/li[8]")).click();
                } catch (Exception e) {
                    driver.findElement(By.xpath("/html/body/div[15]/div/div[2]/ul/li[8]")).click();
                }
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[7]/div/div[1]/div[2]/span[1]/label/label")).click(); //PALIWO
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[8]/div/div[1]/div[2]/span[2]/label/label")).click();  //POJEMNOSC
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[10]/div/div[1]/div[2]/span[1]/label/label")).click();    //SKRZYNIA
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[12]/div[1]/div[2]/span/span/span[1]")).click();  //TYP
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/div[16]/div/div[2]/ul/li[4]")).click();
                break;

            case 13:
                przebieg = "130000";
                driver.findElement(By.xpath("/html/body/div[3]/div/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[2]/div[1]/div[2]/span/span/span[1]")).click();   //MARKA
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/div[11]/div/div[2]/ul/li[5]")).click();
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/div[3]/div/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[3]/div[1]/div[2]/span/span/span[1]")).click();   //ROK PRODUKCJI
                Thread.sleep(1000);
                try {
                    driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/ul/li[10]")).click();
                } catch (Exception e) {
                    driver.findElement(By.xpath("/html/body/div[12]/div/div[2]/ul/li[10]")).click();
                }
                Thread.sleep(1000);
                Kopiuj("1999"+miesRej+dzienRej);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[4]/div[1]/div[2]/div[2]/span/input[1]")).click();    //DATA PIERWSZEJ REJESTRACJI
                Thread.sleep(1000);
                Wklej();
                clickXY(1185,628);
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[5]/div[1]/div[2]/span/span/span[1]")).click();   //ROK NABYCIA
                Thread.sleep(1000);
                try {
                    driver.findElement(By.xpath("/html/body/div[10]/div/div[2]/ul/li[9]")).click();
                } catch (Exception e) {
                    driver.findElement(By.xpath("/html/body/div[14]/div/div[2]/ul/li[9]")).click();
                }
                clickXY(1185,628);
                Thread.sleep(1000);
                ScrollBy(driver,"700");
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[6]/div[1]/div[2]/span/span/span[1]")).click();   //MODEL
                Thread.sleep(1000);
                try {
                    driver.findElement(By.xpath("/html/body/div[11]/div/div[2]/ul/li[8]")).click();
                } catch (Exception e) {
                    driver.findElement(By.xpath("/html/body/div[15]/div/div[2]/ul/li[8]")).click();
                }
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[7]/div/div[1]/div[2]/span[1]/label/label")).click(); //PALIWO
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[8]/div/div[1]/div[2]/span[2]/label/label")).click();  //POJEMNOSC
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[10]/div/div[1]/div[2]/span[1]/label/label")).click();    //SKRZYNIA
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[12]/div[1]/div[2]/span/span/span[1]")).click();  //TYP
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/div[16]/div/div[2]/ul/li[5]")).click();
                break;

            case 14:
                przebieg = "120000";
                driver.findElement(By.xpath("/html/body/div[3]/div/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[2]/div[1]/div[2]/span/span/span[1]")).click();   //MARKA
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/div[11]/div/div[2]/ul/li[5]")).click();
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/div[3]/div/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[3]/div[1]/div[2]/span/span/span[1]")).click();   //ROK PRODUKCJI
                Thread.sleep(1000);
                try {
                    driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/ul/li[10]")).click();
                } catch (Exception e) {
                    driver.findElement(By.xpath("/html/body/div[12]/div/div[2]/ul/li[10]")).click();
                }
                Thread.sleep(1000);
                Kopiuj("1999"+miesRej+dzienRej);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[4]/div[1]/div[2]/div[2]/span/input[1]")).click();    //DATA PIERWSZEJ REJESTRACJI
                Thread.sleep(1000);
                Wklej();
                clickXY(1185,628);
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[5]/div[1]/div[2]/span/span/span[1]")).click();   //ROK NABYCIA
                Thread.sleep(1000);
                try {
                    driver.findElement(By.xpath("/html/body/div[10]/div/div[2]/ul/li[9]")).click();
                } catch (Exception e) {
                    driver.findElement(By.xpath("/html/body/div[14]/div/div[2]/ul/li[9]")).click();
                }
                clickXY(1185,628);
                Thread.sleep(1000);
                ScrollBy(driver,"700");
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[6]/div[1]/div[2]/span/span/span[1]")).click();   //MODEL
                Thread.sleep(1000);
                try {
                    driver.findElement(By.xpath("/html/body/div[11]/div/div[2]/ul/li[8]")).click();
                } catch (Exception e) {
                    driver.findElement(By.xpath("/html/body/div[15]/div/div[2]/ul/li[8]")).click();
                }
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[7]/div/div[1]/div[2]/span[1]/label/label")).click(); //PALIWO
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[8]/div/div[1]/div[2]/span[2]/label/label")).click();  //POJEMNOSC
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[10]/div/div[1]/div[2]/span[1]/label/label")).click();    //SKRZYNIA
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[12]/div[1]/div[2]/span/span/span[1]")).click();  //TYP
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/div[16]/div/div[2]/ul/li[5]")).click();
                break;
        }
        Thread.sleep(3000);
        ScrollBy(driver,"700");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[3]/div/div[3]/span/button")).click();

        Thread.sleep(3000);
        Kopiuj("2020"+miesPolisy+dzienPolisy);
        driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[4]/div/div/div[2]/div[2]/div/div[1]/div/div[2]/div/div[1]/div[2]/div[2]/span/input[1]")).click();
        Thread.sleep(1000);
        Wklej();

        driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[4]/div/div/div[2]/div[2]/div/div[1]/div/div[3]/div[1]/div[2]/span/span/input[1]")).sendKeys(przebieg);

        clickXY(720,624);
        Kopiuj(numer);
        driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[4]/div/div/div[2]/div[2]/div/div[1]/div/div[11]/div[1]/div[2]/span/input")).click();
        Thread.sleep(1000);
        Wklej();
        ScrollBy(driver,"700");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[4]/div/div/div[2]/div[2]/div/div[1]/div/div[12]/div/div[1]/div[2]/label[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"kk20_app\"]/div/main/section/div/div[4]/div/div/div[2]/div[2]/div/div[1]/div/div[14]/div/div[3]/span/button/label")).click();
        Thread.sleep(7000);
        driver.quit();


    }

    public static void tamMoney(String mail, String login) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\bot\\chromedriver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tammoney.club/723121398594230/");

        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"memberlogin\"]/div[1]/a[1]/u")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(login);
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(mail);
        driver.findElement(By.xpath("//*[@id=\"password1\"]")).sendKeys(mail+"V2");
        driver.findElement(By.xpath("//*[@id=\"password2\"]")).sendKeys(mail+"V2");
        Thread.sleep(10000);
        driver.quit();
    }

    public static void Pampers(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "E:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            driver.get("https://www.mypay.pl/webapp/extern.php?k=6776&u=230491");
            Thread.sleep(35000);
            Dodatkowy.Pampers(driver, mail);
            driver.quit();
        } catch (Exception e) {
            driver.quit();
        }


    }

    public static void Everyday(String mail, String kod, String ulica, String miasto, String odp) throws AWTException, IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\bot\\chromedriver\\chromedriver.exe");
        String imie = genImieZen();
        String nazwisko = genNazwiskoZen();
        Random r = new Random();
        int miesiac = r.nextInt(12 - 2 + 1) + 2;
        int rok = r.nextInt(1995 - 1986 + 1) + 1986;
        int dzien = r.nextInt(29) + 1;
        int odp1 = r.nextInt(2);
        int odp2 = r.nextInt(2);
        int odp3 = r.nextInt(3);
        int kupon1 = r.nextInt(8);
        int kupon2 = r.nextInt(8);
        int x = 1750;
        Robot robot = new Robot();
        String roko = String.valueOf(rok);
        Writer niewykorzystane = new BufferedWriter(new FileWriter("C:\\Users\\Artur\\Desktop\\klikanie\\niewykorzystaneEvery.txt", true));
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            driver.get("https://www.mypay.pl/webapp/extern.php?k=6934&u=230491");
            Thread.sleep(20000);
            driver.get("https://www.everydayme.pl/letnia-swiezosc");

            Thread.sleep(5000);
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,400)", "");
            Thread.sleep(1000);
            clickXY(772, 540);
            Thread.sleep(1000);
            clickXY(943, 628);

            Thread.sleep(3000);
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,400)", "");
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
                    driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div[1]/form/div[2]/div[1]/div[2]/label[1]")).click();
                    break;
                case 1:
                    driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div[1]/form/div[2]/div[1]/div[2]/label[2]")).click();
                    break;
            }
            Thread.sleep(2000);
            switch (odp2) {
                case 0:
                    driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div[1]/form/div[2]/div[2]/div[2]/label[1]")).click();
                    break;
                case 1:
                    driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div[1]/form/div[2]/div[2]/div[2]/label[2]")).click();
                    break;
            }
            Thread.sleep(2000);
            switch (odp3) {
                case 0:
                    driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div[1]/form/div[2]/div[3]/div[2]/label[1]")).click();
                    break;
                case 1:
                    driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div[1]/form/div[2]/div[3]/div[2]/label[2]")).click();
                    break;
                case 2:
                    driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div[1]/form/div[2]/div[3]/div[2]/label[3]")).click();
                    break;
            }
            Thread.sleep(4000);
            driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div[1]/form/div[2]/div[4]/div[2]/textarea")).sendKeys(odp);
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
            /*
            //WP
            driver.get("http://poczta.wp.pl/");
            Thread.sleep(6000);
            driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("szczyt2020");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();
            Thread.sleep(20000);
            driver.findElement(By.xpath("//*[text()='Oferty']")).click();
            //driver.findElement(By.xpath("/html/body/div[2]/nh-app-view/div/div/div/nh-sidebar/div/div/div[3]/div[1]/div[5]/div[2]")).click();
            Thread.sleep(10000);
            boolean flaga = false;
            int m = 0;
            while (!flaga) {
                try {
                    driver.findElement(By.xpath("//*[text()='EverydayMe']")).click();
                    Thread.sleep(4000);
                    driver.findElement(By.xpath("//*[text()='Do dzieła']")).click();
                    Thread.sleep(20000);
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
             */

            driver.quit();

        } catch (Exception e) {
            driver.quit();
        }



    }

    public static void Nestle(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "E:\\bot\\chromedriver\\chromedriver.exe");
        String imie = genImieZen();
        String nazwisko = genNazwiskoZen();
        Random r = new Random();
        int dziecko = r.nextInt(2);
        int plec = r.nextInt(2);
        int dzienUro = r.nextInt(29) + 1;
        int miesUro = r.nextInt(10 - 4 + 1) + 4;
        int rokUro = 2019;
        int dzienSpo = r.nextInt(29) + 1;
        int miesSpo = r.nextInt(12 - 8 + 1) + 8;
        int rokSpo = 2020;
        int m = 0;
        boolean flaga = false;
        Robot robot = new Robot();
        String dzieckoUrodzone = String.valueOf(rokUro) + "-" + dodajZero(miesUro) + "-" + dodajZero(dzienUro);
        String dzieckoSpodziewane = String.valueOf(rokSpo) + "-" + dodajZero(miesSpo) + "-" + dodajZero(dzienSpo);
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
        driver.get("https://www.mypay.pl/webapp/extern.php?k=6858&u=230491");
        Thread.sleep(40000);

        try {
            try {
                driver.findElement(By.xpath("//*[@id=\"dev-popin\"]/div/div[2]/div/div/div[2]/div/div/div")).click();
            } catch (Exception e) {
                clickXY(946, 743);
                Narzedzia.clickXY(500, 746);
                Narzedzia.clickXY(500, 746);
                clickXY(946, 743);
            }
            Thread.sleep(10000);
            js.executeScript("window.scrollBy(0,700)");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"gigya-textbox-86190741038286000\"]")).sendKeys(imie);
            driver.findElement(By.xpath("//*[@id=\"gigya-textbox-98147042545906400\"]")).sendKeys(nazwisko);
            driver.findElement(By.xpath("//*[@id=\"gigya-textbox-32672274042894692\"]")).sendKeys(mail);
            driver.findElement(By.xpath("//*[@id=\"gigya-password-40553674254645060\"]")).sendKeys(mail + "V2");
            driver.findElement(By.xpath("//*[@id=\"gigya-password-49311983690159380\"]")).sendKeys(mail + "V2");
            Thread.sleep(6000);
            driver.findElement(By.xpath("//*[@id=\"mbf-registration-one-step-form\"]/div[4]/div[15]/input")).click();
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
            driver.findElement(By.xpath("//*[@id=\"gigya-profile-form\"]/div[2]/div[1]/input")).click();
            Thread.sleep(6000);

            //WP
            driver.get("http://poczta.wp.pl/");
            Thread.sleep(3000);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("szczyt2020");
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
            driver.quit();

        } catch (Exception e) {
            driver.quit();
        }



    }

    public static void Be(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "E:\\bot\\chromedriver\\chromedriver.exe");
        String imie = genImieZen();
        String nazwisko = genNazwiskoZen();
        Random r = new Random();
        int dzien = r.nextInt(29) +1;
        String dataUr;
        if (dzien < 10)
            dataUr = "0"+String.valueOf(dzien)+"-06-2020";
        else
            dataUr = String.valueOf(dzien)+"-06-2020";
        int m = 0;
        boolean flaga = false;
        Robot robot = new Robot();
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
        driver.get("https://www.mypay.pl/webapp/extern.php?k=6853&u=230491");
        Thread.sleep(40000);

        //try {
            driver.findElement(By.xpath("/html/body/div[1]/nt-cookie-popup/div[1]/div[2]/div[2]/nt-analytics/button")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("/html/body/div/div[3]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"fos_user_registration_form_children_0_childData_birth_date\"]")).sendKeys(dataUr);
            Thread.sleep(1000);
            ScrollBy(driver,"700");
            Thread.sleep(1000);
            driver.findElement(By.xpath("/html/body/div[1]/main/nt-analytics/form/nt-order-address/fieldset/div/div/div/div[2]/div[1]/div[1]/div/div/div/label")).click();
            driver.findElement(By.xpath("/html/body/div[1]/main/nt-analytics/form/nt-order-address/fieldset/div/div/div/div[2]/div[2]/div/div[1]/div/div/div/label")).click();
            driver.findElement(By.xpath("//*[@id=\"fos_user_registration_form_profileData_email_first\"]")).sendKeys(mail);
            driver.findElement(By.xpath("//*[@id=\"fos_user_registration_form_profileData_email_second\"]")).sendKeys(mail);
            driver.findElement(By.xpath("//*[@id=\"fos_user_registration_form_profileData_plainPassword\"]")).sendKeys(mail+"V2");
            Thread.sleep(1000);
            ScrollBy(driver,"700");
            Thread.sleep(1000);
            driver.findElement(By.xpath("/html/body/div[1]/main/nt-analytics/form/fieldset[3]/div/div/div/div[2]/div[1]/div/div[1]/div/div[1]/div[1]/div/div/label")).click();
            driver.findElement(By.xpath("/html/body/div[1]/main/nt-analytics/form/fieldset[3]/div/div/div/div[2]/div[1]/div/div[1]/div/div[3]/div[1]/div/div/label")).click();
            driver.findElement(By.xpath("/html/body/div[1]/main/nt-analytics/form/fieldset[3]/div/div/div/div[2]/div[1]/div/div[1]/div/div[4]/div[1]/div/div/label")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("/html/body/div[1]/main/nt-analytics/form/div[3]/div/button/nt-loading-icon/span/span")).click();


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
                    driver.findElement(By.xpath("//*[text()='BebiKlub']")).click();
                    Thread.sleep(4000);
                    driver.findElement(By.xpath("/html/body/div[2]/nh-app-view/div/div/div/div[1]/div/div/nh-show-item/div/div/div/div/nh-html-compile/div/div[3]/a")).click();
                    Thread.sleep(20000);
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
            driver.quit();
        /*
        } catch (Exception e) {
            driver.quit();
        }
        */


    }
}
